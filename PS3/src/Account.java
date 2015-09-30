import java.util.Date;

public class Account {

	private int id;
	private double balance;
	private double annualIntrestRate;
	private Date DateCreated;

	public Account(int id, double balance) {
		super();
		this.id = id;
		this.balance = balance;
		// this.DateCreated = new Date();

	}

	public Account() {
		super();
		this.id = 0;
		this.balance = 0;
		this.DateCreated = new Date();

	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualIntrestRate() {
		return annualIntrestRate;

	}

	public void setannualIntrestRate(double annualIntrestRate) {
		this.annualIntrestRate = annualIntrestRate;

	}

	public Date getDateCreated() {
		return DateCreated;
	}

	public double getMonthlyIntrestRate() {
		return annualIntrestRate / 12;
	}

	public void withdraw(double amount) throws InsufficientFundsException {
		if (amount <= balance){
			balance = balance - amount;
		} else {
			double needs = amount - balance;
			throw new InsufficientFundsException(needs);
		}
	}

	public void deposit (double amount)
	{
	balance = balance + amount;
	}
}