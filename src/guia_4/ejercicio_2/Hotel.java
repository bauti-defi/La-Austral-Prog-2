package guia_4.ejercicio_2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Hotel {

	private List<Reservacion> reservaciones;

	public Hotel() {
		this.reservaciones = new ArrayList<>();
	}

	public void reserve(Habitacion habitacion, String reservationDate) {
		reservaciones.add(new Reservacion(habitacion, new Date(), reservationDate));
	}

	public void removeReserveration(Reservacion reservacion) {
		reservaciones.remove(reservacion);
	}

	public List<Reservacion> getReservaciones() {
		return reservaciones;
	}
}
