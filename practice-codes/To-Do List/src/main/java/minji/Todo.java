package minji;

public class Todo {

    public void run(){
        ListMemory listMemory = new ListMemory();
        Input input = new Input();
        Output output = new Output();

        while(true){
            output.showMenu();
            int number = input.InputMenu();
            MenuNum menu = MenuNum.fromValue(number);
            switch(menu){
                case ADD_TODO -> {
                    output.printCreateTodo();
                    Task newTask = input.addTodo();
                    listMemory.save(newTask);
                    output.save();
                }
                case VIEW_TODO -> {
                    output.makeList();
                    output.makeMark();
                    boolean isEmpty = listMemory.displayTasks();
                    if(isEmpty) output.showEmptyList();
                    output.makeMark();
                }
                case UPDATE_TODO -> {
                    boolean isEmpty = listMemory.displayTasks();
                    if(isEmpty) output.showEmptyList();
                    else{
                        output.updateNumber();
                        int updateNum = input.updateTodo();
                        listMemory.updateTask(updateNum);
                        output.update();
                    }
                }
                case DELETE_TODO -> {
                    boolean isEmpty = listMemory.displayTasks();
                    if(isEmpty) output.showEmptyList();
                    else{
                        output.deleteNumber();
                        int deleteNum = input.deleteTodo();
                        listMemory.deleteTask(deleteNum);
                        output.delete();
                    }
                }
                case EXIT -> output.goOut();
                default -> output.printError();
            }
        }
    }
}
