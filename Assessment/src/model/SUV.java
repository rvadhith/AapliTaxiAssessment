package model;
//SUV class to estimate cost of SUV car rides
public class SUV extends Cars {

	@Override
	public int baseCostEstimation(int distance) {
		return ((distance - 5) * 15) + 100;
	}

	@Override
	public int mileStoneCostEstimation(int distance) {
		return 0;
	}
}
