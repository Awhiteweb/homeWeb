package uk.co.white.coutts.ui.views.components;

import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import uk.co.white.coutts.data.Paint;

public 	class SavePaint implements ClickListener
{
	private static final long serialVersionUID = 448981353109451685L;

	private Paint paint;
	
	SavePaint( Paint paint )
	{
		this.paint = paint;
	}
	
	@Override
	public void buttonClick( ClickEvent event )
	{
//		painter.save( paint );
	}
	
}