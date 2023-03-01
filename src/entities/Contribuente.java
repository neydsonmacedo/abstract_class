package entities;

public abstract class Contribuente {
	String nome;
	Double rendaAnual;
	
	public Contribuente() {
		
	}
	
	public Contribuente(String nome, Double rendaAnual) {
		this.nome = nome;
		this.rendaAnual = rendaAnual;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getRendaAnual() {
		return rendaAnual;
	}
	
	public void setRendaAnual(Double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}
	
	public abstract double calculoImposto();
}
