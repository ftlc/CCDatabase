package Boundaries;

import Controllers.PaymentMethodController;
import Controllers.SoldFromController;
import Controllers.WriteInfoController;
import Entity.Model;
import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InfoPage extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField nametxt;
    private JTextField phoneNumtxt;
    private JTextField emailtxt;
    private JTextField busNameTxt;
    private JTextField POnumtxt;
    private JTextField invoiceNumtxt;
    private JTextField manInvoiceNumtxt;
    private JTextField dateOfPurchaseTxt;
    private JTextField dateOfShipmenttxt;
    private JTextField protxt;
    private JTextField shippingCotxt;
    private JTextField manufacturertxt;
    private JTextField manBranchtxt;
    private JTextField modelNumtxt;
    private JTextField quantityTxt;
    private JTextField shippingTermtxt;
    private JTextField netCosttxt;
    private JTextField salesPricetxt;
    private JTextField soNumtxt;
    private JTextField taxtxt;
    private JTextField amazonEbayFeetxt;
    private JTextField paypalFeetxt;
    private JTextField paidDatetxt;
    private JTextField invoiceDatetxt;
    private JComboBox soldFrom;
    private JComboBox payMethod;
    private JCheckBox paidToMan;
    private JCheckBox returningCustomerCheckBox;
    private JCheckBox deliveryCheckBox;
    private JCheckBox liftGateCheckBox;
    Model model;

    public InfoPage(Model m) {

        this.model = m;


        setBounds(100, 100, 800, 800);
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);




        payMethod.setEditable(true);
        payMethod.addItem("Amazon");
        payMethod.addItem("PayPal");
        payMethod.addItem("Bank Transfer");
        payMethod.addActionListener(new PaymentMethodController());


        soldFrom.setEditable(true);
        soldFrom.addItem("Website");
        soldFrom.addItem("Amazon");
        soldFrom.addItem("Facebook");
        soldFrom.addItem("eBay");
        soldFrom.addItem("CraigsList");
        soldFrom.addItem("Other");
        soldFrom.addActionListener(new SoldFromController());


        buttonOK.addActionListener(new WriteInfoController(model.getInfoEntity(), this));

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);


    }

    public JTextField getBusNameTxt() {
        return busNameTxt;
    }

    public JTextField getDateOfPurchaseTxt() {
        return dateOfPurchaseTxt;
    }

    public JTextField getDateOfShipmenttxt() {
        return dateOfShipmenttxt;
    }

    public JTextField getEmailtxt() {
        return emailtxt;
    }

    public JTextField getAmazonEbayFeetxt() {
        return amazonEbayFeetxt;
    }

    public JTextField getInvoiceNumtxt() {
        return invoiceNumtxt;
    }

    public JCheckBox getPaidToMan() {
        return paidToMan;
    }

    public JTextField getManBranchtxt() {
        return manBranchtxt;
    }

    public JTextField getManInvoiceNumtxt() {
        return manInvoiceNumtxt;
    }

    public JTextField getInvoiceDatetxt() {
        return invoiceDatetxt;
    }

    public JCheckBox getDeliveryCheckBox() {
        return deliveryCheckBox;
    }

    public JComboBox getPayMethod() {
        return payMethod;
    }

    public JTextField getManufacturertxt() {
        return manufacturertxt;
    }

    public JTextField getModelNumtxt() {
        return modelNumtxt;
    }

    public JTextField getNametxt() {
        return nametxt;
    }

    public JComboBox getSoldFrom() {
        return soldFrom;
    }

    public JCheckBox getReturningCustomerCheckBox() {
        return returningCustomerCheckBox;
    }

    public JTextField getNetCosttxt() {
        return netCosttxt;
    }

    public JTextField getPaidDatetxt() {
        return paidDatetxt;
    }

    public JTextField getPaypalFeetxt() {
        return paypalFeetxt;
    }

    public JTextField getPhoneNumtxt() {
        return phoneNumtxt;
    }

    public JTextField getPOnumtxt() {
        return POnumtxt;
    }

    public JTextField getProtxt() {
        return protxt;
    }

    public JTextField getQuantityTxt() {
        return quantityTxt;
    }

    public JTextField getSalesPricetxt() {
        return salesPricetxt;
    }

    public JTextField getShippingCotxt() {
        return shippingCotxt;
    }

    public JTextField getShippingTermtxt() {
        return shippingTermtxt;
    }

    public JCheckBox getLiftGateCheckBox() {
        return liftGateCheckBox;
    }

    public JTextField getSoNumtxt() {
        return soNumtxt;
    }

    public JTextField getTaxtxt() {
        return taxtxt;
    }

    private void onOK() {
        // add your code here
        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }



    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        contentPane = new JPanel();
        contentPane.setLayout(new GridLayoutManager(2, 1, new Insets(10, 10, 10, 10), -1, -1));
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));
        contentPane.add(panel1, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, 1, null, null, null, 0, false));
        final Spacer spacer1 = new Spacer();
        panel1.add(spacer1, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1, true, false));
        panel1.add(panel2, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        buttonOK = new JButton();
        buttonOK.setText("OK");
        panel2.add(buttonOK, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        buttonCancel = new JButton();
        buttonCancel.setText("Cancel");
        panel2.add(buttonCancel, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JPanel panel3 = new JPanel();
        panel3.setLayout(new GridLayoutManager(30, 2, new Insets(0, 0, 0, 0), -1, -1));
        contentPane.add(panel3, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final JLabel label1 = new JLabel();
        label1.setText("Name");
        panel3.add(label1, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        nametxt = new JTextField();
        nametxt.setText("");
        panel3.add(nametxt, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JLabel label2 = new JLabel();
        label2.setText("Phone Number");
        panel3.add(label2, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        phoneNumtxt = new JTextField();
        phoneNumtxt.setText("");
        panel3.add(phoneNumtxt, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JLabel label3 = new JLabel();
        label3.setText("Email");
        panel3.add(label3, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label4 = new JLabel();
        label4.setText("Business Name");
        panel3.add(label4, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label5 = new JLabel();
        label5.setText("PO Number");
        panel3.add(label5, new GridConstraints(4, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label6 = new JLabel();
        label6.setText("Invoice Num");
        panel3.add(label6, new GridConstraints(5, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label7 = new JLabel();
        label7.setText("Man. Invoice Num");
        panel3.add(label7, new GridConstraints(6, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label8 = new JLabel();
        label8.setText("Date of Purchase");
        panel3.add(label8, new GridConstraints(7, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label9 = new JLabel();
        label9.setText("Date of Shipment");
        panel3.add(label9, new GridConstraints(8, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label10 = new JLabel();
        label10.setText("PRO");
        panel3.add(label10, new GridConstraints(9, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label11 = new JLabel();
        label11.setText("Shipping Co");
        panel3.add(label11, new GridConstraints(10, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label12 = new JLabel();
        label12.setText("Manufacturer");
        panel3.add(label12, new GridConstraints(11, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label13 = new JLabel();
        label13.setText("Man. Branch");
        panel3.add(label13, new GridConstraints(12, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label14 = new JLabel();
        label14.setText("Model Num");
        panel3.add(label14, new GridConstraints(13, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        emailtxt = new JTextField();
        emailtxt.setText("");
        panel3.add(emailtxt, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        busNameTxt = new JTextField();
        busNameTxt.setText("");
        panel3.add(busNameTxt, new GridConstraints(3, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        POnumtxt = new JTextField();
        POnumtxt.setText("");
        panel3.add(POnumtxt, new GridConstraints(4, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        invoiceNumtxt = new JTextField();
        invoiceNumtxt.setText("");
        panel3.add(invoiceNumtxt, new GridConstraints(5, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        manInvoiceNumtxt = new JTextField();
        manInvoiceNumtxt.setText("");
        panel3.add(manInvoiceNumtxt, new GridConstraints(6, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        dateOfPurchaseTxt = new JTextField();
        dateOfPurchaseTxt.setText("");
        panel3.add(dateOfPurchaseTxt, new GridConstraints(7, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        dateOfShipmenttxt = new JTextField();
        dateOfShipmenttxt.setText("");
        panel3.add(dateOfShipmenttxt, new GridConstraints(8, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        protxt = new JTextField();
        protxt.setText("");
        panel3.add(protxt, new GridConstraints(9, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        shippingCotxt = new JTextField();
        shippingCotxt.setText("");
        panel3.add(shippingCotxt, new GridConstraints(10, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        manufacturertxt = new JTextField();
        manufacturertxt.setText("");
        panel3.add(manufacturertxt, new GridConstraints(11, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        manBranchtxt = new JTextField();
        manBranchtxt.setText("");
        panel3.add(manBranchtxt, new GridConstraints(12, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        modelNumtxt = new JTextField();
        modelNumtxt.setText("");
        panel3.add(modelNumtxt, new GridConstraints(13, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        quantityTxt = new JTextField();
        quantityTxt.setText("");
        panel3.add(quantityTxt, new GridConstraints(14, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        shippingTermtxt = new JTextField();
        shippingTermtxt.setText("");
        panel3.add(shippingTermtxt, new GridConstraints(15, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        netCosttxt = new JTextField();
        netCosttxt.setText("");
        panel3.add(netCosttxt, new GridConstraints(16, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        salesPricetxt = new JTextField();
        salesPricetxt.setText("");
        panel3.add(salesPricetxt, new GridConstraints(17, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        soNumtxt = new JTextField();
        soNumtxt.setText("");
        panel3.add(soNumtxt, new GridConstraints(18, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        taxtxt = new JTextField();
        taxtxt.setText("");
        panel3.add(taxtxt, new GridConstraints(20, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        amazonEbayFeetxt = new JTextField();
        amazonEbayFeetxt.setText("");
        panel3.add(amazonEbayFeetxt, new GridConstraints(21, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        paypalFeetxt = new JTextField();
        paypalFeetxt.setText("");
        panel3.add(paypalFeetxt, new GridConstraints(22, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        paidDatetxt = new JTextField();
        paidDatetxt.setText("");
        panel3.add(paidDatetxt, new GridConstraints(29, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        invoiceDatetxt = new JTextField();
        invoiceDatetxt.setText("");
        panel3.add(invoiceDatetxt, new GridConstraints(25, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JLabel label15 = new JLabel();
        label15.setText("Quantity");
        panel3.add(label15, new GridConstraints(14, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label16 = new JLabel();
        label16.setText("Shipping Term");
        panel3.add(label16, new GridConstraints(15, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label17 = new JLabel();
        label17.setText("Net Cost");
        panel3.add(label17, new GridConstraints(16, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label18 = new JLabel();
        label18.setText("Sales Price");
        panel3.add(label18, new GridConstraints(17, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label19 = new JLabel();
        label19.setText("SO Number");
        panel3.add(label19, new GridConstraints(18, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label20 = new JLabel();
        label20.setText("Sold From");
        panel3.add(label20, new GridConstraints(19, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label21 = new JLabel();
        label21.setText("Tax");
        panel3.add(label21, new GridConstraints(20, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label22 = new JLabel();
        label22.setText("Amazon/Ebay fee");
        panel3.add(label22, new GridConstraints(21, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label23 = new JLabel();
        label23.setText("Paypal Fee");
        panel3.add(label23, new GridConstraints(22, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label24 = new JLabel();
        label24.setText("Invoice Date");
        panel3.add(label24, new GridConstraints(25, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label25 = new JLabel();
        label25.setText("Payment Method");
        panel3.add(label25, new GridConstraints(26, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label26 = new JLabel();
        label26.setText("Paid Date");
        panel3.add(label26, new GridConstraints(29, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        soldFrom = new JComboBox();
        panel3.add(soldFrom, new GridConstraints(19, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        payMethod = new JComboBox();
        panel3.add(payMethod, new GridConstraints(26, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        paidToMan = new JCheckBox();
        paidToMan.setText("Paid To Manufacturer?");
        panel3.add(paidToMan, new GridConstraints(28, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        returningCustomerCheckBox = new JCheckBox();
        returningCustomerCheckBox.setText("Returning Customer?");
        panel3.add(returningCustomerCheckBox, new GridConstraints(27, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        deliveryCheckBox = new JCheckBox();
        deliveryCheckBox.setText("Delivery?");
        panel3.add(deliveryCheckBox, new GridConstraints(24, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        liftGateCheckBox = new JCheckBox();
        liftGateCheckBox.setText("Lift Gate?");
        panel3.add(liftGateCheckBox, new GridConstraints(23, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return contentPane;
    }
}

