import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        Celular celular1 = new Celular();
        System.out.print("Informe o nome do Celular 1: ");
        celular1.nome = scanner.nextLine();
        System.out.print("Informe o armazenamento do Celular 1 (em GB): ");
        celular1.armazenamentoDoCeular = Integer.parseInt(scanner.nextLine());
        System.out.print("Informe o sistema operacional do Celular 1: ");
        celular1.sistemasOperacional = scanner.nextLine();
        System.out.print("Informe o tamanho da tela do Celular 1: ");
        celular1.tamanhoDaTela = Float.parseFloat(scanner.nextLine());

        Celular celular2 = new Celular();
        System.out.print("Informe o nome do Celular 2: ");
        celular2.nome = scanner.nextLine();
        System.out.print("Informe o armazenamento do Celular 2 (em GB): ");
        celular2.armazenamentoDoCeular = Integer.parseInt(scanner.nextLine());
        System.out.print("Informe o sistema operacional do Celular 2: ");
        celular2.sistemasOperacional = scanner.nextLine();
        System.out.print("Informe o tamanho da tela do Celular 2: ");
        celular2.tamanhoDaTela = Float.parseFloat(scanner.nextLine());

        Celular celular3 = new Celular();
        System.out.print("Informe o nome do Celular 3: ");
        celular3.nome = scanner.nextLine();
        System.out.print("Informe o armazenamento do Celular 3 (em GB): ");
        celular3.armazenamentoDoCeular = Integer.parseInt(scanner.nextLine());
        System.out.print("Informe o sistema operacional do Celular 3: ");
        celular3.sistemasOperacional = scanner.nextLine();
        System.out.print("Informe o tamanho da tela do Celular 3: ");
        celular3.tamanhoDaTela = Float.parseFloat(scanner.nextLine());

        scanner.close();

        System.out.format("Celular %s com a tela de %.1f, com %d GB e SO %s\n", celular1.nome, celular1.tamanhoDaTela,
                celular1.armazenamentoDoCeular, celular1.sistemasOperacional);
        System.out.format("Celular %s com a tela de %.1f, com %d GB e SO %s\n", celular2.nome, celular2.tamanhoDaTela,
                celular2.armazenamentoDoCeular, celular2.sistemasOperacional);
        System.out.format("Celular %s com a tela de %.1f, com %d GB e SO %s", celular3.nome, celular3.tamanhoDaTela,
                celular3.armazenamentoDoCeular, celular3.sistemasOperacional);
    }
}
