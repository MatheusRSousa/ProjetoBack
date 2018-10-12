package br.unifacisa.si.treinamento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.unifacisa.si.treinamento.service.AlunoService;

//import br.unifacisa.si.treinamento.App;


@EnableAutoConfiguration
@SpringBootApplication
public class App implements CommandLineRunner{
	@Autowired
	AlunoService alunoService;
	
	public static void main(String[] args) {
	SpringApplication.run(App.class,args);
	}
	@Override
	public void run(String... args) throws Exception
	{
		Aluno aluno = new Aluno();
		aluno.setNome("Matheus");
		aluno.setRegistro(1813080010);
		
		alunoService.addAluno(aluno);
		
		System.out.println("ID: " + aluno.getID() + " NOME: " + aluno.getNome()+" MATRICULA: "+ aluno.getRegistro()); {
			
		}
	}
}
