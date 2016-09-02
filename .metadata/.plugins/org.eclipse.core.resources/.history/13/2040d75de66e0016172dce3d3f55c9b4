import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;

import com.Test.ejb.HelloRemote;

import model.Employee;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create Properties for JNDI InitialContext.
		
		
		try{
			
			
			Properties prop = new Properties();
			prop.put(Context.INITIAL_CONTEXT_FACTORY, org.jboss.naming.remote.client.InitialContextFactory.class.getName()); 
			prop.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
			prop.put(Context.PROVIDER_URL, "http-remoting://localhost:8080");
			prop.put("jboss.naming.client.ejb.context", true);
			
			
			Context context = new InitialContext(prop);
			
			String appName     = "TestEAR";
			String moduleName  = "TestEJB";
			String beanName    = "Hello";
			String packageName = "com.Test.ejb";
			String className   = "HelloRemote";
			
			String fullJndiName = String.format("%s/%s/%s!%s.%s", appName, moduleName, beanName, packageName, className);
			
			HelloRemote bean = (HelloRemote) context.lookup(fullJndiName);
			System.out.println(bean.sayHello());
			for(Employee e : bean.getEmployeeName()){
				System.out.println(e.getName());
			}
			
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
	}

	
	public Main() {
		super();
	}

}