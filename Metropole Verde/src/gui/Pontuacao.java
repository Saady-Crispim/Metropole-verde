package gui;

public class Pontuacao {
    private int pontuacao1;
    private int pontuacao2;

    private static Pontuacao instance = null;

    private Pontuacao() {
        // Construtor privado para garantir que apenas uma instância seja criada
    }

    public static Pontuacao getInstance() {
        if (instance == null) {
            instance = new Pontuacao();
        }
        return instance;
    }

    public int getPontuacao1() {
        return pontuacao1;
    }

    public void setPontuacao1(int pontuacao1) {
        this.pontuacao1 = pontuacao1;
    }

    public int getPontuacao2() {
        return pontuacao2;
    }

    public void setPontuacao2(int pontuacao2) {
        this.pontuacao2 = pontuacao2;
    }
}
