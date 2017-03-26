package org.ms.dfa.model;

import javafx.beans.property.*;

import java.time.LocalDate;

/**
 * Created by Mateusz on 2017-03-26.
 */
public class BankingProduct {

    private final StringProperty name;
    private final IntegerProperty id;
    private final StringProperty bankName;
    private final StringProperty productType;
    private final ObjectProperty<LocalDate> startDate;
    private final ObjectProperty<LocalDate> endDate;

    public BankingProduct(String name, Integer id, String bankName, String productType, ObjectProperty<LocalDate> startDate, ObjectProperty<LocalDate> endDate) {
        this.name = new SimpleStringProperty(name);
        this.id = new SimpleIntegerProperty(id);
        this.bankName = new SimpleStringProperty(bankName);
        this.productType = new SimpleStringProperty(productType);
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getName() {
        return name.get();
    }

    public StringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public int getId() {
        return id.get();
    }

    public IntegerProperty idProperty() {
        return id;
    }

    public void setId(int id) {
        this.id.set(id);
    }

    public String getBankName() {
        return bankName.get();
    }

    public StringProperty bankNameProperty() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName.set(bankName);
    }

    public String getProductType() {
        return productType.get();
    }

    public StringProperty productTypeProperty() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType.set(productType);
    }

    public LocalDate getStartDate() {
        return startDate.get();
    }

    public ObjectProperty<LocalDate> startDateProperty() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate.set(startDate);
    }

    public LocalDate getEndDate() {
        return endDate.get();
    }

    public ObjectProperty<LocalDate> endDateProperty() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate.set(endDate);
    }
}
