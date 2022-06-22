package Questao1;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		RedeSocial r1 = new RedeSocial();
		
		r1.setDataCriacao(JOptionPane.showInputDialog(null, "Digite a data da Criação:"));
		r1.setNomeUsuario(JOptionPane.showInputDialog(null, "Digite o Nome do Usuário: "));
		r1.setDataNascimento(JOptionPane.showInputDialog(null, "Digite a data do nescimento:"));
		r1.setSenha(JOptionPane.showInputDialog(null, "Digite a Senha: "));
		
		Publicacao p1 = new Publicacao();		
		Publicacao p2 = new Publicacao();
		
		p1.setDataPublicacao(JOptionPane.showInputDialog(null, "Digite a data da Publicação:"));
		p1.setTextoPublicacao(JOptionPane.showInputDialog(null, "Digite o texto da publicação:"));
		p1.setLinkMidia(JOptionPane.showInputDialog(null, "Digite o link da Mídia:"));
		
		p2.setDataPublicacao(JOptionPane.showInputDialog(null, "Digite a data da Publicação 2:"));
		p2.setTextoPublicacao(JOptionPane.showInputDialog(null, "Digite o texto da publicação 2:"));
		p2.setLinkMidia(JOptionPane.showInputDialog(null, "Digite o link da Mídia da publicação 2:"));
		
		
		r1.inserePublicacao(p1);
		r1.inserePublicacao(p2);
		
		r1.imprimePublicacao();
		
	}

}
