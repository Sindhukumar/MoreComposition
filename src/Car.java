
public class Car {
	
	private String make;
	private String color;
	private int maxSpeed;
	private int speed;
	private Driver driver;
	public Car(){
		super();
		driver=new Driver();
	}
	public Driver getDriver() {
		return driver;
	}
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	public Car(String make){
		this();
		this.make=make;
	}
	public String getMake() {
		return make;
	}
	public String setMake(String make) {
		this.make = make;
		return("The make is "+make);
	}
	public String getColor() {
		return color;
	}
	public String setColor(String color) {
		this.color = color;
		return("The color is "+color);
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public String setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
		return("Max speed is "+maxSpeed+"mph");
	}
	public int getSpeed() {
		return speed;
	}
	public String setSpeed(int speed) {
		this.speed = speed;
		return("The speed is "+speed+"mph");
	}
	
	public String acceralate(){
		return("The "+color+" "+make+" is accelerating");
	}
	public String start(){
		return("The "+color+" "+make+" is starting");
	}
	public String stop(){
		return("The "+color+" "+make+" has stopped");
	}
	public String stop(String msg){
		return("The "+color+" "+make+" has stopped "+msg);
	}
}
