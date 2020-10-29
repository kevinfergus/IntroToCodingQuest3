/**
* Passengers will be stored in a HashSet. To ensure no duplicates can be stored,
* you will need a hashCode and equals method.
*
* Hint: name, email, and accountType could create a nice, unique hash value.
*/
public class Passenger extends User {
	
	// BUSINESS, PERSONAL, etc.
	private String accountType;

	public Passenger() {
		super();
	}

	public Passenger(String name, String accountType) {
		super();
		this.setName(name);
		this.accountType = accountType;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
    
  public int hashCode(Passenger passenger){
    int hashcode = passenger.getName().hashCode() * passenger.getEmail().hashCode() * passenger.getAccountType().hashCode();
return hashcode;
}
    
    
 public boolean equals(Passenger passenger){
if (this.getName() == passenger.getName() && this.getEmail() == passenger.getEmail() && this.getAccountType() == passenger.getAccountType()){
return true;
}
return false;

}
	
}
