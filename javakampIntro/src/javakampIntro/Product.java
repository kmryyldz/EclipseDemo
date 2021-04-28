package javakampIntro;

public class Product {
	
	public Product() {

	System.out.println("Öðrenci kaydedildi.");
	
	}
	public Product(int studentnumber , String name , String surname , String lesson , int age)
	{
		this.studentnumber = studentnumber;
		this.name = name;
		this.surname =surname;
		this.lesson = lesson;
		this.age = age;
}
	int studentnumber;
	String name;
	String surname;
	String lesson;
	int age;
	
}