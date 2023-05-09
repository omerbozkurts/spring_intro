package spring_intro;

public class CustomerManager implements ICustomerService{
	// musteri yonetimi burda saglanirken veriler diger class olan cutomerdal'dan cekilerek guvenlik artirilmis olur
	
	private ICustomerDal customer;
	
	//setter injection
	public void setCustomerDal(ICustomerDal customer) {
		this.customer=customer;
	}
	
	//constructor injection
	/*
	public CustomerManager(ICustomerDal customer) {
		this.customer=customer;
	}
	*/
	@Override
	public void add() {
		//is kurallari , musteri varligi ile ilgili sorgular ve diger islemler
		customer.add();
	}
}
