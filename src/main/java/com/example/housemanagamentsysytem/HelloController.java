package com.example.housemanagamentsysytem;

import action.MenuBarAction;
import action.actionMenuButtons;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.ComboBoxListCell;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class HelloController implements Initializable, EventHandler {

    public Button buyurtmaKorishBtn,buyurtmaOlishBtn,
            buyurtmalar,hodimlar,home,edit, stollar,yangilashBtn,sozlamalar;

    public AnchorPane sozlamalarPane,buyurtmaPane,mahsulotQoshishPane,
            royhatYaratishPane,JadvalNamunaPane,jadvalPane;
    public Pane jadvalYaratish;
    @FXML
    private TableColumn<TableData, Integer> ichimlikNarxi;
    @FXML
    private TableColumn<TableData, String> ichimlikNomi;
    @FXML
    private TableColumn<TableData, String> ichimliklar;
    @FXML
    private TableColumn<TableData, Integer> taomNarxi;
    @FXML
    private TableColumn<TableData, String> taomNomi;
    @FXML
    private TableColumn<?, ?> taomlar;
    @FXML
    private Button ishHaqlari;
    @FXML
    public Button mahsulotlar;
    @FXML
    private AnchorPane navBar;
    @FXML
    private Button ochirishBtn;
    @FXML
    private ListView<ComboBox<String>> royhat;

    @FXML
    private Label user;
    @FXML
    private TableColumn<TableData,Integer> vaBoshqaNarxi;
    @FXML
    private TableColumn<TableData, String> vaBoshqaNomi;
    @FXML
    private TableColumn<?, ?> vaBoshqalar;
    @FXML
    private TableColumn<TableData, Integer> jamiNarx;
    @FXML
    private  TableView<TableData> tableView;

    public Menu fileMenu,mahsulotQoshish;
    public MenuItem taomItem,ichimlikItem,vaBoshqaItem,
            royhatYaratish,jadvalYaratItem;



    actionMenuButtons harakat;

    private TableData tableData;
    Integer result,result1,result2,resultAll;


    public HelloController(){
        harakat=new actionMenuButtons(this);

       try{

           tableData=new TableData();
           result=tableData.getIchimlikNarxi();
           result1=tableData.getTaomNarxi();
           result2=tableData.getVaBoshqaNarxlar();
           resultAll=result+result1+result2;
       }catch (NullPointerException e){
           System.out.println(e.getMessage());
       }
    }


    public void setTableData(){
//        Integer result=

        ObservableList<TableData> malumotlar= FXCollections.observableArrayList(
                new TableData("Palov","Cola",
                        "Salat",20000,15000,40000,resultAll)
                , new TableData("Manti","Fanta",
                        "Pyure",25000,35000,60000,resultAll)
                , new TableData("Shorva","Pepsi",
                        "Perashki",10000,25000,20000,resultAll)

        );

        taomNomi.setCellValueFactory(new PropertyValueFactory<>("taomNomi"));
        ichimlikNomi.setCellValueFactory(new PropertyValueFactory<>("ichimlikNomi"));
        vaBoshqaNomi.setCellValueFactory(new PropertyValueFactory<>("vaBoshqalarNomi"));
        taomNarxi.setCellValueFactory(new PropertyValueFactory<>("taomNarxi"));
        ichimlikNarxi.setCellValueFactory(new PropertyValueFactory<>("ichimlikNarxi"));
        vaBoshqaNarxi.setCellValueFactory(new PropertyValueFactory<>("vaBoshqaNarxlar"));
        jamiNarx.setCellValueFactory(new PropertyValueFactory<>("jamiNarx"));
        tableView.setItems(malumotlar);
    }



    public void setListViewData(){
        ObservableList stollar=FXCollections.observableArrayList();
        ObservableList taomlar=FXCollections.observableArrayList();
        ObservableList ichimlklar=FXCollections.observableArrayList();
        ObservableList vaBoshqalar=FXCollections.observableArrayList();

    }



    public void setOnActionButtons(ActionEvent event){
       harakat.action(event);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        sozlamalar.setOnAction(this::setOnActionButtons);
       taomItem.setOnAction(this::handleMenu);
       royhatYaratish.setOnAction(this::handleMenu);
       jadvalYaratItem.setOnAction(this::handleMenu);
        setTableData();
        setListViewData();
    }

   public void actionDashboard(ActionEvent event) {
        harakat.action(event);
    }




    public void handleMenu(ActionEvent event) {
        new MenuBarAction(this).menuAction(event);

    }

    @Override
    public void handle(Event event) {

    }
}