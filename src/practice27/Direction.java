package practice27;

public enum Direction {
	EAST("東"), WEST("西"), SOUTH("南"), NORTH("北");
	
	private String jname;
	
	public String getJname() {
		return jname;
	}

	private Direction(String jname) {
		this.jname=jname;
	}

};
