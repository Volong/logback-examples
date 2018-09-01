package chapters.joran;

import org.xml.sax.Attributes;

import ch.qos.logback.core.joran.action.ImplicitAction;
import ch.qos.logback.core.joran.spi.ActionException;
import ch.qos.logback.core.joran.spi.ElementPath;
import ch.qos.logback.core.joran.spi.InterpretationContext;

public class PrintMeImplicitAction extends ImplicitAction {

	@Override
	public boolean isApplicable(ElementPath currentElementPath, Attributes attributes, InterpretationContext ec) {
		String printmeStr = attributes.getValue("printme");
		return Boolean.valueOf(printmeStr).booleanValue();
	}

	@Override
	public void begin(InterpretationContext ic, String name, Attributes attributes) throws ActionException {
		System.out.println("Element [" + name + "] asked to be printed.");
	}

	@Override
	public void end(InterpretationContext ic, String name) throws ActionException {
		// TODO Auto-generated method stub
		
	}

}
