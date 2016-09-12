
public class Vehicle {

	public static void main(String[] args) {
		Car car1 = new Car();
		Driver driver = new Driver();
		driver.setName("Bob");
		car1.setColor("red");
		car1.setDriver(driver);
		car1.setMake("Porsche");
		System.out.println("The "+car1.getColor()+" "+car1.getMake()+" is being driven by "+driver.getName());
	}

}
