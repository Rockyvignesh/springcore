

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPost implements BeanPostProcessor {

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

		System.out.println("Beanb4"+bean);
		System.out.println("BeanNameb4 "+beanName);
		return null;

	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Bean after"+bean);
		System.out.println("BeanName after"+beanName);
		return null;
	}
	

}
