package minji;


public class Main {

    public static void main(String[] args) {

        Input input = new Input();
        Output output = new Output();
        MemoryStore memoryStore = new MemoryStore();

        Todo todo = new Todo(memoryStore, input, output);
        todo.run();
    }
}