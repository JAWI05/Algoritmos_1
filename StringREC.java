import java.util.Scanner;

public class StringREC {

    public static String InverteString(String s){
        if (s.isEmpty()){
            return s;
        }
        // charAt - retorna o caracter do local
        // substring - extrai uma parte de uma String
        return s.charAt(s.length()-1) + InverteString(s.substring(0,s.length()-1));
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Digite a palavra: ");
        String palavra = in.nextLine();
        System.out.println(InverteString(palavra));
    }
}
