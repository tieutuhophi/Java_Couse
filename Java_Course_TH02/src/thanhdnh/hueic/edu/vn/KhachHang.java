package thanhdnh.hueic.edu.vn;

public class KhachHang {
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String un) {
		username = un;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String pa) {
		password = pa;
	}
	
	public void MuaHang(String th , String nsx , double dg , int sl) {
		HangHoa hh = new HangHoa();
		hh.setTenHang(th);
		hh.setngaySanXuat(nsx);
		hh.setDonGia(dg);
		hh.setSoLuong(sl);
		hh.TinhTien();
	}
}
