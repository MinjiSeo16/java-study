package minji;

import java.util.Scanner;

public class updateList {
    public static void execute(){
        Scanner scanner = new Scanner(System.in);

        int isEmpty = listMemory.view();
        if(isEmpty != 0){
            System.out.println("상태를 수정할 번호를 선택해주세요: ");
            int updateNum = scanner.nextInt();
            listMemory.update(updateNum);
            System.out.println("상태를 수정하였습니다.");
        }
    }
}
