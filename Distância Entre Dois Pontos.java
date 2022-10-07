/*Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles, mostrando 4 casas decimais após a vírgula, segundo a fórmula:

Distancia =

Entrada
O arquivo de entrada contém duas linhas de dados. A primeira linha contém dois valores de ponto flutuante: x1 y1 e a segunda linha contém dois valores de ponto flutuante x2 y2.

Saída
Calcule e imprima o valor da distância segundo a fórmula fornecida, com 4 casas após o ponto decimal.*/





import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        
        // Declaração de variáveis
        double x1 = leitor.nextDouble();
        double y1 = leitor.nextDouble();
        double x2 = leitor.nextDouble();
        double y2 = leitor.nextDouble();
        
        // Cálculos
        double A = Math.pow(x2-x1,2);
        double B = Math.pow(y2-y1, 2);
        double c = Math.sqrt(A+B);

        // Saída dos valores
        System.out.printf("%.4f%n",c);

        leitor.close();

    }

}
