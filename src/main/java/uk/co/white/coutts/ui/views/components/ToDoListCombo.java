package uk.co.white.coutts.ui.views.components;

import com.vaadin.data.util.ItemSorter;
import com.vaadin.ui.NativeSelect;
import uk.co.white.coutts.data.ToDoList;

import java.util.ArrayList;
import java.util.List;

public class ToDoListCombo extends NativeSelect
{
	private static final long serialVersionUID = 8585464462264796097L;

	private List<ToDoList> lists;
	
	public ToDoListCombo( List<ToDoList> list )
	{
		lists = new ArrayList<ToDoList>();
		for ( ToDoList d : list )
			lists.add( d );
//		generateList( list );
//		generateSelect();
		addItems( lists );
		setItemCaptionMode( ItemCaptionMode.ID );
		setCaption( "ToDo Lists" );
	}
	
	private void generateSelect()
	{
//		BeanContainer<Long, ToDoList> container = new BeanContainer<Long, ToDoList>( ToDoList.class );
//		container.setBeanIdProperty( "id" );
//		container.setItemSorter( new SortList() );
//		for ( ToDoList t : lists )
//			container.addItem( new BeanItem<ToDoList>( t ) );
		addItems( lists );
		setItemCaptionPropertyId( "name" );
		setItemCaptionMode( ItemCaptionMode.EXPLICIT );
	}
	
	private void generateList( List<ToDoList> data )
	{
	}
	
	class SortList implements ItemSorter
	{
		private static final long serialVersionUID = -2268031662434723625L;
		
		@Override
		public void setSortProperties( Sortable container, Object[] propertyId, boolean[] ascending )
		{}

		@Override
		public int compare( Object itemId1, Object itemId2 )
		{ 
			return itemId1.toString().compareToIgnoreCase( itemId2.toString() );
		}
		
	}
}
