package chapters.joran;

import java.util.HashMap;

import ch.qos.logback.core.ContextBase;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.joran.spi.ElementSelector;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.util.StatusPrinter;

public class Calculator1 {

    public static void main(String[] args) throws JoranException {
        
        ContextBase context = new ContextBase();
        
        HashMap<ElementSelector, Action> ruleMap = new HashMap<>();
        
        ruleMap.put(new ElementSelector("/computation"), new ComputationAction1());
        
        ruleMap.put(new ElementSelector("/computation/literal"), new LiteralAction());
        
        ruleMap.put(new ElementSelector("/computation/add"), new AddAction());
        
        ruleMap.put(new ElementSelector("/computation/multiply"), new MultiplyAction());
        
        SimpleConfigurator simpleConfigurator = new SimpleConfigurator(ruleMap);
        simpleConfigurator.setContext(context);
        simpleConfigurator.doConfigure(args[0]);
        
        StatusPrinter.print(context);
        
        
    }
}
