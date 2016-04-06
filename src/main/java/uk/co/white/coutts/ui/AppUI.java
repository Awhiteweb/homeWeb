package uk.co.white.coutts.ui;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.UI;
import uk.co.white.coutts.service.Service;
import uk.co.white.coutts.ui.views.PaintView;

import javax.servlet.annotation.WebServlet;

@Theme("mytheme")
@Widgetset("uk.co.white.coutts.MyAppWidgetset")
public class AppUI extends UI
{
    private static final long serialVersionUID = -2498763791502623272L;

    @Override
    protected void init(VaadinRequest request) {
        Service.createData();
        setContent( new PaintView() );
    }

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = AppUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet
    {
        private static final long serialVersionUID = -2498763791502627272L;
    }

}
