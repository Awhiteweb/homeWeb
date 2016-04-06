package uk.co.white.coutts.data;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Alex on 12/03/2016.
 */
public class ToDoList {

    private Long id;
    private String name;
    private List<ToDo> todos;

    public ToDoList()
    {
        this.todos = new LinkedList<ToDo>();
    }

    public ToDoList( String name )
    {
        this.name = name;
        this.todos = new LinkedList<ToDo>();
    }
    public ToDoList( String name, List<ToDo> todos )
    {
        this.name = name;
        this.todos = todos;
    }

    public void setTodos( List<ToDo> todos )
    {
        this.todos = todos;
    }
    public void addTodo( ToDo todo )
    {
        this.todos.add( todo );
    }
    public void addTodos( List<ToDo> todos )
    {
        this.todos.addAll( todos );
    }
    public int getTodoListSize()
    {
        return todos.size();
    }
    public void setName( String name )
    {
        this.name = name;
    }
    public Long getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public List<ToDo> getToDos()
    {
        return todos;
    }

    @Override
    public String toString()
    {
        return name;
    }

}
