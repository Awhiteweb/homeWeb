package uk.co.white.coutts.ui.views.components;

import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;

/**
 * creates a basic window
 */
public class MyPopup extends Window
{
    private VerticalLayout v;
    private HorizontalLayout h;

    public MyPopup()
    {
        setup();
    }

    private void setup()
    {
        setStyleName( "my-popup" );
        setClosable( false );
        setResizable( false );
        center();
        v.setSpacing( true );
        v.setMargin( true );
        setContent( v );
    }

    public void addToVertical( Component component )
    {
        v.addComponent( component );
    }

    public void addToHorizontal( Component component )
    {
        if ( v.getComponentIndex( h ) < 0 )
            v.addComponent( h );
        h.addComponent( component );
    }
}
