import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> items;

    public Library(){
        this.items = new ArrayList<>();
    }

    public void addItem(Book item){
        items.add(item);
    }

    public void removeItem(Book item){
        items.remove(item);
    }

    public void listItems(){
        for(LibraryItem item : items){
            System.out.println(item);
        }
    }
}
