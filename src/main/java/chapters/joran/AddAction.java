package chapters.joran;

import java.util.EmptyStackException;

import org.xml.sax.Attributes;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.joran.spi.ActionException;
import ch.qos.logback.core.joran.spi.InterpretationContext;

public class AddAction extends Action {

    @Override
    public void begin(InterpretationContext ic, String name, Attributes attributes) throws ActionException {
        int first = fetchInteger(ic);
        int second = fetchInteger(ic);
        ic.pushObject(first + second);
    }

    @Override
    public void end(InterpretationContext ic, String name) throws ActionException {
        // TODO Auto-generated method stub
        
    }
    
    int fetchInteger(InterpretationContext ic) {
        int result = 0;
        
        try {
            Object popObject = ic.popObject();
            if (popObject instanceof Integer) {
                result = ((Integer) popObject).intValue();
            } else {
                String errMsg = "Object [" + popObject + "] currently at the top of the stack is not an integer.";
                ic.addError(errMsg);
                throw new IllegalArgumentException(errMsg);
            }
        } catch (EmptyStackException e) {
            ic.addError(("Expecting an integer on the execution stack."));
            throw e;
        }
        
        return result;
    }
    
}
