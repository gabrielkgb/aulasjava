import java.util.Scanner;
public class dever_4 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
    

        int num1;

        System.out.println("digite seu numero: ");
        num1 = Scanner.nextInt();

        int quadrado = num1 * num1;
        System.out.println("o quadrado de " + num1 + " eh " + quadrado); 

        Scanner.close();
    }
}
