package spring_intro;
//Oracle icin yazilmistir
public class CustomerDal implements ICustomerDal{
	// bu kisimda veriler cekilir
	String connectionString;
	public String getConnectionString() {
		return this.connectionString;
	}
	public void setConnectionString(String connectionString) {
		this.connectionString=connectionString;
	}
	
	@Override
	public void add() {
		System.out.println("Connection String:"+this.connectionString);
		System.out.println("Oracle:musteri eklendi");
	}
	
}
