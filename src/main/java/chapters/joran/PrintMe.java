package chapters.joran;

import java.util.ArrayList;
import java.util.HashMap;

import ch.qos.logback.core.ContextBase;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.joran.action.ImplicitAction;
import ch.qos.logback.core.joran.action.NOPAction;
import ch.qos.logback.core.joran.spi.ElementSelector;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.util.StatusPrinter;

public class PrintMe {
	
	public static void main(String[] args) throws JoranException {
		
		ContextBase context = new ContextBase();
		
		HashMap<ElementSelector, Action> ruleMap = new HashMap<>();
		
		ruleMap.put(new ElementSelector("*/foo"), new NOPAction());
		
		ArrayList<ImplicitAction> iaList = new ArrayList<>();
		
		iaList.add(new PrintMeImplicitAction());
		
		SimpleConfigurator simpleConfigurator = new SimpleConfigurator(ruleMap, iaList);
		
		simpleConfigurator.setContext(context);
		
		simpleConfigurator.doConfigure(args[0]);
		
		StatusPrinter.printInCaseOfErrorsOrWarnings(context);
	}

}
