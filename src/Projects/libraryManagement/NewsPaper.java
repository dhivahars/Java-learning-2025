package Projects.libraryManagement;

public class NewsPaper extends LibraryItem{
    private String dateOfIssue;

    public NewsPaper(int id, String title, boolean isAvailable, String author, String dateOfIssue) {
        super(id, title, isAvailable, author);
        this.dateOfIssue = dateOfIssue;
    }

    @Override
    public String displayInfo() {
        return "Book Id:"+getId()+"\nBook Title:"+getTitle()+"\nAuthor:"+getAuthor()+"\nDate of Issue:"+dateOfIssue;
    }
}
