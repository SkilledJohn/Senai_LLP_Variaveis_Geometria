import java.util.Scanner;

public class tubo {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
  
        double pi = 3.14, r, h, a;

        System.out.println("Digite o raio da base do tubo: ");
        r = leia.nextInt();
        System.out.println("Digite a altura do tubo: ");
        h = leia.nextInt();

        a = 2*pi*r * (r + h);

        System.out.println("A base do tubo é: "+ a);
    }
}
