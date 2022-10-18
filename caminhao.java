package heranca;

public class caminhao extends veiculo {
	private int eixos;
	
	public caminhao(String placa, int ano, int eixos) {
		super(placa, ano);
		this.eixos = eixos;
		
	}
	
	public caminhao() {
		
	}
    
	public int getEixos() {
		return eixos;
		
	}
	
	public void setEixos(int eixos) {
		this.eixos = eixos;
		
	}
	
	public void exibirDados() {
		System.out.println("A placa do veiculo é " + placa + "e o ano de fabricação é" + ano+ " a quantidade de eixos é" + eixos);
	}
}
