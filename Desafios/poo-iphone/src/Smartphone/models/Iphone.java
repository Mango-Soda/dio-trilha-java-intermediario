package smartphone.models;

import smartphone.interfaces.AparelhoEletronico;
import smartphone.interfaces.NavegarInternet;
import smartphone.interfaces.ReprodutorMusical;

public class Iphone implements AparelhoEletronico, ReprodutorMusical, NavegarInternet {
    private String paginaInicial = "https://www.google.com";
    private String musicaAtual = null;
    private boolean emChamada = false;

    @Override
    public void ligar(String numero) {
        if (!emChamada) {
            emChamada = true;
            System.out.println("Ligando...");
        } else {
            System.out.println("Já está em chamada.");
        }
    }

    @Override
    public void atender() {
        if (emChamada) {
            System.out.println("Atendendo chamada...");
        } else {
            System.out.println("Não há chamadas para atender.");
        }
    }

    @Override
    public void correioDeVoz() {
        if (emChamada) {
            System.out.println("Verificando correio de voz...");
        } else {
            System.out.println("Não há chamadas para atender.");
        }
    }

    @Override
    public void tocarMusica(String musica) {
        if (musica != null && !musica.isEmpty()) {
            musicaAtual = musica;
            System.out.println("Tocando música: " + musicaAtual);
        } else {
            System.out.println("Nenhuma música selecionada.");
        }
    }

    @Override
    public void pausarMusica() {
        if (musicaAtual != null) {
            System.out.println("Pausando música: " + musicaAtual);
            musicaAtual = null;
        } else {
            System.out.println("Nenhuma música tocando.");
        }
    }

    @Override
    public void adicionarMusica(String musica) {
        if (musica != null && !musica.isEmpty()) {
            System.out.println("Adicionando música: " + musica);
        } else {
            System.out.println("Nenhuma música para adicionar.");
        }
    }

    @Override
    public void exibirPagina(String url) {
        if (url != null && !url.isEmpty()) {
            System.out.println("Exibindo página: " + url);
        } else {
            System.out.println("URL inválida.");
        }
    }

    @Override
    public void adicionarAba(String url) {
        if (url != null && !url.isEmpty()) {
            System.out.println("Adicionando aba: " + url);
        } else {
            System.out.println("URL inválida.");
        }
    }

    @Override
    public void atualizarPagina(String url) {
        if (url != null && !url.isEmpty()) {
            System.out.println("Atualizando página: " + url);
        } else {
            System.out.println("URL inválida.");
        }
    }

    public String getPaginaInicial() {
        return paginaInicial;
    }
}