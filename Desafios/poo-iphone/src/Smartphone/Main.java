package smartphone;

import smartphone.model.AparelhoEletronico;
import smartphone.service.ChamadaService;
import smartphone.service.CorreioVozService;

public class Main {
    public static void main(String[] args) {
        // Criando instâncias dos serviços e do aparelho eletrônico
        AparelhoEletronico aparelho = new AparelhoEletronico();
        ChamadaService chamadaService = new ChamadaService();
        CorreioVozService correioVozService = new CorreioVozService();

        // Configurando os serviços no aparelho
        aparelho.setChamadaService(chamadaService);
        aparelho.setCorreioVozService(correioVozService);

        // Testando o funcionamento do aparelho
        System.out.println("Testando o funcionamento do aparelho:");
        aparelho.ligar();
        aparelho.receberChamada();
        aparelho.atenderChamada();
        aparelho.encerrarChamada();
        aparelho.desligar();  
    }
}
