public class CarImpl implements Car {

	@Override
	public int getBaseSpeed() {
		return baseSpeed;
	}

	@Override
	public int getTopSpeed() {
		return topSpeed;
	}

	@Override
	public String getEngine() {
		return engine;
	}

	@Override
	public int getFuelCapacity() {
		return fuelCapacity;
	}
}