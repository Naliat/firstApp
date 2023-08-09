import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        Personagem heroi = new Personagem();

        // Maneira Manuel
        heroi.nome = "Tailan";
        heroi.ataque = 50;
        heroi.defesa = 80;
        heroi.idade = 18;

        System.out.format("O nome do personagem é %s, com ataque %d e defesa %d, e a idade é %d%n", heroi.nome,
                heroi.ataque, heroi.defesa, heroi.idade);

        // Maneira Ideal
        System.out.print("Informe o nome do personagem: ");
        heroi.nome = scanner.nextLine();
        System.out.print("Informe o valor de ataque do personagem: ");
        heroi.ataque = Integer.parseInt(scanner.nextLine());
        System.out.print("Informe o valor de defesa do personagem: ");
        heroi.defesa = Integer.parseInt(scanner.nextLine());
        System.out.print("Informe a idade do personagem: ");
        heroi.idade = Integer.parseInt(scanner.nextLine());

        scanner.close();

        System.out.format("O nome do personagem é %s, com ataque %d e defesa %d, e a idade é %d%n", heroi.nome,
                heroi.ataque, heroi.defesa, heroi.idade);
    }
}
