package oo.composicao;

public class CursoTeste {
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("joao");
		Aluno aluno2 = new Aluno("pedro");
		Aluno aluno3 = new Aluno("maria");
		
		Curso curso1 = new Curso("Java completo");
		Curso curso2 = new Curso("Web completo");
		Curso curso3 = new Curso("React Native");
		
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno3);
		
		aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);
		
		for(Aluno aluno: curso1.alunos) {
			System.out.println(aluno.nome);
		}
		
		Curso cursoEncontrado = aluno1.obterCursoPorNome("Java completo");
		
		if(cursoEncontrado != null) {
			System.out.println("o curso eh " + cursoEncontrado.nome);
		}
	}
	
	
}
