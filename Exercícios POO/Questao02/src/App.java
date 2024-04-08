public class App {
    public static void main(String[] args) throws Exception {

        Tarefa t1 = new Tarefa("Lavar a louça");
        Tarefa t2 = new Tarefa("Estudar");
        Tarefa t3 = new Tarefa("Academia");
        ListaDeTarefas lista = new ListaDeTarefas();

        // Adicionando tarefas à lista
        lista.adicionarTarefa(t1);
        lista.adicionarTarefa(t2);
        lista.adicionarTarefa(t3);

        // Tarefa concluída
        lista.tarefaConcluida(t1);

        // Listar todas as tarefas
        lista.listarTarefas();

        lista.removerTarefa(t2);

        // Teste getId
        // t3.pegarId();

    }
}
