package uk.co.white.coutts.ui.views.components;

import com.vaadin.ui.CheckBox;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Label;
import uk.co.white.coutts.data.ToDo;

import java.util.List;

public class ToDoListGrid extends GridLayout
{
	private static final long serialVersionUID = 1L;
	
	private List<ToDo> todos;
	
	public ToDoListGrid( List<ToDo> todos )
	{
		this.todos = todos;
		setColumns( 2 );
		setRows( todos.size() + 1 );
		generateGrid();
	}
	
	private void generateGrid()
	{
		int row = 0;
		addComponent( new Label( "<strong>Item</strong>" ), 0, row );
		addComponent( new Label( "<strong>Complete</strong>" ), 1, row );
		for ( ToDo t : todos )
		{
			row++;
			addComponent( new Label( t.getTodo() ), 0, row );
			addComponent( setCheck( t ), 1, row );
		}
	}
	
	private CheckBox setCheck( ToDo t )
	{
		CheckBox c = new CheckBox();
		c.setValue( t.isComplete() );
		c.addContextClickListener( e -> {
			t.setComplete( c.getValue() );
		} );
		return c;
	}
}
