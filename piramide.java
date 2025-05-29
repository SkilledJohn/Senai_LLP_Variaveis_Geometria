import java.util.Scanner;

public class piramide {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a medida lateral do quadrado base da pirâmide: ");
        int base_piramide = leia.nextInt();
        System.out.println("Digite a medida base do triângulo lateral da pirâmide: ");
        int base_triangulo = leia.nextInt();
        System.out.println("Digite a altura do triângulo lateral da pirâmide: ");
        int altura_triangulo = leia.nextInt();

        int A_base = base_piramide;
        int A_lateral = ((base_triangulo * altura_triangulo)/2) * 4;

        int area_total = A_lateral + A_base;

        System.out.println("A área total da pirâmide é: "+ area_total);
    }
}
