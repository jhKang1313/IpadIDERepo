import java.util.*;

class MyList<T>{
    private List<T> list;

    public MyList(){
        this.list = new ArrayList<T>();
    }

    public void addItem(T item){
        this.list.add(item);
    }

    public void printList(){
        this.list.stream().forEach(item -> System.out.println(item));
    }
}