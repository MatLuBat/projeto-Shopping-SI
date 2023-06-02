public class Cosmetico extends Loja {
    private double taxaComercializacao;
    public Cosmetico(double taxaComercializacao, String nome, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco endereco, Data data) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, data);
        this.taxaComercializacao = taxaComercializacao;
    }

    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }
}

