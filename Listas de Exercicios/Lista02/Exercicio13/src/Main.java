import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double base,altura,raio,area,perimetro,hipotenusa;
        int forma;
        System.out.println("Menu");
        System.out.println("1.Círculo");
        System.out.println("2.Triângulo Retângulo");
        System.out.println("3.Retângulo");
        System.out.println("Escolha umas das Opções: ");
        forma = in.nextInt();

        switch (forma) {
            case 1://Círculo;
                System.out.println("Informe o raio: ");
                raio = in.nextDouble();
                area = 3.14 * raio * raio;
                perimetro = 2 * 3.14 * raio;
                System.out.println("A área é: "+area);
                System.out.println("O perímetro é: "+perimetro);
                break;

            case 2://Triângulo;
                System.out.println("Informe a base: ");
                base = in.nextDouble();
                System.out.println("Informe a altura: ");
                altura = in.nextDouble();
                area = (base * altura)/2;
                hipotenusa = Math.sqrt((base * base) + (altura * altura));
                perimetro = base + altura + hipotenusa;
                System.out.println("A área é: "+area);
                System.out.println("O perímetro é: "+perimetro);
                break;

            case 3://Retângulo;
                System.out.println("Informe a base: ");
                base = in.nextDouble();
                System.out.println("Informe a altura: ");
                altura = in.nextDouble();
                area = base * altura;
                perimetro = (2 * base) + (2 * altura);
                System.out.println("A área é: "+area);
                System.out.println("O perímetro é: "+perimetro);
                break;
        }
    }
}