package classe;

public class Produtoteste {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook",2000.00);
		
		var p2 = new Produto();
		p2.nome = "Mouse";
		p2.preco = 200.00;
		
		Produto.desconto= 0.60;
		
		double precofinalp1 = p1.precoComDesconto();
		System.out.printf("O preço do final com desconto do %s ",p1.nome);
		System.out.printf("é de R$%.2f\n",precofinalp1);
		System.out.println(p1.nome + " R$" + p1.precoComDesconto());
		
		double precofinalp2 = p2.precoComDesconto(0.1);// desconto do produto + % que o gerente adicionar 0.1 é 10%
		System.out.printf("\nO preço do final com desconto do %s ",p2.nome);
		System.out.printf("é de R$%.2f",precofinalp2);
		
        double mediaCarrinho = (precofinalp1 +precofinalp2) / 2;
        System.out.printf("\nA média dos produtos é de: R$%.2f",mediaCarrinho);
	}

}
