package spring_intro;

public class MySqlCustomerDal implements ICustomerDal{
	
	String connectionString;
	public String getConnectionString() {
		return this.connectionString;
	}
	public void setConnectionString(String connectionString) {
		this.connectionString=connectionString;
	}
	
	@Override
	public void add(){
		System.out.println("Connection String:"+this.connectionString);
		System.out.println("MySql:musteri eklendi");
	}
}
