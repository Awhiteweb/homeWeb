package uk.co.white.coutts.ui.views.components;

import com.vaadin.ui.Button;
import com.vaadin.ui.Window;

public class CancelButton extends Button
{
	private static final long serialVersionUID = -5052577385632072853L;
	
	public CancelButton( Window window )
	{
		setWidth( "70px" );
		setCaption( "Cancel" );
		setStyleName( "cancel-button" );
		addClickListener( e -> window.close() );
	}	
}
