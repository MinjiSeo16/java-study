package minji;


public class Main {
    private static final int REWRITE = 1;
    private static final int SAVE = 2;

    public static void main(String[] args) {

        Input input = new Input();
        Output output = new Output();
        PersonMemory personMemory = new PersonMemory();

        while(true){
            output.printName();
            String name = input.inputName();
            Person person = new Person(name);

            if(!personMemory.contain(person)) {
                output.printNotFound();
                int number = input.selectNumber();

                if(number == REWRITE){
                    continue;
                }
                else if(number == SAVE){
                    ListMemory listMemory = new ListMemory();
                    personMemory.save(person,listMemory);
                    output.saveName();
                }
                else{
                    return;
                }
            }

            ListMemory listMemory = personMemory.getListMemory(person);
            Todo todo = new Todo(listMemory, input, output);
        }
    }
}