package hello;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    

	private static final Logger logger = LogManager.getLogger(HelloController.class);
	
	@Autowired
	MessageConfigProperties messageProperties;
	
    @RequestMapping("/")
    public String index() {
        
    	String greetingsMessage = messageProperties.getGreetings();
    	
    	logger.info("Inside index() method, returning :"+greetingsMessage);
    	
    	//return "Greetings from Spring Boot!";
        return greetingsMessage;
    }
    
}
