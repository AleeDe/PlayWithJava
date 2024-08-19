public class Book extends LibraryItem{
    private int numberOfPages;

    public Book(String title, String author, String ISBN,int numberOfPages) {
        super(title,author,ISBN);
        this.numberOfPages = numberOfPages;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "Book{"+
                    "title='" + getTitle() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", ISBN='" + getISBN() + '\'' +
                ", numberOfPages=" + numberOfPages +
                '}';
    }

    
    
}
