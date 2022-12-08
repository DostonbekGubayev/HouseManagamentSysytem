package com.example.housemanagamentsysytem;

import javafx.event.ActionEvent;

import java.util.HashMap;

public class Settings extends HelloController{
    HelloController controller;

    HashMap<String,Integer> toplam;

    public Settings(HelloController controller){

        this.controller=controller;
    }

    public String nomi(String nomi){
        String mahsulotNomi=nomi;

        mahsulotNomi=controller.taomNomiSetting.getText();

       // for(int i=0;i<)

        return mahsulotNomi;
    }
    public Integer narxi(Integer narxi){
        Integer mahsulotNarxi=narxi;


    return mahsulotNarxi;
    }

    public void setting(ActionEvent event){

    }
}
