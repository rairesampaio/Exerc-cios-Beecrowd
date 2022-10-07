/*Calcule o consumo médio de um automóvel sendo fornecidos a distância total percorrida (em Km) e o total de combustível gasto (em litros).

Entrada
O arquivo de entrada contém dois valores: um valor inteiro X representando a distância total percorrida (em Km), e um valor real Y representando o total de combustível gasto, com um dígito após o ponto decimal.

Saída
Apresente o valor que representa o consumo médio do automóvel com 3 casas após a vírgula, seguido da mensagem "km/l".


______________________________________________________________________________________*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        // ENTRADA E DECLARAÇÃO DE VARIAVEIS
        int km = leitor.nextInt();
        double lt = leitor.nextDouble();
        
        // FÓRMULAS DE CÁLCULO
        double consumo = km / lt;

        // SAÍDA DOS DADOS
        System.out.printf("%.3f km/l%n",consumo);
        leitor.close();
    }
 
}