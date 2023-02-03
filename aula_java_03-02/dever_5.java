import java.util.Scanner;
public class dever_5 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
    
        int num1, num2;

        System.out.println("digite seu numero: ");
        num1 = Scanner.nextInt();
        
        System.out.println("digite outro numero: ");
        num2 = Scanner.nextInt();
        
        if (num1 > num2){
            System.out.println( "o numero menor eh: " + num2);
        }else{
            System.out.println( "o numero menor eh: " + num1);
        }

        Scanner.close();
    }
}
