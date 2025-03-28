import java.util.HashMap;
import java.util.Map;

public class Telefone {

    AparelhoEletronico aparelhoEletronico;
    boolean chamadoRecebido;
    Map<String, String> mensagensDeVoz;
    
    public Telefone(AparelhoEletronico aparelhoEletronico) {
        this.aparelhoEletronico = aparelhoEletronico;
        this.chamadoRecebido = false;
        this.mensagensDeVoz = new HashMap<>();
    }

    public void receberChamada() {
        if (!aparelhoEletronico.isLigado()) {
            System.out.println("O telefone está desligado. Ligue antes de atender.");
            return;
        }

        chamadoRecebido = true;
        System.out.println("Chamada recebida.");
    }

    public void atender() {
        if (chamadoRecebido) {
            System.out.println("Chamada recebida.");
        }
        else {
            System.out.println("Sem chamada para atender.");
        }
    }

    public void encerrarChamada() {
        chamadoRecebido = false;
        System.out.println("Chamada encerrada.");
        return;
    }

    public void iniciarCorreioVoz() {
        if (!aparelhoEletronico.isLigado()) {
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
