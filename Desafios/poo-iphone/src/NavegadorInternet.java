import java.util.ArrayList;
import java.util.List;

public class NavegadorInternet {
    private List<Integer> abas;
    private String pagina;
    private AparelhoEletronico aparelhoEletronico;

    public NavegadorInternet(AparelhoEletronico aparelhoEletronico) {
        this.abas = new ArrayList<>();
        this.pagina = null;
        this.aparelhoEletronico = aparelhoEletronico;
    }

    public void exibirPagina() {
        if (!aparelhoEletronico.isLigado()) {
            System.out.println("O aparelho não está ligado. Não é possível exibir a página.");
            return;
        }

        System.out.printf("Exibindo página: %s\n", (pagina != null ? pagina : "Página não encontrada"));
    }

    public void adicionarNovaAba() {
        if (!aparelhoEletronico.getConexao()) {
            System.out.println("Falha na conexão. Não é possível adicionar a aba.");
            return;
        }

        abas.add(abas.size(), 1);
        System.out.printf("Nova aba adicionada. Total de abas: %d\n", abas.size());
    }

    public void atualizarPagina() {
        if (!aparelhoEletronico.getConexao()) {
            System.out.println("Falha na conexão. Não é possível atualizar a página.");
            return;
        }

        if (pagina == null) {
            System.out.println("Página não encontrada.");
        } else {
            System.out.println("Atualizando página...");
            System.out.printf("Página: %s\n", pagina);
        }
    }

    public String getPagina() {
        return pagina;
    }

    public void setPagina(String pagina) {
        if (pagina != null && !pagina.isEmpty()) {
            this.pagina = pagina;
            System.out.printf("Página definida: %s\n", pagina);
        } else {
            System.out.println("Página não encontrada.");
        }
    }

    public List<Integer> getAbas() {
        return new ArrayList<>(abas);
    }

    public void adicionarAba(Integer aba) {
        abas.add(aba);
        System.out.printf("Aba %d adicionada. Total de abas: %d\n", aba, abas.size());
    }
}

