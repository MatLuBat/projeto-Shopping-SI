public class Vestuario extends Loja{
    private boolean produtosImportados;

    public Vestuario(boolean produtosImportados, String nome, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco endereco, Data data) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, data);
        this.produtosImportados = produtosImportados;
    }

    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }
    public boolean getprodutosImportados(){
        return produtosImportados;
    }
}
