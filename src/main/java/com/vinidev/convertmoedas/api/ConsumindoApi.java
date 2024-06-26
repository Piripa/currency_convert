package com.vinidev.convertmoedas.api;

import org.json.JSONObject;

import javax.print.attribute.standard.Destination;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ConsumindoApi {

    private static String api =  "https://economia.awesomeapi.com.br/json/last/";

   public JSONObject getJsonAPI(String moedaOrigem, String moedaDestino) throws Exception {
       this.api = api + moedaOrigem +"-"+moedaDestino;
    try {
        URL newUrl = new URL(this.api);
        HttpURLConnection conexao = (HttpURLConnection) newUrl.openConnection();
        conexao.setRequestMethod("GET");

        int responseCode = conexao.getResponseCode();
        if(responseCode == HttpURLConnection.HTTP_OK ) {
            BufferedReader inLinha = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
            String linha;
            StringBuilder texto = new StringBuilder();
            while((linha = inLinha.readLine()) != null) {
                texto.append(linha);
            }
            inLinha.close();
            JSONObject jsonResponse = new JSONObject(texto.toString());
            return jsonResponse;

        }else{
            throw new Exception(conexao.getResponseMessage());
        }
    }catch(Exception e) {
        throw new Exception(e.getMessage());
    }
   }
}
