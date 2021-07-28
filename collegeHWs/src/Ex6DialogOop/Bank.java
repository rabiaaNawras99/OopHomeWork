package Ex6DialogOop;
import java.util.ArrayList;
public class Bank {

	private String bankName;
	private ArrayList<Account> accounts= new ArrayList<>();
	private ArrayList<AcoountOwnner> accOwner= new ArrayList<>();
	
	//c`tor
	public Bank(String bankName) {
		setBankName(bankName);
		setAccounts(accounts);
	}

	
	

	//setters and getters
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String name) {
		this.bankName = name;//return accounts.get(name)-> in case the parameter is number int
	}
	public ArrayList<Account> getAccounts() {
		return accounts;
	}
	public void setAccounts(ArrayList<Account> accounts) {
		this.accounts = accounts;
	}
	public ArrayList<AcoountOwnner> getAccowner() {
		return accOwner;
	}


	public void setAccowner(ArrayList<AcoountOwnner> accowner) {
		this.accOwner = accowner;
	}

	//func1
	public void addAccount (Account acc) {
		
		accounts.add(acc);
	}
	//func2
	public Account findAccount (String no){
		for (Account acc : accounts) {
			if (acc.getAccount_id().equals(no)) 
				return acc;
			
		}
		return null;
	}
	//func3
	public Account Deposit (String no, double money) {
		Account acc= this.findAccount(no);
		double newMoney = acc.getBalance()+ money;
		acc.setBalance(newMoney);
		return acc;
		
	}
	//func4
	public Account Withdraw (String no, double money) {
		Account acc= this.findAccount(no);
		double newMoney = acc.getBalance()- money;
		acc.setBalance(newMoney);
		return acc;
	}

	//func5
	public String toString() {
		return "Bank :"+getBankName()+"\n"+" Account : "+ this.getAccounts() ;
	}

	
	//fun6
	private Account helperFunMaxBalance() 
   {
      if (accounts.size() == 0) // if no accounts, return null
        return null;
      
      // assume first account is the largest 
      Account largestYet = accounts.get(0) ;
      
      // for all other accounts
      for ( int i = 1; i < accounts.size(); i++ ) 
      {
         Account current = accounts.get(i) ;		// get next account
         // is current account > highest so far?
         if (current.getBalance() > largestYet.getBalance())
            largestYet = current ;
      }
      return largestYet;
   }
	

	//func 7: 
	public AcoountOwnner maxBalance() {
		
		Account helo= helperFunMaxBalance();
		return helo.getOwner();
		
	}

}
