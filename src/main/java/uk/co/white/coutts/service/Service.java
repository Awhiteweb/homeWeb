package uk.co.white.coutts.service;

import uk.co.white.coutts.data.Paint;
import uk.co.white.coutts.data.ToDo;
import uk.co.white.coutts.data.ToDoList;
import uk.co.white.coutts.data.User;

import java.util.LinkedList;
import java.util.List;

public class Service {

    private static List<Paint> paints;
    private static List<ToDoList> todoLists;
    private static User user;


    public static User getUser()
    {
        return user;
    }

    public static List<Paint> getPaints()
    {
        return paints;
    }

    public static List<ToDoList> getTodoLists()
    {
        return todoLists;
    }

    public static void setUser( User user )
    {
        Service.user = user;
    }

    public static void setPaints( List<Paint> paints )
    {
        Service.paints = paints;
    }

    public static void setTodoLists( List<ToDoList> todoLists )
    {
        Service.todoLists = todoLists;
    }

    public static void createData()
    {
        List<Paint> paints = new LinkedList<>();
        Paint paint = new Paint( "kitchen", "k12h234j8" );
        paints.add( paint );
        paint = new Paint( "kitchen", "k12h234j8" );
        paints.add( paint );
        paint = new Paint( "living room", "cc6786sdc" );
        paints.add( paint );
        paint = new Paint( "hall", "67ujhbvt6" );
        paints.add( paint );
        Service.setPaints( paints );

        List<ToDo> toDos = new LinkedList<>();
        ToDo todo = new ToDo( "go on holiday", false );
        toDos.add( todo );
        todo = new ToDo( "pack for holiday", false );
        toDos.add( todo );
        todo = new ToDo( "enjoy holiday", false );
        toDos.add( todo );
        todo = new ToDo( "eat breakfast", false );
        toDos.add( todo );
        todo = new ToDo( "eat lunch", false );
        toDos.add( todo );
        todo = new ToDo( "eat supper", false );
        toDos.add( todo );

        List<ToDoList> todoLists = new LinkedList<>();
        ToDoList list = new ToDoList( "holiday", toDos );
        todoLists.add( list );
        list = new ToDoList( "cleaning", toDos );
        todoLists.add( list );
        list = new ToDoList( "chilling", toDos );
        todoLists.add( list );
        list = new ToDoList( "party", toDos );
        todoLists.add( list );
        Service.setTodoLists( todoLists );
    }

}
