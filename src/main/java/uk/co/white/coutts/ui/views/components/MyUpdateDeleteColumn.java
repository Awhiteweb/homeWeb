package uk.co.white.coutts.ui.views.components;

import com.vaadin.server.FontAwesome;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.HorizontalLayout;
import uk.co.white.coutts.data.Paint;

public class MyUpdateDeleteColumn extends MyGridColumn
{
	private static final long serialVersionUID = 3531110278900427313L;

	private String style = "col";
	private Paint paint;

	public MyUpdateDeleteColumn( Paint paint )
	{
		this.paint = paint;
		setStyleName( style );
		addButtons();
	}
	
	public MyUpdateDeleteColumn( Paint paint, String style )
	{
		this.paint = paint;
		setStyleName( this.style + " " + style );
		addButtons();
	}
	
	private void addButtons()
	{
		addUpdateButton();
		addDeleteButton();
	}
	
	private void addUpdateButton()
	{
		Button update = new Button();
		update.setIcon( FontAwesome.EDIT );
		update.addStyleName( "update-button" );
		update.addClickListener( e -> {
//			painter.save( paint );
		});
		addComponent( update );
	}
	
	private void addDeleteButton()
	{
		Button delete = new Button();
		delete.setIcon( FontAwesome.REMOVE );
		delete.addStyleName( "delete-button" );
		delete.addClickListener( e -> {
//			painter.delete( paint );
		});
		addComponent( delete );
	}
	
	private Window createWindow( int i )
	{
		Window w = new Window();
//		w.setWidth( "200px" );
		w.setResizable( false );
		w.setClosable( false );
		
		VerticalLayout v = new VerticalLayout();
		v.setSizeFull();
		v.setSpacing( true );
		w.setContent( v );
		
		Label content;
		Button submit;
		Button cancel = new CancelButton( w );
		
		switch( i )
		{
			case 0:
				content = new Label( "Please edit this Paint" );
				TextField room = new TextField();
				room.setInputPrompt( paint.getRoom() );
				v.addComponent( room );
				room = new TextField();
				room.setInputPrompt( paint.getCode() );
				v.addComponent( room );
				submit = new Button( "Save" );
				submit.addClickListener( e -> { 
//					painter.save( paint );
					w.close();
				});
				break;
			case 1:
				content = new Label( "Are you sure you wish to delete" );
				submit = new Button( "Yes" );
				submit.addClickListener( e -> {
//					painter.delete( paint );
					w.close();
				});
				break;
			default:
				content = new Label( "error" );
				submit = new Button( "Yes" );
				break;
		}
		
		content = new Label( "Are you sure you wish to delete" );
		v.addComponent( content );
		
		HorizontalLayout h = new HorizontalLayout();
		h.setWidth( "100%" );
		h.setSpacing( true );
		v.addComponent( h );
		
		submit.setWidth( "70px" );
		h.addComponent( submit );		
		h.addComponent( cancel );
		
		return w;
	}
	
	
}
