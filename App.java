package AEP2;

public class App {
	public static void main(String[] args) {
		Aluno Ana = new Aluno (1, "Ana");
		Aluno Gui = new Aluno (2, "Gui");
		Aluno Carlos = new Aluno (3, "Carlos");
		Aluno Pedro = new Aluno (4, "Pedro");
		Aluno Antonio = new Aluno (5, "Antonio");
		
		Disciplina alg = new Disciplina ("Algorítimos");
		Disciplina bd1 = new Disciplina ("Banco de Dados 1");
		Disciplina eng = new Disciplina ("Engenharia");
		Disciplina pro = new Disciplina ("Programação");
		
		Avaliacao av1 = new Avaliacao (Ana, alg, 10.0f);
		Avaliacao av2 = new Avaliacao (Ana, bd1, 8.0f);
		Avaliacao av3 = new Avaliacao (Ana, eng, 4.0f);
		Avaliacao av4 = new Avaliacao (Ana, pro, 7.0f);
		
		Avaliacao av5 = new Avaliacao (Gui, alg, 2.0f);
		Avaliacao av6 = new Avaliacao (Gui, bd1, 3.0f);
		Avaliacao av7 = new Avaliacao (Gui, eng, 7.0f);
		Avaliacao av8 = new Avaliacao (Gui, pro, 4.0f);
		
		Avaliacao av9 = new Avaliacao (Carlos, alg, 8.0f);
		Avaliacao av10 = new Avaliacao (Carlos, bd1, 8.0f);
		Avaliacao av11 = new Avaliacao (Carlos, eng, 5.0f);
		Avaliacao av12 = new Avaliacao (Carlos, pro, 4.0f);
		
		Avaliacao av13 = new Avaliacao (Pedro, alg, 6.0f);
		Avaliacao av14 = new Avaliacao (Pedro, bd1, 6.0f);
		Avaliacao av15 = new Avaliacao (Pedro, eng, 6.0f);
		Avaliacao av16 = new Avaliacao (Pedro, pro, 6.0f);
		
		Avaliacao av17 = new Avaliacao (Antonio, alg, 6.0f);
		Avaliacao av18 = new Avaliacao (Antonio, bd1, 8.0f);
		Avaliacao av19 = new Avaliacao (Antonio, eng, 10.0f);
		Avaliacao av20 = new Avaliacao (Antonio, pro, 10.0f);
		
		RepositorioDeAvaliacao repo = new RepositorioDeAvaliacao();
		repo.adicionar(av1);
		repo.adicionar(av2);
		repo.adicionar(av3);
		repo.adicionar(av4);
		repo.adicionar(av5);
		repo.adicionar(av6);
		repo.adicionar(av7);
		repo.adicionar(av8);
		repo.adicionar(av9);
		repo.adicionar(av10);
		repo.adicionar(av11);
		repo.adicionar(av12);
		repo.adicionar(av13);
		repo.adicionar(av14);
		repo.adicionar(av15);
		repo.adicionar(av16);
		repo.adicionar(av17);
		repo.adicionar(av18);
		repo.adicionar(av19);
		repo.adicionar(av20);
		
		Aluno[] AprovadosEmAlg = repo.obterAprovados (alg);
		Aluno[] AprovadosEmBd1 = repo.obterAprovados (bd1);
		Aluno[] AprovadosEng = repo.obterAprovados (eng);
		Aluno[] AprovadosEmPro = repo.obterAprovados (pro);
		
		System.out.println(Ana.getNome());
		System.out.println(Ana.getRA());
		
		System.out.println(Gui.getNome());
		System.out.println(Gui.getRA());
		
		System.out.println(Carlos.getNome());
		System.out.println(Carlos.getRA());
		
		System.out.println(Pedro.getNome());
		System.out.println(Pedro.getRA());
		
		System.out.println(Antonio.getNome());
		System.out.println(Antonio.getRA());
		
		System.out.println(av1.getNota());
		System.out.println(av2.getNota());
		System.out.println(av3.getNota());
		System.out.println(av4.getNota());
		System.out.println(av5.getNota());
		
		System.out.println(av6.getNota());
		System.out.println(av7.getNota());
		System.out.println(av8.getNota());
		System.out.println(av9.getNota());
		System.out.println(av10.getNota());
		
		System.out.println(av11.getNota());
		System.out.println(av12.getNota());
		System.out.println(av13.getNota());
		System.out.println(av14.getNota());
		System.out.println(av15.getNota());
		
		System.out.println(av16.getNota());
		System.out.println(av17.getNota());
		System.out.println(av18.getNota());
		System.out.println(av19.getNota());
		System.out.println(av20.getNota());
		
		System.out.println(alg.getNome());
		System.out.println(bd1.getNome());
		System.out.println(eng.getNome());
		System.out.println(pro.getNome());
		
	}
}
