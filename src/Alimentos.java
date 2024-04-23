public class Alimentos extends Produto{
    private String dataVal;
    private String fornecedor;

    //Construtores 
    public Alimentos(){

    }

    public Alimentos(String nome, double preco, int qtdProduto, String DataVal, String fornecedor) {
    super(nome, preco, qtdProduto);
    this.dataVal = dataVal;
    this.fornecedor = fornecedor;
    }

    //getters e setters
    public String getDataVal() {
    return dataVal;
    }
    public void setDataVal(String dataVal) {
        this.dataVal = dataVal;
    }
    public String getFornecedor() {
        return fornecedor;
    }
    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }


    @Override
    public String toString() {
        return "\nAlimentos\n" +
                "nome: " + getNome() +
                ", preco: " + getPreco() +
                ", quantidade: " + getQtdProduto() +
                ", dataValidade: " + dataVal +
                ", fornecedor: " + fornecedor;
    }

}
