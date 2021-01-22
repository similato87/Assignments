package assn1.dtm;

public class Buyer {

	private int userId;
	private String status;

	public Buyer() {
		this.userId = 0;
		this.status = "NONMEMBER";
	}

	public Buyer(int userId) {
		this.userId = userId;
		this.status = checkStatus();
	}

	private String checkStatus() {
		if (this.userId == 0)
			return "NONMEMBER";
		else if (this.userId < 100)
			return "INACTIVEMEMBER";
		else
			return "ACTIVEMEMBER";
	}

	public int getUserId() {
		return userId;
	}

	public String getStatus() {
		return status;
	}

	@Override
	public String toString() {
		return "Buyer [userId=" + userId + ", status=" + status + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer tom = new Buyer();
		System.out.println(tom);
		
		Buyer jack = new Buyer(200);
		System.out.println(jack);

	}

}
