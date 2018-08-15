package guia_1.ejercicio_6;

import guia_2.ejercicio_2.Traversable;

public abstract class Bird {

	private int gramsOfFoodEaten;
	private final boolean canFly;
	private final double birdCharacteristic;

	public Bird(boolean canFly, double birdCharacteristic) {
		this.canFly = canFly;
		this.birdCharacteristic = birdCharacteristic;
	}

	public void eat(int gramsOfFood) {
		gramsOfFoodEaten += gramsOfFood;
	}

	public boolean canFly() {
		return canFly;
	}

	public double fly() throws GroundBirdException {
		if (!canFly()) {
			throw new GroundBirdException();
		}
		return gramsOfFoodEaten * 0.8 * birdCharacteristic;
	}

	public double walk() {
		return gramsOfFoodEaten * 1.5 * birdCharacteristic;
	}

	public boolean isHungry() {
		return gramsOfFoodEaten <= 0;
	}

	public boolean canCross(Traversable traversable) {
		return canFly() || traversable.canTransit(); //why did the chicken cross the road?
	}
}
