public class Eletronico extends Produto{
    private String marca;
    private String modelo;

    //Construtores
    public Eletronico(){

    }
    public Eletronico(String nome, double preco, int qtdProduto, String marca, String modelo){
        super(nome, preco, qtdProduto);
        this.marca = marca;
        this.modelo = modelo;
    }

    //getters e setters

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "\nEletronico\n" +
        "nome: " + getNome() +
        ", preco: " + getPreco() +
        ", quantidade: " + getQtdProduto() +
        ", marca: " + marca +
        ", modelo: " + modelo;
    }

}
