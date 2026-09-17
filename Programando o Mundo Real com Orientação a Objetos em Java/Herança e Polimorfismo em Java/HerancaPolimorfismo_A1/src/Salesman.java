public class Salesman extends Employee {
    private double soldAmount;
    private double comission;
    private int salesQuantity;
    private double commissionPercentage;

    // set -> recebe o valor e altera o atributo.
    // get -> não recebe o valor e retorna o atributo.


    public void setSoldAmount(double soldAmount) {
        this.soldAmount = soldAmount;
    }

    public double getSoldAmount() {
        return soldAmount;
    }

    public void setComission(double comission) {
        this.comission = comission;
    }

    public double getComission() {
        return comission;
    }

    public void setSalesQuantity(int salesQuantity) {
        this.salesQuantity = salesQuantity;
    }

    public int getSalesQuantity() {
        return salesQuantity;
    }

    public void setCommissionPercentage(double commissionPercentage) {
        this.commissionPercentage = commissionPercentage;
    }

    public double getComissionPercentage() {
        return commissionPercentage;
    }
}