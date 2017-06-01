
public class VehicleApp {

	public static void main(String[] args) {
		
		Car a= new Car();
		Boat b= new Boat();
		Airplane p=new Airplane();
		
		
		System.out.println(a.tireCount());
		System.out.println(a.run());
		System.out.println(b.floatOnWater());
		System.out.println(b.stop());
		System.out.println(p.fly());
		System.out.println(p.accelerate());
	}

}
