package Pizzaria;

public class Pizza {
	
	private int codigo;
	public String sabor;
	public String queijo;
	public String borda;
	public String ingrediente1;
	public String ingrediente2;
	public String ingrediente3;
	public String ingrediente4;
	private double valor;
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	Pizza(){
		
	}
	
	Pizza(int codigo, String sabor, String queijo, String borda, String ingrediente1, double valor){
		this.sabor = sabor;
		this.codigo = codigo;
		this.codigo = codigo;
		this.queijo = queijo;
		this.borda = borda;
		this.ingrediente1 = ingrediente1;
		this.valor = valor;
	}
	
	Pizza(int codigo, String sabor, String queijo, String borda, String ingrediente1, String ingrediente2, double valor){
		this.sabor = sabor;
		this.codigo = codigo;
		this.queijo = queijo;
		this.borda = borda;
		this.ingrediente1 = ingrediente1;
		this.ingrediente2 = ingrediente2;
		this.valor = valor;
	}
	
	Pizza(int codigo, String sabor, String queijo, String borda, String ingrediente1, String ingrediente2, String ingrediente3, double valor){
		this.sabor = sabor;
		this.codigo = codigo;
		this.queijo = queijo;
		this.borda = borda;
		this.ingrediente1 = ingrediente1; 
		this.ingrediente2 = ingrediente2;
		this.ingrediente3 = ingrediente3;
		this.valor = valor;
	}
	
	Pizza(int codigo, String sabor, String queijo, String borda, String ingrediente1, String ingrediente2, String ingrediente3, String ingrediente4, double valor){
		this.sabor = sabor;
		this.codigo = codigo;
		this.queijo = queijo;
		this.borda = borda;
		this.ingrediente1 = ingrediente1; 
		this.ingrediente2 = ingrediente2;
		this.ingrediente3 = ingrediente3;
		this.ingrediente4 = ingrediente4;
		this.valor = valor;
	}
}
