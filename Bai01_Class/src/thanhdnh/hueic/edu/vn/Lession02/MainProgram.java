package thanhdnh.hueic.edu.vn.Lession02;

public class MainProgram {

	public static void main(String[] args) {
		Diem A = new Diem();
		System.out.println("A=" + A.getX() + "," + A.getY());

		Diem B = new Diem(2, 5);
		System.out.println("B=" + B.getX() + "," + B.getY());

		DuongTron C = new DuongTron();
		System.out.println("Đường tròn C: Tâm(" + 
		C.getO().getX() + "," + C.getO().getY() + 
		") và bán kính="+C.getR());
		
		DuongTron D = new DuongTron(new Diem(2, 3), 5);
		System.out.println("Đường tròn D: Tâm(" + 
		D.getO().getX() + "," + D.getO().getY() + 
		") và bán kính="+D.getR());
	}

}
