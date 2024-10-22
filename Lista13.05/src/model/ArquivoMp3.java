/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sunse
 */
public class ArquivoMp3 {

    private File arquivo;
    private TagMp3 tag;
    private String nomeArquivo;

    public ArquivoMp3(String nomeArquivo) throws ArgumentoNaoEhArquivoException, ArquivoNaoTemMp3 {
        this.arquivo = new File(nomeArquivo);

        if (!arquivo.exists() || !arquivo.isFile()) {
            throw new ArgumentoNaoEhArquivoException("O arquivo é invalido");
        }
        this.tag = extrairTag(arquivo);
    }

    public TagMp3 getTagMp3() {
        return tag;
    }

private TagMp3 extrairTag(File arquivo) throws ArgumentoNaoEhArquivoException, ArquivoNaoTemMp3 {

    try (FileInputStream fis = new FileInputStream(arquivo)) {
        byte[] dados = new byte[128];
        long tamanhoArquivo = arquivo.length();

        if (tamanhoArquivo < 128) {
            throw new ArquivoNaoTemMp3("O arquivo " + arquivo.getName() + " não contém uma tag MP3 válida.");
        }
        
        fis.skip(tamanhoArquivo - 128);  // Salta para os últimos 128 bytes do arquivo
        fis.read(dados);  // Lê os últimos 128 bytes
        
        // Verifica o cabeçalho "TAG"
        String cabecalho = new String(dados, 0, 3);
        if (!"TAG".equals(cabecalho)) {
            throw new ArquivoNaoTemMp3("O arquivo " + arquivo.getName() + " não contém uma tag MP3 válida.");
        }

        // Extração dos campos seguindo a tabela da imagem
        String titulo = new String(dados, 3, 30).trim();          // Campo Título da música
        String artista = new String(dados, 33, 30).trim();        // Campo Artista
        String album = new String(dados, 63, 30).trim();          // Campo Álbum
        int ano = parseIntSafe(new String(dados, 93, 4).trim());  // Campo Ano
        String comentario = new String(dados, 97, 28).trim();     // Campo Comentário
        
        // Extração da Flag de trilha e Número da faixa
        int flagTrilha = dados[125];  // Flag de trilha (1 byte)
        if (flagTrilha < 0) {
            flagTrilha += 256;  // Converter o byte assinado para positivo se necessário
        }
        
        int numeroFaixa = dados[126];  // Número da faixa (1 byte)
        if (numeroFaixa < 0) {
            numeroFaixa += 256;  // Converter o byte assinado para positivo se necessário
        }

         // Extração e mapeamento do Gênero (byte final)
        int generoCode = dados[127] & 0xFF;  // Converter o byte para valor positivo
        String genero = mapearGenero(generoCode);  // Mapeia o código de gênero para uma String

        // Se o gênero ainda for vazio, tenta definir um valor padrão ou lidar com isso
        if (genero.isEmpty()) {
            genero = "Desconhecido";  // Valor padrão se o gênero for vazio
        }


        // Retorna uma nova instância de TagMp3 com os valores extraídos
        return new TagMp3(titulo, artista, album, ano, comentario, numeroFaixa, genero);
    
    } catch (IOException ex) {
        Logger.getLogger(ArquivoMp3.class.getName()).log(Level.SEVERE, null, ex);
    }

    return null;  // Retorna null em caso de erro
}



private int parseIntSafe(String value) throws NumberFormatException {
    if (value.isEmpty() || !value.matches("\\d+")) {
        throw new NumberFormatException("Valor não numérico: " + value);
    }
    return Integer.parseInt(value);
}


private String mapearGenero(int generoCode) {
    String[] generos = {
        "Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop",
        "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock",
        "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", 
        "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical",
        "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock",
        "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock",
        "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance",
        "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk",
        "Jungle", "Native US", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer",
        "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", 
        "Hard Rock"
    };

    if (generoCode >= 0 && generoCode < generos.length) {
        return generos[generoCode];  // Retorna o gênero correspondente
    } else {
        return "Desconhecido";  // Se o código estiver fora da faixa conhecida
    }
}
}