public class Person {
    //TODO 1: declare instance variables
    private String name;
    private int age;
    private float weight;

    Person(String name, int age, float weight) {
        //TODO 2: complete the constructor
        this.setName(name);
        this.setAge(age);
        this.setWeight(weight);
    }

    public String toString() {
        //TODO 3: use the String.format() method to return string representation of the object
        return String.format("Name: %s Age: %s Weight: %s", this.getName(), this.getAge(), this.getWeight());
    }

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
