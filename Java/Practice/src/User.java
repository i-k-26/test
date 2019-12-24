import java.util.Date;

public class User {

	private int id;
	private String name;
	private Date registered;

	public User(int id, String name, Date registered) {
		this.id = id;
		this.name = name;
		this.registered = registered;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Date getRegisteredDate() {
		return registered;
	}
}