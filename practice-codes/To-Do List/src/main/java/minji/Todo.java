package minji;

import java.util.Optional;

public class Todo {

    private final MemoryStore memoryStore;
    private final Input input;
    private final Output output;
    private String currentName;

    public Todo(MemoryStore memoryStore, Input input, Output output){
        this.memoryStore = memoryStore;
        this.input = input;
        this.output = output;
    }

    public void run(){
        while(true){
            output.showMenu();
            int number = input.inputMenu();
            Optional<MenuNum> optionalMenu = MenuNum.fromValue(number);
            if(optionalMenu.isEmpty()){
                output.printError();
                continue;
            }
            MenuNum menu = optionalMenu.get();

            switch(menu){
                case REGISTER_USER -> {
                    output.registerName();
                    String name = input.inputName();
                    memoryStore.register(name);
                    output.save();
                }
                case SELECT_USER -> {
                    output.selectName();
                    String name = input.inputName();
                    if(memoryStore.existName(name)){
                        currentName = name;
                        output.selectName();
                    }
                    else{
                        output.notFound();
                    }
                }
                case ADD_TODO -> {
                    if(currentName == null){
                        output.showEmptyUser();
                        continue;
                    }
                    output.printCreateTodo();
                    Task newTask = input.addTodo();
                    memoryStore.save(currentName, newTask);
                    output.save();
                }
                case VIEW_TODO -> {
                    if(currentName == null){
                        output.showEmptyUser();
                        continue;
                    }
                    output.makeList();
                    output.makeMark();
                    boolean isEmpty = memoryStore.displayTasks(currentName);
                    if(isEmpty){
                        output.showEmptyList();
                    }
                    output.makeMark();
                }
                case UPDATE_TODO -> {
                    if(currentName == null){
                        output.showEmptyUser();
                        continue;
                    }
                    boolean isEmpty = memoryStore.displayTasks(currentName);
                    if(isEmpty){
                        output.showEmptyList();
                    }
                    else{
                        output.updateNumber();
                        int updateNum = input.updateTodo();
                        memoryStore.updateTask(currentName, updateNum);
                        output.update();
                    }
                }
                case DELETE_TODO -> {
                    if(currentName == null){
                        output.showEmptyUser();
                        continue;
                    }
                    boolean isEmpty = memoryStore.displayTasks(currentName);
                    if(isEmpty){
                        output.showEmptyList();
                    }
                    else{
                        output.deleteNumber();
                        int deleteNum = input.deleteTodo();
                        memoryStore.deleteTask(currentName, deleteNum);
                        output.delete();
                    }
                }
                case EXIT -> {
                    output.goOut();
                    return;
                }
                default -> output.printError();
            }
        }
    }
}
