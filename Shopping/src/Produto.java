public class Produto {
    private String nome;
    private float preco;
    private Data validade;

    public Produto(String nome, float preco, Data data){
        this.nome = nome;
        this.preco = preco;
        this.validade = data;
    }

    public boolean estaVencido(Data data){
        int dia = data.getDia();
        int mes = data.getMes();
        int ano = data.getAno();
        int diav = validade.getDia();
        int mesv = validade.getMes();
        int anov= validade.getAno();
        if (anov <= ano){
            if (mesv <= mes){
                if (diav <= dia){
                    return false;
                }else {return false;}
            }else {return false;}
        }else {
            return true;
        }
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public Data getDataValidade() {
        return validade;
    }

    public void setDataValidade(Data data) {
        this.validade = validade;
    }
}
