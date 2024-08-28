public class Advogado extends Funcionario{
    private String oab;

    public Advogado(String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salario, String dataNascimento, String oab) {
        super(nome, cpf, rg, endereco, setor, sexo, salario, dataNascimento);
        this.oab = oab;
    }

    public String getOab() {
        return oab;
    }

    public void setOab(String oab) {
        this.oab = oab;
    }

    @Override
    public String toString() {
        return "\nAdvogado:" +
                "\nOab:" + oab +
                super.toString()+
                "\nSalario Final:"+getSalarioFinal(salario)
        ;

    }

    @Override
    public double getSalarioFinal(double salario) {
        return this.salario;
    }
}
