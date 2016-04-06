package uk.co.white.coutts.ui.views.components;

import com.vaadin.ui.Component;
import com.vaadin.ui.CssLayout;

public class MyGridColumn extends CssLayout
{
	private static final long serialVersionUID = -7039434296181076900L;

	private String style = "col";
	
	public MyGridColumn()
	{
		setStyleName( style );
	}
	
	public MyGridColumn( String style )
	{
		setStyleName( this.style + " " + style );
	}
	
	public MyGridColumn( Component c )
	{
		setStyleName( style );
		addComponent( c );
	}
	
	public MyGridColumn( String style, Component c )
	{
		setStyleName( this.style + " " + style );
		addComponent( c );
	}
	
	public void addStyleName( String style )
	{
		addStyleName( style );
	}
}
