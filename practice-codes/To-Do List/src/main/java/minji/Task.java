package minji;

public class Task {
    private String toDo;
    private boolean check;

    public Task(String toDo, boolean check){
        this.toDo = toDo;
        this.check = check;
    }

    public void setCheck(boolean check){
        this.check = check;
    }

    public String getTask(){
        return toDo;
    }

    public boolean getCheck(){
        return check;
    }
}
