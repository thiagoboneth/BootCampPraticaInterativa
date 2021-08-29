package Exercicio4;

public class Calculos {

    public int maiorEntre(int a, int b){
        return Math.max(a,b);
    }
    public  int menorEntre(int a, int b){
        return Math.min(a,b);
    }
    public double potenciaNum(double a, double b){
        return Math.pow(a, b);
    }
    public double cosseno(double a){
        return Math.cos(a);
    }
    public double raizQuadrada(int a){
        return Math.sqrt(a);
    }
    public double numeroAleatorio(){
        return Math.floor(Math.random()*(999-0+1)+0);
    }
}


