package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class GestorDeTarefas {
	private List<Tarefa> tarefas;

	public GestorDeTarefas() {
		this.tarefas = new ArrayList<>();
	}
	
	public List<Tarefa> filtrarTarefas(Predicate<Tarefa> criterio) {
        return tarefas.stream()
                      .filter(criterio)
                      .collect(Collectors.toList());
    }

	public boolean adicionarTarefa(Tarefa t) {
		boolean foiAdicionada = tarefas.add(t); // tarefas.add(t) retorna false ou true;

		if (foiAdicionada) {
			return true;
		}
		return false;
	}

	public boolean removerTarefa(String titulo) { // remove por titulo;
		return tarefas.removeIf(t -> t.getTitulo().equals(titulo));
	}

	public void listarTarefasOrdenadas() {
		int tNums = 0;
		for (Tarefa t : tarefas) {
			tNums++;
			System.out.println("Tarefa #" + tNums + ": " + t.getTitulo());
		}
	}

	public void listarTarefasAltaPrioridadePendentes() {
		for (Tarefa t : tarefas) {
			if (t.getPrioridade().equals(Prioridade.ALTA) && t.getStatus().equals(Status.PENDENTE)) {
				System.out.println(t);
			}
		}
	}

	public long contarTarefasEmAndamento() {
		long tNums = 0;
		
		for (Tarefa t : tarefas) {
			if (t.getStatus().equals(Status.EM_ANDAMENTO)) {
				tNums++;
				System.out.println(t);
			}
		}
		
		return tNums;
	}
}
