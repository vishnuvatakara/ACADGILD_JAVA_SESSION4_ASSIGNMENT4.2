import java.util.Scanner;

class Laptop
{
	private String model,speed;
	public void setLaptop(String model,String speed)
	{
		this.model=model;
		this.speed=speed;
		
	}
	public void getLaptop()
	{
		System.out.printf("laptop details model : "+model);
		System.out.printf("\nlaptop details speed : "+speed);
	}
}
class Asus extends Laptop //implementing is a relationship
{
	public void getSetting() //implementing has a relation ship
	{
		Ram hd=new Ram();
		hd.write();
		hd.read();
	}
	public void getFeatures()
	{
		Connectivity con=new Connectivity();
		con.wifi();
		con.bluetooth();
	}
	
}
class Ram
{
	public void write() {
		System.out.println("\nRam is writable");
		
	}
	public void read()
	{
		System.out.println("Ram is readble");
	}
}
class Connectivity
{
	public void wifi()
	{
		System.out.println("wifi included");
	}
	public void bluetooth()
	{
		System.out.println("bluetooth included");
	}
}
public class Relationship{
public static void main(String args[])
{
	Asus as=new Asus();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the laptop model");
	String model=sc.nextLine();
	System.out.println("enter the laptop speed");
	String speed=sc.nextLine();
	as.setLaptop(model,speed);
	as.getLaptop();
	as.getSetting();
	as.getFeatures();
	System.out.println("by using has a realtioship a class can collect the features of many other class ,no need of overriding");
	System.out.println("a class can be is a relation with only one class means it can extend only one class");
}
}
