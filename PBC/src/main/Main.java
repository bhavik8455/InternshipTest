package main;


class Emp{
	String name;
	int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
public class Main {
	
	public static void main(String[] args) {
		Emp e = new Emp();
		e.setName("BHAVIK");
		e.setId(20);
		
		System.out.println("Name " + e.getName()+"\n ID : "+e.getId());
	}

}
