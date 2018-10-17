package seedu.address.model;

import javafx.collections.ObservableList;
import seedu.address.model.book.Book;

/**
 * Unmodifiable view of an BookInventory
 */
public interface ReadOnlyBookInventory {

    /**
     * Returns an unmodifiable view of the persons list.
     * This list will not contain any duplicate persons.
     */
    ObservableList<Book> getBookList();

}
