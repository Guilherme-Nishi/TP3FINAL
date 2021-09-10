package lojaRoupas;

public class Cliente extends Pessoa {

	private String emailCliente;
	private Cartao cartaoCliente;
	private Endereco endereco;
	
	public Cliente (String n,String s,String ec,Endereco ed2) {
		nome=n;
		senha=s;
		emailCliente=ec;
		endereco=ed2;
		
		

	}
	
	public String toString() {
		return "Nome do cliente: "+nome+" \nSenha do cliente: "+senha+" \nEmail do cliente "+emailCliente+endereco;
		
		
	}
	public  String getNome(){
		return nome;
		
	}
	
	public void   setNome(String nome) {
		this.nome=nome;
		
	}
	
	public  Cartao getCartao(){
		return cartaoCliente;
		
	}
	
	public void   setCartao(Cartao cartaoCliente) {
		this.cartaoCliente=cartaoCliente;
		
	}
	public Endereco getEndereco(){
		return endereco;
		
	}
	
	public void   setEndereço(Endereco endereco) {
		this.endereco=endereco;
		
	}
	
	public  String getEmail(){
		return emailCliente;
		
	}
	
	public void   setEmail(String emailCliente) {
		this.emailCliente=emailCliente;
		
	}
	public  String getSenha(){
		return senha;
		
	}
	
	public void   setSenha(String senha) {
		this.senha=senha;
		
	}
	
	
}