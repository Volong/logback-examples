package chapters.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class VariablesFromJNDI {

	private static final Logger LOGGER = LoggerFactory.getLogger(VariablesFromJNDI.class);
	
	@ResponseBody
	@RequestMapping("/jndi")
	public String variablesFromJNDI() {
		
		LOGGER.info("variables from jndi");
		
		return "ok";
	}
}
