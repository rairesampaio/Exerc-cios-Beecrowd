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