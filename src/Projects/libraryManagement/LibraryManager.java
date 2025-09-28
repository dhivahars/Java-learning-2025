package Projects.libraryManagement;

import java.util.ArrayList;

public class LibraryManager {
    static final double LATE_FEE=20;
    private ArrayList<LibraryItem> items=new ArrayList<>();;
    public void addItems(LibraryItem item){
        items.add(item);
        System.out.println(item.getTitle()+"has been added");
    }
    void removeItems(int id){
        LibraryItem toRemove=null;
        for (LibraryItem l:items){
            if(l.getId()==id){

                toRemove=l;
                break;
            }
        }
        if(toRemove!=null){items.remove(toRemove);
            System.out.println(toRemove.getTitle()+"is Removed");
        }
        else{
            System.out.println(toRemove.getTitle()+"is not Found");
        }
    }
    void removeItems(String title){
        LibraryItem toRemove=null;
        for (LibraryItem l:items){
            if(l.getTitle().equalsIgnoreCase(title)){

                toRemove=l;
                break;
            }
        }
        if(toRemove!=null){items.remove(toRemove);
            System.out.println(toRemove.getTitle()+" is Removed");
        }
        else{
            System.out.println(title+" is not Found");
        }
    }
    LibraryItem searchBook(String title){
        for(LibraryItem item:items){
            if (item.getTitle().equalsIgnoreCase(title)){
                System.out.println(item.getTitle()+" is found");
                return item;
            }

        }
        System.out.println("The"+title+"is not found");
        return null;
    }
    LibraryItem searchBook(int id){
        for(LibraryItem item:items){
            if(item.getId()==id){
                System.out.println(item.getTitle()+"is found");
                return item;
            }
        }
        System.out.println("No item Exist with id:"+id);
        return null;
    }
    void displayAllItem(){
        if(!items.isEmpty()){
            for(LibraryItem item:items){
                item.displayInfo();
            }
        }
        else{
            System.out.println("Library is Empty");
        }
    }
    public double getLateFee(int daysLate){
        return daysLate*LATE_FEE;
    }
}
