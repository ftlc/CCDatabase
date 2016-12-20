package Entity;

import java.util.Date;

/**
 * Created by ftlc on 12/19/16.
 */
public class InfoEntity {


    String name;
    String phone;
    String email;
    String business_name;
    final String PO = "PO";
    int ponum;
    int invoiceNum;
    String manInvoiceNum;
    Date dateOfPurchase;
    Date dateOfShipment;
    int pro;
    String shipCo;
    String manufacturer;
    String manBranch;
    String modelNum;
    int quantity;
    String shippingTerms;
    float netCost;
    float salesPrice;
    final String SO = "SO";
    int so;
    String soldFrom;
    float tax;
    float AEfee;
    float paypalFee;

    boolean liftGate;
    boolean delivery;
    Date invoiceDate;
    String paymentMethod;
    boolean returningCust;
    boolean paidToMan;
    Date paidDate;


    public Date getDateOfPurchase() {
        return dateOfPurchase;
    }

    public Date getDateOfShipment() {
        return dateOfShipment;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public Date getPaidDate() {
        return paidDate;
    }

    public float getAEfee() {
        return AEfee;
    }

    public float getNetCost() {
        return netCost;
    }

    public float getPaypalFee() {
        return paypalFee;
    }

    public float getSalesPrice() {
        return salesPrice;
    }

    public float getTax() {
        return tax;
    }

    public int getInvoiceNum() {
        return invoiceNum;
    }

    public int getPonum() {
        return ponum;
    }

    public int getPro() {
        return pro;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getSo() {
        return so;
    }

    public String getBusiness_name() {
        return business_name;
    }

    public String getEmail() {
        return email;
    }

    public String getManInvoiceNum() {
        return manInvoiceNum;
    }

    public String getManBranch() {
        return manBranch;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModelNum() {
        return modelNum;
    }

    public String getName() {
        return name;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public String getPhone() {
        return phone;
    }

    public String getPO() {
        return PO;
    }

    public String getShipCo() {
        return shipCo;
    }

    public String getShippingTerms() {
        return shippingTerms;
    }

    public String getSO() {
        return SO;
    }

    public String getSoldFrom() {
        return soldFrom;
    }

    public void setAEfee(float AEfee) {
        this.AEfee = AEfee;
    }

    public void setBusiness_name(String business_name) {
        this.business_name = business_name;
    }

    public void setDateOfPurchase(Date dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    public void setDelivery(boolean delivery) {
        this.delivery = delivery;
    }

    public void setDateOfShipment(Date dateOfShipment) {
        this.dateOfShipment = dateOfShipment;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public void setInvoiceNum(int invoiceNum) {
        this.invoiceNum = invoiceNum;
    }

    public void setLiftGate(boolean liftGate) {
        this.liftGate = liftGate;
    }

    public void setManBranch(String manBranch) {
        this.manBranch = manBranch;
    }

    public void setManInvoiceNum(String manInvoiceNum) {
        this.manInvoiceNum = manInvoiceNum;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setModelNum(String modelNum) {
        this.modelNum = modelNum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNetCost(float netCost) {
        this.netCost = netCost;
    }

    public void setPaidDate(Date paidDate) {
        this.paidDate = paidDate;
    }

    public void setPaidToMan(boolean paidToMan) {
        this.paidToMan = paidToMan;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setPaypalFee(float paypalFee) {
        this.paypalFee = paypalFee;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPonum(int ponum) {
        this.ponum = ponum;
    }

    public void setPro(int pro) {
        this.pro = pro;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }



    public void setReturningCust(boolean returningCust) {
        this.returningCust = returningCust;
    }

    public void setSalesPrice(float salesPrice) {
        this.salesPrice = salesPrice;
    }

    public void setShipCo(String shipCo) {
        this.shipCo = shipCo;
    }

    public void setShippingTerms(String shippingTerms) {
        this.shippingTerms = shippingTerms;
    }



    public void setSo(int so) {
        this.so = so;
    }

    public void setSoldFrom(String soldFrom) {
        this.soldFrom = soldFrom;
    }

    public void setTax(float tax) {
        this.tax = tax;
    }




    public InfoEntity() {


    }
}
