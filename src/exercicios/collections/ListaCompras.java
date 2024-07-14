package exercicios.collections;

public class ListaCompras {

	// atributo
	private String nome;
	private double preco;
	private int quantidade;

	// Construtor criado para receber o item e criar um objeto tipo listaCompras
	public ListaCompras(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	// Metodo get criado para saber o tipo do produto, porque produto esta privado "Private String produto"
	public String getItem() {
		return nome;
	}
	
	//Sobreescrevendo o metodo toString para imprimir a descrição na classe CarrinhoCompras linhas 68 e 42

	@Override
	 public String toString() {
        return "ListaCompras{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
	}
	
	
	

}

