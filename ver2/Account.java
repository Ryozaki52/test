package ver2;

public class Account {

	// Instance variable, only available inside this class.
	// New Comment for balance
	private double balance;
	private String name;
	public String getName() {

		return name;

		}

		public void setName(String name) {

		this.name = name;

		}
	
	// A "getter" method that simply returns the balance.

	public double getBalance() {

	return balance;

	}

	// A method that increases the balance by amount

	public void deposit(double amount) {

	if(amount>0) {

	balance += amount;

	}

	}

	public void withdraw(double amount) {

		if(amount>0) {

		balance -= amount;

		}

		}
	public void mergeAccount(Account a) {

		if(this.getName().equals(a.getName())) {

		this.balance += a.getBalance();

		}

		}
	// Informal test code
	@Override

	public String toString() {

		String msg = "name=" + name + ", balance=$" + balance;

	return msg;

	}
	public Account(String name, double balance) {

		this.name = name;

		this.balance = balance;

		}
	public static void main(String[] args) {
		

		Account a1 = new Account(1000.0);

		System.out.println("Balance=$" + a1.getBalance());

		a1.deposit(500.0);

		System.out.println("Balance=$" + a1.getBalance());
		a1.withdraw(200.0);

		System.out.println("Balance=$" + a1.getBalance());
		System.out.println(a1.toString());

		System.out.println(a1);
		
		
	}
	// Decreases the balance by amount
	private static void testMergeAccount_Successful() {

		System.out.println("-->testMergeAccount_Successful()");

		Account a1 = new Account("Shay", 1000.0);

		Account a2 = new Account("Shay", 500.0);

		a1.mergeAccount(a2);

		System.out.println("balance for a1 should be $1500, balance=$" + a1.getBalance());

		}

		private static void testMergeAccount_Unsuccessful() {

		System.out.println("-->testMergeAccount_Unsuccessful()");

		Account a1 = new Account("Shay", 1000.0);

		Account a2 = new Account("Wren", 500.0);

		a1.mergeAccount(a2);

		System.out.println("balance for a1 should be $1000, balance=$" + a1.getBalance());

		}
	
	}