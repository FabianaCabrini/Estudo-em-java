import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é o seu nome? ");
        //Dicas: O println - Faz uma quebra de linha, já o print deixa tudo numa linha só
        String nome = scanner.nextLine();
        System.out.println("Qual é a sua idade? ");
        int age = scanner.nextInt();
        System.out.println("Olá " + nome + " sua idade é " + age);
        //Podemos usar também %s para ver o nome e idade, ex: System.out.println("Olá, %s. Sua idade é %s", nome, idade);
    }
}
