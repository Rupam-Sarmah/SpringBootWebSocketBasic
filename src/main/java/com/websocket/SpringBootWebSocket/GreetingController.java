package com.websocket.SpringBootWebSocket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class GreetingController {
	@MessageMapping("/hello")
	@SendTo("/topic/greetings")
	public Greeting greet(HelloMessage message) {
		return new Greeting("Hello...," + HtmlUtils.htmlEscape(message.getName()));
		
		/*
		 * https://www.youtube.com/watch?v=n6ZqOwreFTA 
		 * 7.14
		 * https://github.com/dailycodebuffer/Spring-MVC-Tutorials/tree/master/spring-websocket/src/main/java/com/dailycodebuffer/websocket
		 */
	}

}
