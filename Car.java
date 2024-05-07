/**
* Car.java
* @author Cole Fuhrman
*/
public class Car extends Vehicle {
	private int numDoors;
	private int numPassengers;
	
	public Car(String theMake, String theModel, String thePlate, int theDoors, int thePassengers){
			super(theMake, theModel, thePlate);
			this.numDoors = theDoors;
			this.numPassengers = thePassengers;
	}
	
	public int getDoors(){
		return this.numDoors;
	}
	
	public int getPassengers(){
		return this.numPassengers;	
	}
	
	@Override
	public String toString(){
		String result = String.format("%d-door %s %s with license %s", this.numDoors, this.getMake(), this.getModel(), this.getPlate());
		return result;
	}
	
	@Override
	public boolean equals(Object other){
		if(!(other instanceof Car)){
			return false;
		}
		Car otherCar = (Car) other;
		
		if(this.numDoors == otherCar.getDoors()){
			if(this.numPassengers == otherCar.getPassengers()){
				return super.equals(other);
			}
		}
		return false;
	}
	
	public Car copy(){
		String theMake = this.getMake();
		String theModel = this.getModel();
		String thePlate = this.getPlate();
		int theDoors = this.numDoors;
		int thePassengers = this.numPassengers;
		Car theCopy = new Car(theMake, theModel, thePlate, theDoors, thePassengers);
		return theCopy;
	}
	
}