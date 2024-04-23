public class Produto {
    protected String nome;
    protected double preco;
    protected int qtdProduto;

    //Construtores 
    public Produto(){

    }
    public Produto(String nome, double preco, int qtdProduto) {
        this.nome = nome;
        this.preco = preco;
    }
    //getters e setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getQtdProduto() {
        return qtdProduto;
    }
    public void setQtdProduto(int qtdProduto) {
        this.qtdProduto = qtdProduto;
    }
}
