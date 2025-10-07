import java.util.ArrayList;
import java.util.List;

public class DonHang {
    private String tenKhachHang;
    private List<SanPham> danhSachSanPham = new ArrayList<>();

    public DonHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public void themSanPham(SanPham sp) {
        danhSachSanPham.add(sp);
    }

    public double tinhTongTien() {
        double tong = 0;
        for (SanPham sp : danhSachSanPham) {
            tong += sp.getGia();
        }
        return tong;
    }

    public void thanhToan(String phuongThuc) {
        double tongTien = tinhTongTien();
        System.out.println("Khách hàng: " + tenKhachHang + ". Tổng tiền: " + tongTien);

        if (phuongThuc.equalsIgnoreCase("tienmat")) {
            System.out.println("Thanh toán tiền mặt thành công.");
        } else if (phuongThuc.equalsIgnoreCase("the")) {
            System.out.println("Thanh toán bằng thẻ tín dụng thành công.");
        } else if (phuongThuc.equalsIgnoreCase("momo")) {
            System.out.println("Thanh toán qua ví Momo thành công.");
        } else {
            System.out.println("Phương thức thanh toán không hợp lệ!");
        }
    }
}
