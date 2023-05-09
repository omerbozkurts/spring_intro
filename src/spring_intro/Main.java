package spring_intro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		/*CustomerManager customer=new CustomerManager(context.getBean("database",ICustomerDal.class));
		customer.add();
*/
		ICustomerService customerService=context.getBean("service",ICustomerService.class);
		customerService.add(); 
	}

}
