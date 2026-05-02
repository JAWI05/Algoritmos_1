import java.util.Scanner;

public class Ex1_1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int dia, i = 0;
        float gastos, total = 0, media;

        System.out.print("Digite o número de dias: ");
        dia = in.nextInt();

        while(dia > i){
            System.out.print("Digite o valor dos gastos do dia "+(i+1)+": ");
            gastos = in.nextFloat();
            total = total + gastos;

            i++;
        }

        media = total / dia;
        System.out.printf("\nO gasto total de "+dia+" dias foi de: %.2f",total);
        System.out.printf("\nA média dos gastos é de: %.2f",media);
    }
}
