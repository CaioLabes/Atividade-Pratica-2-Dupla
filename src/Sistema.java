import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
    private static ArrayList<Produto> produtos = new ArrayList<>();
    private static Scanner Leitor = new Scanner(System.in);



    public static void menuProdutos() {
        //Menu que será exibido
        int opcao;
        do {
            System.out.println("----- MENU -----");
            System.out.println("1. Cadastrar Produto");
            System.out.println("2. Buscar Produto");
            System.out.println("3. Excluir Produto");
            System.out.println("4. Listar todos os Produtos");
            System.out.println("5. Excluir todos os Produtos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = Leitor.nextInt();
            //switch do menu 
            switch (opcao) {
                case 1:
                    System.out.println("Selecione o tipo de produto a cadastrar:");
                    System.out.println("1. Eletrônico");
                    System.out.println("2. Alimento");
                    System.out.println("3. Vestuário");
                    int tipo = Leitor.nextInt();
                    Leitor.nextLine();

                    System.out.print("Digite o nome do produto: ");
                    String nome = Leitor.nextLine();
                    System.out.print("Digite o preço do produto: ");
                    double preco = Leitor.nextDouble();
                    System.out.print("Digite a quantidade do produto: ");
                    int qtdProduto = Leitor.nextInt();
                    //Switch para qual categoria o cadastro vai
                    switch (tipo) {
                        case 1:
                            Leitor.nextLine();
                            System.out.print("Digite a marca do produto eletrônico: ");
                            String marca = Leitor.nextLine();
                            System.out.print("\nDigite o modelo do produto eletrônico: ");
                            String modelo = Leitor.nextLine();
                            produtos.add(new Eletronico(nome, preco, qtdProduto, marca, modelo));
                            break;
                        case 2:
                            Leitor.nextLine();
                            System.out.print("Digite a data de validade do alimento: ");
                            String dataVal = Leitor.nextLine();
                            System.out.print("\nDigite o fornecedor do alimento: ");
                            String fornecedor = Leitor.nextLine();
                            produtos.add(new Alimentos(nome, preco, qtdProduto, dataVal, fornecedor));
                            break;
                        case 3:
                            Leitor.nextLine();
                            System.out.print("Digite o tamanho do vestuário: ");
                            String tamanho = Leitor.nextLine();
                            System.out.print("\nDigite a cor do vestuário: ");
                            String cor = Leitor.nextLine();
                            produtos.add(new Vestuario(nome, preco, qtdProduto, tamanho, cor));
                            break;
                        default:
                            System.out.println("Opção inválida.");
                        }
                    System.out.println("Produto cadastrado com sucesso!");

                    break;
                //busca de produto
                case 2:
                    Leitor.nextLine();
                    System.out.print("Digite o nome do produto a ser buscado: ");
                    String nomeBusca = Leitor.nextLine();
                    boolean encontrado = false;
                    for (Produto produto : produtos) {
                        if (produto.getNome().equalsIgnoreCase(nomeBusca)) {
                            System.out.println("Produto encontrado:");
                            System.out.println(produto);
                            encontrado = true;
            
                        } else if(!encontrado){
                            System.out.println("Pdoruto não encontrado.");
                        }
                    }
                    break;
                //exclusão de produto
                case 3:
                Leitor.nextLine();
                System.out.print("Digite o nome do produto a ser excluído: ");
                String nomeExclusao = Leitor.nextLine();
                boolean removido = false;
                for (Produto produto : produtos) {
                    if (produto.getNome().equalsIgnoreCase(nomeExclusao)) {
                        produtos.remove(produto);
                        removido = true;
                        System.out.println("Produto excluído com sucesso!");
                        break;
                    }
                }
                if (!removido) {
                    System.out.println("Produto não encontrado.");
                }
                    break;
                //listagem de todos os produtos cadastrados
                case 4:
                    if (produtos.isEmpty()) {
                        System.out.println("Nenhum produto cadastrado.");
                    } else {
                        System.out.println("Lista de produtos cadastrados:");
                        for (Produto produto : produtos) {
                            System.out.println(produto);
                        }
                    }
                    break;
                //exclusão de todos os produtos cadastrados
                case 5:
                    produtos.clear();
                    System.out.println("Todos os produtos foram excluídos.");
                    break;
                case 0:
                    System.out.println("Saindo, Obrigado por usar o programa...\nFeito por Caio Labes e Lucas Zelleroff");
                    break;
                default:
                    System.out.println("Opção inválida. Tente digitar outro valor.");
                    break;
            }
        } while (opcao != 0);
    }
}
