package Exercicio2;

public class Main {
    public static void main(String[] args) {

        String mensagemFinal = "Esta é a última mensagem";

        //Código que lança exceção

        int[] numeros = new int[5];


        try {
            numeros[5] = 10;
        }
        catch (ArrayIndexOutOfBoundsException e){

            System.out.println(e.getMessage());
        }
        finally {
            System.out.println(mensagemFinal);
        }

    }
}
