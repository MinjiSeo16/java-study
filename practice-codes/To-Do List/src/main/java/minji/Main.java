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

        while(true){
            System.out.println("[To-DO List]");
            System.out.println("1. 할 일 추가" + "\n"
                    + "2. 할 일 보기" + "\n"
                    + "3. 할 일 상태 수정하기" + "\n"
                    + "4. 할 일 삭제하기" + "\n"
                    + "5. 종료하기");
            System.out.println("원하는 번호를 선택해주세요: ");

            int number = scanner.nextInt();
            switch(number){
                case ADD_TODO -> input.addTodo();
                case VIEW_TODO -> input.viewTodo();
                case UPDATE_TODO -> input.updateTodo();
                case DELETE_TODO -> input.deleteTodo();
                case EXIT -> System.out.println("To-DO List를 종료합니다.");
                default -> System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            }
        }
    }
}