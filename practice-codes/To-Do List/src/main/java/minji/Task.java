package minji;

public class Task {
    private String todo;
    private boolean isCheck;

    public Task(String todo, boolean isCheck){
        this.todo = todo;
        this.isCheck = isCheck;
    }

    public void setCheck(boolean isCheck){
        this.isCheck = isCheck;
    }

    public String getTask(){
        return todo;
    }

    public boolean isCheck(){
        return isCheck;
    }
}
