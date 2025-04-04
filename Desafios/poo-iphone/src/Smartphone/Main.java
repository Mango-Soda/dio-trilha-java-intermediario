package smartphone;

import smartphone.model.AparelhoEletronico;

public class Main {
    public static void main(String[] args) {
        AparelhoEletronico aparelho = new AparelhoEletronico();
        
        // Testando o método ligar
        aparelho.ligar(); // O aparelho foi ligado.
        aparelho.ligar(); // O aparelho já está ligado.

        // Testando o método desligar
        aparelho.desligar(); // O aparelho foi desligado.
        aparelho.desligar(); // O aparelho já está desligado.

        // Testando o método isLigado
        System.out.println("O aparelho está ligado? " + aparelho.isLigado()); // false

        // Testando o método receberChamada
        aparelho.receberChamada(); // O aparelho está desligado. Não é possível receber chamadas.

        // Ligando o aparelho para testar receberChamada
        aparelho.ligar();
        aparelho.receberChamada(); // Recebendo chamada...

        // Testando o método atenderChamada
        aparelho.atenderChamada(); // Atendendo chamada...

        // Testando o método encerrarChamada
        aparelho.encerrarChamada(); // Encerrando chamada...

        // Testando o método iniciarCorreioVoz
        aparelho.iniciarCorreioVoz(); // Iniciando o correio de voz...
    }
}
