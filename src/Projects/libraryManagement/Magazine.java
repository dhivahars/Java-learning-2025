package Projects.libraryManagement;

public class Magazine extends LibraryItem implements Borrowable{
    private String edition;

    public Magazine(int id, String title, boolean isAvailable, String author, String edition) {
        super(id, title, isAvailable, author);
        this.edition = edition;
    }
    @Override
    public String displayInfo(){
        return "Book Id:"+getId()+"\nBook Title:"+getTitle()+"\nAuthor:"+getAuthor()+"\nEdition:"+edition;
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
