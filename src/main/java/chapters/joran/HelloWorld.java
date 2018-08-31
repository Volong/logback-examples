package chapters.joran;

import java.util.HashMap;

import org.springframework.scheduling.config.ContextLifecycleScheduledTaskRegistrar;

import ch.qos.logback.core.ContextBase;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.joran.spi.ElementSelector;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.util.StatusPrinter;

public class HelloWorld {

    public static void main(String[] args) throws JoranException {
        
        HashMap<ElementSelector, Action> ruleMap = new HashMap<>();
        
        // 将 hello-world 模式与 HelloWorldAction 相关联
        ruleMap.put(new ElementSelector("hello-world"), new HelloWorldAction());
        
        // Joran 需要在上下文中才能工作
        ContextBase context = new ContextBase();
        SimpleConfigurator simpleConfigurator = new SimpleConfigurator(ruleMap);
        
        // 将配置器与它的上下文相关联
        simpleConfigurator.setContext(context);
        simpleConfigurator.doConfigure(args[0]);
        StatusPrinter.print(context);
    }
}
