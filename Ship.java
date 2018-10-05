package Battleship;

public class Ship {
	
	 public String name;
	 public int size;
	 public int health;
	 
	 public Ship(String n, int s, int h) {
		 name = n;
		 size = s;
		 health = h;
	 }
	 
	
	
	public String getName() {
		return name;
	}
	
	public int getSize() {
		return size;
	}
	
	public int getHealth() {
		return health;
	}
	
	public void gotHit() {
		health--;
	}
	
	public boolean isDestroyed() {
		if(getHealth() > 0) {
			return false;
		}else
			return true;
	}
}
