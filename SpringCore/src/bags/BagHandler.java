package bags;

//import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BagHandler {

	public static void main(String[] args) {
		
		 ApplicationContext ioc = new ClassPathXmlApplicationContext("BagConfiguration.xml");
		 
		 //Compile Time 
		 SchoolBag schoolBagObjectFromIoc = (SchoolBag) ioc.getBean("schoolBagObject");
		 schoolBagObjectFromIoc.display();
		 
//		 If you use below line then you don't need to type cast it.
//		 SchoolBag schoolBagIoc = ioc.getBean("schoolBagObject", SchoolBag.class);
//		 schoolBagIoc.display();
		 
		 //Run time
		 Bag shoppingbag = (Bag) ioc.getBean("shoppingBagObject");
		 shoppingbag.display();
	}

}
