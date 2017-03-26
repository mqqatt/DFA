package org.ms.dfa;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import org.ms.df.util.DateUtil;
import org.ms.dfa.model.BankingProduct;

import java.time.LocalDate;

public class Controller {


    @FXML
    private TableView<BankingProduct> bankingProductTable;

    @FXML
    private TableColumn<BankingProduct, Integer>  idColumn;

    @FXML
    private TableColumn<BankingProduct, String> bankingProductName;

  //  @FXML
  //  private Label nameLabel;
    @FXML
    private Label bankNameLabel;
    @FXML
    private Label productTypeLabel;
    @FXML
    private Label startDateLabel;
    @FXML
    private Label endDateLabel;

    private Main mainApp;


    public Controller(){

    }

    @FXML
    private void initialize() {
        idColumn.setCellValueFactory(cellData -> cellData.getValue().idProperty().asObject());
        bankingProductName.setCellValueFactory(cellData -> cellData.getValue().nameProperty());

        showBankingProductDetail(null);

        bankingProductTable.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue)
                -> showBankingProductDetail(newValue));

    }

    private void showBankingProductDetail(BankingProduct bankingProduct){

        if(bankingProduct != null){

            bankNameLabel.setText(bankingProduct.getBankName());
            productTypeLabel.setText(bankingProduct.getProductType());

            startDateLabel.setText(DateUtil.format(bankingProduct.getStartDate()));
            endDateLabel.setText(DateUtil.format(bankingProduct.getEndDate()));

        //TODO banking product conditions!

        }

        if(bankingProduct == null){

            bankNameLabel.setText("");
            productTypeLabel.setText("");
            startDateLabel.setText("");
            endDateLabel.setText("");

        }

    }

    public void setMainApp(Main mainApp) {
        this.mainApp = mainApp;

        // Add observable list data to the table
        bankingProductTable.setItems(mainApp.getBankingProductsData());
    }



}
