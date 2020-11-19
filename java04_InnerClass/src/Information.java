
public class Information {

	int num = 1111;
	String name = "ȫ�浿";
	String tel = "010-1234-4568";
	public Information() {}
	
	
	public Information(int num, String name, String tel) {
		this.num = num;
		this.name = name;
		this.tel = tel;
		
	}
	public void print() {
		System.out.println(num+":"+name+":"+tel);

	
	}
}
