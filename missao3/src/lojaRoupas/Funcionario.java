package lojaRoupas;
import java.util.*;
public class Funcionario extends Pessoa {
	private String identificador;
	private Endereco endereco;
	
	public Funcionario(String n,String i,String s,Endereco ed1){
		nome=n;
		identificador=i;
		senha=s;
		endereco=ed1;
		
	}
	
	

	public String toString() {
		return "Nome do funcion�rio: " + nome + " \nID do funcion�rio:" + identificador+" \nSenha do funcion�rio "+senha+endereco;
	}
	public String getIdentificador() {
		return identificador;
	}
	
	public void setIdentificador(String identificador) {
		this.identificador=identificador;
	}
	public  String getNome(){
		return nome;
		
	}
	
	public void   setNome(String nome) {
		this.nome=nome;
		
	}
	
	public Endereco getEndereco(){
		return endereco;
		
	}
	
	public void   setEndereco(Endereco endereco) {
		this.endereco=endereco;
		
	}
	
	public  String getSenha(){
		return senha;
		
	}
	
	public void   setSenha(String senha) {
		this.senha=senha;
		
	}
}