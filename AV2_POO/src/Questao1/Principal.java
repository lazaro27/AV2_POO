package Questao1;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		RedeSocial r1 = new RedeSocial();
		
		r1.setDataCriacao(JOptionPane.showInputDialog(null, "Digite a data da Cria��o:"));
		r1.setNomeUsuario(JOptionPane.showInputDialog(null, "Digite o Nome do Usu�rio: "));
		r1.setDataNascimento(JOptionPane.showInputDialog(null, "Digite a data do nescimento:"));
		r1.setSenha(JOptionPane.showInputDialog(null, "Digite a Senha: "));
		
		Publicacao p1 = new Publicacao();		
		Publicacao p2 = new Publicacao();
		
		p1.setDataPublicacao(JOptionPane.showInputDialog(null, "Digite a data da Publica��o:"));
		p1.setTextoPublicacao(JOptionPane.showInputDialog(null, "Digite o texto da publica��o:"));
		p1.setLinkMidia(JOptionPane.showInputDialog(null, "Digite o link da M�dia:"));
		
		p2.setDataPublicacao(JOptionPane.showInputDialog(null, "Digite a data da Publica��o 2:"));
		p2.setTextoPublicacao(JOptionPane.showInputDialog(null, "Digite o texto da publica��o 2:"));
		p2.setLinkMidia(JOptionPane.showInputDialog(null, "Digite o link da M�dia da publica��o 2:"));
		
		
		r1.inserePublicacao(p1);
		r1.inserePublicacao(p2);
		
		r1.imprimePublicacao();
		
	}

}
