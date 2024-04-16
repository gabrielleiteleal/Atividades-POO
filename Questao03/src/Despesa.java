import java.util.Calendar;
import java.util.Date;

public class Despesa {

    // Atributos
    private String descricao;
    private double valor;
    private Date data = new Date();
    private Calendar calendario = Calendar.getInstance();
    private int dia;
    private int mes;
    private int ano;

    // Construtor
    public Despesa() {

    }

    // Adicionar despesa
    public void novaDespesa(String desc, int val) {
        this.descricao = desc;
        this.valor = val;
        calendario.setTime(data);
        this.dia = calendario.get(Calendar.DAY_OF_MONTH);
        this.mes = calendario.get(Calendar.MONTH) + 1;
        this.ano = calendario.get(Calendar.YEAR);
    }

    //ToString
    public void detalhes(){
        System.out.println("==============================");
        System.out.println(getDescricao());
        if(getValor() >= 0){
            System.out.println("+R$ " + getValor());
        }else{
            System.out.println("-R$ " + getValor());
        }
        System.out.println(this.dia + "/" + this.mes + "/" + this.ano);
        System.out.println("==============================");
    }

    // Getter & Setter
    public String getDescricao() {
        return this.descricao;
    }

    public double getValor() {
        return this.valor;
    }

    public void getData() {
        calendario.setTime(data);
        dia = calendario.get(Calendar.DAY_OF_MONTH);
        mes = calendario.get(Calendar.MONTH) + 1;
        ano = calendario.get(Calendar.YEAR);

    }

    public void setDescricao(String desc) {
        this.descricao = desc;
    }

    public void setValor(int v) {
        this.valor = v;
    }

}
