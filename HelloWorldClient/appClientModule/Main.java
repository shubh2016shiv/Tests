import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.HelloWorld.ejb.HelloWorldRemote;

public class Main {
	public static void main(String[] args) {


		// Create the JNDI InitialContext.
		try {
			
			
			// Create Properties for JNDI InitialContext.
			Properties prop = new Properties();
			prop.put(Context.INITIAL_CONTEXT_FACTORY, org.jboss.naming.remote.client.InitialContextFactory.class.getName()); 
			prop.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
			prop.put(Context.PROVIDER_URL, "http-remoting://localhost:8080");
			prop.put("jboss.naming.client.ejb.context", true);
		
			
			Context context = new InitialContext(prop);
			
			HelloWorldRemote bean = (HelloWorldRemote) context.lookup("HelloWorldBeanEAR/HelloWorldBean/HelloWorld!com.HelloWorld.ejb.HelloWorldRemote");
			
			System.out.println(bean.sayHello());
			
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	
	
	}
}