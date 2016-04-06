package uk.co.white.coutts.data;

/**
 * Created by Alex on 12/03/2016.
 */
public class User {

    private String name;

    public User(){}

    public User( String name )
    {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
