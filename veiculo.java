package heranca;

public class veiculo {
	protected String placa;
	protected int ano;
	
	public veiculo(String placa, int ano) {
		this.placa = placa;
		this.ano = ano;
		
	}
    public veiculo() {
    	
    }
    public String getPlaca() {
    	return placa;
    }
    public int getAno() {
    	return ano;
    }
    public void setAno(int ano) {
    	this.ano=ano;
    }
    public void exibirDados() {
    	System.out.println("A placa do veiculo é" + placa + "e o ano de fabricacao é" + ano );
    }
}

