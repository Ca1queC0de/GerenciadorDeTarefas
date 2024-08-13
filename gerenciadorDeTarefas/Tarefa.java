package gerenciadorDeTarefas;

public class Tarefa {

	private String nome;
	private boolean concluida;
	
	public Tarefa(String nome) {
		this.nome = nome;
		this.concluida = false;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isConcluida() {
		return concluida;
	}
	public void setConcluida(boolean concluida) {
		this.concluida = concluida;
	}
	
	public String toString() {
		String status;
		if (concluida) {
			status = " (Concluída)";
		} else {
			status = " (Pendente)";
		}
		return nome + status;
	}
	
}
