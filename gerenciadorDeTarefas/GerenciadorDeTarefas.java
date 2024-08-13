package gerenciadorDeTarefas;

import java.util.ArrayList;

public class GerenciadorDeTarefas {
    private ArrayList<Tarefa> listaDeTarefas;

    public GerenciadorDeTarefas() {
        listaDeTarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String nome) {
        Tarefa novaTarefa = new Tarefa(nome);
        listaDeTarefas.add(novaTarefa);
        System.out.println("Tarefa adicionada: " + nome);
    }

    public void removerTarefa(int indice) {
        if (indice >= 0 && indice < listaDeTarefas.size()) {
            Tarefa tarefaRemovida = listaDeTarefas.remove(indice);
            System.out.println("Tarefa removida: " + tarefaRemovida.getNome());
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void exibirTarefas() {
        if (listaDeTarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa na lista.");
        } else {
            System.out.println("Tarefas:");
            for (int i = 0; i < listaDeTarefas.size(); i++) {
                System.out.println((i + 1) + ". " + listaDeTarefas.get(i));
            }
        }
    }

    public void marcarTarefaComoConcluida(int indice) {
        if (indice >= 0 && indice < listaDeTarefas.size()) {
            Tarefa tarefa = listaDeTarefas.get(indice);
            tarefa.setConcluida(true);
            System.out.println("Tarefa marcada como concluída: " + tarefa.getNome());
        } else {
            System.out.println("Índice inválido.");
        }
    }
}
