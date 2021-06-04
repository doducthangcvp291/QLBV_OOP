package Xulidulieu;

public class Person {
    private int ID ;
    private String HoTen ;
    private String NgayHaSinh ;
    private double BMI ;
    private String GhiChu;
    public Person(){
    };
    public Person( int ID , String HoTen , String NgayHaSinh , double BMI , String GhiChu){
        this.setID(ID);
        this.setHoTen(HoTen);
        this.setNgayHaSinh(NgayHaSinh);
        this.setBMI(BMI);
        this.setGhiChu(GhiChu);
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public String getNgayHaSinh() {
        return NgayHaSinh;
    }

    public void setNgayHaSinh(String ngayHaSinh) {
        NgayHaSinh = ngayHaSinh;
    }

    public double getBMI() {
        return BMI;
    }

    public void setBMI(double BMI) {
        this.BMI = BMI;
    }

    public String getGhiChu(String ghiChu) {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }
}
