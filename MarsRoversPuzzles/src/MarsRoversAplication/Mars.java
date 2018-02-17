package MarsRoversAplication;

public class Mars {

	private int x;
	private int y;
	private int quadrante;
	
	public Mars(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public Mars() {
		
	}

	
	public void setPlateau(int x, int y) {
		this.x = x;
		this.y = y;
		
		if(this.x > 0 && this.y>0) {
			quadrante = 1;
		}else if(this.x < 0 && this.y>0){
			quadrante = 2;			
		}else if(this.x < 0 && this.y<0){
			quadrante = 3;
		}else if(this.x > 0 && this.y<0){
			quadrante = 4;
		}
	}
	
	public boolean limit(int x, int y) {
		
		if(quadrante == 1 && (x > this.x || x < 0 || y > this.y || y < 0)) {
			return false;
		}else if (quadrante == 2 && (x < this.x || x > 0 || y > this.y || y < 0)) {
			return false;
		}else if (quadrante == 3 && ( x < this.x || x > 0 || y < this.y || y > 0)) {
			return false;
		}else if(quadrante == 4 && ( x > this.x || x < 0 || y < this.y || y > 0)) {
			return false;			
		}		
		return true;
	}
		
}
