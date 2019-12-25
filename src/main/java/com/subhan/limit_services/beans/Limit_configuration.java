package com.subhan.limit_services.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(value = "limits-service")
public class Limit_configuration {
  private int maximumLimit;
  private int minimumLimit;
public int getMaximumLimit() {
	return maximumLimit;
}
public Limit_configuration() {
	super();
	// TODO Auto-generated constructor stub
}
public void setMaximumLimit(int maximumLimit) {
	this.maximumLimit = maximumLimit;
}
public Limit_configuration(int maximumLimit, int minimumLimit) {
	super();
	this.maximumLimit = maximumLimit;
	this.minimumLimit = minimumLimit;
}
public int getMinimumLimit() {
	return minimumLimit;
}
public void setMinimumLimit(int minimumLimit) {
	this.minimumLimit = minimumLimit;
}
	
}
