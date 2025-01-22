package minji;

import java.util.Scanner;

public class Input {

    Scanner scanner = new Scanner(System.in);

    public Task addTodo(){
        String todo = scanner.nextLine();
        Task newTask = new Task(todo, false);
        return newTask;
    }

    public int updateTodo(){
        int updateNum = scanner.nextInt();
        return updateNum;
    }

    public int deleteTodo(){
        int taskNumber = scanner.nextInt();
        return taskNumber;
    }

    public int inputMenu() {
        int menu = scanner.nextInt();
        return menu;
    }

    public String inputName(){
        String name = scanner.next();
        return name;
    }

    public int selectNumber(){
        int number = scanner.nextInt();
        return number;
    }
}
