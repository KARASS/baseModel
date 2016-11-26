package com.karas.skeleton;

import org.apache.catalina.core.AprLifecycleListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SkeletonApplication {
	AprLifecycleListener arpLifecycle = null;

	@Value("${com.tomcat.apr}")
	private boolean enableApr;

	public static void main(String[] args) {
		SpringApplication.run(SkeletonApplication.class, args);
	}

	@Bean
	public TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory() {
		TomcatEmbeddedServletContainerFactory tomcat = new TomcatEmbeddedServletContainerFactory();
		if (enableApr) {
			arpLifecycle = new AprLifecycleListener();
			tomcat.setProtocol("org.apache.coyote.http11.Http11AprProtocol");
		}
		return tomcat;
	}
}
