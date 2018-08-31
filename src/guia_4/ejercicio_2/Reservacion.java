package guia_4.ejercicio_2;

import java.util.Date;

public class Reservacion {
	private Habitacion habitacion;
	private Date date;
	private String reservationDate;

	public Reservacion(Habitacion habitacion, Date date, String reservationDate) {
		this.habitacion = habitacion;
		this.date = date;
		this.reservationDate = reservationDate;// Por ejemplo: 23/04
	}

	public String getReservationDate() {
		return reservationDate;
	}

	public Habitacion getHabitacion() {
		return habitacion;
	}

	public Date getDate() {
		return date;
	}

	@Override
	public String toString() {
		return "Habitacion N°: " + habitacion.getRoomNumber() + "Fecha de reservacion: " + reservationDate;
	}
}
