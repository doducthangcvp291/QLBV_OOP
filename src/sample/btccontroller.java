package sample;

import Xulidulieu.Me;
import Xulidulieu.PhongKham;
import com.jfoenix.controls.JFXButton;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class btccontroller {
    @FXML
    private Button clickMe;
    @FXML
    private Button clickBe;
    @FXML
    private Button clickPhongKham;
    @FXML
    private Button clickThongTinTiemChung;
    @FXML
    private Button clickChiSoDinhDuong;
    @FXML
    private GridPane Me;
    @FXML
    private TextField TimID;
    @FXML
    private TextField TimTen;
    @FXML
    private TextField ThemIDME;
    @FXML
    private TextField ThemTenMe;
    @FXML
    private TextField ThemNgaySinhMe;
    @FXML
    private TextField ThemBMIme ;
    @FXML
    private TextField ThemGheChuMe;
    @FXML
    private DatePicker ThemNgayHaSinh ;
    @FXML
    private TableView<Me> tbme;
    @FXML
    void xemme(ActionEvent event) {
    }


    @FXML
    private TableColumn<Me, Integer> tbmeid;

    @FXML
    private TableColumn<Me, String> tbmehovaten;

    @FXML
    private TableColumn<Me, String> tbmengaysinh;

    @FXML
    private TableColumn<Me, String> tbmengayhasinh;

    @FXML
    private TableColumn<Me,Double> tbmebmi ;

    @FXML
    private TableColumn<Me, String> tbmeghichu;
    @FXML
    private GridPane Be;
    @FXML
    private TextField TimIDBe;
    @FXML
    private TextField TimTenBe;
    @FXML
    private TextField ThemIDBe;
    @FXML
    private TextField ThemHoTenBe;
    @FXML
    private TextField ThemNgaySinhBe;
    @FXML
    private TextField ThemGhiChuBe;

    @FXML
    void Xembe(ActionEvent event) {
    }
    @FXML
    private GridPane PhongKham;
    @FXML
    private TextField TimTenPhongKham;
    @FXML
    private TextField TimDiaDiemPhongKham;
    @FXML
    private TextField ThemTenPhongKham;
    @FXML
    private TextField ThemDiaDIemPhongKham;
    @FXML
    private JFXButton xemttpk;
    @FXML
    private TableView<Xulidulieu.PhongKham> tbphongkham;

    @FXML
    private TableColumn<Xulidulieu.PhongKham,String> tbtenphongkham;

    @FXML
    private TableColumn<Xulidulieu.PhongKham, String> tbdiadiemphongkham;
    @FXML
    private GridPane ThongTinTiemChung;
    @FXML
    private TextField TimIDTiemChung;
    @FXML
    private TextField TìmPhongKhamTiemChung;
    @FXML
    private TextField ThemIDTIemChung;
    @FXML
    private TextField ThemNgayTiem;
    @FXML
    private TextField ThemLoaiVXTIem;
    @FXML
    private TextField ThemPhongKhamTiem;
    @FXML
    private TextField ThemPhanUngGhiChu;
    @FXML
    void xemtttc(ActionEvent event) {
    }
    @FXML
    private GridPane ChiSoDinhDuong;
    @FXML
    private TextField IDChiSoDinhDong;
    @FXML
    private TextField ChieuCao;
    @FXML
    private TextField CanNang;
    @FXML
    private TextField NhapBMI;

    public btccontroller() {
    }
    @FXML
    void getselected(MouseEvent event){

    }

    @FXML
    void NhapIDChiSoDinhDuong(ActionEvent event) {
    }

    @FXML
    void THemPhongKham(ActionEvent event) {
        String query = "Insert into TblPhongKham(PhongKham,DiaDiem) values(?,?) ";
        try {
            Connection connection = DBConnect.getConnection() ;

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, ThemTenPhongKham.getText());
            preparedStatement.setString(2, ThemDiaDIemPhongKham.getText());
            preparedStatement.execute();

        } catch (SQLException ex) {
            Logger.getLogger(btccontroller.class.getName()).log(Level.SEVERE, null, ex);
        }
        ThemTenPhongKham.setText(null);
        ThemDiaDIemPhongKham.setText(null);

    }

    @FXML
    void ThemBe(ActionEvent event) {
    }

    @FXML
    void ThemChiSoDinhDuong(ActionEvent event) {
    }

    @FXML
    void ThemMe(ActionEvent event) {
        String query = "Insert into TblMe(ID,HoTenMe,NamSinh,NgayHaSinh,BMI,GhiChu) values(?,?,?,?,?,?) ";
        try {
            Connection connection = DBConnect.getConnection() ;

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, ThemIDME.getText());
            preparedStatement.setString(2, ThemTenMe.getText());
            preparedStatement.setString(3, ThemNgaySinhMe.getText());
            preparedStatement.setString(4, String.valueOf(ThemNgayHaSinh.getValue()));
            preparedStatement.setDouble(5, Double.parseDouble(ThemBMIme.getText()));
            preparedStatement.setString(6, ThemGheChuMe.getText());
            preparedStatement.execute();

        } catch (SQLException ex) {
            Logger.getLogger(btccontroller.class.getName()).log(Level.SEVERE, null, ex);
        }
        ThemIDME.setText(null);
        ThemTenMe.setText(null);
        ThemNgaySinhMe.setText(null);
        ThemTenMe.setText(null);
        ThemBMIme.setText(null);
        ThemGheChuMe.setText(null);
    }

    @FXML
    void ThemThongTinTiemChung(ActionEvent event) {
    }

    @FXML
    void ThongTinChiTietBe(ActionEvent event) {
    }

    @FXML
    void TimBe(ActionEvent event) {
    }

    @FXML
    void TimMe(ActionEvent event) {
    }

    @FXML
    void TimPhongKham(ActionEvent event) {
    }

    @FXML
    void TìmThongTinTiemChung(ActionEvent event) {
    }

    @FXML
    void XoaBe(ActionEvent event) {
    }

    @FXML
    void XoaLanNhap(ActionEvent event) {
    }

    @FXML
    void XoaMe(ActionEvent event) {
    }

    @FXML
    void XoaPhongKham(ActionEvent event) {
    }

    @FXML
    void XoaThongTinTiemChung(ActionEvent event) {
    }

    public void handleClick(ActionEvent event) {
        if (event.getSource() == this.clickMe)
        {
            this.Me.setBackground(new Background(new BackgroundFill[]{new BackgroundFill(Color.rgb(202, 209, 232), CornerRadii.EMPTY, Insets.EMPTY)}));
            this.Me.toFront();
            ObservableList<Xulidulieu.Me> oblist = FXCollections.observableArrayList();
            try{
                String sql = "Select * from TblMe";
                Connection con = DBConnect.getConnection();
                ResultSet rs = con.createStatement().executeQuery(sql);
                while (rs.next()){
                    oblist.add(new Me(
                            rs.getInt("ID"),
                            rs.getString("HoTenMe") ,
                            rs.getString("NamSinh"),
                            rs.getString("NgayHaSinh"),
                            rs.getDouble("BMI"),
                            rs.getString("GhiChu") ));
                }
            } catch (SQLException ex) {
                Logger.getLogger(btccontroller.class.getName()).log(Level.SEVERE, null, ex);

            }
            tbmeid.setCellValueFactory(new PropertyValueFactory<>("ID"));
            tbmehovaten.setCellValueFactory(new PropertyValueFactory<>("HoTen"));
            tbmengaysinh.setCellValueFactory(new PropertyValueFactory<>("NgaySinh"));
            tbmengayhasinh.setCellValueFactory(new PropertyValueFactory<>("NgayHaSinh"));
            tbmebmi.setCellValueFactory(new PropertyValueFactory<>("BMI"));
            tbmeghichu.setCellValueFactory(new PropertyValueFactory<>("GhiChu"));
            tbme.setItems(oblist);
        }
        else if (event.getSource() == this.clickBe) {
            this.Be.setBackground(new Background(new BackgroundFill[]{new BackgroundFill(Color.rgb(202, 229, 232), CornerRadii.EMPTY, Insets.EMPTY)}));
            this.Be.toFront();
        } else if (event.getSource() == this.clickPhongKham)
        {
            this.PhongKham.setBackground(new Background(new BackgroundFill[]{new BackgroundFill(Color.rgb(202, 229, 232), CornerRadii.EMPTY, Insets.EMPTY)}));
            this.PhongKham.toFront();
//            ObservableList<PhongKham> oblist = FXCollections.observableArrayList();
//            try{
//                String sql = "Select * from TblPhongKham";
//                Connection con = DBConnect.getConnection();
//                ResultSet rs = con.createStatement().executeQuery(sql);
//                while (rs.next()){
//                    oblist.add(new PhongKham(
//                            rs.getString("PhongKham"),
//                            rs.getString("DiaDiem")));
//                }
//            } catch (SQLException ex) {
//                Logger.getLogger(btccontroller.class.getName()).log(Level.SEVERE, null, ex);
//
//            }
//            tbtenphongkham.setCellValueFactory(new PropertyValueFactory<>("TenPhongKham"));
//            tbdiadiemphongkham.setCellValueFactory(new PropertyValueFactory<>("DiaDiem"));
//            tbphongkham.setItems(oblist);
        }
        else if (event.getSource() == this.clickThongTinTiemChung)
        {
            this.ThongTinTiemChung.setBackground(new Background(new BackgroundFill[]{new BackgroundFill(Color.rgb(202, 229, 232), CornerRadii.EMPTY, Insets.EMPTY)}));
            this.ThongTinTiemChung.toFront();
        }
        else if (event.getSource() == this.clickChiSoDinhDuong)
        {
            this.ChiSoDinhDuong.setBackground(new Background(new BackgroundFill[]{new BackgroundFill(Color.rgb(202, 229, 232), CornerRadii.EMPTY, Insets.EMPTY)}));
            this.ChiSoDinhDuong.toFront();
        }


    }

    @FXML
    void showttpk(ActionEvent event) {
            ObservableList<PhongKham> oblist = FXCollections.observableArrayList();
            try{
                String sql = "select * from TblPhongKham";
                Connection con = DBConnect.getConnection();
                ResultSet rs = con.createStatement().executeQuery(sql);
                while (rs.next()){
                    oblist.add(new PhongKham(rs.getString("PhongKham"), rs.getString("DiaDiem")));
                }
            } catch (SQLException ex) {
                Logger.getLogger(btccontroller.class.getName()).log(Level.SEVERE, null, ex);

            }
            tbtenphongkham.setCellValueFactory(new PropertyValueFactory<>("TenPhongKham"));
            tbdiadiemphongkham.setCellValueFactory(new PropertyValueFactory<>("DiaDiem"));
            tbphongkham.setItems(oblist);
    }

    }


