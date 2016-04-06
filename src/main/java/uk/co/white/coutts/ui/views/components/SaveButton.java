package uk.co.white.coutts.ui.views.components;

import com.vaadin.ui.Button;
import com.vaadin.ui.Window;

public class SaveButton extends Button
{
	private static final long serialVersionUID = 4950019212074367145L;

	public SaveButton( Window window, String caption )
	{
		setStyleName( "save-btn" );
		setCaption( caption );
		setWidth( "70px" );
		addClickListener( e -> window.close() );
	}
}
