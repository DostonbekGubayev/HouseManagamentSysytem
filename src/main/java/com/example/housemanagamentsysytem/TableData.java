//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

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
    private Integer ichimlikSoni;
    private Integer boshqaSoni;

    public TableData() {
    }

    public TableData(String taomNom, Integer taomNarxi, Integer taomSoni, String ichimlikNom, Integer ichimlikNarxi, Integer ichimlikSoni, String vaBoshqalarNom, Integer vaBoshqaNarxlar, Integer boshqaSoni, Integer jamiNarx) {
        this.taomNomi = new SimpleStringProperty(taomNom);
        this.ichimlikNomi = new SimpleStringProperty(ichimlikNom);
        this.vaBoshqalarNomi = new SimpleStringProperty(vaBoshqalarNom);
        this.taomNarxi = taomNarxi;
        this.ichimlikNarxi = ichimlikNarxi;
        this.vaBoshqaNarxlar = vaBoshqaNarxlar;
        this.jamiNarx = jamiNarx;
        this.taomSoni = taomSoni;
        this.ichimlikSoni = ichimlikSoni;
        this.boshqaSoni = boshqaSoni;
    }

    public String getTaomNomi() {
        return this.taomNomi.get();
    }

    public SimpleStringProperty taomNomiProperty() {
        return this.taomNomi;
    }

    public void setTaomNomi(String taomNomi) {
        this.taomNomi.set(taomNomi);
    }

    public String getIchimlikNomi() {
        return this.ichimlikNomi.get();
    }

    public SimpleStringProperty ichimlikNomiProperty() {
        return this.ichimlikNomi;
    }

    public void setIchimlikNomi(String ichimlikNomi) {
        this.ichimlikNomi.set(ichimlikNomi);
    }

    public String getVaBoshqalarNomi() {
        return this.vaBoshqalarNomi.get();
    }

    public SimpleStringProperty vaBoshqalarNomiProperty() {
        return this.vaBoshqalarNomi;
    }

    public void setVaBoshqalarNomi(String vaBoshqalarNomi) {
        this.vaBoshqalarNomi.set(vaBoshqalarNomi);
    }

    public Integer getTaomNarxi() {
        return this.taomNarxi;
    }

    public void setTaomNarxi(Integer taomNarxi) {
        this.taomNarxi = taomNarxi;
    }

    public Integer getIchimlikNarxi() {
        return this.ichimlikNarxi;
    }

    public void setIchimlikNarxi(Integer ichimlikNarxi) {
        this.ichimlikNarxi = ichimlikNarxi;
    }

    public Integer getVaBoshqaNarxlar() {
        return this.vaBoshqaNarxlar;
    }

    public void setVaBoshqaNarxlar(Integer vaBoshqaNarxlar) {
        this.vaBoshqaNarxlar = vaBoshqaNarxlar;
    }

    public Integer getTaomSoni() {
        return this.taomSoni;
    }

    public void setTaomSoni(Integer taomSoni) {
        this.taomSoni = taomSoni;
    }

    public Integer getIchimlikSoni() {
        return this.ichimlikSoni;
    }

    public void setIchimlikSoni(Integer ichimlikSoni) {
        this.ichimlikSoni = ichimlikSoni;
    }

    public Integer getBoshqaSoni() {
        return this.boshqaSoni;
    }

    public void setBoshqaSoni(Integer boshqaSoni) {
        this.boshqaSoni = boshqaSoni;
    }

    public void setJamiNarx(Integer jamiNarx) {
        this.jamiNarx = jamiNarx;
    }

    public Integer getJamiNarx() {
        Integer result;
        if (this.taomNarxi != null && this.taomSoni != null && this.ichimlikNarxi != null && this.ichimlikSoni != null && this.vaBoshqaNarxlar != null && this.boshqaSoni != null) {
            result = this.taomNarxi * this.taomSoni + this.ichimlikNarxi * this.ichimlikSoni + this.vaBoshqaNarxlar * this.boshqaSoni;
            return result;
        } else if (this.taomNarxi.equals((Object)null) & this.taomSoni.equals((Object)null)) {
            result = this.ichimlikNarxi * this.ichimlikSoni + this.vaBoshqaNarxlar * this.boshqaSoni;
            return result;
        } else if (this.ichimlikNarxi.equals((Object)null) && this.ichimlikSoni.equals((Object)null)) {
            result = this.taomNarxi * this.taomSoni + this.vaBoshqaNarxlar * this.boshqaSoni;
            return result;
        } else if (this.vaBoshqaNarxlar.equals((Object)null) && this.boshqaSoni.equals((Object)null)) {
            result = this.taomNarxi * this.taomSoni + this.ichimlikNarxi * this.ichimlikSoni;
            return result;
        } else {
            return this.taomNarxi * this.taomSoni + this.ichimlikNarxi * this.ichimlikSoni + this.vaBoshqaNarxlar * this.boshqaSoni;
        }
    }
}
