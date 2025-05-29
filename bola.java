import java.util.Scanner;

public class bola {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double r, pi = 3.14, a;

        System.out.println("Digite o raio da bola: ");
        r = leia.nextInt();

        a = (4*pi) * (r*r);

        System.out.println("A área da bola é: "+ a);
    }
}
