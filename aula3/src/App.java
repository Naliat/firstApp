import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Tipo manual
        Planta planta = new Planta();
        planta.nome = "Acerola";
        planta.idade = 2;
        planta.altura = 50f;
        planta.tipo = "Tipo A";

        System.out.format("O nome da Planta é %s com idade de %d, altura de %.1f cm e tipo %s\n", planta.nome, planta.idade, planta.altura, planta.tipo);
        // Tipo ideal
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o nome da planta: ");
        planta.nome = scanner.nextLine();
        System.out.print("Informe a idade da planta: ");
        planta.idade = Integer.parseInt(scanner.nextLine());
        System.out.print("Informe a altura da planta (em cm): ");
        planta.altura = Float.parseFloat(scanner.nextLine());
        System.out.print("Informe o tipo da planta: ");
        planta.tipo = scanner.nextLine();

        scanner.close();

        System.out.format("O nome da Planta é %s, com idade de %d, altura de %.1f cm e tipo %s%n", planta.nome, planta.idade, planta.altura, planta.tipo);
    }
}

