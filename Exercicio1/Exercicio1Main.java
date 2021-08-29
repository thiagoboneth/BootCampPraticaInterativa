package Exercicio1;

public class Exercicio1Main {

    public static void main(String[] args) {

    PracticaExcecoes teste1 = new PracticaExcecoes();


        try{
            System.out.println(teste1.retornaCalculo());
        }
        catch (Exception exception){
            System.out.println("Ocorreu um erro");
            throw new IllegalArgumentException("Nao pode ser dividor por zero");
        }
    }
}