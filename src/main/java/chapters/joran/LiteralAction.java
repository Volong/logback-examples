package chapters.joran;

import org.xml.sax.Attributes;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.joran.spi.ActionException;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.util.OptionHelper;

public class LiteralAction extends Action {

    public static final String NAME_ATR = "value";
    
    @Override
    public void begin(InterpretationContext ic, String name, Attributes attributes) throws ActionException {
        String valueStr = attributes.getValue(NAME_ATR);
        if (OptionHelper.isEmpty(valueStr)) {
            ic.addError("The literal action requires a value attribute");
            return;
        } 
        
        try {
            Integer valueOf = Integer.valueOf(valueStr);
            ic.pushObject(valueOf);
        } catch (NumberFormatException e) {
            ic.addError("The value [" + valueStr + "] could not be converted to an Integer", e);
            throw e;
        }
        
    }

    @Override
    public void end(InterpretationContext ic, String name) throws ActionException {
        // TODO Auto-generated method stub
        
    }

}
