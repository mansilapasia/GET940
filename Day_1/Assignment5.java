class Account{
	int accountNo;
	float accountBalance;
	String accountPassword;
	static String bankName;
	
	Account(){
		System.out.println("Banking");
	}
	Account(int acno,float acbal,String acpass)
	{
		this.accountNo=acno;
		this.accountBalance=acbal;
		this.accountPassword=acpass;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public float getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(float accountBalance) {
		this.accountBalance = accountBalance;
	}
	public String getAccountPassword() {
		return accountPassword;
	}
	public void setAccountPassword(String accountPassword) {
		this.accountPassword = accountPassword;
	}
	public static void setBankName(String bankName) {
		Account.bankName = bankName;
	}
	void displayAccount()
	{
		System.out.println("Bank Name:"+bankName);
		System.out.println("Account number:"+accountNo);
		System.out.println("Account Balance:"+accountBalance);
		System.out.println("Account Password:"+accountPassword);
	}
	
}
public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("------Welcome to Banking System------");
		Account.setBankName("HDFC");
		Account a=new Account(1234,50000,"pass@123");
		a.displayAccount();
		System.out.println("-------------------");
		Account a1=new Account(4567,60000,"abc@123");
		a1.displayAccount();
	}

}
