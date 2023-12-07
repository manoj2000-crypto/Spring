package personDetail;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonDetailHandler {

	public static void main(String[] args) {
		ApplicationContext ioc = new ClassPathXmlApplicationContext("PersonDetail.xml");
		
		Person person = ioc.getBean("personObj", Person.class);
		System.out.println("Name : " + person.getPersonName());
		person.getHomeAddress().displayAddress();
		person.getOfficeAddress().displayAddress();
	}

}
