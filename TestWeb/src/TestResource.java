import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.Test.ejb.HelloLocal;

import model.Employee;

@Path("/employees")
public class TestResource {

	Context context;
	
	HelloLocal bean;
	TestResource(){
		try{
			context = new InitialContext();
			
//			String appName     = "TestEAR";
//			String moduleName  = "TestEJB";
//			String beanName    = "Hello";
//			String packageName = "com.Test.ejb";
//			String className   = "HelloLocal";
		//	String fullJndiName = String.format("%s/%s/%s!%s.%s", appName, moduleName, beanName, packageName, className);
			bean = (HelloLocal) context.lookup("java:global/TestEAR/TestEJB/Hello!com.Test.ejb.HelloLocal");
		}catch(NamingException e){
			System.out.println("The Local Server not found" + e.getMessage());
		}
	}
	
	
@GET
@Path("/employeeName")
@Produces("application/json")
public List<Employee> getEmpName(){
	List<Employee> emp_List = bean.getEmployeeName();
	//List<String> emps = new ArrayList<>();
//	for(Employee e:emp_List){
//		emps.add(e.getName());
//	}
	
	return emp_List;
	
}
	
}
