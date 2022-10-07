Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
Entrada
O arquivo de entrada contém três valores com um dígito após o ponto decimal.

Saída
O arquivo de saída deverá conter 5 linhas de dados. Cada linha corresponde a uma das áreas descritas acima, sempre com mensagem correspondente e um espaço entre os dois pontos e o valor. O valor calculado deve ser apresentado com 3 dígitos após o ponto decimal.


__________________________________________________




import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        // ENTRADA E DECLARAÇÃO DE VARIAVEIS
        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        double C = leitor.nextDouble();
        double pi = 3.14159; 

        // FÓRMULAS DE CÁLCULO
        double Atri = (A*C)/2; // (Base x Altura) /2
        double Acirc = pi * Math.pow(C, 2); // (Pi x R)^2
        double Atrap = ((A+B)*C)/2; // ((Base maior x Base menor) x Altura)/2
        double Aquad = Math.pow(B,2); // Lado ao quadrado (como foi usado nesse exercício) ou Base x Altura
        double Aret = A*B; // Base x Altura
     
        // SAÍDA DOS DADOS
        System.out.printf("TRIANGULO: %.3f%n",Atri);
        System.out.printf("CIRCULO: %.3f%n",Acirc);
        System.out.printf("TRAPEZIO: %.3f%n",Atrap);
        System.out.printf("QUADRADO: %.3f%n",Aquad);
        System.out.printf("RETANGULO: %.3f%n",Aret);

        leitor.close();
    }
 
}