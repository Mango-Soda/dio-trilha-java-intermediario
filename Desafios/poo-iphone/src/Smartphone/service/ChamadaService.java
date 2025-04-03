package smartphone.service;

import smartphone.model.AparelhoEletronico;

public class ChamadaService {

    public void receberChamada(AparelhoEletronico aparelho) {
        if (!aparelho.isLigado()) {
            System.out.println("O aparelho está desligado. Ligue-o primeiro.");
            return;
        }

        System.out.println("Chamada recebida.");
    }

    public void atender(AparelhoEletronico aparelho) {
        if (!aparelho.isLigado()) {
            System.out.println("O aparelho está desligado. Ligue-o primeiro.");
            return;
        }

        System.out.println("Chamada atendida.");
    }

    public void encerrarChamada(AparelhoEletronico aparelho) {
        System.out.println("Chamada encerrada.");
    }
}

