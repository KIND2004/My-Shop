package model;

public class Beensgrn {

    private String grnno;
    private String dat;
    private String applyname;
    private String supname;
    private String branchname;
    private String address;
    private int no;
    private String name;
    private int qty;
    private Double price;
    private Double total;
    private String totalall;
    private String payment;
    private String balance;

    public Beensgrn(String grnno, String dat, String applyname, String supname, String branchname, String address, int no, String name, int qty, Double price, Double total, String totalall, String payment, String balance) {
        this.grnno = grnno;
        this.dat = dat;
        this.applyname = applyname;
        this.supname = supname;
        this.branchname = branchname;
        this.address = address;
        this.no = no;
        this.name = name;
        this.qty = qty;
        this.price = price;
        this.total = total;
        this.totalall = totalall;
        this.payment = payment;
        this.balance = balance;
    }

  

   
    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getDat() {
        return dat;
    }

    public void setDat(String dat) {
        this.dat = dat;
    }

    public String getGrnno() {
        return grnno;
    }

    public void setGrnno(String grnno) {
        this.grnno = grnno;
    }

    public String getApplyname() {
        return applyname;
    }

    public void setApplyname(String applyname) {
        this.applyname = applyname;
    }

    public String getSupname() {
        return supname;
    }

    public void setSupname(String supname) {
        this.supname = supname;
    }

    public String getBranchname() {
        return branchname;
    }

    public void setBranchname(String branchname) {
        this.branchname = branchname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTotalall() {
        return totalall;
    }

    public void setTotalall(String totalall) {
        this.totalall = totalall;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

}
