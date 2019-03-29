import static org.junit.Assert.assertEquals;

import org.junit.Test;

import marsmission.Directions;
import marsmission.Rover;

public class RoverShould {

	@Test
	public void check_rover_startpoint() {

		// given
		Rover rover = new Rover();

		// then
		assertEquals(0, rover.getPosX());
		assertEquals(0, rover.getPosY());
		assertEquals(Directions.N, rover.direction());
	}
	
	@Test
	public void move() {

		// given
		Rover rover = new Rover();

		// when
//		rover.move("f,f,b,l,b");
		rover.move("f,l,f,l,f,l,f");

		// then
		assertEquals(0, rover.getPosX());
		assertEquals(0, rover.getPosY());
		assertEquals(Directions.E, rover.direction());

	}

	@Test
	public void move_forward_north() {

		// given
		Rover rover = new Rover();

		// when
		rover.moveForward();

		// then
		assertEquals(1, rover.getPosY());

	}

	@Test
	public void move_backwards_north() {

		// given
		Rover rover = new Rover();

		// when
		rover.moveBackwards();

		// then
		assertEquals(-1, rover.getPosY());

	}

	@Test
	public void move_forward_east() {

		// given
		Rover rover = new Rover();

		// when
		rover.changeDirection(Directions.E);
		rover.moveForward();

		// then
		assertEquals(1, rover.getPosX());

	}

	@Test
	public void move_backwards_east() {

		// given
		Rover rover = new Rover();

		// when
		rover.changeDirection(Directions.E);
		rover.moveBackwards();

		// then
		assertEquals(-1, rover.getPosX());

	}

	@Test
	public void move_forward_south() {

		// given
		Rover rover = new Rover();

		// when
		rover.changeDirection(Directions.S);
		rover.moveForward();

		// then
		assertEquals(-1, rover.getPosY());

	}

	@Test
	public void move_backwards_south() {

		// given
		Rover rover = new Rover();

		// when
		rover.changeDirection(Directions.S);
		rover.moveBackwards();

		// then
		assertEquals(1, rover.getPosY());

	}
	
	@Test
	public void move_forward_west() {

		// given
		Rover rover = new Rover();

		// when
		rover.changeDirection(Directions.W);
		rover.moveForward();

		// then
		assertEquals(-1, rover.getPosX());

	}

	@Test
	public void move_backwards_west() {

		// given
		Rover rover = new Rover();

		// when
		rover.changeDirection(Directions.W);
		rover.moveBackwards();

		// then
		assertEquals(1, rover.getPosX());

	}
}
