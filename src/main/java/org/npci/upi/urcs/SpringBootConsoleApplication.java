package org.npci.upi.urcs;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = { "hyd.lucifer" })
public class SpringBootConsoleApplication {

    public static void main(String[] args) throws Exception {
    	System.setProperty("server.port", "8000");
	    SpringApplication.run(SpringBootConsoleApplication.class, args);
    }

}
