package com.micmiu.ejb;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class HelloWorld
 */
@Stateless
public class HelloWorld implements HelloWorldRemote {

    /**
     * Default constructor. 
     */
    public HelloWorld() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public String sayHello(String username) {
		return "Hello, " + username + "welcome to EJB.";
	}

}
