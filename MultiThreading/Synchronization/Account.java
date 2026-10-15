package MultiThreading.Synchronization;

public class Account {

	public int id;
	public double ammount;
	
	
	
	public Account(int id, double ammount) {
		super();
		this.id = id;
		this.ammount = ammount;
	}

	public synchronized void deposite(int x) {
		ammount += x;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getAmmount() {
		return ammount;
	}

	public void setAmmount(double ammount) {
		this.ammount = ammount;
	}

	public synchronized void withdraw(int x) {
		ammount -= x;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", ammount=" + ammount + "]";
	}
	
	
}
