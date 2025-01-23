package minji;

public class Output {

    public void showMenu(){
        System.out.println("[To-DO List]");
        System.out.println("1. 사용자 등록하기" + "\n"
                + "2. 사용자 선택하기" + "\n"
                + "3. 할 일 추가" + "\n"
                + "4. 할 일 보기" + "\n"
                + "5. 할 일 상태 수정하기" + "\n"
                + "6. 할 일 삭제하기" + "\n"
                + "7. 종료하기");
        System.out.println("원하는 번호를 선택해주세요: ");
    }

    public void printCreateTodo(){
        System.out.println("할 일을 입력해주세요: ");
    }

    public void updateNumber(){
        System.out.println("상태를 수정할 번호를 선택해주세요: ");
    }

    public void deleteNumber(){
        System.out.println("삭제할 일의 번호를 선택해주세요: ");
    }

    public void makeList(){
        System.out.println("님 할 일 목록 !!");
    }

    public void makeMark(){
        System.out.println("-------------");
    }

    public void goOut(){
        System.out.println("To-DO List를 종료합니다.");
    }

    public void printError(){
        System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
    }

    public void showEmptyList(){
        System.out.println("등록된 일이 없습니다.");
    }

    public void save(){
        System.out.println("저장되었습니다.");
    }

    public void update(){
        System.out.println("상태를 수정하였습니다.");
    }

    public void delete(){
        System.out.println("선택한 일을 삭제하였습니다.");
    }

    public void registerName(){
        System.out.println("등록할 사용사 이름을 입력해주세요: ");
    }

    public void selectName(){
        System.out.println("To-Do List 사용자 이름을 입력해주세요: ");
    }

    public void notFound(){
        System.out.println("해당 사용자를 찾을 수 없습니다.");
    }

    public void showEmptyUser(){
        System.out.println("등록된 사용자가 없습니다.");
    }
}
