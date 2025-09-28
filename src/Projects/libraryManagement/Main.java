package Projects.libraryManagement;

public class Main {
    public static void main(String[] args) {
        LibraryManager l=new LibraryManager();
        l.addItems(new Book(101,"Harry Potter",true,"Abcd","Comic",100));
        l.addItems(new Magazine(201,"Abbb",true,"abcd","2025"));
        l.addItems(new NewsPaper(1,"The Hindu",true,"aaa","22/09/25"));
        l.displayAllItem();
        l.removeItems(1);
        l.searchBook("abbb");
        System.out.println(l.getLateFee(10));
    }
}
