package Ex6DialogOop;

public class Ex6DialogOop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//make bank
		
		Bank bank= new Bank("Leumi");
		//make 2 ownners
		AcoountOwnner David =new AcoountOwnner("Itai","Daniel ","1111","Afula");
		AcoountOwnner Moshe =new AcoountOwnner("Gila","Yakov ","2321","Haifa");
		//System.out.println(Mohammed.toString());
		
		Account accdav1=new Account("12394",David,5343424);
		Account accdav2=new Account("85419",David,6546454);
		Account accmosh1=new Account("61246",Moshe,10364500);
		Account accmosh2=new Account("43434",Moshe,90057650);
		//System.out.println(se.toString());
		
		bank.addAccount(accmosh2);
		bank.addAccount(accdav1);
		bank.addAccount(accmosh1);
		bank.addAccount(accdav2);
		
		bank.Deposit("43434", 1000);
		bank.Deposit("85419", 3234);
		
		bank.Withdraw("12394", 2399);
		bank.Withdraw("61246", 3000);
		
		System.out.println(bank.toString());
		
		System.err.println( "max balance is: "+ bank.maxBalance());

	}

}
