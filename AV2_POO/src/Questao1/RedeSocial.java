package Questao1;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class RedeSocial {
	private String dataCriacao;
	private String nomeUsuario;
	private String dataNascimento;
	private String Senha;
	
	ArrayList<Publicacao> publicacoes = new ArrayList<>();
	
		

	public RedeSocial(String dataCriacao, String nomeUsuario, String dataNascimento, String senha,
			ArrayList<Publicacao> publicacoes) {
		super();
		this.dataCriacao = dataCriacao;
		this.nomeUsuario = nomeUsuario;
		this.dataNascimento = dataNascimento;
		Senha = senha;
		this.publicacoes = publicacoes;
	}

	public RedeSocial() {
		
	}

	public void inserePublicacao(Publicacao publi) {
		publicacoes.add(publi);
	}
	
	public void imprimePublicacao() {
		Publicacao.setContadorPublicacao(publicacoes.size());
		JOptionPane.showMessageDialog(null,"total de Publicações: " + Publicacao.getContadorPublicacao());
		
		for(Publicacao publicacoes:publicacoes) {
			JOptionPane.showMessageDialog(null,"Data da Publicação: " + publicacoes.getDataPublicacao() + "\nTexto: " + publicacoes.getTextoPublicacao() + "\n Link: " + publicacoes.getLinkMidia());
		}
	}

	public String getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(String dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getSenha() {
		return Senha;
	}

	public void setSenha(String senha) {
		Senha = senha;
	}

	public ArrayList<Publicacao> getPublicacoes() {
		return publicacoes;
	}

	public void setPublicacoes(ArrayList<Publicacao> publicacoes) {
		this.publicacoes = publicacoes;
	}

	

}
