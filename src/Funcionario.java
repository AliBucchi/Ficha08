
public class Funcionario {

    private String nome, departamento, dataEntrada, bi;
    public double salario;
    private static int identificador = 0;

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getDepartamento() { return departamento; }
    public void setDepartamento(String departamento) { this.departamento = departamento; }

    public String getDataEntrada() { return dataEntrada; }
    public void setDataEntrada(String dataEntrada) { this.dataEntrada = dataEntrada; }

    public String getBi() { return bi; }
    public void setBi(String bi) { this.bi = bi; }

    public double getSalario() { return salario; }
    public void setNome(double salario) { this.salario = salario; }

    public int getIdentificador() { return identificador; }
    public void setIdentificador(int identificador) { Funcionario.identificador = identificador; }

    public Funcionario(){
        Funcionario.identificador++;
    }

    public Funcionario(String nome) {
        Funcionario.identificador++;
        this.nome = nome;
    }

    public void recebeAumento(double aumento) {
    }

    public double calculaGanhoAnual() {
        return 10;
    }

    public double calculaHoraExtra(int hora) {
        return 10;
    }

    public double getBonificacao(){
        return 10;
    }

}
