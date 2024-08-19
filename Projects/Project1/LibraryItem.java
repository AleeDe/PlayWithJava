public class LibraryItem{
    
    private String title;
    private String author;
    private String ISBN;


    public LibraryItem(String title, String author, String iSBN) {
        this.title = title;
        this.author = author;
        this.ISBN = iSBN;
    }


    public String getTitle() {
        return title;
    }


    public String getAuthor() {
        return author;
    }


    public String getISBN() {
        return ISBN;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public void setAuthor(String author) {
        this.author = author;
    }


    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

    
    


    
}