import java.util.Scanner;

class BankAccount {
	private String accountNumber;
	private String accountHolderName;
	private double balance;

	public BankAccount(String accountNumber, String accountHolderName, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance < 0 ? 0.0 : balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		if (amount <= 0) {
			System.out.println("Invalid Deposit Amount");
			return;
		}

		balance += amount;
	}

	public void withdraw(double amount) {
		if (amount > balance) {
			System.out.println("Insufficient Funds");
			return;
		}

		balance -= amount;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter account number: ");
		String accountNumber = scanner.nextLine();

		System.out.print("Enter account holder name: ");
		String accountHolderName = scanner.nextLine();

		System.out.print("Enter initial balance: ");
		double balance = scanner.nextDouble();

		BankAccount account = new BankAccount(accountNumber, accountHolderName, balance);

		System.out.print("Enter deposit amount: ");
		double depositAmount = scanner.nextDouble();
		account.deposit(depositAmount);

		System.out.print("Enter withdraw amount: ");
		double withdrawAmount = scanner.nextDouble();
		account.withdraw(withdrawAmount);

		System.out.println(account.getBalance());

		scanner.close();
	}
}
