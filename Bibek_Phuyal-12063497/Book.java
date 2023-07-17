 /** Bibek Phuyal
 * Version (2012-12-21)
 * giving a description of class book
 */
public class Book //class declaration
{
    //declaration of instance variables
    private String description;//book name
    private String dateOfBorrow;//to check the date of book borrowed
    private String memberName;//to print the name of user
    private String dateOfReturn;
    private int numberofDays;
    private int DownPayment;
    private int dailyRate;
    private int totalRate;
    private boolean borrowed;

    /**
     * Method for passing parameter and initialization of instance variables for objects of class Book
     */
    public Book(String newDescription, int newDownPayment, int newDailyRate)//passing parameter
    {
        // initialization of instance variables
        description = newDescription;
        numberofDays = 0;//initializing number of days to 0
        DownPayment = newDownPayment;
        memberName = "";//passing null value
        dateOfBorrow = "";//passing null value
        dailyRate = newDailyRate;
        dateOfReturn = "";//passing null value
        borrowed = false;//passing boolean varible as false
        totalRate = 0;//initializing totalRate to 0
        
    }
    /**Return Method for initialized variables
     * 
     */ 
    public String getnewDescription(){
        return description;
    }
    
    public int getDownPayment(){
        return DownPayment;
    }    
    public String getDateOfBorrow(){
        return dateOfBorrow;
    }
    public String getDateOfReturn(){
        return dateOfReturn;
    }
    public int getDailyRate(){
        return dailyRate;
    }
    public int getNumberofDays(){
        return numberofDays;
    }
    public String getMemberName(){
        return memberName;
    }
    /**Set method for dailyrate and downpayment
     * 
     */
    public void setDailyRate(int newDailyRate){
        dailyRate = newDailyRate;
    }
    public void setDownPayment(int newDownPayment){
        DownPayment = newDownPayment;
    }
    /**for checking the borrowed status of book
     * Method when borrowed status is true and calculation of total rate
     */
    public void backBorrow(String newmemberName, String newdateOfBorrow, String newdateOfReturn, int newnumberofDays)//passing parameter inside the method
       {
        if (borrowed == true){
            System.out.println("We're sorry "+memberName+" the book "+description+" has already been issued. \nPlease return the book on "+dateOfReturn);
            //print statement when book is borrowed
        }
        else{
            //passing values
            memberName = newmemberName;
            dateOfBorrow = newdateOfBorrow;
            dateOfReturn = newdateOfReturn;
            numberofDays = newnumberofDays;
            borrowed = true;
            
            
        }
        totalRate = (dailyRate * numberofDays)+totalRate;//calculation of total rate
    }
    /**for checking the borrowed status of book
     * Method when borrowed status is false and calculation of total rate
     */
    public void returnBook(){
        if(borrowed == false){
            System.out.println("The Book "+description+" hasn't been borrowed.");//print statement when book is not borrowed
        }
        else{
            memberName = "";//passing null value
            numberofDays = 0;// initializing numberofDays to 0
            dateOfBorrow = "";//passing null value
            dateOfReturn = "";//passing null value
            borrowed = false;//passing false to boolean variable
        }
    }
    public void endDescription()
    //method for printing description and total rate of a book
    {
        System.out.println("The name of the book is: "+description);//for printitng the name of book
        System.out.println("It's total rate is: "+totalRate);//for printing total rate
    }
    
}
