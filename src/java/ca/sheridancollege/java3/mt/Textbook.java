package ca.sheridancollege.java3.mt;

public class Textbook {
    
    private String title = "Cocaine Blues";
    private double price = 20.0;
    private Subject subject = Subject.valueOf("PROGRAMMING");
    
    /**
     * Constructs a default Textbook object.
     */
    public Textbook() {
        
    }
    
    /**
     * Constructs a Textbook book with programmer-specified title, price,
     * and subject.
     * 
     * @param title programmer-specified title
     * @param price programmer-specified price
     * @param subject programmer-specified subject
     */
    public Textbook(String title, double price, Subject subject) {
        setTitle(title);
        setPrice(price);
        setSubject(subject);
    }
    
    /**
     * Returns this Textbook's title.
     * @return title
     */
    public String getTitle(){
        return this.title;
    }
    
    /**
     * Returns this Textbook's price.
     * @return price
     */
    public double getPrice() {
        return this.price;
    }
    
    /**
     * Returns this Textbook's Subject Enum
     * @return subject
     */
    public Subject getSubject() {
        return this.subject;
    }
    
    /**
     * Places a valid value in this Textbook's title which must be not be empty
     * otherwise an IAE is thrown.
     *
     * @param title programmer-specified title
     * @throws IllegalArgumentException
     */
    public void setTitle(String title) throws IllegalArgumentException {
	// make sure the title isn't empty, otherwise exception occurs
	if (title == null || title.trim().isEmpty()) {
            // throw an IAE with a message that the email field is empty
            throw new IllegalArgumentException("Error: title must not be "
                    + "empty.");
        }
	else {
            // title is ok		
            this.title = title;
	}
    }
    
    /**
     * Places a valid value in this Textbook's price which must be
     * zero or higher.
     * 
     * @param price programmer-specified price
     * @throws IllegalArgumentException 
     */
    public void setPrice(double price) throws IllegalArgumentException {
        // ensure that the price is 0 or higher
        if (price >= 0) {
            this.price = price;
        }
        else {
            throw new IllegalArgumentException("Error: price must be zero or "
                    + "higher.");
        }
    }
    
    /**
     * Places a valid value in this Textbook's subject.
     * @param subject 
     */
    public void setSubject(Subject subject) {
        this.subject = subject;
    }
    
}
