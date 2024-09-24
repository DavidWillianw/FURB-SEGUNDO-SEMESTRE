package Model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author David
 */


public class Ponto {

    private int x;
    private int y;
/**
 * 
 * 
 * Crie o ponto com as coodernadas predefinas como zero
 */
    public Ponto() {
        this.x = 0;
        this.y = 0;
    }
/*
 * 
 *  Ele iguala o valor de X e y que está zerado igual ao X e y que o user digita
 * 
 */
    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }
/*
    Ele identifica onde está o quadrante 
    */
    public Quadrante identificarQuadrante() {
        Quadrante quad;

        if (getX() > 0 && getY() > 0) {
            quad = Quadrante.PRIMEIRO;
        }
        else if(getX() < 0 && getY() > 0) {
            quad = Quadrante.SEGUNDO;
        }
        else if(getX() < 0 && getY() < 0) {
            quad = Quadrante.TERCEIRO;
        }
        else if (getX() > 0 && getY() < 0) {
            quad = Quadrante.QUARTO;
        } else   {
            quad = Quadrante.NENHUM;
        }
         return quad;
    }
/*
    Ele verifica se está indicindo sobre X
    */
    public boolean estaIncidindoSobreX() {
        boolean veriX = false;
        if (getY() == 0) {
            veriX = true;
        }
        return veriX;
    }
/*
    Ele verifica se está indicindo sobre Y
    */
    public boolean estaIncidindoSobreY() {
        boolean veriY = false;
        if (x == 0) {
            veriY = true;
        }
        return veriY;
    }
/*
    Ele calcula a distancia entre os dois pontos
    */
     public double calcularDistancia(Ponto outro) {
        double dx = this.x - outro.getX();
        double dy = this.y - outro.getY();
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }

    public static double calcularDistancia(Ponto p1, Ponto p2) {
        double dx = p1.getX() - p2.getX();
        double dy = p1.getY() - p2.getY();
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }
    
/*
    Setters e Getters
    */
    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;

    }

    public int getY() {
        return y;
    }
}
