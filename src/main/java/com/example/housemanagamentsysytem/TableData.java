package com.example.housemanagamentsysytem;


import javafx.beans.property.SimpleStringProperty;

public class TableData {

    private SimpleStringProperty taomNomi;
    private SimpleStringProperty ichimlikNomi;
    private SimpleStringProperty vaBoshqalarNomi;
    private Integer taomNarxi;
    private Integer ichimlikNarxi;
    private Integer vaBoshqaNarxlar;
    private Integer jamiNarx;
    Integer result;



    public TableData(){

    }



    public TableData(String taomNom, String ichimlikNom, String vaBoshqalarNom, Integer taomNarxi, Integer ichimlikNarxi, Integer vaBoshqaNarxlar,Integer jamiNarx) {
       taomNomi=new SimpleStringProperty(taomNom);
       ichimlikNomi=new SimpleStringProperty(ichimlikNom);
       vaBoshqalarNomi=new SimpleStringProperty(vaBoshqalarNom);
        this.taomNarxi = taomNarxi;
        this.ichimlikNarxi = ichimlikNarxi;
        this.vaBoshqaNarxlar = vaBoshqaNarxlar;
        this.jamiNarx=jamiNarx;

    }

    public String getTaomNomi() {
        return taomNomi.get();
    }

    public SimpleStringProperty taomNomiProperty() {
        return taomNomi;
    }

    public void setTaomNomi(String taomNomi) {
        this.taomNomi.set(taomNomi);
    }

    public String getIchimlikNomi() {
        return ichimlikNomi.get();
    }

    public SimpleStringProperty ichimlikNomiProperty() {
        return ichimlikNomi;
    }

    public void setIchimlikNomi(String ichimlikNomi) {
        this.ichimlikNomi.set(ichimlikNomi);
    }

    public String getVaBoshqalarNomi() {
        return vaBoshqalarNomi.get();
    }

    public SimpleStringProperty vaBoshqalarNomiProperty() {
        return vaBoshqalarNomi;
    }

    public void setVaBoshqalarNomi(String vaBoshqalarNomi) {
        this.vaBoshqalarNomi.set(vaBoshqalarNomi);
    }

    public Integer getTaomNarxi() {
        return taomNarxi;
    }

    public void setTaomNarxi(Integer taomNarxi) {
        this.taomNarxi = taomNarxi;
    }

    public Integer getIchimlikNarxi() {
        return ichimlikNarxi;
    }

    public void setIchimlikNarxi(Integer ichimlikNarxi) {
        this.ichimlikNarxi = ichimlikNarxi;
    }

    public Integer getVaBoshqaNarxlar() {
        return vaBoshqaNarxlar;
    }

    public void setVaBoshqaNarxlar(Integer vaBoshqaNarxlar) {
        this.vaBoshqaNarxlar = vaBoshqaNarxlar;
    }

//    public void setJamiNarx(Integer jamiNarx){
//        this.jamiNarx=jamiNarx;
//        Integer result=
//    }

    public Integer getJamiNarx(){
        Integer result=taomNarxi+ichimlikNarxi+vaBoshqaNarxlar;
        return result;
    }

}
