package com.example.sa3id;

import java.util.ArrayList;

public class UploadRequest {
    private String description;
    private ArrayList<String> materialsList;
    private String senderEmail;

    public String getSenderEmail() {
        return senderEmail;
    }

    public void setSenderEmail(String senderEmail) {
        this.senderEmail = senderEmail;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<String> getMaterialsList() {
        return materialsList;
    }

    public void setMaterialsList(ArrayList<String> materialsList) {
        this.materialsList = materialsList;
    }
}
