package view;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import model.ArgumentoNaoEhArquivoException;
import model.ArquivoMp3;
import model.ArquivoNaoTemMp3;
import model.TagMp3;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nomeDiretorio;

        try {
            System.out.println("----------------------------");
            System.out.println("Digite o nome do diretorio onde os arquivos MP3 estao armazenados:");
            nomeDiretorio = scan.nextLine();
            System.out.println("Diretorio selecionado: " + nomeDiretorio);
            System.out.println("");
            System.out.println("----------------------------");

            
            File diretorio = new File(nomeDiretorio);
            File[] arquivosMp3 = diretorio.listFiles((dir, name) -> name.toLowerCase().endsWith(".mp3"));

            if (arquivosMp3 != null && arquivosMp3.length > 0) {
                for (File arquivo : arquivosMp3) {
                    try {
                        // Passa o caminho do arquivo como String
                        ArquivoMp3 arquivoMp3 = new ArquivoMp3(arquivo.getAbsolutePath());
                        TagMp3 tag = arquivoMp3.getTagMp3();

                        if (tag != null) {
                            System.out.println("Titulo: " + tag.getTitulo());
                            System.out.println("Artista: " + tag.getArtista());
                            System.out.println("Album: " + tag.getAlbum());
                            System.out.println("Ano: " + tag.getAno());
                            System.out.println("Comentario: " + tag.getComentario());
                            System.out.println("Numero de Faixas: " + tag.getNumeroFaixa());
                            System.out.println("Genero: " + tag.getGenero());
                            System.out.println("----------------------------");
                        } else {
                            System.out.println("Nenhuma tag MP3 encontrada para o arquivo: " + arquivo.getName());
                        }
                    } catch (ArquivoNaoTemMp3 e) {
                        System.err.println("Erro ao processar o arquivo " + arquivo.getName() + ": " + e.getMessage());
                    }
                }
            } else {
                System.out.println("Nenhum arquivo MP3 encontrado no diretório especificado.");
            }
        } catch (ArgumentoNaoEhArquivoException e) {
            System.err.println("Erro: " + e.getMessage());
        } finally {
            scan.close();
        }
    }
}
