import java.util.Random;

public class POTENCIArec {

    public static int potenciaREC(int x, int n){
        if (n==0){
            return 1;
        }
        return x * potenciaREC(x, n-1);
    }

    public static void main(String[] args){
        Random r = new Random();
        int x = r.nextInt(100);
        System.out.print(x+" ao quadrado é: ");
        System.out.println(potenciaREC(x, 2));
    }
}
