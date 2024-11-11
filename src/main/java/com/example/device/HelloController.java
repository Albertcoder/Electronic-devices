package com.example.device;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {

    @FXML
    private TabPane tabPane;
    @FXML
    private TextField smartphoneNameField, smartphonePriceField, smartphoneWeightField, smartphoneScreenSizeField, smartphoneCameraResolutionField;
    @FXML
    private TextField laptopNameField, laptopPriceField, laptopWeightField, laptopRamSizeField, laptopProcessorTypeField;
    @FXML
    private TextField tabletNameField, tabletPriceField, tabletWeightField, tabletBatteryLifeField;
    @FXML
    private CheckBox stylusCheckBox;
    @FXML
    private ListView<Device> listView;
    @FXML
    private ObservableList<Device> deviceList;

    @FXML
    public void initialize() {
        deviceList = FXCollections.observableArrayList();
        listView.setItems(deviceList);
    }

    @FXML
    protected void onAddButtonClick() {
        try {
            Device device = null;

            // Initialize variables for device creation
            String name = "";
            double price = 0;
            double weight = 0;

            // Get the selected tab
            String selectedTab = tabPane.getSelectionModel().getSelectedItem().getText();

            // Handle adding a Smartphone
            if (selectedTab.equals("Smartphone")) {
                name = smartphoneNameField.getText();
                price = Double.parseDouble(smartphonePriceField.getText());
                weight = Double.parseDouble(smartphoneWeightField.getText());
                double screenSize = Double.parseDouble(smartphoneScreenSizeField.getText());
                double cameraResolution = Double.parseDouble(smartphoneCameraResolutionField.getText());
                device = new Smartphone(name, price, weight, screenSize, cameraResolution);
            }
            // Handle adding a Laptop
            else if (selectedTab.equals("Laptop")) {
                name = laptopNameField.getText();
                price = Double.parseDouble(laptopPriceField.getText());
                weight = Double.parseDouble(laptopWeightField.getText());
                int ramSize = Integer.parseInt(laptopRamSizeField.getText());
                String processorType = laptopProcessorTypeField.getText();
                device = new Laptop(name, price, weight, ramSize, processorType);
            }
            // Handle adding a Tablet
            else if (selectedTab.equals("Tablet")) {
                name = tabletNameField.getText();
                price = Double.parseDouble(tabletPriceField.getText());
                weight = Double.parseDouble(tabletWeightField.getText());
                double batteryLife = Double.parseDouble(tabletBatteryLifeField.getText());
                boolean hasStylus = stylusCheckBox.isSelected();
                device = new Tablet(name, price, weight, batteryLife, hasStylus);
            }

            // If device creation is successful, add it to the list and clear the fields
            if (device != null) {
                deviceList.add(device);
                clearFields();
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid numeric values.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    @FXML
    protected void onRemoveButtonClick() {
        Device selectedDevice = listView.getSelectionModel().getSelectedItem();
        if (selectedDevice != null) {
            deviceList.remove(selectedDevice);
        } else {
            System.out.println("Error, please select a device to remove");
        }
    }

    private void clearFields() {
        // Clear the fields based on the selected tab
        String selectedTab = tabPane.getSelectionModel().getSelectedItem().getText();

        if (selectedTab.equals("Smartphone")) {
            smartphoneNameField.clear();
            smartphonePriceField.clear();
            smartphoneWeightField.clear();
            smartphoneScreenSizeField.clear();
            smartphoneCameraResolutionField.clear();
        } else if (selectedTab.equals("Laptop")) {
            laptopNameField.clear();
            laptopPriceField.clear();
            laptopWeightField.clear();
            laptopRamSizeField.clear();
            laptopProcessorTypeField.clear();
        } else if (selectedTab.equals("Tablet")) {
            tabletNameField.clear();
            tabletPriceField.clear();
            tabletWeightField.clear();
            tabletBatteryLifeField.clear();
            stylusCheckBox.setSelected(false);
        }
    }
}
