public class Main {
    public static void main(String[] args) {
        // sản phẩm
        SanPham sp1 = new SanPhamDienTu("DT01", "Điện thoại Samsung", 5000000, "IMEI12345", 12);
        SanPham sp2 = new SanPhamThucPham("TP01", "Bánh quy", 20000, "12/12/2025");

        // Hiển thị 
        System.out.println("=== DANH SÁCH SẢN PHẨM ===");
        sp1.hienThiThongTin();
        sp2.hienThiThongTin();

        //  khách
        DonHang don1 = new DonHang("Nguyễn Văn A");
        don1.themSanPham(sp1);
        don1.themSanPham(sp2);

        //  thanh toán
        System.out.println("\n=== THANH TOÁN ĐƠN HÀNG ===");
        don1.thanhToan("tienmat");
    }
}
