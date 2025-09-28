package Projects.libraryManagement;

public class Book extends LibraryItem implements Borrowable{
    private String genre;
    private int pages;

    public Book(int id, String title, boolean isAvailable, String author,String genre, int pages) {
        super(id,title,isAvailable,author);
        this.genre = genre;
        this.pages = pages;
    }
    @Override
    public String displayInfo(){
        return "Book Id:"+getId()+"\nBook Title:"+getTitle()+"\nAuthor:"+getAuthor()+"\nGenere:"+genre;
    }

    @Override
    public void returnBook() {
        setAvailable(true);
    }
    @Override
    public void borrow() {
        setAvailable(false);
    }
}
