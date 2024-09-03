package Streams;

public class Tarefa {
	
	private String titulo;
    private String  descricao;
    private Prioridade  prioridade; // (baixa, média, alta)
    private Status  status; // (pendente, em andamento, concluída)
    
    Tarefa(String titulo, String descricao, Prioridade prioridade, Status status){
    	this.titulo = titulo;
    	this.descricao = descricao;
    	this.prioridade = prioridade;
    	this.status = status;
    }

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Prioridade getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(Prioridade prioridade) {
		this.prioridade = prioridade;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	@Override
    public String toString() {
        return "Tarefa: " + titulo + ", Prioridade: " + prioridade + ", Status: " + status;
    }
}
