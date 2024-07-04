package com.vinidev.convertmoedas.moedas;

public class Moeda {

    private String MoedaOrigem;
    private String MoedaDestino;
    private double valorMoedaOrigem;

    public Moeda(String MoedaOrigem, double valorMoedaOrigem,String MoedaDestino ) {
        this.MoedaOrigem = MoedaOrigem;
        this.MoedaDestino = MoedaDestino;
        this.valorMoedaOrigem = valorMoedaOrigem;
    }

    public String getMoedaOrigem() {
        return MoedaOrigem;
    }
    public void setMoedaOrigem(String MoedaOrigem) {
        this.MoedaOrigem = MoedaOrigem;
    }
    public String getMoedaDestino() {
        return MoedaDestino;
    }
    public void setMoedaDestino(String MoedaDestino) {
        this.MoedaDestino = MoedaDestino;
    }
    public double getValorMoedaOrigem() {
        return valorMoedaOrigem;
    }
    public void setValorMoedaOrigem(double valorMoedaOrigem) {
        this.valorMoedaOrigem = valorMoedaOrigem;
    }

    @Override
    public String toString() {
        return "Moeda Destino " + getMoedaDestino() + " Moeda Origem " + getMoedaOrigem() + " Value " + getValorMoedaOrigem();
    }
}

