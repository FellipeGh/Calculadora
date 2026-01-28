package pack;

public class Calculadora implements interCalculadora{

	private int n1 = 0 ;
	private int n2 = 0 ;
	private int resultado = 0 ;
	
	
	
	public Calculadora () {
		
	}
	
	
	public int getN1() {
		return n1;
	}
	public void setN1(int n) {
		this.n1 = n;
	}
	
	public int getN2() {
		return n2;
	}
	public void setN2 (int n) {
		this.n2 = n;
	}
	
	public int getResultado () {
		return resultado;
	}
	public void setResultado (int r) {
		this.resultado = r;
	}
	@Override
	public void somar() {
		this.setResultado(this.getN1() + this.getN2());
	}
	@Override
	public void subtrair() {
		this.setResultado(this.getN1() - this.getN2());
	}
	
	@Override
	public void multiplicar() {
		this.setResultado(this.getN1() * this.getN2());
		System.out.println(this.getN1() + " x " + this.getN2() + " = " + this.getResultado());
	}
	@Override
	public void dividir() {
		this.setResultado(this.getN1() / this.getN2());
	}
	
	
}
