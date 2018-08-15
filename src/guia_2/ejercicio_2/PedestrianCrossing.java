package guia_2.ejercicio_2;

import guia_1.ejercicio_2.Semaphore;

public class PedestrianCrossing implements Traversable {

	private final Semaphore semaphore;

	public PedestrianCrossing(final Semaphore semaphore) {
		this.semaphore = semaphore;
	}

	@Override
	public boolean canTransit() {
		return semaphore.canWalkAcross();
	}
}
