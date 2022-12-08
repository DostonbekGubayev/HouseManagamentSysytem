package com.example.housemanagamentsysytem;

import action.ExitManager;
import action.actionMenuButtons;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.LinearGradient;

import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Collection;
import java.util.Iterator;
import java.util.ResourceBundle;
import java.util.Scanner;

public class HelloController implements Initializable {

    public Button buyurtmaKorishBtn,buyurtmaOlishBtn,
            buyurtmalar,hodimlar,home,edit, stollar,yangilashBtn,sozlamalar,saveButton;

    public AnchorPane sozlamalarPane,buyurtmaPane,mahsulotQoshishPane,
            royhatYaratishPane,JadvalNamunaPane,jadvalPane,settingsPane,homePane;

    public Button taomNomQoshBtn,taomNomOchirBtn,ichimlikNomQoshBtn,
            ichimlikNomOchirBtn,boshqaNomQoshBtn,boshqaNomOchirBtn;

    public TextField taomNomiSetting,ichimlikNomiSetting,boshqaNomiSetting;

    public ComboBox<String> taomNomiSettCbox,ichimlikNomiSettCbox,boshqaNomiSettCbox;

    @FXML
    private TableColumn<TableData, Integer> ichimlikNarxi;
    @FXML
    private TableColumn<TableData, String> ichimlikNomi;
    @FXML
    private TableColumn<TableData, String> ichimliklar;
    @FXML
    private TableColumn<TableData, Integer> taomNarxi;
    @FXML
    private TableColumn<TableData, Integer> taomSoni;
    @FXML
    private TableColumn<TableData, Integer> ichimlikSoni;
    @FXML
    private TableColumn<TableData, Integer> boshqaSoni;
    @FXML
    private TableColumn<TableData, String> taomNomi;

    @FXML
    private TableColumn<?, ?> taomlar;
    @FXML
    private Button ishHaqlari,exit;
    @FXML
    public Button mahsulotlar,kiritishButton;
    @FXML
    private AnchorPane navBar;
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
    @FXML
    private TextField taomNomiTf,taomNarxiTf,taomSoniTf,ichimlikNomiTf,
            ichimlikNarxiTf,ichimlikSoniTf,boshqaNarxiTf,boshqaNomiTf,boshqaSoniTf;
    @FXML
    private Label summaLbl,narxQiymatiLbl;

    public ComboBox<String> taomNomiCBox, ichimlikNomiCBox,boshqaNomiCBox;

    public Menu fileMenu,mahsulotQoshish;
    public MenuItem taomItem,ichimlikItem,vaBoshqaItem,
            royhatYaratish,jadvalYaratItem;


    ObservableList<TableData>malumotlar=FXCollections.observableArrayList();
    ObservableList<String> taomToplami=FXCollections.observableArrayList();

    private actionMenuButtons harakat;
    private MalumotYozish malumotYozish;
    private TableData tableData;

    public HelloController(){
        harakat=new actionMenuButtons(this);
        malumotYozish=new MalumotYozish(this);
        tableData=new TableData();

    }


    public void setTableData(){


        taomNomi.setCellValueFactory(new PropertyValueFactory<>("taomNomi"));
        ichimlikNomi.setCellValueFactory(new PropertyValueFactory<>("ichimlikNomi"));
        vaBoshqaNomi.setCellValueFactory(new PropertyValueFactory<>("vaBoshqalarNomi"));
        taomNarxi.setCellValueFactory(new PropertyValueFactory<>("taomNarxi"));
        ichimlikNarxi.setCellValueFactory(new PropertyValueFactory<>("ichimlikNarxi"));
        vaBoshqaNarxi.setCellValueFactory(new PropertyValueFactory<>("vaBoshqaNarxlar"));
        jamiNarx.setCellValueFactory(new PropertyValueFactory<>("jamiNarx"));
        taomSoni.setCellValueFactory(new PropertyValueFactory<>("taomSoni"));
        ichimlikSoni.setCellValueFactory(new PropertyValueFactory<>("ichimlikSoni"));
        boshqaSoni.setCellValueFactory(new PropertyValueFactory<>("boshqaSoni"));

        tableView.setItems(malumotlar);

    }




    //Jadvalga ma'lumotlarni textField lardan o'zlashtirish

