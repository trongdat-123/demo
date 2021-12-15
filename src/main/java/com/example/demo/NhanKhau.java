package com.example.demo;

public class NhanKhau {
    private int maNhanKhau;
    private String hoVaTen;
    private int CMND_CCCD;
    private String ngayThangNamSinh;
    private String noiSinh;
    private String danToc;
    private String tonGiao;
    private boolean gioiTinh;
    private String trinhDoVanHoa;
    private String ngheNghiep;
    private String noiLamViec;
    private String ngayDangKiThuongtru;
    private String quanHeVoiChuHo;
    private int maSoHoKhau;
    private String ghiChu;

    public NhanKhau(int maNhanKhau, String hoVaTen, int CMND_CCCD, String ngayThangNamSinh, String noiSinh, String danToc, String tonGiao, boolean gioiTinh, String trinhDoVanHoa, String ngheNghiep, String noiLamViec, String ngayDangKiThuongtru, String quanHeVoiChuHo, int maSoHoKhau, String ghiChu) {
        this.maNhanKhau = maNhanKhau;
        this.hoVaTen = hoVaTen;
        this.CMND_CCCD = CMND_CCCD;
        this.ngayThangNamSinh = ngayThangNamSinh;
        this.noiSinh = noiSinh;
        this.danToc = danToc;
        this.tonGiao = tonGiao;
        this.gioiTinh = gioiTinh;
        this.trinhDoVanHoa = trinhDoVanHoa;
        this.ngheNghiep = ngheNghiep;
        this.noiLamViec = noiLamViec;
        this.ngayDangKiThuongtru = ngayDangKiThuongtru;
        this.quanHeVoiChuHo = quanHeVoiChuHo;
        this.maSoHoKhau = maSoHoKhau;
        this.ghiChu = ghiChu;
    }

    public NhanKhau() {

    }

    public int getMaNhanKhau() {
        return maNhanKhau;
    }

    public void setMaNhanKhau(int maNhanKhau) {
        this.maNhanKhau = maNhanKhau;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public int getCMND_CCCD() {
        return CMND_CCCD;
    }

    public void setCMND_CCCD(int CMND_CCCD) {
        this.CMND_CCCD = CMND_CCCD;
    }

    public String getNgayThangNamSinh() {
        return ngayThangNamSinh;
    }

    public void setNgayThangNamSinh(String ngayThangNamSinh) {
        this.ngayThangNamSinh = ngayThangNamSinh;
    }

    public String getNoiSinh() {
        return noiSinh;
    }

    public void setNoiSinh(String noiSinh) {
        this.noiSinh = noiSinh;
    }

    public String getDanToc() {
        return danToc;
    }

    public void setDanToc(String danToc) {
        this.danToc = danToc;
    }

    public String getTonGiao() {
        return tonGiao;
    }

    public void setTonGiao(String tonGiao) {
        this.tonGiao = tonGiao;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getTrinhDoVanHoa() {
        return trinhDoVanHoa;
    }

    public void setTrinhDoVanHoa(String trinhDoVanHoa) {
        this.trinhDoVanHoa = trinhDoVanHoa;
    }

    public String getNgheNghiep() {
        return ngheNghiep;
    }

    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }

    public String getNoiLamViec() {
        return noiLamViec;
    }

    public void setNoiLamViec(String noiLamViec) {
        this.noiLamViec = noiLamViec;
    }

    public String getNgayDangKiThuongtru() {
        return ngayDangKiThuongtru;
    }

    public void setNgayDangKiThuongtru(String ngayDangKiThuongtru) {
        this.ngayDangKiThuongtru = ngayDangKiThuongtru;
    }

    public String getQuanHeVoiChuHo() {
        return quanHeVoiChuHo;
    }

    public void setQuanHeVoiChuHo(String quanHeVoiChuHo) {
        this.quanHeVoiChuHo = quanHeVoiChuHo;
    }

    public int getMaSoHoKhau() {
        return maSoHoKhau;
    }

    public void setMaSoHoKhau(int maSoHoKhau) {
        this.maSoHoKhau = maSoHoKhau;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
}
