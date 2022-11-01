package stident.info.com;

public class Student {
	private String name;
	private Integer rollNumber;
	private String std;

	public Student() {
	}

	public Student(String name, Integer rollNumber, String std) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
		this.std = std;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(Integer rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getStd() {
		return std;
	}

	public void setStd(String std) {
		this.std = std;
	}
	
}
