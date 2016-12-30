package Entity;


/**
 * Created by ftlc on 12/19/16.
 */
public class InfoEntity {


    StrDataPoint name;
    StrDataPoint phone;
    StrDataPoint email;
    StrDataPoint business_name;
    final String PO = "PO";
    IntDataPoint ponum;
    IntDataPoint invoiceNum;
    StrDataPoint manInvoiceNum;
    DateDataPoint dateOfPurchase;
    DateDataPoint dateOfShipment;
    IntDataPoint pro;
    StrDataPoint shipCo;
    StrDataPoint manufacturer;
    StrDataPoint manBranch;
    StrDataPoint modelNum;
    IntDataPoint quantity;
    StrDataPoint shippingTerms;
    FloatDataPoint netCost;
    FloatDataPoint salesPrice;
    final String SO = "SO";
    IntDataPoint so;
    StrDataPoint soldFrom;
    FloatDataPoint tax;
    FloatDataPoint AEfee;
    FloatDataPoint paypalFee;

    boolean liftGate;
    boolean delivery;
    DateDataPoint invoiceDateDataPoint;
    StrDataPoint paymentMethod;
    boolean returningCust;
    boolean paidToMan;
    DateDataPoint paidDateDataPoint;


    public DateDataPoint getDateOfPurchase() {
        return dateOfPurchase;
    }

    public DateDataPoint getDateOfShipment() {
        return dateOfShipment;
    }

    public DateDataPoint getInvoiceDateDataPoint() {
        return invoiceDateDataPoint;
    }

    public DateDataPoint getPaidDate() {
        return paidDateDataPoint;
    }

    public FloatDataPoint getAEfee() {
        return AEfee;
    }

    public FloatDataPoint getNetCost() {
        return netCost;
    }

    public FloatDataPoint getPaypalFee() {
        return paypalFee;
    }

    public FloatDataPoint getSalesPrice() {
        return salesPrice;
    }

    public FloatDataPoint getTax() {
        return tax;
    }

    public IntDataPoint getInvoiceNum() {
        return invoiceNum;
    }

    public IntDataPoint getPonum() {
        return ponum;
    }

    public IntDataPoint getPro() {
        return pro;
    }

    public IntDataPoint getQuantity() {
        return quantity;
    }

    public IntDataPoint getSo() {
        return so;
    }

    public StrDataPoint getBusiness_name() {
        return business_name;
    }

    public StrDataPoint getEmail() {
        return email;
    }

    public StrDataPoint getManInvoiceNum() {
        return manInvoiceNum;
    }

    public StrDataPoint getManBranch() {
        return manBranch;
    }

    public StrDataPoint getManufacturer() {
        return manufacturer;
    }

    public StrDataPoint getModelNum() {
        return modelNum;
    }

    public StrDataPoint getName() {
        return name;
    }

    public StrDataPoint getPaymentMethod() {
        return paymentMethod;
    }

    public StrDataPoint getPhone() {
        return phone;
    }


    public StrDataPoint getShipCo() {
        return shipCo;
    }

    public StrDataPoint getShippingTerms() {
        return shippingTerms;
    }


    public StrDataPoint getSoldFrom() {
        return soldFrom;
    }


    public boolean setData(String theData, StrDataPoint toSet) {
        return toSet.setDataPoint(theData);
    }


    public boolean setData(String theData, IntDataPoint toSet) {
        return toSet.setDataPoint(theData);
    }
    public boolean setData(String theData, FloatDataPoint toSet) {
        return toSet.setDataPoint(theData);
    }


    public boolean setData(boolean theData, BoolDataPoint toSet) {
        return toSet.setDataPoint(theData);
    }










    public InfoEntity() {


    }
}
