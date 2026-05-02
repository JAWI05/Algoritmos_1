import java.util.Scanner;

public class MDCrecursivo {

    public static int mdcRec(int a, int b){
        if (b == 0){
            return a;
        }
        // resto de a/b
        return mdcRec(b, a % b);
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Num1: ");
        int a = in.nextInt();
        System.out.print("Num2: ");
        int b = in.nextInt();
        System.out.println("O mdc é "+mdcRec(a,b));
    }
}
