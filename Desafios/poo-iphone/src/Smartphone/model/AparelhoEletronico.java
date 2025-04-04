package smartphone.model;

import smartphone.service.ChamadaService;
import smartphone.service.CorreioVozService;
import smartphone.interfaces.Ligavel;

public class AparelhoEletronico implements Ligavel {
    private boolean ligado;
    private ChamadaService chamadaService;
    private CorreioVozService correioVozService;

    public AparelhoEletronico() {
        this.ligado = false;
    }

    public void setCorreioVozService(CorreioVozService correioVozService) {
        this.correioVozService = correioVozService;
    }

    public void setChamadaService(ChamadaService chamadaService) {
        this.chamadaService = chamadaService;
    }

    @Override
    public void ligar() {
        if (!ligado) {
            this.ligado = true;
            System.out.println("O aparelho foi ligado.");
        } else {
            System.out.println("O aparelho já está ligado.");
        }
    }

    @Override
    public void desligar() {
        if (ligado) {
            this.ligado = false;
            System.out.println("O aparelho foi desligado.");
        } else {
            System.out.println("O aparelho já está desligado.");
        }
    }

    @Override
    public boolean isLigado() {
        return ligado;
    }

    public void receberChamada() {
        chamadaService.receberChamada(this);
    }

    public void atenderChamada() {
        chamadaService.atender(this);
    }

    public void encerrarChamada() {
        chamadaService.encerrarChamada(this);
    }

    public void iniciarCorreioVoz() {
        correioVozService.iniciarCorreioVoz(this);
    }
}
