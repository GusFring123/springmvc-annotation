注解方式实现springmvc的初步配置
主要配置有
	web.xml中
	1.前端控制器DispatcherServlet
	2.在DispatcherServlet中，配置初始化参数contextConfigLocation，指定springmvc主配置文件的位置
	3.配置访问路径*.action

	springmvc.xml中
	1.配置了成对出现的HandlerMapping和HandlerAdapter
	RequestMappingHandlerMapping与RequestMappingHandlerAdapter
	处理器映射器与处理器适配器，虽然有默认的配置，但默认的适配器和映射器太老了
	更加推荐的是使用加载注解驱动的方式来实现上述的两个配置
		<mvc:annotation-driven></mvc:annotation-driven>
	2.对于handler（controller）可以使用单独配置bean的方式来告诉spring bean的位置
	不过推荐使用组件扫描器
		<context:component-scan base-package="com.gus.controller" ></context:component-scan>
	组件扫描器可以扫描controller,service,等注解的组件，在这里指定controller的包。
	
	3.配置视图解析器
	在视图解析器中，配置jsp路径的前缀与jsp路径的后缀，这样在访问路径的时候就可以
	省写前后缀了
	<bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
        	<!--配置jsp路径的前缀-->
        	<property name="prefix" value="/WEB-INF/jsp/"></property>
        	<!--配置jsp路径的后缀-->
        	<property name="suffix" value=".jsp"></property>
    	</bean>

	类中：
	1.使用@Controller注解类进行标记
	2.使用@RequestMapping("/queryItems")注解进行方法注解，参数为url地址，可以省写.action
	一般情况下方法名与路径名一致，方便维护。