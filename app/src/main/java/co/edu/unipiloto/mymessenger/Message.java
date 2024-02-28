package co.edu.unipiloto.mymessenger;

public class Message {

    private String msg;
    private String user;

    public Message(String msg, String user) {
        this.msg = msg;
        this.user = user;
    }

    public String getMsg() {

        return msg;
    }

    public String getUser() {

        return user;
    }
}
