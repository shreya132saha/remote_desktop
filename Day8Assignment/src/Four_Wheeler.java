/*Activity 2:
Create interface FourWheeler and add default method testDrive().
In Car class, implement this interface. Car now implement both Vehicle and FourWheeler interface.
Check the compilation error and fix the error.
Run the TestVehicle class and check the output.

*/


public interface Four_Wheeler {
	default void testDrive()
	{
		System.out.println("Default method");
	}

}
