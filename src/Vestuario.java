public class Vestuario extends Produto {
    private String tamanho;
    private String cor;


    //Construtores
    public Vestuario(){}

    public Vestuario(String nome, double preco, int qtdProduto, String tamanho, String cor) {
        super(nome, preco, qtdProduto);
        this.tamanho = tamanho;
        this.cor = cor;
    }

    //Getters e setters
    public String getTamanho() {
        return tamanho;
    }
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "\nVestuario\n" +
                "nome: " + getNome() +
                ", preco: " + getPreco() +
                ", quantidade: " + getQtdProduto() +
                ", tamanho: " + tamanho +
                ", cor: " + cor;
    }

}
