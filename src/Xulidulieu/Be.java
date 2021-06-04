package Xulidulieu;

public class Be extends Person {
    private int ChieuCao;
    private double CanNang;

    public Be(){};
    public Be(int ID , String HoTen , String NgayHaSinh , double BMI, String GhiChu, int ChieuCao , double CanNang){
        super(ID, HoTen, NgayHaSinh, BMI , GhiChu );
        this.setChieuCao(ChieuCao);
        this.setCanNang(CanNang);
    }

    public int getChieuCao() {
        return ChieuCao;
    }

    public void setChieuCao(int chieuCao) {
        ChieuCao = chieuCao;
    }

    public double getCanNang() {
        return CanNang;
    }

    public void setCanNang(double canNang) {
        CanNang = canNang;
    }

}
