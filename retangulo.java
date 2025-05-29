import java.util.Scanner;

public class retangulo
{
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int b, h, a;
		
		System.out.println("Digite a base do retângulo: ");
		b = leia.nextInt();

		System.out.println("Digite a altura do retângulo: ");
		h = leia.nextInt();

		a = b * h;

		System.out.println("A área do retângulo é: "+ a);
	}
}