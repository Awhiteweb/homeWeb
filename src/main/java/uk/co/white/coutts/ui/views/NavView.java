package uk.co.white.coutts.ui.views;

import com.vaadin.ui.Button;
import com.vaadin.ui.CssLayout;

public class NavView extends CssLayout
{
    private String navStyle = "nav-view";

    private Button homeBtn;
    private Button paintBtn;
    private Button todoBtn;
    private Button elecBtn;
    private Button gasBtn;
    private MainView mainView;

    public NavView()
    {
        setStyleName( navStyle );
        setHeight( "100%" );
    }

    public NavView( MainView mainView )
    {
        this();
        this.mainView = mainView;
    }

    {
        homeBtn = new Button();
        paintBtn = new Button();
        todoBtn = new Button();
        elecBtn = new Button();
        gasBtn = new Button();
    }
}
