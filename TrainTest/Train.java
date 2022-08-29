import java.util.*;
import java.util.ArrayList;

/**
 * A program that simulate a freight train. The methods are used to adds and
 * removes cars and trains, get the power and weight of them.
 * 
 * 
 * @author Chris Schmidt
 * 
 */
public class Train {
	public static void main(String args[]) {

	}

	// variables
	private String trainName;
	private int powerLocomotives;
	private int[] freightCars;

	// constructor
	public Train(String trainName, int powerLocomotives) {
		this.trainName = trainName;
		this.powerLocomotives = powerLocomotives;
	}

	/**
	 * Return the train's name
	 * 
	 * @return
	 */
	public String getTrainName() {
		return trainName;
	}

	/**
	 * Set the train's name
	 * 
	 * @param trainName
	 */
	public void setTrainName(String trainName) {
		if (trainName.length() == 0) {
			System.out.println("Error. Train name needs to have at least 1 character long.");
			return;
		}
		this.trainName = trainName;
	}

	/**
	 * Return the number of locomotives
	 * 
	 * @return
	 */
	public int getpowerLocomotives() {
		return powerLocomotives;
	}

	/**
	 * Set the number of locomotives
	 * 
	 * @param powerLocomotives
	 */
	public void setpowerLocomotives(int powerLocomotives) {
		if (powerLocomotives < 0) {
			System.out.println("Error. Locomotives can't be set to less than 0.");
			return;
		} else {
			this.powerLocomotives = powerLocomotives;
		}
	}

	/**
	 * Return an array of freight cars
	 * 
	 * @param freightCars
	 * @return
	 */
	public int[] getFreightCars(int... freightCars) {
		if (freightCars == null) {
			System.out.println("There are no freight cars in the list.");
			return freightCars;
		} else {
			return freightCars;
		}
	}

	/**
	 * Adds 2 cars arrays together
	 * 
	 * @param weights
	 * @return
	 */
	public int[] addCars(int... weights) {
		int count = 0;
		int[] freightCars = { 20, 30, 20 };
		int[] newTrain = new int[freightCars.length + weights.length];
		for (int i = 0; i < freightCars.length; i++) {
			newTrain[i] = freightCars[i];
			count++;
		}
		for (int j = 0; j < weights.length; j++) {
			newTrain[count++] = weights[j];
		}
		for (int i = 0; i < newTrain.length; i++) {
			System.out.print(newTrain[i] + " ");
		}
		return newTrain;
	}

	/**
	 * Remove a car from the array
	 * 
	 * @param position
	 * @return
	 */
	public int removeCar(int position) {
		return freightCars[position];
	}

	/**
	 * Return a string that prints the name and number of locomotives
	 * 
	 * @return
	 */
	public String toString() {
		String trainInfo = "Train name: " + this.trainName + "\n";
		trainInfo += "Number of Locomotives: " + this.powerLocomotives + "\n";
		trainInfo += "Weights of Freight Cars: " + this.getFreightCars() + "\n";
		return trainInfo;
	}

	/**
	 * Return a value of the total weight of all cars
	 * 
	 * @param weights
	 * @return
	 */
	public int getTotalWeightOfCars(int... weights) {
		if (weights == null) {
			return 0;
		} else {
			int sum = 0;
			for (int n : weights) {
				sum += n;
			}
			return sum;
		}
	}

	/**
	 * Return the number of cars in the array
	 * 
	 * @param freightCars
	 * @return
	 */
	public int getNumOfCars(int... freightCars) {
		if (freightCars == null) {
			return 0;
		} else {
			int numOfCars = freightCars.length;
			return numOfCars;
		}
	}

	/**
	 * Return the maximum speed that the train can travel
	 * 
	 * @param weights
	 * @return
	 */
	public int compMaxSpeed(int... weights) {
		int maxSpeed = ((powerLocomotives * 50) - getTotalWeightOfCars(weights));
		if (maxSpeed > 150) {
			return 150;
		} else {
			return maxSpeed;
		}
	}

	/**
	 * Remove all cars from the array
	 * 
	 * @param freightCars
	 * @return
	 */
	public int[] removeAllCars(int... freightCars) {
		freightCars = null;
		return freightCars;
	}

	/**
	 * Merge Trains
	 * 
	 * @param other
	 */
	public void mergeTrains(Train other) {
		this.powerLocomotives = this.powerLocomotives + other.powerLocomotives;
		other.powerLocomotives = 0;
	}
}