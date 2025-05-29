import java.util.Scanner;

public class circulo {
 public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);

    int r;
    double pi = 3.14, a;

    System.out.println("Digite o raio do círculo: ");
    r = leia.nextInt();

    a = pi*(r*r);

    System.out.println("A área do círculo é: "+ a);
 }   
}
