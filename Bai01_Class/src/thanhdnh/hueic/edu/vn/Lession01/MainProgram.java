package thanhdnh.hueic.edu.vn.Lession01;

public class MainProgram {

	public static void main(String[] args) {
		SinhVien sv = new SinhVien();
		SinhVien sv2 = new SinhVien("SV002", "Binh");
		/*sv.setMaSV("SV001");
		sv.setHoTenSV("Nam");*/
		
		System.out.println(sv.inThongTin());
		System.out.println(sv2.inThongTin());
	}

}
