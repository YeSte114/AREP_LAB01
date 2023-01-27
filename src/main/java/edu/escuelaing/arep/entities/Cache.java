/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.escuelaing.arep.entities;

/**
 *
 * @author jeison.barreto
 */
import java.util.ArrayList;
import java.util.List;

public class Cache {
    List<String> actualMemory;
    String url;
    public Cache(String url){
        this.url = url;
        actualMemory = new ArrayList<>();
    }

    public void addingToCache(String url){
        if(actualMemory.size()<0){
            actualMemory.add(url);
        }else{
            String actual = "";
            for(int i = 0 ; i<actualMemory.size();i++){
                actual = actualMemory.get(i);
                if(actual.equals(url)){
                    break;
                }
            }
        }
    }
    public boolean isOnCache(String url){
        if(actualMemory.contains(url)){
            return true;
        }else return false;
    }

    public List<String> getActualMemory() {
        return this.actualMemory;
    }

    public void setActualMemory(List<String> actualMemory) {
        this.actualMemory = actualMemory;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

} 
