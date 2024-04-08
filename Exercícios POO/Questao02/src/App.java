public class App {
    public static void main(String[] args) throws Exception {
        
        Tarefa t1 = new Tarefa("Lavar a louça");
        Tarefa t2 = new Tarefa("Estudar");
        ListaDeTarefas lista = new ListaDeTarefas();

        lista.adicionarTarefa(t1);
        lista.adicionarTarefa(t2);
        lista.listarTarefas();

    }
}
