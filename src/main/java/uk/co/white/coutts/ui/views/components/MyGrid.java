package uk.co.white.coutts.ui.views.components;

import com.vaadin.ui.CssLayout;

/**
 *
 * creates a 2 col grid with the header row cells empty
 *
 */
public class MyGrid extends CssLayout
{
	private static final long serialVersionUID = -3244499057129594824L;
	
	private String style = "my-grid";
	
	public MyGrid()
	{
		setStyleName( style );
	}
	
	public MyGrid( String style )
	{
		setStyleName( this.style + " " + style );
	}
	
	public void addRow( MyGridRow row )
	{
		addComponent( row );
	}
	
}
