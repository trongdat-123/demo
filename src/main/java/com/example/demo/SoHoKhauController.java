package com.example.demo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class SoHoKhauController implements Initializable {

    // Khai báo hiển thị

    @FXML
    TableView<SoHoKhau> table = new TableView();
    @FXML
    TableColumn Col_Sohokhau = new TableColumn();
    @FXML
    TableColumn Col_DiaChi = new TableColumn();
    @FXML
    TableColumn Col_Hovaten = new TableColumn();
    @FXML
    TableColumn Col_Ngaycap = new TableColumn();
    @FXML
    ComboBox comboBox1 = new ComboBox();

    // Khai báo thông tin nhân khẩu
    @FXML
    TextField themTen;
    @FXML
    TextField themCMT;
    @FXML
    TextField themSoHoKhau;
    @FXML
    TextField themDiaChi;
    @FXML
    ComboBox themNhanKhauLienQuan = new ComboBox();

    // Khai báo đối tượng hiển thị
    private ObservableList<SoHoKhau> soHoKhauObservableList;
    private ObservableList<String> Choicelist1, Choicelist2;

    public static String ngayHienTai() {
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        return date.format(dateTimeFormatter);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        SoHoKhau soHoKhau1 = new SoHoKhau(1, "Dường 123", "Trieu Quang Manh", "20-11-2021");
        soHoKhauObservableList = FXCollections.observableArrayList();
        Col_Sohokhau.setCellValueFactory(new PropertyValueFactory<SoHoKhau, Integer>("maSoHoKhau"));
        Col_DiaChi.setCellValueFactory(new PropertyValueFactory<SoHoKhau, String>("soNha"));
        Col_Hovaten.setCellValueFactory(new PropertyValueFactory<SoHoKhau, String>("chuHo"));
        Col_Ngaycap.setCellValueFactory(new PropertyValueFactory<SoHoKhau, String>("ngayCap"));

        soHoKhauObservableList.add(soHoKhau1);

        table.setItems(soHoKhauObservableList);
        table.refresh();

        Choicelist1 = FXCollections.observableArrayList("Mã sổ hộ khẩu", "Địa chỉ",
                "Họ và tên chủ hộ", "Ngày cấp");
        comboBox1.setItems(Choicelist1);
        Choicelist2 = FXCollections.observableArrayList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
        themNhanKhauLienQuan.setItems(Choicelist2);
    }


    public void themSoHoKhauOnClick(ActionEvent event) throws IOException {
        Stage stage1 = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("view_them_so_ho_khau_step_1.fxml"));
        Scene scene1 = null;
        try {
            scene1 = new Scene(fxmlLoader.load(), 600, 400);
        } catch (IOException e) {
            e.printStackTrace();
        }
        stage1.setTitle("Thêm mới sổ hộ khẩu");
        stage1.setScene(scene1);
        stage1.show();
    }

    public boolean check() {
        if (themTen.getText() == null || themCMT.getText() == null || themSoHoKhau.getText() == null || themDiaChi.getText() == null || themNhanKhauLienQuan.getSelectionModel().getSelectedItem() == "") {
            Alert alert = new Alert(Alert.AlertType.ERROR);

            alert.setTitle("Lỗi!!!");
            alert.setHeaderText("Không thể thêm mới sổ hộ khẩu");
            alert.setContentText("Vui lòng điền đầy đủ các trường thông tin");

            alert.showAndWait();
            return false;
        }
        for (int i = 0; i < soHoKhauObservableList.size(); i++) {
            if (themSoHoKhau.getText().equals(soHoKhauObservableList.get(i).getMaSoHoKhau())) {
                Alert alert = new Alert(Alert.AlertType.ERROR);

                alert.setTitle("Lỗi!!!");
                alert.setHeaderText("Không thể thêm mới sổ hộ khẩu");
                alert.setContentText("Mã sổ hộ khẩu đâ tồn tại");

                alert.showAndWait();
                return false;
            }
        }
        return true;
    }


    @FXML public void setThemSoHoKhau() {
        if (check()) {
            SoHoKhau soHoKhau = new SoHoKhau();
            soHoKhau.setChuHo(themTen.getText());
            soHoKhau.setSoNha(themDiaChi.getText());
            soHoKhau.setMaSoHoKhau(Integer.parseInt(themSoHoKhau.getText()));
            soHoKhau.setNgayCap(ngayHienTai());

            soHoKhauObservableList.add(soHoKhau);
        }
    }


}
