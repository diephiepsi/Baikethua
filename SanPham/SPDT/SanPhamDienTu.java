public class SanPhamDienTu extends SanPham {
    private String imei;
    private int thoiGianBaoHanh;

    public SanPhamDienTu(String maSanPham, String tenSanPham, double gia, String imei, int thoiGianBaoHanh) {
        super(maSanPham, tenSanPham, gia);
        this.imei = imei;
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("IMEI: " + imei + ", Bảo hành: " + thoiGianBaoHanh + " tháng");
    }
}
