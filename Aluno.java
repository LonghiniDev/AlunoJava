package AEP2;

public class Aluno {
	
	private int ra;
	private String nomeAluno;

	public Aluno(int raAluno, String nomeAluno) {
		this.nomeAluno = nomeAluno;
		this.ra = raAluno;
		
	}
	
	public String getNome() {
		return this.nomeAluno;
	}
	
	public int getRA() {
		return this.ra;
	}

}
