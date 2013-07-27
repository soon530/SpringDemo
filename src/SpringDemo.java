import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class SpringDemo {
	public static void main(String[] args) {
		Resource rs = new FileSystemResource("xml/beans-config.xml");
		BeanFactory factory = new XmlBeanFactory(rs);

		HelloBean hello = (HelloBean) factory.getBean("helloBean");
		System.out.println(hello.getHelloWord());
	}
}
