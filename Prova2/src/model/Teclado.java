package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * @author Robson Walter de Souza
 */
public class Teclado {
    private Scanner scanner;

    public Teclado() {
        scanner = new Scanner(System.in);
    }

    public LocalDate lerData() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate valor = null;
        while (true) {
            try {
                valor = LocalDate.parse(scanner.nextLine(), dtf);
                break;
            } catch (Exception e) {
                System.out.println("Valor digitado incorreto. Digite um valor no formato dd/MM/yyyy.");
            }
        }
        return valor;
    }

    public int lerInt() {
        int valor = 0;
        while (true) {
            try {
                valor = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Valor digitado incorreto. Digite um valor inteiro.");
            }
        }
        return valor;
    }

    public double lerDouble() {
        double valor = 0;
        while (true) {
            try {
                valor = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Valor digitado incorreto. Digite um valor double.");
            }
        }
        return valor;
    }

    public boolean lerBoolean() {
        boolean retorno = false;
        while (true) {
            try {
                retorno = Boolean.parseBoolean(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Valor digitado incorreto. Digite 'true' ou 'false'.");
            }
        }
        return retorno;
    }
    public String lerString(){
        return scanner.nextLine();
    }
}