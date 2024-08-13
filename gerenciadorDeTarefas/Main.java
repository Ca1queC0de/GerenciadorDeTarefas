package gerenciadorDeTarefas;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        GerenciadorDeTarefas gerenciador = new GerenciadorDeTarefas();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 5) {
            System.out.println("\nGerenciador de Tarefas:");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Remover Tarefa");
            System.out.println("3. Exibir Todas as Tarefas");
            System.out.println("4. Marcar Tarefa como Concluída");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome da tarefa: ");
                    String nome = scanner.nextLine();
                    gerenciador.adicionarTarefa(nome);
                    break;
                case 2:
                    gerenciador.exibirTarefas();
                    System.out.print("Digite o número da tarefa para remover: ");
                    int indiceRemover = scanner.nextInt() - 1;
                    gerenciador.removerTarefa(indiceRemover);
                    break;
                case 3:
                    gerenciador.exibirTarefas();
                    break;
                case 4:
                    gerenciador.exibirTarefas();
                    System.out.print("Digite o número da tarefa para marcar como concluída: ");
                    int indiceConcluir = scanner.nextInt() - 1;
                    gerenciador.marcarTarefaComoConcluida(indiceConcluir);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}
