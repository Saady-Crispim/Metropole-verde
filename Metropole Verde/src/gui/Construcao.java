package gui;

public class Construcao {
	private boolean Casacomp1 = false;

	private boolean Casacomp2 = false;
	private boolean Tecelagem1 = false;
	private boolean Tecelagem2 = false;
	private boolean Fundicao1 = false;
	private boolean Fundicao2 = false;
	private boolean Hidreletrica1 = false;
	private boolean Hidreletrica2 = false;
	private boolean Eolica1 = false;
	private boolean Eolica2 = false;
	private boolean Horta1 = false;
	private boolean Horta2 = false;

	private JogoModel jogoModel;

	public Construcao(JogoModel jogoModel) {
		this.jogoModel = jogoModel;
	}

	public void casacomp1() {
		// custo: -200 madeira e -200 minerio
		jogoModel.setMadeiraJogador1(jogoModel.getMadeiraJogador1() - 200);
		jogoModel.setMinerioJogador1(jogoModel.getMinerioJogador1() - 200);
		Casacomp1 = true;
	}

	public void casacomp2() {
		// custo: -200 madeira e -200 minerio
		jogoModel.setMadeiraJogador2(jogoModel.getMadeiraJogador2() - 200);
		jogoModel.setMinerioJogador2(jogoModel.getMinerioJogador2() - 200);
		Casacomp2 = true;
	}

	public void tecelagem1() {
		// custo: -350 madeira e -300 minerio
		jogoModel.setMadeiraJogador1(jogoModel.getMadeiraJogador1() - 350);
		jogoModel.setMinerioJogador1(jogoModel.getMinerioJogador1() - 300);
		Tecelagem1 = true;
		}

	public void tecelagem2() {
		// custo: -350 madeira e -300 minerio
		jogoModel.setMadeiraJogador2(jogoModel.getMadeiraJogador2() - 350);
		jogoModel.setMinerioJogador2(jogoModel.getMinerioJogador2() - 300);
		Tecelagem2 = true;
		}

	public void fundicao1() {
		// custo: -400 madeira e -350 minerio
		jogoModel.setMadeiraJogador1(jogoModel.getMadeiraJogador1() - 400);
		jogoModel.setMinerioJogador1(jogoModel.getMinerioJogador1() - 350);
		Fundicao1 = true;
		}

	public void fundicao2() {
		// custo: -400 madeira e -350 minerio
		jogoModel.setMadeiraJogador2(jogoModel.getMadeiraJogador2() - 400);
		jogoModel.setMinerioJogador2(jogoModel.getMinerioJogador2() - 350);
		Fundicao2 = true;
		}

	public void hidreletrica1() {
		// custo: -450 madeira e -400 minerio
		jogoModel.setMadeiraJogador1(jogoModel.getMadeiraJogador1() - 450);
		jogoModel.setMinerioJogador1(jogoModel.getMinerioJogador1() - 400);
		Hidreletrica1 = true;
		}

	public void hidreletrica2() {
		// custo: -450 madeira e -400 minerio
		jogoModel.setMadeiraJogador2(jogoModel.getMadeiraJogador2() - 450);
		jogoModel.setMinerioJogador2(jogoModel.getMinerioJogador2() - 400);
		Hidreletrica2 = true;
		}

	public void eolica1() {
		// custo: -500 madeira e -450 minerio
		jogoModel.setMadeiraJogador1(jogoModel.getMadeiraJogador1() - 500);
		jogoModel.setMinerioJogador1(jogoModel.getMinerioJogador1() - 450);
		Eolica1 = true;
		}

	public void eolica2() {
		// custo: -500 madeira e -450 minerio
		jogoModel.setMadeiraJogador2(jogoModel.getMadeiraJogador2() - 500);
		jogoModel.setMinerioJogador2(jogoModel.getMinerioJogador2() - 450);
		Eolica2 = true;
		}

	public void horta1() {
		// custo: -300 madeira e -250 minerio
		jogoModel.setMadeiraJogador1(jogoModel.getMadeiraJogador1() - 300);
		jogoModel.setMinerioJogador1(jogoModel.getMinerioJogador1() - 250);
		Horta1 = true;
		}

	public void horta2() {
		// custo: -300 madeira e -250 minerio
		jogoModel.setMadeiraJogador2(jogoModel.getMadeiraJogador2() - 300);
		jogoModel.setMinerioJogador2(jogoModel.getMinerioJogador2() - 250);
		Horta2 = true;
		}

	public boolean getCasacomp1() {
		return Casacomp1;
	}

	public boolean getCasacomp2() {
		return Casacomp2;
	}

	public boolean getTecelagem1() {
		return Tecelagem1;
	}

	public boolean getTecelagem2() {
		return Tecelagem2;
	}

	public boolean getFundicao1() {
		return Fundicao1;
	}

	public boolean getFundicao2() {
		return Fundicao2;
	}

	public boolean getHidreletrica1() {
		return Hidreletrica1;
	}

	public boolean getHidreletrica2() {
		return Hidreletrica2;
	}

	public boolean getEolica1() {
		return Eolica1;
	}

	public boolean getEolica2() {
		return Eolica2;
	}

	public boolean getHorta1() {
		return Horta1;
	}

	public boolean getHorta2() {
		return Horta2;
	}
}
