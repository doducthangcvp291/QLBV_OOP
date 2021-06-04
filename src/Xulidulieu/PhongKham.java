package Xulidulieu;

public class PhongKham {
    private String TenPhongKham ;
    private String DiaDiem ;
    public PhongKham(){};
    public PhongKham( String TenPhongKham , String DiaDiem){
        this.setTenPhongKham(TenPhongKham);
        this.setDiaDiem(DiaDiem);
    };

    public String getTenPhongKham() {
        return TenPhongKham;
    }

    public void setTenPhongKham(String TenPhongKham) {
        this.TenPhongKham = TenPhongKham;
    }

    public String getDiaDiem() {
        return DiaDiem;
    }

    public void setDiaDiem(String DiaDiem) {
        this.DiaDiem = DiaDiem;
    }
}
