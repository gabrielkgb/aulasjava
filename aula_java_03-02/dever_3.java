import java.util.Scanner;
public class dever_3 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int num1;

        System.out.println("digite seu numero: ");
        num1 = Scanner.nextInt();

        int quinta = num1 * 1/5;
        System.out.println("a quinta parte de " + num1 + " eh " + quinta); 

        
        Scanner.close();
    }
    
}
