public class Aluno {

    // Atributos encapsulados
    private String nome;
    private int matricula;
    private double nota1;
    private double nota2;
    private double media;

    // Construtor
    public Aluno(String n, int m, double n1, double n2) {
        this.nome = n;
        this.matricula = m;
        this.nota1 = n1;
        this.nota2 = n2;
    }

    // ToString()
    @Override
    public String toString() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("Nota 1: " + this.nota1);
        System.out.println("Nota 2: " + this.nota2);
        System.out.println("Média: " + this.media);
        return super.toString();
    }

    // Getter & Setter
    public String getNome() {
        return this.nome;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public double getNota1() {
        return this.nota1;
    }

    public double getNota2() {
        return this.nota2;
    }

    public double getMedia() {
        return this.media;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public void setMatricula(int m) {
        this.matricula = m;
    }

    public void setNota1(double n1) {
        this.nota1 = n1;
    }

    public void setNota2(double n2) {
        this.nota2 = n2;
    }

    public void setMedia(double me) {
        this.media = me;
    }
}
