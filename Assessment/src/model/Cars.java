package model;
//Car class
public abstract class Cars {
	int distance;
	
	public abstract int baseCostEstimation(int distance);
	public abstract int mileStoneCostEstimation(int distance);
}
