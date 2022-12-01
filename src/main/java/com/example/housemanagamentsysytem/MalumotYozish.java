package com.example.housemanagamentsysytem;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class MalumotYozish {

    HelloController controller;


    String taomQiymatlari[]={"Vodiy Osh","Sho'rva","Manti",
            "Lag'mon","Chuchvara","Xonim","Golubsi","Jiz"};



    String ichimlikQiymatlari[]={"Cola","Pepsi","Fanta","Suv","Sok","Napitka",};


    String boshqaQiymatlari[]={"Bichak","Salat","Oliviya","Smak",
            "Svejiy Salat","Karam salat","Sabzi salat","Lavlagi Salat"};



  ObservableList<String> taomlarToplami= FXCollections.observableArrayList();
    ObservableList<String>ichimlikToplami=FXCollections.observableArrayList();
    ObservableList<String>boshqalarToplami=FXCollections.observableArrayList();


    FileWriter fileWriter;
    File file;

    public MalumotYozish(HelloController controller){
        this.controller=controller;

        malumotYoz(new ActionEvent());


        for (String x: taomQiymatlari){
            taomlarToplami.add(x);
        }
        for (String y:ichimlikQiymatlari){
            ichimlikToplami.add(y);
        }
        for (String z:boshqaQiymatlari){
            boshqalarToplami.add(z);
        }



    }

    public  void malumotYoz(ActionEvent event){

        if (event.getSource().equals(controller.taomNomQoshBtn)){
            

           taomlarToplami.addAll(String.valueOf(taomlarToplami.addAll(controller.boshqaNomiSetting.getText())));
            //controller.taomNomiCBox.getItems().add(controller.taomNomiSetting.getText());
            controller.taomNomiSettCbox.getItems().add(controller.taomNomiSetting.getText());

            file=new File("src/taomMalumotlari.txt");

            try {
                file.createNewFile();
                 fileWriter=new FileWriter(file);
                while (true){
                    fileWriter.write(controller.taomNomiSetting.getText());
                    fileWriter.close();
                    Scanner scanner=new Scanner(file);
                    controller.taomNomiCBox.getItems().add(scanner.nextLine());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }else if (event.getSource().equals(controller.ichimlikNomQoshBtn)){

            ichimlikToplami.add(controller.ichimlikNomiSetting.getText());
            controller.ichimlikNomiSettCbox.getItems().add(controller.ichimlikNomiSetting.getText());

        }else if (event.getSource().equals(controller.boshqaNomQoshBtn)){

            boshqalarToplami.add(controller.boshqaNomiSetting.getText());
            controller.boshqaNomiSettCbox.getItems().add(controller.boshqaNomiSetting.getText());

        }

 }
}
