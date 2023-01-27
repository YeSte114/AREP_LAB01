/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.escuelaing.arep.entities;

/**
 *
 * @author jeison.barreto
 */
import java.util.List;

public class Query {

    private final String url=  "https://www.alphavantage.co/query?function=TIME_SERIES_INTRADAY&symbol=";

    private String specify;
    private Cache cache;
    public Query(String symbol, String time  ){
        specify = url+ symbol + "&interval=" + time + "&apikey=G0PV1W2FLYMLQ6JL";
        cache = new Cache(specify);
    }


    public String getQuery(){
        System.out.println("Specify " + specify);
        return specify;
    }

    public List<String> getCache(){
        return cache.getActualMemory();
    }

}