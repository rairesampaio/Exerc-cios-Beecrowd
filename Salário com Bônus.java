Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o total a receber no final do mês, com duas casas decimais.

Entrada
O arquivo de entrada contém um texto (primeiro nome do vendedor) e 2 valores de dupla precisão (double) com duas casas decimais, representando o salário fixo do vendedor e montante total das vendas efetuadas por este vendedor, respectivamente.

Saída
Imprima o total que o funcionário deverá receber, conforme exemplo fornecido.

__________________________________________________*/



import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        // ENTRADA E DECLARAÇÃO DE VARIAVEIS
        String nome = leitor.nextLine(); 
        double salarioFixo = leitor.nextDouble();
        double vendasEfetuadas = leitor.nextDouble();
        double comissao = vendasEfetuadas * 0.15;
        double salarioFinal = salarioFixo + comissao;

        // SAÍDA DOS DADOS
        System.out.printf("TOTAL = R$ %.2f%n",salarioFinal);

        leitor.close();
    }
 
}