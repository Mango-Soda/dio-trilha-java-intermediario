package model;

public class ReprodutorMusical extends AparelhoEletronico {
    private boolean tocarMusica;

    public ReprodutorMusical() {
        super();
        this.tocarMusica = false;
    }

    public boolean tocar() {
        if (!isLigado()) {
            System.out.println("O aparelho não pode reproduzir música, pois está desligado.");
            return false;
        }
        
        tocarMusica = true;
        System.out.println("Iniciando a reprodução da música...");
        return true;
    }

    public boolean pausar() {
        if (tocarMusica) {
            tocarMusica = false;
            System.out.println("Música pausada.");
            return true;
        } else {
            System.out.println("Nenhuma música está tocando para ser pausada.");
            return false;
        }
    }

    public String selecionarMusica(String musica) {
        if (musica != null && !musica.isEmpty()) {
            System.out.printf("Música selecionada: %s\n", musica);
            return musica;
        } else {
            System.out.println("Nenhuma música selecionada.");
            return "Nenhuma música selecionada";
        }
    }
}

