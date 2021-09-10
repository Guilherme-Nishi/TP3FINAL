package lojaRoupas;

import java.util.*;
public class Teste {
	
	 static Funcionario f;
	 static Cartao c;
	 static Endereco ed1;
	 static Endereco ed2;
	 
	 static Categoria ct;
	 static Produto p;
	 static Cliente cl;
	
	public static  void main(String[] args){
		
		c= new Cartao("3423423423",814,"Guilherme","17/03");
		ed1=new Endereco("73094520","Rua Jardins",23,"em frente a praça");
		ed2=new Endereco("43243244","Rua Palmeiras",54,"em frente ao estádio ");
		f= new Funcionario("Eduardo","6566","12345",ed1);
		ct= new Categoria("GG","Masculino","Adulto");
		p=new Produto("Camisa social",198.99,90,"vermelho",ct);
		cl=new Cliente ("José","233343","messi@hotmail.com",ed2);
		System.out.println("---------------------------------------------");
		System.out.println(f.toString());
		System.out.println("---------------------------------------------");
		System.out.println(c.toString());
		System.out.println("---------------------------------------------");
		System.out.println(ct.toString());
		System.out.println("---------------------------------------------");
		System.out.println(p.toString());
		System.out.println("---------------------------------------------");
		System.out.println(cl.toString());
		
	}
	

	
}