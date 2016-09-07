package seedu.addressbook.data.person;

/**
 * Represents a Peron's contact in the address book
 */

public class Contact {

    public final String value;
    private boolean isPrivate;
    
    public Contact(String contact, Boolean isPrivate) {
        this.isPrivate = isPrivate;
        this.value = contact.trim();
        
    }
    
    @Override
    public String toString() {
        return value;
    }
    
    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}
