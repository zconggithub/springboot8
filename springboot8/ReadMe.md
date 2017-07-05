#springboot7===>springboot整合JSP
#author:zhoucong 			QQ:2632652610



结构目录相关解释：
Src/main/resources/static： 静态文件【html,Css,js等其他】==此处的html或jsp等其他可直接访问
Src/main/resources/templates:目录下的文件是安全的，不可直接访问
自己创建一个结构目录,存放jsp:如下：=====》【可见项目目录结构】
Src/main/webapp
	然后在这个目录机构下建jsp文件夹存放jsp页面
	
具体pom文件如下：
		    <!-- jsp -->
		    <dependency>  
	  <groupId>org.apache.tomcat.embed</groupId>  
	  <artifactId>tomcat-embed-jasper</artifactId>  
	  <scope>provided</scope>  
		</dependency>  
	<!--jsp页面使用jstl标签--><!--不像传统的要加入标签库-->
	<dependency>
	    <groupId>javax.servlet</groupId>
	    <artifactId>jstl</artifactId>
	</dependency>

配置文件如下：即yml文件【】【】【【】【】

spring:
  datasource:
    url: jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf-8
    driver-class-name: com.mysql.jdbc.Driver
    username: root
    password: 123
    #jsp主要配置如下：
  mvc:
    view:
      prefix: /WEB-INF/jsp/
      suffix: .jsp

mybatis:
  mapper-locations: classpath:mapper/*.xml            #XML文件
  
  
  