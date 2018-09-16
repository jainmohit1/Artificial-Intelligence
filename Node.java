// POJO for graph Node
public class Node {
	String parentCity;
	String currenCity;
	double pathCost;
	double heuristicCost;

	protected Node(String parentCity, String currenCity, double pathCost, double heuristicCost) {
		this.parentCity = parentCity;
		this.currenCity = currenCity;
		this.pathCost = pathCost;
		this.heuristicCost = heuristicCost;
	}

	public double getHeuristicCost() {
		return heuristicCost;
	}

	public void setHeuristicCost(double heuristicCost) {
		this.heuristicCost = heuristicCost;
	}

	public String getParentCity() {
		return parentCity;
	}

	public void setParentCity(String parentCity) {
		this.parentCity = parentCity;
	}

	public String getCurrenCity() {
		return currenCity;
	}

	public void setCurrenCity(String currenCity) {
		this.currenCity = currenCity;
	}

	public double getPathCost() {
		return pathCost;
	}

	public void setPathCost(double pathCost) {
		this.pathCost = pathCost;
	}
}