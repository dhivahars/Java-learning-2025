package Projects.libraryManagement;

public abstract class LibraryItem {
    private int id;
    private String title;
    private String author;
    private boolean isAvailable;
    public void setAvailable(boolean available) {

        isAvailable = available;
    }

    public LibraryItem(int id, String title, boolean isAvailable, String author) {
        this.id = id;
        this.title = title;
        this.isAvailable = isAvailable;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public abstract String displayInfo();
}