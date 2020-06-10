package model;
//Sedan Class to calculate expenses for Sedan Car rides
public class Sedan extends Cars {

	@Override
	public int baseCostEstimation(int distance) {
		return ((distance - 5) * 12) + 80;
	}

	@Override
	public int mileStoneCostEstimation(int distance) {
		return distance * 10;
	}
}
