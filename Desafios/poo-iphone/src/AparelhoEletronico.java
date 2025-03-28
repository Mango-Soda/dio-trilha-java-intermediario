import java.util.HashMap;
import java.util.Map;

public class AparelhoEletronico {
    private boolean ligado;
    private boolean conectado;
    private boolean chamadoRecebido;
    private Map<String, String> mensagensDeVoz;

    public AparelhoEletronico() {
        this.ligado = false;
        this.conectado = false;
        this.chamadoRecebido = false;
        this.mensagensDeVoz = new HashMap<>();
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

        System.out.println("Você tem mensagens de voz:");
        for (Map.Entry<String, String> entry : mensagensDeVoz.entrySet()) {
            System.out.println("Contato: " + entry.getKey() + "\nMensagem: " + entry.getValue());
        }
    }

    public void adicionarMensagem(String contato, String mensagem) {
        if (contato == null || contato.isEmpty() || mensagem == null || mensagem.isEmpty()) {
            System.out.println("Erro: Não foi possível adicionar o contato ou mensagem");
            return;
        }
        System.out.println("Contato e mensagem adicionados com sucesso.");
        mensagensDeVoz.put(contato, mensagem);
    }
}
