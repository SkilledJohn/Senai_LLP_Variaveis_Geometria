import java.util.Scanner;

public class triangulo {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int b, h, a;

        System.out.println("Digite a base do triângulo: ");
        b = leia.nextInt();

        System.out.println("Digite a altura do triângulo: ");
        h = leia.nextInt();

        a = (b * h)/2;

        System.out.println("A área do triângulo é: "+ a);
    }
}
