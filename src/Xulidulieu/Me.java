package Xulidulieu;

public class Me extends Person {
    private String NgaySinh;

    public Me() {
    }
    public Me(int ID, String HoTen, String NgayHaSinh, double BMI, String GhiChu , String NgaySinh ) {
        super(ID, HoTen, NgayHaSinh, BMI , GhiChu );
        this.setNgaySinh(NgaySinh);
    }

    public Me(int id, String hoTenMe, String namSinh, String ngayHaSinh, double bmi, String ghiChu) {
        this.setID(id); ;
        this.setHoTen(hoTenMe);
        this.setNgaySinh(namSinh);
        this.setNgayHaSinh(ngayHaSinh);
        this.setBMI(bmi);
        this.getGhiChu(ghiChu);
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.NgaySinh = ngaySinh;
    }
}

