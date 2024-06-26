package com.vinidev.convertmoedas.api;

import com.vinidev.convertmoedas.moedas.Moeda;
import org.json.JSONObject;

public class ConfigCotacao {
    private ConsumindoApi consumindoApi = new ConsumindoApi();
    private Moeda moedas;
    private String name;
    public  ConfigCotacao(Moeda moeda) {
        this.moedas = moeda;
    }
    public double getConvertValue() throws Exception {
        JSONObject jsonObject = consumindoApi.getJsonAPI(this.moedas.getMoedaOrigem(),this.moedas.getMoedaDestino());
        JSONObject getMoeda = jsonObject.getJSONObject(moedas.getMoedaOrigem()+moedas.getMoedaDestino());
        this.name = getMoeda.getString("name");
        double bid =  Double.valueOf(getMoeda.getString("bid")).doubleValue();
        double valor = moedas.getValorMoedaOrigem();
        double convert = valor * bid;
        return convert;
    }
    public String getName() {
        return name;
    }




}
