package entities.copy;

public class Course {

	private int id;
	private String name;
	private String title;
	private String description;
	private int completionPercentage;
	private double price;

	public Course() {
		super();
	}

	public Course(int id, String name, String title, String description, int completionPercentage, double price) {
		super();
		this.id = id;
		this.name = name;
		this.title = title;
		this.description = description;
		this.completionPercentage = completionPercentage;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCompletionPercentage() {
		return completionPercentage;
	}

	public void setCompletionPercentage(int completionPercentage) {
		this.completionPercentage = completionPercentage;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
