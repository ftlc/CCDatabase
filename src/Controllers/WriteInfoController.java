package Controllers;

import Boundaries.InfoPage;
import Entity.DataPoint;
import Entity.InfoEntity;
import Entity.StrDataPoint;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by ftlc on 12/20/16.
 */
public class WriteInfoController implements ActionListener{

    InfoPage infoPage;
    InfoEntity infoEntity;

    public WriteInfoController(InfoEntity ie, InfoPage ip){
        this.infoEntity = ie;
        this.infoPage = ip;

    }
    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        if(!writeTextField(infoPage.getNametxt(), infoEntity.getName())) {return;}

        if(!writeTextField(infoPage.getPhoneNumtxt(), infoEntity.getPhone())) { return;}

        if(!writeTextField(infoPage.getEmailtxt(), infoEntity.getEmail())) { return;}
        if(!writeTextField(infoPage.getBusNameTxt(), infoEntity.getBusiness_name())) { return;}
        if(!writeTextField(infoPage.getPOnumtxt(), infoEntity.getPonum())) { return;}
        if(!writeTextField(infoPage.getInvoiceNumtxt(), infoEntity.getInvoiceNum())) { return;}
        if(!writeTextField(infoPage.getManInvoiceNumtxt(), infoEntity.getManInvoiceNum())) { return;}
        if(!writeTextField(infoPage.getDateOfPurchaseTxt(), infoEntity.getDateOfPurchase())) { return;}
   /*     if(!writeTextField(infoPage.getDateOfShipmenttxt())) { return;}
        if(!writeTextField(infoPage.getProtxt())) { return;}
        if(!writeTextField(infoPage.getShippingCotxt())) { return;}
        if(!writeTextField(infoPage.getManufacturertxt())) { return;}
        if(!writeTextField(infoPage.getManBranchtxt())) { return;}
        if(!writeTextField(infoPage.getModelNumtxt())) { return;}
        if(!writeTextField(infoPage.getQuantityTxt())) { return;}
        if(!writeTextField(infoPage.getShippingTermtxt())) { return;}
        if(!writeTextField(infoPage.getNetCosttxt())) { return;}
        if(!writeTextField(infoPage.getSalesPricetxt())) { return;}
        if(!writeTextField(infoPage.getSoNumtxt())) { return;}*/

        infoPage.dispose();
    }

    boolean writeTextField(JTextField toWrite, DataPoint toWriteTo){

        if(toWrite.getText() != null) {

            toWriteTo.setDataPoint(toWrite.getText());
            return true;
        }
        else {
            JOptionPane.showMessageDialog(null, "Not All Fields Are Filled!");
            return false;
        }
    }
}
