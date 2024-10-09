package main;



class Emp{
	
	String name;
	int id;
	double sal;
	String address;
	
	public void Display(String name , int id , double sal , String address) {
		this.name = name;
		this.id = id;
		this.sal = sal;
		this.address  =address;
		
		System.out.println("Name :"+name+" \n"+"id: "+id+" \n"+"salary: "+sal+"\n"+"address "+address);
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", sal=" + sal + ", address=" + address + "]";
	}
	
	
}
public class Main1 {
	
	public static void main(String[] args) {
		Emp e = new Emp();
		e.Display("BHAVIK",222109,123.87,"Borivali");
		System.out.println(e);
		
	}
	
	
	
	
	

}
