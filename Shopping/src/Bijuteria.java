public class Bijuteria extends Loja{
    private double metaVendas;
    public Bijuteria(double metaVendas, String nome, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco endereco, Data data) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, data);
        this.metaVendas = metaVendas;
    }

    public double getMetaVendas() {
        return metaVendas;
    }

    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }
}
