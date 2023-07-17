import java.util.ArrayList;
public class BookStore
{
    private ArrayList<Book>books;
    public BookStore()// constructor for creating an array list
    {
        books=new ArrayList<Book> ();
    }
        public void addBook (String description, int downPayment,int dailyRate)// add book to the array list 
        {
        Book book=new Book (description, downPayment, dailyRate);
        books.add(book);
        }
    public void removeBook (int index)// remove book from the array list
    {
            if (index > books.size()){
                System.out.println ("error in index number");
            }
            else if (index < 0) {
                System.out.println ("error in index number");
            }
            else 
                books.remove(index);
  } 
  
  public void rentBook (int index, String memberName, String dateOfBorrow, String dateOfReturn, int numberOfDays)// this method is for issuing book
  {
      if (index >=books.size()){
          System.out.println ("error in index number");
        }
        else if (index < 0) {
            System.out.println( "error in index number");
        }
        else{
            Book book = books.get(index);
            book.backBorrow (memberName, dateOfBorrow, dateOfReturn, numberOfDays);
        }
    }
    public void returnBook (int index)// this method is to return book to the book store
    {
        if (index>=books.size ()){
            System.out.println ("error in index number");
        }
        else if (index <0){
            System.out.println ("error in index number");
        }
        else{
            Book book= books.get(index);
            book.returnBook();
        }
    }
    public void bookList()// display list of book available in book store
    {
        int index= 0;
        System.out.println ("Books available in the book store are");
        for (Book book:books){
            String memberName = book.getMemberName();
            if (memberName == ""){ 
                System.out.println ("Book"+index+"=");
                book.endDescription();
            }
            index++;
        }
    }
        
     public void searchBook(String newDescription, double newDailyRate)// search the require book available in book store 
        {
            int index = 0;
            boolean found = false;
            int numberOfBooks = books.size ();
            while (index<numberOfBooks && !found){
                Book book = books.get(index);
                String memberName= book.getMemberName();
            String description= book.getnewDescription();
            double DailyRate= book.getDailyRate();
            if (memberName=="" && description == newDescription && DailyRate <= newDailyRate){
                found= true;
                System.out.println("Book"+index+"=");
                book.endDescription();
            }
            else{
                index++;
            }
            if (!found) {
                System.out.println("the book you need is currently not available");
            }
        }
    }
}



        
    
          
            
           
          
                   
    
    
    
    
    
    