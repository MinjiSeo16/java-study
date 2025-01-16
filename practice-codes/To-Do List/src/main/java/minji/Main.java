package minji;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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
                case 1:
                    AddTask.execute();
                    break;
                case 2:
                    ViewTodo.execute();
                    break;
                case 3:
                    UpdateTodo.execute();
                    break;
                case 4:
                    DeleteTask.execute();
                    break;
                case 5:
                    System.out.println("To-DO List를 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            }
        }
    }
}