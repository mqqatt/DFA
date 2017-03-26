package org.ms.dfa;

import javafx.application.Application;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.ms.dfa.model.BankingProduct;

import java.io.IOException;
import java.time.LocalDate;

public class Main extends Application {

    private Stage primaryStage;
    private AnchorPane mainLayout;
    private ObservableList<BankingProduct> bankingProductsData = FXCollections.observableArrayList();


    @Override
    public void start(Stage primaryStage){

        this.primaryStage = primaryStage;
        primaryStage.setTitle("Desktop Financial Assistant");

        showDFA();
    }


    public void showDFA() {

        try{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("main.fxml"));
            mainLayout =  loader.load();
            Scene scene = new Scene (mainLayout);
            primaryStage.setScene(scene);
            primaryStage.show();

            Controller controller = loader.getController();
            controller.setMainApp(this);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public ObservableList<BankingProduct> getBankingProductsData() {

        return  bankingProductsData;
    }

    public Main(){


    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
