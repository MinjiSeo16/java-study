package minji;

import java.util.Scanner;

public class Main {
    private static final int ADD_TODO = 1;
    private static final int VIEW_TODO = 2;
    private static final int UPDATE_TODO = 3;
    private static final int DELETE_TODO = 4;
    private static final int EXIT = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListMemory listMemory = new ListMemory();
        Input input = new Input(listMemory);
        Output output = new Output();

        while(true){
            output.showMenu();
            int number = scanner.nextInt();
            switch(number){
                case ADD_TODO -> input.addTodo();
                case VIEW_TODO -> input.viewTodo();
                case UPDATE_TODO -> input.updateTodo();
                case DELETE_TODO -> input.deleteTodo();
                case EXIT -> output.goOut();
                default -> output.printError();
            }
        }
    }
}