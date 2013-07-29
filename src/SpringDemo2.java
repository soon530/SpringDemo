import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringDemo2 {
	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext(
				"xml/beans-config.xml");

		HelloBean hello = (HelloBean) context.getBean("helloBean");
		System.out.println(hello.getHelloWord());
	}
}
