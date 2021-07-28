package Ex6DialogOop;

public class Account {

	private String account_id;
	private AcoountOwnner owner;
	private double balance;
	
	public Account(String account_id,AcoountOwnner owner,double balance) {
		setAccount_id(account_id);
		setOwner(owner);
		setBalance(balance);
	}
	
	//getters setters
	public String getAccount_id() {
		return account_id;
	}
	public void setAccount_id(String account_id) {
		this.account_id = account_id;
	}
	public AcoountOwnner getOwner() {
		return owner;
	}
	public void setOwner(AcoountOwnner owner) {
		this.owner = owner;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	//func1
	public void deposit(double amount)
	{
	    balance = balance + amount;
	} 
	//func2
	public void withdraw(double amount)
	{
	   balance = balance - amount;
	} 
	//func3
	public String toString() {
		return "account: "+getAccount_id() +", "+getBalance()+" NIS" +" , " +owner.toString()+" ";
	}

}
