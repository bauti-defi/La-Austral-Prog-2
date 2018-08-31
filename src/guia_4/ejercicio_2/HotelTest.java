package guia_4.ejercicio_2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {
	@Test
	public void test001_ReservationIsWorking() {
		Hotel sheraton = new Hotel();
		Habitacion habitacion = new Suite(1);
		sheraton.reserve(habitacion, "10/08");
		assertEquals("10/08", sheraton.getReservaciones().get(0).getReservationDate());
	}

	@Test
	public void test002_aReservationShouldReturnRoom() {
		//hola
		Hotel sheraton = new Hotel();
		Habitacion habitacion = new Suite(1);
		sheraton.reserve(habitacion, "10/08");
		assertEquals(habitacion, sheraton.getReservaciones().get(0).getHabitacion());
	}

	@Test
	public void test003_aRoomShouldReturnHisPrice() {
		Habitacion habitacion = new Suite(1);
		assertEquals(2000, habitacion.getRoomPrice());
	}

	@Test
	public void test003_aRoomShouldReturnHisSize() {
		Habitacion habitacion = new Suite(1);
		assertEquals(2, habitacion.getRoomSize());
	}

	@Test
	public void test003_aRoomShouldReturnHisRoomNumber() {
		Habitacion habitacion = new Suite(1);
		assertEquals(1, habitacion.getRoomNumber());
	}
}