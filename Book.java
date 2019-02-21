class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;
    private boolean courseText;
    
    
    /* contructor */ 
    public Book(String bookAuthor, String bookTitle, int pages,
    String refNumber, int borrowed, boolean courseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = 150;
        refNumber = "";
        borrowed = 0;
        courseText = false;
        
    }

    public String printAuthor(){
        return author;
    }
    
    public String printTitle(){
        return title;
    }
    
    public int getPages(){
        return pages;
    }
    
    public String getRefNumber(){
        return refNumber;
    }
    
    
    public int getBorrowed(){
        return borrowed;
    }
    
    
    public void borrow(int bor) {
        if ( borrowed >= 0) {
            bor = borrowed;
            bor ++;
        }
    }    
    
    public boolean isCourseText(){
        return courseText;
    }
    
    
    public void printDetails(){ 
        if (refNumber != null && refNumber.length() > 0 ){
            System.out.println("The information you requested: " + "" + "Author: " + "" + author +" " + "Title: " + " " + title + " " + "Pages: " + " " +  pages + " " + "Amount of times borrowed: " + "" + borrowed + "" + "Reference Number: "  + "" + refNumber);
      }       
       else {
           System.out.println("The information you requested: "  + "" + "Author: " + "" + author + " " + "Title: " + " " + title +" " + "Pages: " + " " +  pages + " " + "Amount of times borrowed: " + "" + borrowed);
        
    }
}
    
    public void setRefNumber(String ref){
        if (refNumber != null && refNumber.length() >= 3) {
        ref = refNumber;
    }
     else {
            System.out.println("There is an error in what you entered, please use more than 3 letters.");
    }
 
    }
}
   
    
     
