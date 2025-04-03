package smartphone.model;

import java.util.ArrayList;
import java.util.List;

public class NavegadorInternet extends AparelhoEletronico {
    private String paginaAtual;
    private List<String> abas;

    public NavegadorInternet() {
        super();
        abas = new ArrayList<>();
    }

    public void exibirPagina() {
        System.out.println("Exibindo a página: " + paginaAtual);
    }

    public void adicionarNovaAba(String pagina) {
        abas.add(pagina);
        this.paginaAtual = pagina;
        System.out.println("Nova aba adicionada: " + pagina);
    }

    public void atualizarPagina() {
        System.out.println("Página atualizada: " + paginaAtual);
    }

    public String getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(String paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public List<String> getAbas() {
        return abas;
    }
}