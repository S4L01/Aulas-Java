//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Motorista motorista = new Motorista("Pablo","1000122323","40003",
            new Endereco("Algum lugar","21","ao lado de algo","400433","Salvador",UnidadeFederativa.BAHIA),Setor.OPERACAO,Sexo.MASCULINO,1500,"12/09","4004");
    Gerente gerente = new Gerente("Fran","1230013","10001",
            new Endereco("Nos predios","32","ao lado de outro predio","11043","salvador",UnidadeFederativa.BAHIA),Setor.OPERACAO,Sexo.FEMININO,3000.00,"17/05",Bonificacao.GERENTE);
    Diretor diretor = new Diretor("Salomao","10933292323","90023291",
            new Endereco("subida da favela","90","ao lado de uma casa","1009","salvador",UnidadeFederativa.BAHIA),Setor.RECURSOS_HUMANOS,Sexo.MASCULINO,2500.00,"10/01",Bonificacao.DIRETOR);
    Advogado advogado = new Advogado("Pablo","109921121","4400433131",
            new Endereco("perto de casas","12","ao lado de algo","131345345","salvador",UnidadeFederativa.BAHIA),Setor.RECURSOS_HUMANOS,Sexo.MASCULINO,4000.00,"11/03","900912");

        System.out.println(gerente.toString());
        System.out.println(diretor.toString());
        System.out.println(advogado.toString());
        System.out.println(motorista.toString());

    }
}