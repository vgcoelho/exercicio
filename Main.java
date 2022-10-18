/**
 * 
 */
package heranca;

import java.util.ArrayList; ;



public class Main {
	

	
	public static void main(String[] args) {
		ArrayList<onibus> veiculo = new ArrayList<onibus>();
		veiculo.add(new onibus("AAA-1111", 2000, 41));
		veiculo.add(new onibus("ABC-1234", 2005, 45));
		veiculo.add(new onibus("BBB-2222", 2010, 42));
		veiculo.add(new onibus("CCC - 3333", 2015, 43));
		veiculo.add(new onibus("DDD - 4444",2020, 44));
		
		ArrayList<caminhao> caminhoes = new ArrayList<caminhao>();
		veiculo.add( new caminhao("EFG- 5678", 2022, 9));
		veiculo.add( new caminhao("EEE - 5555", 1982,2));
		veiculo.add( new caminhao("FFF - 6666", 1992, 3));
		veiculo.add(new caminhao("GGG - 7777", 2022, 4));
		veiculo.add(new caminhao("HHH - 8888", 2012, 7));
		
		for (veiculo onibus:onibus) {
			veiculo.exibirDados();
			
		}
		
		for (veiculo caminhao : caminhoes) {
			caminhao.exibirDados();
			
		}
			}

}
