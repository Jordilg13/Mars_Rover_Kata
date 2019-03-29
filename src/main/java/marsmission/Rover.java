package marsmission;

public class Rover {

	private int posX;
	private int posY;
	private Directions direction;

	public Rover() {
		this.posX = 0;
		this.posY = 0;
		this.direction = Directions.N;
	}

	public void move(String rawOrders) {

		String[] orders = rawOrders.split(",");

		for (int i = 0; i < orders.length; i++) {

			if (orders[i].equalsIgnoreCase("f")) {
				moveForward();
			} else if (orders[i].equalsIgnoreCase("b")) {
				moveBackwards();
			} else if (orders[i].equalsIgnoreCase("l")) {
				changeDirectionToLeft();
			} else if (orders[i].equalsIgnoreCase("r")) {
				changeDirectionToRigth();
			}

		}

	}

	private void changeDirectionToRigth() {
		switch (this.direction) {
		case N:
			this.direction = Directions.E;
			break;
		case E:
			this.direction = Directions.S;
			break;
		case S:
			this.direction = Directions.W;
			break;
		case W:
			this.direction = Directions.N;
			break;
		default:
			break;
		}
		
	}

	private void changeDirectionToLeft() {
		switch (this.direction) {
		case N:
			this.direction = Directions.W;
			break;
		case E:
			this.direction = Directions.N;
			break;
		case S:
			this.direction = Directions.E;
			break;
		case W:
			this.direction = Directions.S;
			break;
		default:
			break;
		}
		
	}

	public int getPosX() {
		return posX;
	}

	public int getPosY() {
		return posY;
	}

	public Directions direction() {
		return direction;
	}

	public void moveForward() {

		switch (direction) {
		case N:
			this.posY += 1;
			break;
		case E:
			this.posX += 1;
			break;
		case S:
			this.posY -= 1;
			break;
		case W:
			this.posX -= 1;
			break;
		default:
			break;
		}
	}

	public void moveBackwards() {

		switch (direction) {
		case N:
			this.posY -= 1;
			break;
		case E:
			this.posX -= 1;
			break;
		case S:
			this.posY += 1;
			break;
		case W:
			this.posX += 1;
			break;
		default:
			break;
		}

	}

	public void changeDirection(Directions e) {
		this.direction = e;
	}

}
