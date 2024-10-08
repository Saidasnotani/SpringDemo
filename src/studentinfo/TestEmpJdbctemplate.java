package studentinfo;

import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
import empdao.EmployeeDao;

public class TestEmpJdbctemplate {  
  
public static void main(String[] args) {  
    ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");  
      
    EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");  
  //  int status=dao.saveEmployee(new Employee(5,"Kishore"));
    Employee e = new Employee(5,"Kishore");
    //int status = dao.updateEmployee(e);
    int status = dao.deleteEmployee(e);
    System.out.println(status);  

   }
}
