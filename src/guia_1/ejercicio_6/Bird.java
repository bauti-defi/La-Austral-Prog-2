package guia_1.ejercicio_6;

import guia_2.ejercicio_2.Traversable;

public abstract class Bird {

	private int gramsOfFoodEaten;

	public void eat(int gramsOfFood) {
		gramsOfFoodEaten += gramsOfFood;
	}

	public abstract boolean canFly();

	public double fly() throws GroundBirdException {
		if (!canFly()) {
			throw new GroundBirdException();
		}
		return gramsOfFoodEaten * 0.3;
	}

	public double walk() {
		return gramsOfFoodEaten * 0.5;
	}

	public boolean isHungry() {
		return gramsOfFoodEaten <= 0;
	}

	public boolean canCross(Traversable traversable) {
		return canFly() || traversable.canTransit(); //why did the chicken cross the road?
	}
}
