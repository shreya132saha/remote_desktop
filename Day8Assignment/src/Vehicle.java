/*Activity 1:
Create interface Vehicle, add default method testDrive().
Create new class Car, this class implements Vehicle interface without any method
Create new class TestVehicle with main method.
In main method, create object of Car and call testDrive method and check output.
Add testDrive method in Car class and call testDrive method in main method and check output.*/


public interface Vehicle {
	default void testDrive()
	{
		System.out.println("Interface Vehicles");
	}
	static void applyBreak()
	{
		System.out.println("static method");
	}

}
