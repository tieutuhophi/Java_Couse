package thanhdnh.hueic.edu.vn;

public class HangHoa {
	private String tenhang;
	private String ngaysanxuat;
	private double dongia;
	private int soluong;

	public String gettenhang() {
		return tenhang;
	}

	public void setTenHang(String th) {
		tenhang = th;
	}

	public String getngaysanxuat() {
		return ngaysanxuat;
	}

	public void setNgaySanXuat(String nsx) {
		ngaysanxuat = nsx;
	}

	public double getdongia() {
		return dongia;
	}

	public void setDonGia(double dg) {
		dongia = dg;
	}

	public int getsoluong() {
		return soluong;
	}

	public void setSoLuong(int sl) {
		soluong = sl;
	}

	public double TinhTien() {
		return dongia * soluong;
	}

	public String HangHoa() {
		return "Tên hàng : "+tenhang+", ngày sản xuất : "+ngaysanxuat+", đơn giá : "+dongia+", số lượng : "+soluong;
	}
	public HangHoa() {
		
	}

	public HangHoa(String th, String nsx, double dg, int sl) {
		tenhang = th;
		ngaysanxuat = nsx;
		dongia = dg;
		soluong = sl;
	}

}
