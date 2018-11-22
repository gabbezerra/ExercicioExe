package excecoes;

import java.util.ArrayList;

public class RedeComputadores {

	private ArrayList<Computador> rede;

	public RedeComputadores() {

		rede = new ArrayList<Computador>();
	}

	public void adicionarComputador(Computador pc) {
		rede.add(pc);
	}

	public Computador pesqCompPorIp(String ip) {

		for (Computador pc : rede) {
			if (pc.getIp().equals(ip)) {
				return pc;
			}
		}
		return null;
	}

	public void qtdCompPorMarca (String marca) {
		int qnt=0;
		for (Computador pc : rede) {
			if (pc.getMarca().equals(marca)){
				qnt++;
			}else {
				return;
			}
		}
		System.out.println("\nPcs: " + qnt);
	}
	
}
