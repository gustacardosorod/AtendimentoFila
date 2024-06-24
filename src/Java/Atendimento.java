package Java;
import java.util.Scanner;

public class Atendimento {
    private static Fila fila = new Fila();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1. Sair da aplicação");
            System.out.println("2. Cadastrar usuário");
            System.out.println("3. Chamar próximo");
            System.out.println("4. Exibir quantos usuários ainda estão na fila");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Saindo da aplicação...");
                    break;
                case 2:
                    Usuario usuario = new Usuario();
                    fila.adiciona(usuario);
                    System.out.println("Usuário " + usuario.getNumero() + " foi inserido na fila.");
                    break;
                case 3:
                    if (fila.tamanho() > 0) {
                        Usuario proximo = (Usuario) fila.remove();
                        System.out.println("Chamando o próximo usuário: " + proximo);
                        System.out.println("Próximos usuários na fila:");
                        fila.exibe();
                    } else {
                        System.out.println("Nenhum usuário na fila.");
                    }
                    break;
                case 4:
                    System.out.println("Usuários na fila: " + fila.tamanho());
                    fila.exibe();
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 1);

        scanner.close();
    }
}
