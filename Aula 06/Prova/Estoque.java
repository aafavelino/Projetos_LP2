import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class Estoque
{
	ArrayList<Produto> listaProduto;
	ArrayList<SolicitacaoEstoque> listadesolicitacoes;

	public Estoque()
	{
		listaProduto = new ArrayList();
		listadesolicitacoes = new ArrayList();
	}

	public void addProduto(Produto produto)
	{
		if (produto.getQuantidade() > 0) 
		{
			listaProduto.add(produto);			
		}
		else
		{
			JOptionPane.showMessageDialog(null, produto.getNomeProd() + "com quantidade inválida.");
		}

	}
	public void removerProduto(Produto produto)
	{
		int indice = this.listaProduto.indexOf(produto);
		if (indice >= 0) 
		{
			this.listaProduto.remove(produto);
		}
		
	}

	public void listarProdutos()
	{
		for (Produto p : listaProduto) 
		{
			System.out.println(p.getNomeProd());
		}
	}

	public void solicitarProduto(Usuario solicitante, Produto produto, int quantidade)
	{
		if (this.listaProduto.indexOf(produto) > 0 && quantidade > 0) 
		{
			listadesolicitacoes.add(new SolicitacaoEstoque(solicitante, produto, quantidade));
			listaProduto.get(this.listaProduto.indexOf(produto)).setQuantidade(this.listaProduto.indexOf(produto) - quantidade);
		}
		else
		{
			JOptionPane.showMessageDialog(null, produto.getNomeProd() + "nao existe no estoque ou nao tem estoque disponivel...");
		}


	}
	public void listarSolicitacoes()
	{
		for(SolicitacaoEstoque x : listadesolicitacoes)
		{
			System.out.println(x.getNomeProd() + " quantidade: " + x.getQuantidade());
		}
	}

	public void buscarProdutos(String nome)
	{
		Iterator<Produto> it = listaProduto.iterator();
		int i = 0;

		while(it.hasNext())
		{
			Produto comp = it.next();
			if (comp.getNomeProd().equals(nome)) 
			{
				JOptionPane.showMessageDialog(null, comp.getCodigo() + " " + comp.getNomeProd() + " (" + comp.getQuantidade() + ")");
				i++;
			}
		}
		if (i > 0) 
		{	
			JOptionPane.showMessageDialog(null, "Produto não encontrado...");
		}
	}


}





















