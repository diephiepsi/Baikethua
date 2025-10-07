public class SanPhamThucPham extends SanPham {
    private String hanSuDung;

    public SanPhamThucPham(String maSanPham, String tenSanPham, double gia, String hanSuDung) {
        super(maSanPham, tenSanPham, gia);
        this.hanSuDung = hanSuDung;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Hạn sử dụng: " + hanSuDung);
    }
}
