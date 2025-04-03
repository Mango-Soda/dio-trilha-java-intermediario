package smartphone.model;

public class ReprodutorMusical extends AparelhoEletronico {

    public void tocar() {
        System.out.println("A música começou a tocar.");
    }

    public void pausar() {
        System.out.println("A música foi pausada.");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }
}

