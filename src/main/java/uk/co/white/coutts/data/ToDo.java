package uk.co.white.coutts.data;

/**
 * Created by Alex on 12/03/2016.
 */
public class ToDo {

    private String todo;
    private Boolean complete;

    public ToDo(){}
    public ToDo( String todo, Boolean complete ){
        this.todo = todo;
        this.complete = complete;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public Boolean getComplete() {
        return complete;
    }

    public void setComplete(Boolean complete) {
        this.complete = complete;
    }

    public boolean isComplete()
    {
        return complete.booleanValue();
    }

}
