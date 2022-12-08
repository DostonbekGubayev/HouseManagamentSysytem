package com.example.housemanagamentsysytem;

//import data.DataBaseConnection;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Formatter;
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


    PreparedStatement preparedStatement;
    Statement statement;
    ResultSet resultSet;
    Connection connection;
    String qator;


    public MalumotYozish(HelloController controller){
        this.controller=controller;

      //  connection= DataBaseConnection.connectDB();


        malumotYoz(new ActionEvent());


        for (String x: taomQiymatlari){
          //  taomlarToplami.add(x);
        }
        for (String y:ichimlikQiymatlari){
            ichimlikToplami.add(y);
        }
        for (String z:boshqaQiymatlari){
            boshqalarToplami.add(z);
        }


        file=new File("src/taomMalumotlari.txt");

    }

    public  void malumotYoz(ActionEvent event){

        if (event.getSource().equals(controller.taomNomQoshBtn)){


            taomlarToplami.add(controller.taomNomiSetting.getText());
            //controller.taomNomiCBox.getItems().add(controller.taomNomiSetting.getText());
            controller.taomNomiSettCbox.getItems().add(controller.taomNomiSetting.getText());

            try {
                faylgaYoz();
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

    public void faylgaYoz() throws IOException {

      //  String sql="select insert into karvon_kafesi (taoNomi) ";

        fileWriter=new FileWriter(file,true);
        fileWriter.write(controller.taomNomiSetting.getText());
       fileWriter.write("\n");

       fileWriter.flush();
       fileWriter.close();

        controller.taomNomiSetting.clear();




    }

    public void saveAllBtnAction(ActionEvent event){

           malumotOzlashtirish();
    }

    public void malumotOzlashtirish(){
        try {
            Scanner scanner=new Scanner(file);

            if (scanner.hasNext()){
                qator=scanner.nextLine();
                taomlarToplami.add(qator);


            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
      //  controller.taomNomiCBox.getItems().addAll(taomlarToplami);
    }



}
