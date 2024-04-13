import java.util.Calendar;
import java.util.Date;

public class Despesa {

    // Atributos
    private String descricao;
    private int valor;
    private Date data = new Date();
    private Calendar calendario = Calendar.getInstance();
    private int dia;
    private int mes;
    private int ano;

    // Construtor
    public Despesa() {
        calendario.setTime(data);
        dia = calendario.get(Calendar.DAY_OF_MONTH);
        mes = calendario.get(Calendar.MONTH) + 1;
        ano = calendario.get(Calendar.YEAR);
    }

    // Getter & Setter
    public String getDescricao() {
        return this.descricao;
    }

    public int getValor() {
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

    /*
     * public void setData() {
     * 
     * }
     */

}
