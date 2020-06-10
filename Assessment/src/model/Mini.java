package model;
//Mini class to estimate cost of Mini Car rides
public class Mini extends Cars {

	@Override
	public int baseCostEstimation(int distance) {
		return ((distance - 3) * 10) + 50;	
	}

	@Override
	public int mileStoneCostEstimation(int distance) {
		return distance * 8;
	}
}
