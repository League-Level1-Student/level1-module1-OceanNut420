package _06_duck;

public class duck {
	
	
		
		int numberOfFriends;
		String favoriteFood;
		
		duck(String favoriteFood, int numberOfFriends) {
	        this.favoriteFood = favoriteFood;
	        this.numberOfFriends = numberOfFriends;
		}
		
	void quack(){
		
	}
	
	void waddle() {
		
	}
	
	public static void main(String[] args) {
		
		duck jerry = new duck("marshmallows", 5);
		duck bob = new duck("chips", 0);
		
	}
	
}