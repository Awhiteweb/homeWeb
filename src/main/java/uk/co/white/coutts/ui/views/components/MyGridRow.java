package uk.co.white.coutts.ui.views.components;

import com.vaadin.ui.CssLayout;

import java.util.List;

public class MyGridRow extends CssLayout
{
	private static final long serialVersionUID = 6641694982040192171L;

	private String style = "row";
	public MyGridRow()
	{
		setStyleName( style );
	}
	
	public MyGridRow( String style )
	{
		setStyleName( this.style + " " + style );
	}
	
	public MyGridRow( MyGridColumn c )
	{
		setStyleName( style );
		addComponent( c );
	}

	public MyGridRow( MyGridColumn... cols )
	{
		setStyleName( style );
		for ( MyGridColumn c : cols )
			addComponent( c );
	}

	public MyGridRow( List<MyGridColumn> cols )
	{
		setStyleName( style );
		for ( MyGridColumn c : cols )
			addComponent( c );
	}

	public MyGridRow( String style, MyGridColumn c )
	{
		setStyleName( this.style + " " + style );
		addComponent( c );
	}
	
	public MyGridRow( String style, MyGridColumn... cols )
	{
		setStyleName( this.style + " " + style );
		for ( MyGridColumn c : cols )
			addComponent( c );
	}

	public MyGridRow( String style, List<MyGridColumn> cols )
	{
		setStyleName( this.style + " " + style );
		for ( MyGridColumn c : cols )
			addComponent( c );
	}
	
	public void addStyleName( String style )
	{
		addStyleName( style );
	}
	
	public void addColumn( MyGridColumn c )
	{
		addComponent( c );
	}
	
	public void addColumns( List<MyGridColumn> cols )
	{
		for ( MyGridColumn c : cols )
			addComponent( c );
	}

	public void addColumns( MyGridColumn... cols )
	{
		for ( MyGridColumn c : cols )
			addComponent( c );
	}

	public int getColumnCount()
	{
		return getComponentCount();
	}
}
