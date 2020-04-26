package gr.codehub.app;

public class Customer {
    private String id;
    private String fname;
    private String lname;
    private String vatNo;
    private String phone;

    public Customer(String id, String fname, String lname) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
    }

    public String getVatNo() { return vatNo;  }
    public void setVatNo(String vatNo) { this.vatNo = vatNo; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    @Override
    public String toString() {
        return "Customer: { id='" + id + '\'' +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", vatNo='" + vatNo + '\'' +
                ", phone='" + phone + '\'' +
                " }";
    }
}
