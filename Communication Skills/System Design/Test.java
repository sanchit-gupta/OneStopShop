import java.util.ArrayList;
import java.util.List;

class Test {

    public static void main(String args[]) {
        System.out.println("Hello World");

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");

        list.forEach(t -> {
            System.out.println(t);
        });
        
    }
}