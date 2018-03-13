package chapters.configuration;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.spi.PropertyDefiner;
import ch.qos.logback.core.status.Status;

public class PropertyDefiner1 implements PropertyDefiner {

	private String shape;
	
	private String color;
	
	private int size;
	

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String getPropertyValue() {

		System.out.println(getShape());
		System.out.println(getColor());
		System.out.println(getSize());
		return "info";
	}

	@Override
	public void setContext(Context context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Context getContext() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addStatus(Status status) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addInfo(String msg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addInfo(String msg, Throwable ex) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addWarn(String msg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addWarn(String msg, Throwable ex) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addError(String msg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addError(String msg, Throwable ex) {
		// TODO Auto-generated method stub
		
	}
	
}
