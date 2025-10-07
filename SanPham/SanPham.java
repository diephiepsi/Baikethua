public class SanPham {
    protected String maSanPham;
    protected String tenSanPham;
    protected double gia;

    public SanPham(String maSanPham, String tenSanPham, double gia) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.gia = gia;
    }

    public double getGia() {
        return gia;
    }

    public void hienThiThongTin() {
        System.out.println("Mã: " + maSanPham + ", Tên: " + tenSanPham + ", Giá: " + gia);
    }
}
