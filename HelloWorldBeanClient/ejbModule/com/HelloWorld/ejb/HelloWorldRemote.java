package com.HelloWorld.ejb;

import javax.ejb.Remote;

@Remote
public interface HelloWorldRemote {
 String sayHello();
}
