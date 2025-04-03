package smartphone.service;

import smartphone.model.AparelhoEletronico;

public class CorreioVozService {

    public void iniciarCorreioVoz(AparelhoEletronico aparelho) {
        if (!aparelho.isLigado()) {
            System.out.println("O aparelho está desligado. Não é possível acessar o correio de voz.");
            return;
        }

        System.out.println("Iniciando o correio de voz...");
    }
}
