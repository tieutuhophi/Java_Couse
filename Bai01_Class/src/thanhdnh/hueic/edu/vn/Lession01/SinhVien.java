package thanhdnh.hueic.edu.vn.Lession01;

public class SinhVien {

	private String masv;
	private String hotensv;
	
	public void setMaSV(String ma) {
		masv = ma;
	}
	
	public void setHoTenSV(String ht) {
		hotensv = ht;
	}
	
	public String getMaSV() {
		return masv;
	}
	
	public String getHoTenSV() {
		return hotensv;
	}
	
	public String inThongTin() {
		return "Mã sinh viên: "+masv+", H�? tên sinh viên: "+hotensv;
	}
	
	public SinhVien() {
		masv = "SV001";
		hotensv = "Nam";
	}
	
	public SinhVien(String m, String t) {
		masv = m;
		hotensv = t;
	}
}
