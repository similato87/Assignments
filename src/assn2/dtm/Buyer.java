package assn2.dtm;

public class Buyer {

	private int userId;
	private String status;
	private static int BuyersCount;
	private static int largestUserId = 100;

	public Buyer() {
		this.userId = 0;
		this.status = "NONMEMBER";
		BuyersCount++;
	}

	public Buyer(int userId) {
		this.userId = userId;
		this.status = checkStatus();
		BuyersCount++;
		if (userId >= largestUserId)
			largestUserId = userId + 1;
	}

	private String checkStatus() {
		if (this.userId == 0)
			return "NONMEMBER";
		else if (this.userId < 100)
			return "INACTIVEMEMBER";
		else
			return "ACTIVEMEMBER";
	}

	public void upgradeMembership() {
		if (this.status.equals("NONMEMBER")) {
			this.userId = largestUserId;
			this.status = checkStatus();
			largestUserId++;
		}
	}

	public int getUserId() {
		return userId;
	}

	public String getStatus() {
		return status;
	}

	public static int getBuyersCount() {
		return BuyersCount;
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
