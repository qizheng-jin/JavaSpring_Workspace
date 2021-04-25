### Spring的核心机制IoC
IoC（Inverse Of Control）控制反转：即，把创建对象的权利交给框架，
也就是指将对象的创建、对象的初始化、对象的存储、对象的管理交给了Spring容器。
IoC 是一种通过描述来生成或者获取对象的技术，对于Java初学者更多时候是
使用new关键字来创建对象， 而在spring中则不是，它是通过描述（XML或注解）来创建对象。
在 Spring 中把每一个需要管理的对象称之为 Spring Bean（简称为Bean），
而Spring中管理这些 Bean 的容器， 被我们称之为 Spring IoC 容器（简称 IoC容器）


### 关于Maven命令
1.  Lifecycle.install -- 下载配置文件
    作用: 将项目打包处理
2.  Lifecycle.clean -- 将打包好的文件删除


### Maven bean
1) 当Spring程序执行的时候，首先会根据配置文件的内容进行解析
2) 当程序解析到bean标签时候， 则会根据反射的机制实例化对象
3) 将实例好的对象保存到超大的Map集合中<K, V> bean中的id当作Map的key
4) 从容器中获取对象,则从Map集合中通过id获取对象即可

### 关于反射机制补充说明
反射机制必定调用该函数的无参构造。

### 工厂模式
1. 问题：
   通过spring容器创建的对象一般通过的都是反射机制进行调用
   但是有的时候，由于业务需要, 我们需要创建抽象类和接口,这些类型不能
   用反射方式创建对象, 这时候就需要用工厂模式
   
2. 静态工厂模式
   静态方法特点: 1.静态方法调用何以通过类名直接调用
               2.内存中独一份
   
3. 实例化工厂模式

### 关于单例多例的说明
1. 关于Spring容器对象创建的说明
1.1 Spring容器默认对象都是单例对象(通过构造方法实例化对象)
1.2 可以通过scope属性控制对象的单例和多例
   
### 懒加载
说明: Spring容器中默认的规则是容器创建则单例对象创建,
懒加载可以 让.getBean生成完之后才创建对象.多例对象都是懒加载
一般服务器对象应该先行创建,用户直接使用即可.Spring不负责维护
多例对象的生命周期


### Spring生命周期
生命周期过程:
    1. 实例化对象
    2. 初始化操作
    3. 用户适用对象(调用其中方法)
    4. 对象销毁(一般都是释放资源)

### 编辑XML配置文件
两种方式注入数据:1. 用set方法 2. 用constructor

### Spring的三层结构
MVC

### 万能转义字符
<![CDATA[任意字符]]>


##################注解模式################################
###关于注解的说明
注解的作用: 程序中某些功能以低耦合度的形式进行使用
元注解:
    @Target({ElementType.TYPE})     标识注解对谁有效 type:类 method:方法
    @Retention(RententionPolicy.RUNTIME) 代码在xxx范围内生效
    @Documented     该注解注释编译到API文档中
由谁加载: 由Spring内部的源码进行调用(钩子函数)
    


Spring为了简化xml配置方式,则研发注解模式
Spring为了程序更加严谨,通过不同的注解标识不同的层级 但是注解的功能一样
1) @Controller 用来表示Controller层的代码 相当于将对象交给Spring管理
2) @Service 用来标识Service的代码
3) @Repository 用来表示持久层 
4) @Component --- 万用注解
5) @Autowired 注释，它可以对类成员变量、方法及构造函数进行标注，
   完成自动装配的工作。 通过 @Autowired的使用来消除 set ，get方法。
   如果类型注入失败,则会尝试进行变量名称注入
6) @Qualifier 如果Autowired注入失败,可以用Qualifier("类型名称")进行注入
7) @Configuration -- 用来注解配置类，告诉spring这是一个java配置文件(类)，
                    spring会根据这个文件生成IoC容器
8) @ComponentScan -- 让Spring进行扫描，默认只扫描此类所在的包及其子包
9) @Bean -- 通过该注解,可以将业务数据实例化之后,交给容器管理, 但是@Bean注解
    应该写到配置类中
10) @PropertySource() : 加载指定的.properties文件
11) @Value注解可以为Bean的属性赋值
   

### 关于Spring工厂模式的说明
1. Spring源码中创建对象都是采用工厂模式 顶级接口:BeanFactory
2. Spring开发中需要手动创建对象时, 一般采用FactoryBean(业务接口)



### 优化Xml的配置文件
### 配置类介绍
说明: 随着软件技术发展.xml配置文件显得臃肿 不便于操作,所以Spring后期
提出了配置类的思想, 将所有配置文件中的内容, 写在java类中

#### Spring中常见问题
接口多实现类情况说明
原则: Spring中规定一个接口最好只有一个实现类

### Spring注解模式的执行过程
1. 当程序启动Spring容器时 AnnotationConfigApplicationContext
   利用beanFactory实例化对象
2. 根据配置类中的包扫描开始加载指定的注解(4个). 根据配置文件的顺序依次进行加载
   Dao ----> Service ---> Controller
3. 根据指定的注解/注入指定的对象.之后同一交给Spring容器进行管理,最终程序启动成功


### SpringAOP （面向切面编程）
AOP 要达到的效果是，保证开发者不修改源代码的前提下，去为系统中的业务组件添加某种通用功能。
AOP 的本质是由 AOP 框架修改业务组件的多个方法的源代码，
数据库事务 -- userMapper
