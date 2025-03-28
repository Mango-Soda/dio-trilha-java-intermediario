public class Smartphone {
    private AparelhoEletronico aparelhoEletronico;
    private NavegadorInternet navegadorInternet;
    private Telefone telefone;
    private ReprodutorMusical reprodutorMusical;

    public Smartphone() {
        aparelhoEletronico = new AparelhoEletronico();
        navegadorInternet = new NavegadorInternet(aparelhoEletronico);
        telefone = new Telefone(aparelhoEletronico);
        reprodutorMusical = new ReprodutorMusical(aparelhoEletronico);
    }

    public void ligarAparelho() {
        aparelhoEletronico.ligar();
    }

    public void desligarAparelho() {
        aparelhoEletronico.desligar();
    }

    public void conectarInternet() {
        aparelhoEletronico.setConexao(true);
        System.out.println("Conexão com a internet estabelecida.");
    }

    public void desconectarInternet() {
        aparelhoEletronico.setConexao(false);
        System.out.println("Desconectado da internet.");
    }

    public void acessarPagina(String pagina) {
        navegadorInternet.setPagina(pagina);
        navegadorInternet.exibirPagina();
    }

    public void receberChamada() {
        telefone.receberChamada();
    }

    public void atenderChamada() {
        telefone.atender();
    }

    public void encerrarChamada() {
        telefone.encerrarChamada();
    }

    public void tocarMusica() {
        reprodutorMusical.tocar();
    }
    
    public void pausarMuscia() {
        reprodutorMusical.pausar();
    }

    public void selecionarMusica(String musica) {
        reprodutorMusical.selecionarMusica(musica);
    }
}