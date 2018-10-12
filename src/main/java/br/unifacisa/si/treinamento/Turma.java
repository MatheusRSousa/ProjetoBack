package br.unifacisa.si.treinamento;



import java.util.ArrayList;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Turma {
	@Id
	private Long ID;
	@DBRef
	private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	@DBRef
	private Sala sala;
	private Integer periodo;
	
	
	
	public Turma(ArrayList<Aluno> alunos, Sala sala, Integer periodo) {
		super();
		this.alunos = alunos;
		this.sala = sala;
		this.periodo = periodo;
	}
	public Long getID() {
		return ID;
	}
	public void setID(Long iD) {
		ID = iD;
	}
	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}
	public Sala getSala() {
		return sala;
	}
	public void setSala(Sala sala) {
		this.sala = sala;
	}
	public Integer getPeeriodo() {
		return periodo;
	}
	public void setPeeriodo(Integer peeriodo) {
		this.periodo = peeriodo;
	}
	@Override
	public String toString() {
		return "Turma [ID=" + ID + ", alunos=" + alunos + ", sala=" + sala + ", peeriodo=" + periodo + "]";
	}
	
	
	
	
}
