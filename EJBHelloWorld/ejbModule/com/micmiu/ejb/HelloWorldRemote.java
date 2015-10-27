package com.micmiu.ejb;

import javax.ejb.Remote;

@Remote
public interface HelloWorldRemote {
	String sayHello(String username);
}
