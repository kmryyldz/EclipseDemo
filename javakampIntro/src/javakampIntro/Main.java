package javakampIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product();
		product1.studentnumber =1;
		product1.name ="Ada";
		product1.surname ="YILDIZ";
		product1.lesson ="Matematik";
		product1.age =25;
		
		Product product2 = new Product();
		product2.studentnumber =2;
		product2.name ="Deniz";
		product2.surname ="KOÇ";
		product2.lesson ="Ýngilizce";
		product2.age =20;
		
		Product product3 = new Product();
		product3.studentnumber =3;
		product3.name ="Burak";
		product3.surname ="ÖZDEMÝR";
		product3.lesson ="Matematik";
		product3.age =23;
		
		Product [] products = {product1,product2,product3};
		
		for (Product product : products ) {
		System.out.println(product.studentnumber + product.name + product.surname + product.lesson + product.age);
		
         }

		
		School school1 = new School();
		school1.lesson="Matematik";
		
		School school2 = new School();
		school2.lesson="Ýngilizce";
		
		
		
		
	}
}
