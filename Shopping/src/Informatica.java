public class Informatica extends Loja{
    private  double seguroEletronicos;
    public Informatica(double seguroEletronicos,String nome, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco endereco, Data data) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, data);
        this.seguroEletronicos = seguroEletronicos;
    }

    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }
}
