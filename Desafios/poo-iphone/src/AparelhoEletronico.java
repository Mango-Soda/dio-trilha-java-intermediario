import java.util.HashMap;
import java.util.Map;

public class AparelhoEletronico {
    private boolean ligado;
    private boolean chamadoRecebido;
    private Map<String, String> mensagensDeVoz;

    public AparelhoEletronico() {
        this.ligado = false;
        this.chamadoRecebido = false;
        this.mensagensDeVoz = new HashMap<>();
    }

    public void ligar() {
        this.ligado = true;
        System.out.printf("O aparelho foi %s.\n", (ligado ? "ligado" : "já está ligado"));
    }

    public void desligar() {
        this.ligado = false;
        System.out.printf("O aparelho foi %s.\n", (ligado ? "desligado" : "já está desligado"));
    }

    public boolean isLigado() {
        return ligado;
    }

    public void receberChamada() {
        if (!ligado) {
            System.out.println("O telefone está desligado. Ligue antes de atender.");
            return;
        }

        chamadoRecebido = true;
        System.out.println("Chamada recebida.");
    }

    public void atender() {
        if (chamadoRecebido) {
            System.out.println("Chamada recebida.");
        } else {
            System.out.println("Sem chamada para atender.");
        }
    }

    public void encerrarChamada() {
        chamadoRecebido = false;
        System.out.println("Chamada encerrada.");
    }

    public void iniciarCorreioVoz() {
        if (!ligado) {
            System.out.println("O telefone está desligado. Não há mensagens de voz disponíveis.");
            return;
        }

        if (mensagensDeVoz.size() < 0) {
            System.out.println("Nenhuma mensagem de voz encontrada.");
            return;
        }

        System.out.println("Você tem mensagens de voz:");
        for (Map.Entry<String, String> entry : mensagensDeVoz.entrySet()) {
            System.out.println("Contato: " + entry.getKey() + "\nMensagem: " + entry.getValue());
        }
    }
}
