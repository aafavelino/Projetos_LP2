import java.time.LocalDate;
import javax.swing.JOptionPane;

public class SolicitacaoEstoque
{
	private Usuario solicitante;
	private Produto produto;
	private int quantidade;
	private LocalDate data_solicitacao;

	public SolicitacaoEstoque(Usuario solicitante, Produto produto, int quantidade)
	{
		this.solicitante = solicitante;
		this.produto = produto;
		this.quantidade = quantidade;
		this.data_solicitacao = LocalDate.now();
	}

	public String getSolicitante()
	{
		return this.solicitante.getNome();
	}

	public String getProduto()
	{
		return this.produto.getNomeProd();
	}
}