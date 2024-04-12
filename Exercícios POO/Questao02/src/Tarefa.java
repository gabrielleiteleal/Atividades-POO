public class Tarefa {

    // Atributos encapsulados
    private String descrição;
    private boolean concluida;
    private int id;

    // Construtor
    public Tarefa() {
    }

    // Adicionar tarefa
    public void novaTarefa(String desc) {
        setDescrição(desc);
    }

    // Getter & Setter
    public String getDescrição() {
        return this.descrição;
    }

    public boolean isConcluida() {
        return this.concluida;
    }

    public int getId() {
        return this.id;
    }

    public void setDescrição(String d) {
        this.descrição = d;
    }

    public void setConcluida(boolean c) {
        this.concluida = c;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void pegarId() {
        System.out.println("ID: " + this.getId());
    }
}
