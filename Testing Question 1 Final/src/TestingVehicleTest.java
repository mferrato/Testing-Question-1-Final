import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.UUID;

import org.junit.Test;

import vehiclechain.Car;
import vehiclechain.MotorCycle;
import vehiclechain.Person;
import vehiclechain.Truck;
import vehiclechain.Vehicle;

public class TestingVehicleTest {
	
	// Variables from VehicleTest
			HashMap<UUID, Vehicle> HMap = new HashMap<UUID, Vehicle>();

			Person a = new Person("Mauricio", "Ferrato");
			Person b = new Person("Bert", "Gibbons");

			Car car = new Car("Ferrari", "Red", 2844, a, 4);

			Truck truck = new Truck("Jeep", "Black", 3091, a, 2);

			MotorCycle motorcycle = new MotorCycle("Ducati", "Silver", 164, null,
					false);

	
	@Test
	public void countTest() {
		truck.transferOwner(b);
		HMap.put(a.getPersonID(), car);
		HMap.put(b.getPersonID(), truck);
		HMap.put(UUID.randomUUID(), motorcycle);
		assertEquals(HMap.size(),3);
	}

}
