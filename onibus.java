/**
 * 
 */
package heranca;


public class onibus extends veiculo {
	private int assentos;
	
	public onibus(String placa, int ano, int assentos) {
		super(placa, ano);
		this.assentos = assentos;
		
	}
	
	public int getAssentos() {
		return assentos;
	}
	
	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}
	
	public void exibirDados() {
		System.out.println("A placa do veiculo é" + placa + "e o ano de fabricação é" + ano + "o numero de assentos é " + assentos);
	}
	
	

}
