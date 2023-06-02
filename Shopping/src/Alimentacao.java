public class Alimentacao extends Loja{
    private Data dataAlvara;
    public Alimentacao(Data dataAlvara, String nome, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco endereco, Data data) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, data);
        this.dataAlvara = dataAlvara;
    }

    public Data getDataAlvara() {
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }
}
