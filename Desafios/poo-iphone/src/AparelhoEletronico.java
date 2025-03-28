public class AparelhoEletronico {
    private boolean ligado;
    private boolean conectado;

    public AparelhoEletronico() {
        this.ligado = false;
        this.conectado = false;
    }

    public void ligar() {
        this.ligado = true;
        System.out.printf("O aparelho foi %s.\n", (ligado ? "ligado" : "já está ligado"));
    }

    public boolean isLigado() {
        return ligado;
    }

    public void desligar() {
        this.ligado = false;
        System.out.printf("O aparelho foi %s.\n", (ligado ? "desligado" : "já está desligado"));
    }

    public boolean getConexao() {
        return conectado;
    }

    public void setConexao(boolean conectado) {
        this.conectado = conectado;
        System.out.printf("A conexão foi %s.\n", (conectado ? "estabelecida" : "desconectada"));
    }
}
