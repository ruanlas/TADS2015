
public class Author {
	private String name;
	private int id;
	
	public Author(String name, int id){
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public void print() {
		System.out.println("-------------------------");
		System.out.println(" -  Name: "+ this.name);
		System.out.println(" -  ID: "+this.id);
		System.out.println("-------------------------");
	}
}
