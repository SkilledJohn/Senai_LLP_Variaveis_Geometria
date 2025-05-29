import java.util.Scanner;

public class caixa {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o comprimento da caixa: ");
        int c = leia.nextInt();
        System.out.println("Digite a largura da caixa: ");
        int l = leia.nextInt();
        System.out.println("Digite a altura da caixa: ");
        int h = leia.nextInt();

        double a = 2*(c*l) + 2*(c*h) + 2*(l*h);

        System.out.println("A área desta caixa é: "+ a);
    }
}
