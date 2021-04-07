package aulas;

public class Aluno{

	private String aluno;
	private Integer matricula;
	
	public Aluno(){
		
	}
	
	public Aluno(String aluno, Integer matricula){
		this.aluno = aluno;
		this.matricula = matricula;
	}
	
	public String getAluno(){
		return aluno;
	}
	
	public void setAluno(String aluno){
		this.aluno = aluno;
	}
	
	public Integer getMatricula(){
		return matricula;
	}
	
	public void setMatricula(int matricula){
		this.matricula = matricula;	
	}
}
