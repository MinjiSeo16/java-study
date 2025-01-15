package minji;

import java.util.Scanner;

public class deleteList {
    public static void execute(){
        Scanner scanner = new Scanner(System.in);

        int isEmpty = listMemory.view();
        if(isEmpty != 0) {
            System.out.println("삭제할 일의 번호를 선택해주세요: ");
            int updateNum = scanner.nextInt();
            listMemory.delete(updateNum);
            System.out.println("선택한 일을 삭제하였습니다.");
        }
    }
}
