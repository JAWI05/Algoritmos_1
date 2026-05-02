import java.util.Scanner;
import java.util.ArrayList;

public class Ex1_2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n, i = 0, p = 0;
        double fahr, temp;
        ArrayList<Double> temperatura = new ArrayList<>();
        ArrayList<Double> fahreheit = new ArrayList<>();

        System.out.print("Quantas temperaturas serão lidas: ");
        n = in.nextInt();

        while(n > i){
            System.out.print("Digite a temmperatura em Celsius (N): ");
            temp = in.nextDouble();
            temperatura.add(temp);

            fahr = (temp * 9.0/5.0) + 32;
            fahreheit.add(fahr);

            i += 1;
        }

        while(n > p){
            System.out.println("A temperatura "+(p+1)+" é "+temperatura.get(p)+" Celsius e "+fahreheit.get(p)+" Fahrenheit");

            p += 1;
        }
    }
}
