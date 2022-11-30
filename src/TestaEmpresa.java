public class TestaEmpresa {

    public static void main(String[] args) {
        Empresa empresa = new Empresa("godofredo",3109876);

        Funcionario f1 = new Funcionario();
        f1.Salario(1000);
        empresa.adiciona(f1);
        Funcionario f2 = new Funcionario();
        f2.salario = 1700;
        empresa.adiciona(f2);

    }
}
