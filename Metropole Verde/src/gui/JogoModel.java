package gui;

public class JogoModel {

	private int madeiraJogador1 = 500;
	private int minerioJogador1 = 500;
	private int madeiraJogador2 = 500;
	private int minerioJogador2 = 500;

	public int getMadeiraJogador1() {
		return madeiraJogador1;
	}

	public int getMinerioJogador1() {
		return minerioJogador1;
	}

	public int getMadeiraJogador2() {
		return madeiraJogador2;
	}

	public int getMinerioJogador2() {
		return minerioJogador2;
	}

	public void setMadeiraJogador1(int madeiraJogador1) {
		this.madeiraJogador1 = madeiraJogador1;
	}

	public void setMinerioJogador1(int minerioJogador1) {
		this.minerioJogador1 = minerioJogador1;
	}

	public void setMadeiraJogador2(int madeiraJogador2) {
		this.madeiraJogador2 = madeiraJogador2;
	}

	public void setMinerioJogador2(int minerioJogador2) {
		this.minerioJogador2 = minerioJogador2;
	}

	public void coletarRecursosJogador1() {
		if (madeiraJogador1 < 500 || minerioJogador1 < 500) {
			madeiraJogador1 += 300;
			minerioJogador1 += 300;
		} else if (madeiraJogador1 > 700 || minerioJogador1 > 700) {
			madeiraJogador1 += 150;
			minerioJogador1 += 150;
		} else {
			madeiraJogador1 += 275;
			minerioJogador1 += 275;
		}
	}

	public void coletarRecursosJogador2() {
		if (madeiraJogador2 < 500 || minerioJogador2 < 500) {
			madeiraJogador2 += 300;
			minerioJogador2 += 300;
		} else if (madeiraJogador2 > 700 || minerioJogador2 > 700) {
			madeiraJogador2 += 150;
			minerioJogador2 += 150;
		} else {
			madeiraJogador2 += 275;
			minerioJogador2 += 275;
		}
	}

}
