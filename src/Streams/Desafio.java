package Streams;

public class Desafio {

	public static void main(String[] args) {

		GestorDeTarefas gestor = new GestorDeTarefas();

		// Adicionando algumas tarefas
		gestor.adicionarTarefa(new Tarefa("Sistema login", "Terminar crud", Prioridade.MÉDIA, Status.EM_ANDAMENTO));
		gestor.adicionarTarefa(new Tarefa("Sistema Registro", "Terminar crud", Prioridade.MÉDIA, Status.EM_ANDAMENTO));
		gestor.adicionarTarefa(new Tarefa("Adicionar logo", "colocar nova logo", Prioridade.BAIXA, Status.EM_ANDAMENTO));
		gestor.adicionarTarefa(new Tarefa("Sistema Compra", "Fazer sistema de compras", Prioridade.ALTA, Status.PENDENTE));
		gestor.adicionarTarefa(new Tarefa("Sistema frete", "Arrumar frete", Prioridade.ALTA, Status.PENDENTE));

		// Listar tarefas de alta prioridade e pendentes
		System.out.println("Tarefas de alta prioridade e pendentes:");
		gestor.listarTarefasAltaPrioridadePendentes();
		System.out.println();

		// Contar tarefas em andamento
		System.out.println("Tarefas em andamento: ");
		long emAndamento = gestor.contarTarefasEmAndamento();
		System.out.println("numeros tarefas em andamento: " + emAndamento);
		System.out.println();

		// Ordenar e listar tarefas
		System.out.println("Tarefas ordenadas:");
		gestor.listarTarefasOrdenadas();
		System.out.println();

		// Filtrar tarefas usando Predicate
		 System.out.println("Tarefas pendentes:");
	        gestor.filtrarTarefas(tarefa -> tarefa.getStatus().equals(Status.PENDENTE))
	              .forEach(System.out::println);
	}
}
