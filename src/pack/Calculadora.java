package pack;

public class Calculadora implements interCalculadora{

	private int n1 = 0 ;
	private int n2 = 0 ;
	private int resultado = 0 ;
	private String operacao = "";
	
	
	
	public Calculadora () {
		System.out.println("Escolha um numero e a operação :");
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
	
	public String getOperacao() {
		return operacao;
	}
	public void setOperacao(String o) {
		this.operacao = o;
	}
	public int getResultado () {
		return resultado;
	}
	public void setResultado (int r) {
		this.resultado = r;
	}
	
	
	@Override
	public void somar() {
		if(this.getOperacao() {
			this.setResultado(this.getN1() + this.getN2());
			System.out.println(this.getN1() + " + " + this.getN2() + " = " + this.getResultado());
		}
	}
	@Override
	public void subtrair() {
		this.setResultado(this.getN1() - this.getN2());
		System.out.println(this.getN1() + " - " + this.getN2() + " = " + this.getResultado());
	}
	
	@Override
	public void multiplicar() {
		this.setResultado(this.getN1() * this.getN2());
		System.out.println(this.getN1() + " x " + this.getN2() + " = " + this.getResultado());
	}
	@Override
	public void dividir() {
		this.setResultado(this.getN1() / this.getN2());
		System.out.println(this.getN1() + " / " + this.getN2() + " = " + this.getResultado());
	}
	
	
}
