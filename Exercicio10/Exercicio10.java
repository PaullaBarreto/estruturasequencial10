import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args)  throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com uma temperatura em graus celcius: ");
        double celcius = sc.nextDouble();
        
        double fahrenheit = 32 + (celcius * 1.8);
        System.out.println(celcius + " graus celcius, equivalem a " + fahrenheit + " graus fahrenheit.");
    }
}