package tabuleiro;

public class Posicao {

	//Criando atributos das posições do tabuleiro.
	private int linha;
	private int coluna;
	
	//Criando os construtores.
	public Posicao(int linha, int coluna) {
		this.linha = linha;
		this.coluna = coluna;
	}
	
	public void setLinha(int linha) {
		this.linha = linha;
	}
	
	public int getLinha() {
		return linha;
	}
	
	public void setColuna(int coluna) {
		this.coluna = coluna;
	}
	
	@Override
	public String toString() {
		return linha + ", " + coluna;
	}

}
