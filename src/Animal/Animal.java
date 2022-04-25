package Animal;

public class Animal {
	private String name;

	public Animal(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	//食べる
	public void eat() {
		System.out.println(name + "が食べる");
	}
}
