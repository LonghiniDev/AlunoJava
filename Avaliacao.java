package AEP2;

import java.util.ArrayList;
import java.util.List;

public class Avaliacao {
	
	private List <Avaliacao> Avaliacao = new ArrayList <Avaliacao> ();
	private float notaAluno;
	
	public Avaliacao(Aluno nomeAluno, Disciplina nomeDisciplina, float Nota) {
		this.notaAluno = Nota;
		this.getAluno(nomeAluno);
		this.getDisciplina(nomeDisciplina);
	}

	public float getNota() {
		return this.notaAluno;
	}
	
	public Disciplina getDisciplina(Disciplina nomeDisciplina) {
		return nomeDisciplina;
	}
	
	public Aluno getAluno(Aluno nomeAluno) {
		return nomeAluno;
	}

}
