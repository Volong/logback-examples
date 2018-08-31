package chapters.joran;

import org.xml.sax.Attributes;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.joran.spi.ActionException;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.util.OptionHelper;

public class ComputationAction1 extends Action {

    public static final String NAME_ATR = "name";
    
    String nameStr;
    
    @Override
    public void begin(InterpretationContext ic, String name, Attributes attributes) throws ActionException {
        nameStr = attributes.getValue(NAME_ATR);
    }

    @Override
    public void end(InterpretationContext ic, String name) throws ActionException {
        if (OptionHelper.isEmpty(nameStr)) {
            
        } else {
            Integer i = (Integer) ic.peekObject();
            System.out.println("The computation named [" + nameStr + "] resulted in the value " + i);
        }
    }

    
}