    public void malomotKiritish(ActionEvent event){
        String taom_nomi="---",ichimlik_nomi="---",boshqa_nomi = "---";
        Integer taom_narxi,taom_soni,ichimlik_narxi,ichimlik_soni,boshqa_narxi,boshqa_soni;

        Integer taomSum,ichimlikSum,boshqaSum,jamiSum;


        if(taomNarxiTf.getText().isEmpty()&&taomSoniTf.getText().isEmpty()){
            taomSum=0;
            taom_narxi=0;
            taom_soni=0;
            tableData.setTaomNarxi(null);
            tableData.setTaomSoni(null);
        }else {
            taom_nomi=taomNomiCBox.getSelectionModel().getSelectedItem();
            taom_narxi=Integer.parseInt(taomNarxiTf.getText());
            taom_soni=Integer.parseInt(taomSoniTf.getText());
            taomSum=taom_narxi*taom_soni;
        }

        if (ichimlikNarxiTf.getText().isEmpty()&&ichimlikSoniTf.getText().isEmpty()){
            ichimlikSum=0;
            ichimlik_narxi=0;
            ichimlik_soni=0;

            tableData.setIchimlikNarxi(null);
            tableData.setIchimlikSoni(null);
        }else{
            ichimlik_nomi=ichimlikNomiCBox.getSelectionModel().getSelectedItem();
            ichimlik_narxi=Integer.parseInt(ichimlikNarxiTf.getText());
            ichimlik_soni=Integer.parseInt(ichimlikSoniTf.getText());
            ichimlikSum=ichimlik_narxi*ichimlik_soni;

        }

        if (boshqaSoniTf.getText().isEmpty()&&boshqaNarxiTf.getText().isEmpty()){
            boshqaSum=0;
            boshqa_narxi=0;
            boshqa_soni=0;

            tableData.setVaBoshqaNarxlar(null);
            tableData.setBoshqaSoni(null);
        }else{
            boshqa_nomi=boshqaNomiCBox.getSelectionModel().getSelectedItem();

            boshqa_narxi=Integer.parseInt(boshqaNarxiTf.getText());
            boshqa_soni=Integer.parseInt(boshqaSoniTf.getText());
            boshqaSum=boshqa_narxi*boshqa_soni;
        }

        jamiSum=taomSum+ichimlikSum+boshqaSum;


        malumotlar.addAll(new TableData(
                taom_nomi,taom_narxi,taom_soni,
                ichimlik_nomi,ichimlik_narxi,ichimlik_soni,
                boshqa_nomi,boshqa_narxi,boshqa_soni,jamiSum
        ));

        taomNomi.setCellValueFactory(new PropertyValueFactory<>("taomNomi"));
        ichimlikNomi.setCellValueFactory(new PropertyValueFactory<>("ichimlikNomi"));
        vaBoshqaNomi.setCellValueFactory(new PropertyValueFactory<>("vaBoshqalarNomi"));
        taomNarxi.setCellValueFactory(new PropertyValueFactory<>("taomNarxi"));
        ichimlikNarxi.setCellValueFactory(new PropertyValueFactory<>("ichimlikNarxi"));
        vaBoshqaNarxi.setCellValueFactory(new PropertyValueFactory<>("vaBoshqaNarxlar"));
        jamiNarx.setCellValueFactory(new PropertyValueFactory<>("jamiNarx"));
        taomSoni.setCellValueFactory(new PropertyValueFactory<>("taomSoni"));
        ichimlikSoni.setCellValueFactory(new PropertyValueFactory<>("ichimlikSoni"));
        boshqaSoni.setCellValueFactory(new PropertyValueFactory<>("boshqaSoni"));

        tableView.setItems(malumotlar);

        taomSoniTf.clear();
        taomNarxiTf.clear();
        taomNomiCBox.getSelectionModel().clearSelection();
        taomNomiCBox.setPromptText("Choose...");

        ichimlikNomiCBox.getSelectionModel().clearSelection();
        ichimlikNarxiTf.clear();
        ichimlikSoniTf.clear();
        ichimlikNomiCBox.setPromptText("Choose...");

        boshqaNomiCBox.getSelectionModel().clearSelection();
        boshqaNarxiTf.clear();
        boshqaSoniTf.clear();
        boshqaNomiCBox.setPromptText("Choose...");

        Integer qiymat=Integer.parseInt(narxQiymatiLbl.getText())+ jamiSum;


        narxQiymatiLbl.setText(String.valueOf(qiymat));

        System.out.println(qiymat);
    }


    // Ma'lumotlarn fayldan o'zlashtirish metodi
    public void fayldanMalumotOl(){

        try {
            Scanner scanner=new Scanner(malumotYozish.file);
            String qator;
            while (scanner.hasNext()){
                qator=scanner.nextLine();
               taomToplami.add(qator);


                taomNomiCBox.getItems().addAll(taomToplami);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }



    public void actionSettings(ActionEvent event) {

        harakat.action(event);
        malumotYozish.malumotYoz(event);
    }



    @Override
    public void initialize(URL location, ResourceBundle resources) {

        kiritishButton.setOnAction(this::malomotKiritish);
        home.setOnAction(this::actionSettings);
        buyurtmalar.setOnAction(this::actionSettings);
        sozlamalar.setOnAction(this::actionSettings);


        taomNomiCBox.getItems().addAll(malumotYozish.taomlarToplami);
        ichimlikNomiCBox.getItems().addAll(malumotYozish.ichimlikToplami);
        boshqaNomiCBox.getItems().addAll(malumotYozish.boshqalarToplami);


        exit.setOnAction(event -> ExitManager.exit());
        taomNomQoshBtn.setOnAction(event -> {
            malumotYozish.malumotYoz(event);
        });
        ichimlikNomQoshBtn.setOnAction(event -> malumotYozish.malumotYoz(event) );
        boshqaNomQoshBtn.setOnAction(event ->   malumotYozish.malumotYoz(event) );


        saveButton.setOnAction(event -> {
            malumotYozish.saveAllBtnAction(event);
            fayldanMalumotOl();
        });
        fayldanMalumotOl();

        taomNomiCBox.setVisibleRowCount(5);
        ichimlikNomiCBox.setVisibleRowCount(5);
        boshqaNomiCBox.setVisibleRowCount(5);



        setTableData();


    }




}