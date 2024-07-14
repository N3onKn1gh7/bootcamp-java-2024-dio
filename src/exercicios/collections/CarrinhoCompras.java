package exercicios.collections;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {

	// atributo
	private List<ListaCompras> produtoMercado; // utlizando uma List com generics <>com o elemento ListaCompras dentro
												// <ListaCompras>

	// Criando um Constructor para que, ao chamar um objeto do tipo CarrinhoCompras
	// criar uma List vazia para poder adicionar/remover elementos, obter total de
	// produtos, etc
	public CarrinhoCompras() {
		this.produtoMercado = new ArrayList<>();
	}

	// Implementando métodos:

	// 1º método adicionar itens
	public void adicionarItem(String nome, double preco, int quantidade) {
		produtoMercado.add(new ListaCompras(nome, preco, quantidade));
	}

	// 2º método remover um produto
	public void removerItem(String item) {
		List<ListaCompras> itensParaRemover = new ArrayList<>(); // Criando uma lista vazia chamada
																	// produtosParaRemover
		for (ListaCompras p : produtoMercado) {
			if (p.getItem().equalsIgnoreCase(item)) {
				itensParaRemover.add(p);
			}
		}
		produtoMercado.removeAll(itensParaRemover); // RemoveAll remove todos elementos repetidos (se hover)
	}

	public int obterNumeroTotalItem() {
		return produtoMercado.size();
	}

	public void obterDescricoesItem() {
		System.out.println(produtoMercado);
	}
	
	//Testando o codigo com o metodo main
	
	public static void main(String[] args) {
		CarrinhoCompras carrinhoCompras = new CarrinhoCompras();//Para testar com main devemos criar um objeto tipo CarrinhoCompras
		
		//Chamando o metodo de verificar quantidade no carrinho(imprime 0 porque ainda não foi adicionado nada
		
		System.out.println("O numero de itens no carrinho é " + carrinhoCompras.obterNumeroTotalItem());
		
		//adicionando um item no carrinho e imprimindo a quantidade de itens
		
		carrinhoCompras.adicionarItem("Produto 1", 10.0, 2);
		carrinhoCompras.adicionarItem("produto 2",15.5, 1);
		carrinhoCompras.adicionarItem("produto 3", 7.25, 5);
		System.out.println("O numero de itens no carrinho é " + carrinhoCompras.obterNumeroTotalItem());
		
		//Removendo itens
		carrinhoCompras.removerItem("produtoMercado 1");
		System.out.println("O numero de itens no carrinho é " + carrinhoCompras.obterNumeroTotalItem());
		
		//Obtendo descrição do item
		//Na classe ListaCompras tem que ser feito um toString para 
		carrinhoCompras.obterDescricoesItem(); //Apenas chamando pq já é um Sysout (na linha 42)
	}
	
}

