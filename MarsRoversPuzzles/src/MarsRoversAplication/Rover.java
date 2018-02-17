package MarsRoversAplication;

public class Rover {

	private char orientation;
	private String coordanate;
	private String coordanateBackUp;
	private int x;
	private int y;
	private Mars plateau = new Mars();
	
	public Rover(int xm, int ym, int x, int y, char orientation) {
		this.x = x;
		this.y = y;
		this.orientation = orientation;
		plateau.setPlateau(xm, ym);
	}
	
	public char getOrientation() {
		return orientation;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void toMove (String coordanate) {
		this.coordanate = coordanate;
		coordanateBackUp = coordanate;

		do {			
			//Take the first command to execute
			char letter = this.coordanate.charAt(0);			
			if(letter == 'R' || letter == 'L') {
				//DIRECTIONS
				orientation = directions(letter);
			}
			else {
				//MOVING
				moving(letter);				
			}				
			//Delete the first command executed
			this.coordanate = this.coordanate.substring(1, this.coordanate.length());
			
		}while(!this.coordanate.isEmpty());
		System.out.println(showPosition());
	}
	
	private char directions(char letter) {
		
		if (letter == 'L') {
			if(orientation == 'N') {
				return 'W';				
			}
			else if(orientation == 'S') {
				return 'E';			
							}
			else if(orientation == 'E') {
				return 'N';				
			}
			else if(orientation == 'W') {
				return 'S';				
			}
		}
		if (letter == 'R') {
			if(orientation == 'N') {
				return 'E';				
			}
			else if(orientation == 'S') {
				return 'W';			
							}
			else if(orientation == 'E') {
				return 'S';				
			}
			else if(orientation == 'W') {
				return 'N';				
			}
		}
		//I think this is unnecessary, but the only way to work. (?)
		//D = Danger, something goes wrong
		return 'D';
	}
	private void moving(char letter) {
		
		if(orientation == 'N') {
			y++;
			if(plateau.limit(x, y)== false) {
				y--;
				limitMessage();
			}			
		}
		if(orientation == 'S') {
			y--;
			if(plateau.limit(x, y)== false) {
				y++;
				limitMessage();
			}
				}
		if(orientation == 'E') {
			x++;
			if(plateau.limit(x, y)== false) {
				x--;
				limitMessage();
			}
		}
		if(orientation == 'W') {
			x--;
			if(plateau.limit(x, y)== false) {
				x++;
				limitMessage();
			}
		}
		
	}
	
	private String showPosition () {
		return "X: "+x+"\nY: "+y+"\nOrientation: "+orientation;
	}
	
	private void limitMessage() {
		System.out.println("The Rover reached the limit of the plateau");
	}
	
	public void printActions() {
		System.out.println("The actions made by Rover was: "+coordanateBackUp);
	}
}
