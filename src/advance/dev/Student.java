package advance.dev;

public class Student extends Person{

	public Student(String name, int old, String address) {
		super(name, old, address);
		// TODO Auto-generated constructor stub
	}
	float dtb ;
	public Student(String name, int old, String address, float dtb) {
		super(name, old, address);
		this.dtb = dtb;
	}
	public void getInfo() {
		super.getInfo();
		System.out.println("Diem " + this.dtb);
	}

} 