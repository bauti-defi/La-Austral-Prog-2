package guia_1.ejercicio_2;

public class Semaphore implements Runnable {

	private long greenDuration, yellowDuration, redDuration;

	private Light currentLight;
	private long currentWait;


	enum Light {
		GREEN, RED, YELLOW;
	}

	public Semaphore() {
		this.currentLight = Light.RED;
		this.currentWait = redDuration;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(currentWait); // Runs on its own thread, no thread lock
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		switch (currentLight) {
			case RED:
				currentLight = Light.YELLOW;
				currentWait = yellowDuration;
				break;
			case YELLOW:
				currentLight = Light.GREEN;
				currentWait = greenDuration;
				break;
			case GREEN:
				currentLight = Light.RED;
				currentWait = redDuration;
				break;
		}
		run();
	}

	public void setGreenDuration(final long greenDuration) {
		this.greenDuration = greenDuration;
	}

	public void setYellowDuration(final long yellowDuration) {
		this.yellowDuration = yellowDuration;
	}

	public void setRedDuration(final long redDuration) {
		this.redDuration = redDuration;
	}

	public boolean canWalkAcross() {
		return currentLight == Light.RED;
	}

	public boolean canDriveThrough() {
		return currentLight == Light.GREEN || currentLight == Light.YELLOW;
	}
}
