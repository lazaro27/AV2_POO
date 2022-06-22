package Questao2;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		AlunoEnem aluno1 = new AlunoEnem();
		
		int qtde = 0;
		int total = 0;
		
		aluno1.setId_aluno(Integer.parseInt(JOptionPane.showInputDialog("Digite o id do Aluno: ")));
		aluno1.setNome(JOptionPane.showInputDialog("Digite o nome do Aluno: "));
		aluno1.setAno(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do Aluno: ")));
			
		
		ArrayList<ProvaEnem> provas = new ArrayList<>();
		
		qtde = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de provas(Mínimo 5): "));
		
		while(qtde < 5) {
			
			qtde = Integer.parseInt(JOptionPane.showInputDialog("A QUANTIDADE DEVE SER DE NO MÍNIMO 5\nDIGITE UMA QUANTIADE VÁLIDA>>> "));		
		}
		
		ProvaEnem p1 = new ProvaEnem();
		
		for(int i = 0; i<qtde; i++) {		
			p1.setId_Prova(Integer.parseInt(JOptionPane.showInputDialog("Digite o id da Prova " + (i+1) +" :")));
			p1.setTitulo(JOptionPane.showInputDialog("Digite o titulo da prova: "+ (i+1) +" :"));
			p1.setNota(Integer.parseInt(JOptionPane.showInputDialog("Digite a nota da Prova " + (i+1) +" :")));
			
			provas.add(p1);
		}
		
		JOptionPane.showMessageDialog(null, "O total de notas inseridas e: " + provas.size());
		
		for(int i = 0; i<provas.size();i++) {
			
			total += provas.get(i).getNota();
		}
		
		JOptionPane.showMessageDialog(null, "A soma das notas inseridas e :" + total);
		
		
		
		
	}

}
