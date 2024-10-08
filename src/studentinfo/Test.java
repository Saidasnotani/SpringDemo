package studentinfo;

 

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {  
public static void main(String[] args) {  
  
//	Resource resource=new ClassPathResource("applicationContext.xml");  Using BeanFactory IOC
//    BeanFactory factory=new XmlBeanFactory(resource);
//    Student student=(Student)factory.getBean("studentbean");
	
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); // Using ApplicationContext IOC
    Student student = (Student)context.getBean("studentbean");
	student.displayInfo();  
}  
}  
