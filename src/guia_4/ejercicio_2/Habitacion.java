package guia_4.ejercicio_2;

public abstract class Habitacion {
	private int RoomPrice, RoomSize, RoomNumber;

	public Habitacion(int RoomNumber, int RoomPrice, int RoomSize) {
		this.RoomNumber = RoomNumber;
		this.RoomPrice = RoomPrice;
		this.RoomSize = RoomSize;
	}

	public int getRoomNumber() {
		return RoomNumber;
	}

	public int getRoomPrice() {
		return RoomPrice;
	}

	public int getRoomSize() {
		return RoomSize;
	}
}
