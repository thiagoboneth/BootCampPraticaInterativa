package Exercicio3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {
            lerArquivo("oizinho");
        } catch (FileNotFoundException f) {
            System.out.println("O arquivo especificado não foi encontrado");
        }
        catch (IOException e) {
            System.out.println("Erro ao ler o arquivo especificado");
        }

    }

    public static void lerArquivo(String nomeArquivo) throws IOException, FileNotFoundException {
        String texto = null;
        BufferedReader bufferedReader = new
                BufferedReader(new FileReader(nomeArquivo));
        while((texto = bufferedReader.readLine()) != null) {
            System.out.println(texto);
        }
        bufferedReader.close();
    }

}
