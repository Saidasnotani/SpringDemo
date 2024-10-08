package empdao;
import org.springframework.jdbc.core.JdbcTemplate;  
import studentinfo.Employee;

public class EmployeeDao {  
private JdbcTemplate jdbcTemplate;  
  
public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
    this.jdbcTemplate = jdbcTemplate;  
}  
  
public int saveEmployee(Employee e){  
    String query="insert into employees values('"+e.getId()+"','"+e.getName()+"')";  
    return jdbcTemplate.update(query);  
}  
public int updateEmployee(Employee e){  
    String query="update employees set emp_name='"+e.getName()+"' where emp_id='"+e.getId()+"' ";  
    return jdbcTemplate.update(query);  
}  
public int deleteEmployee(Employee e){  
    String query="delete from employees where emp_id='"+e.getId()+"' ";  
    return jdbcTemplate.update(query);  
}  
  
}  