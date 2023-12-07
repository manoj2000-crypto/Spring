package personDetail;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//This file is the Main for running the project.
public class PersonDetailHandler {

	public static void main(String[] args) {
		// Creating IOC Container
		ApplicationContext ioc = new ClassPathXmlApplicationContext("PersonDetail.xml");

		/*
		 * We use getBean() because, we already created bean(Object) in
		 * "PersonDetail.xml" file manually
		 * 
		 */
		Person person = ioc.getBean("personObj", Person.class);

		System.out.println("Name : " + person.getPersonName());

		person.getHomeAddress().displayAddress();
		person.getOfficeAddress().displayAddress();
	}

}
