import java.util.ArrayList;
import java.util.List;

public class NavegadorInternet extends AparelhoEletronico{
    private List<Integer> abas;
    private String pagina;

    public NavegadorInternet(AparelhoEletronico aparelhoEletronico) {
        super();
        this.abas = new ArrayList<>();
        this.pagina = null;
    }

    public void exibirPagina() {
        if (!isLigado()) {
            System.out.println("O aparelho não está ligado. Não é possível exibir a página.");
            return;
        }

        System.out.printf("Exibindo página: %s\n", (pagina != null ? pagina : "Página não encontrada"));
    }

    public void adicionarNovaAba() {
        abas.add(abas.size(), 1);
        System.out.printf("Nova aba adicionada. Total de abas: %d\n", abas.size());
    }

    public void atualizarPagina() {
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
}

