ע�ⷽʽʵ��springmvc�ĳ�������
��Ҫ������
	web.xml��
	1.ǰ�˿�����DispatcherServlet
	2.��DispatcherServlet�У����ó�ʼ������contextConfigLocation��ָ��springmvc�������ļ���λ��
	3.���÷���·��*.action

	springmvc.xml��
	1.�����˳ɶԳ��ֵ�HandlerMapping��HandlerAdapter
	RequestMappingHandlerMapping��RequestMappingHandlerAdapter
	������ӳ�����봦��������������Ȼ��Ĭ�ϵ����ã���Ĭ�ϵ���������ӳ����̫����
	�����Ƽ�����ʹ�ü���ע�������ķ�ʽ��ʵ����������������
		<mvc:annotation-driven></mvc:annotation-driven>
	2.����handler��controller������ʹ�õ�������bean�ķ�ʽ������spring bean��λ��
	�����Ƽ�ʹ�����ɨ����
		<context:component-scan base-package="com.gus.controller" ></context:component-scan>
	���ɨ��������ɨ��controller,service,��ע��������������ָ��controller�İ���
	
	3.������ͼ������
	����ͼ�������У�����jsp·����ǰ׺��jsp·���ĺ�׺�������ڷ���·����ʱ��Ϳ���
	ʡдǰ��׺��
	<bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
        	<!--����jsp·����ǰ׺-->
        	<property name="prefix" value="/WEB-INF/jsp/"></property>
        	<!--����jsp·���ĺ�׺-->
        	<property name="suffix" value=".jsp"></property>
    	</bean>

	���У�
	1.ʹ��@Controllerע������б��
	2.ʹ��@RequestMapping("/queryItems")ע����з���ע�⣬����Ϊurl��ַ������ʡд.action
	һ������·�������·����һ�£�����ά����