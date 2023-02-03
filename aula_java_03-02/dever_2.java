import java.util.Scanner;

public class dever_2 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        int num1, num2, num3;

        System.out.println("digite seu numero: ");
        num1 = Scanner.nextInt();
        
        System.out.println("digite outro numero: ");
        num2 = Scanner.nextInt();
    
        System.out.println("digite outro numero: ");
        num3 = Scanner.nextInt();

        int media =( num1 + num2 + num3) / 3;
        System.out.println("a media do seu numero ai pai " + media); 


        Scanner.close();
    }
    
}
