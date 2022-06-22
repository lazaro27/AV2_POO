package Questao2;

public class ProvaEnem {
	private int id_Prova;
	private String titulo;
	private int nota;
	
	
	public ProvaEnem(int id_Prova, String titulo, int nota) {
		super();
		this.id_Prova = id_Prova;
		this.titulo = titulo;
		this.nota = nota;
	}


	public ProvaEnem() {
		// TODO Auto-generated constructor stub
	}


	public int getId_Prova() {
		return id_Prova;
	}


	public void setId_Prova(int id_Prova) {
		this.id_Prova = id_Prova;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public int getNota() {
		return nota;
	}


	public void setNota(int nota) {
		this.nota = nota;
	}
	
	
	

}
