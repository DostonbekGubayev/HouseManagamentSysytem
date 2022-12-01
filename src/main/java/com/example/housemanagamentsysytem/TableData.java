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
    private Integer taomSoni;
     private Integer  ichimlikSoni;
    private Integer   boshqaSoni;
   // private Integer result=0;




    public TableData(){

    }




    public TableData(String taomNom,Integer taomNarxi,Integer taomSoni, String ichimlikNom,
                       Integer ichimlikNarxi, Integer ichimlikSoni, String vaBoshqalarNom,
                     Integer vaBoshqaNarxlar, Integer boshqaSoni, Integer jamiNarx) {


       taomNomi=new SimpleStringProperty(taomNom);
       ichimlikNomi=new SimpleStringProperty(ichimlikNom);
       vaBoshqalarNomi=new SimpleStringProperty(vaBoshqalarNom);
        this.taomNarxi = taomNarxi;
        this.ichimlikNarxi = ichimlikNarxi;
        this.vaBoshqaNarxlar = vaBoshqaNarxlar;
        this.jamiNarx=jamiNarx;
        this.taomSoni = taomSoni;
        this.ichimlikSoni = ichimlikSoni;
        this.boshqaSoni = boshqaSoni;


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

    public Integer getTaomSoni() {
        return taomSoni;
    }

    public void setTaomSoni(Integer taomSoni) {
        this.taomSoni = taomSoni;
    }

    public Integer getIchimlikSoni() {
        return ichimlikSoni;
    }

    public void setIchimlikSoni(Integer ichimlikSoni) {
        this.ichimlikSoni = ichimlikSoni;
    }

    public Integer getBoshqaSoni() {
        return boshqaSoni;
    }

    public void setBoshqaSoni(Integer boshqaSoni) {
        this.boshqaSoni = boshqaSoni;
    }

    public void setJamiNarx(Integer jamiNarx) {
        this.jamiNarx = jamiNarx;
    }





    public Integer getJamiNarx(){
        Integer result;
        if (taomNarxi!=null&&taomSoni!=null&&ichimlikNarxi!=null&&
                ichimlikSoni!=null&&vaBoshqaNarxlar!=null&&boshqaSoni!=null){


            result=taomNarxi*taomSoni+ichimlikNarxi*ichimlikSoni+vaBoshqaNarxlar*boshqaSoni;
            return result;


        }
        else if (taomNarxi.equals(null)&taomSoni.equals(null)){

            result=ichimlikNarxi*ichimlikSoni+vaBoshqaNarxlar*boshqaSoni;
            return result;

        }  else if (ichimlikNarxi.equals(null)&&ichimlikSoni.equals(null)){

            result=taomNarxi*taomSoni+vaBoshqaNarxlar*boshqaSoni;
            return result;

            }else if (vaBoshqaNarxlar.equals(null)&&boshqaSoni.equals(null)){

            result=taomNarxi*taomSoni+ichimlikNarxi*ichimlikSoni;
            return result;

        }

        return taomNarxi*taomSoni+ichimlikNarxi*ichimlikSoni+vaBoshqaNarxlar*boshqaSoni;
    }



}
