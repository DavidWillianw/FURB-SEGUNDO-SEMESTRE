/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package view;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author sunse
 */
public class App {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");

        Scanner scan = new Scanner(System.in);

        long bytes = 0;
        Boolean b = false;
        // File diretorio = new File("C:\\Users\\sunse\\Music\\a");
        String nomeDiretorio = "";
        try {

            while (!b) {
                System.out.println("----------------------------");
                System.out.println("Digite o nome do diretorio:");
                nomeDiretorio = scan.nextLine();

                File diretorio = new File(nomeDiretorio);

                try {
                    File[] conteudoDiretorio = diretorio.listFiles();

                    if (conteudoDiretorio == null) {
                        throw new IllegalArgumentException("O diretorio não existe ou não é um diretorio.");
                    }

                    for (File item : conteudoDiretorio) {
                        if (!item.exists()) {
                            throw new IllegalArgumentException("O arquivo " + item.getName() + " não existe.");
                        } else {
                            System.out.println("Diretorio/Arquivo: " + item.getName());
                            System.out.println("Tamanho: " + item.length() + " bytes");
                            bytes += item.length();
                        }
                    }
                    System.out.println("Total de bytes: " + bytes);
                    b = true;

                } catch (IllegalArgumentException e) {
                    System.out.println("Erro: " + e.getMessage());
                } catch (Exception e) {
                    System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
                }
            }

        } catch (Exception e) {
            throw new IllegalArgumentException("O conteudo diretorio é vazio.");
        }

        System.out.println("----------------------------");
        System.out.println(" Diretorio digitado pelo o usuario " + nomeDiretorio);
        System.out.println("----------------------------");
        System.out.println(" Total de bytes " + bytes + "Bytes");
        double a = bytes / Math.pow(2, 20);
        System.out.println(" Total de megabytes " + df.format(a) + "MB");
        System.out.println("----------------------------");
    }
}
