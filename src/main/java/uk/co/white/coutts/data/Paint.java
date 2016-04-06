package uk.co.white.coutts.data;

/**
 * Created by Alex on 12/03/2016.
 */
public class Paint {

    private String room;
    private String code;

    public Paint(){}
    public Paint( String room, String code )
    {
        this.room = room;
        this.code = code;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString()
    {
        return String.format( "Room: %s, Code: %s", room, code );
    }

}
