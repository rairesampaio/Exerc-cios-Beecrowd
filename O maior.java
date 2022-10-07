Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem “eh o maior”. Utilize a fórmula:

MaiorAB = (a + b + abs(a-b))/2

Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). Um segundo passo, portanto é necessário para chegar no resultado esperado.

Entrada
O arquivo de entrada contém três valores inteiros.

Saída
Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".
____________________________________________________________


import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        // ENTRADA E DECLARAÇÃO DE VARIAVEIS
        int A = leitor.nextInt();
        int B = leitor.nextInt();
        int C = leitor.nextInt();
        
        // FÓRMULAS DE CÁLCULO
        int maiorAB = (A + B + Math.abs(A - B))/2;
        int maiorABC = (maiorAB + C + Math.abs(maiorAB - C))/2;

        // SAÍDA DOS DADOS
        System.out.println(maiorABC+" eh o maior");
        leitor.close();
    }
 
}