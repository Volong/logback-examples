package chapters.joran;

import org.xml.sax.Attributes;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.joran.spi.ActionException;
import ch.qos.logback.core.joran.spi.InterpretationContext;

public class HelloWorldAction extends Action {

    @Override
    public void begin(InterpretationContext ic, String name, Attributes attributes) throws ActionException {
        System.out.println("Hello World");
    }

    @Override
    public void end(InterpretationContext ic, String name) throws ActionException {
        // TODO Auto-generated method stub
        
    }

    
}
