package solid;

//Example (Before SRP)
class Invoice {
    public void calculateTotal() {
        // Calculate the total of the invoice
    }

    public void printInvoice() {
        // Print the invoice
    }

    public void saveToDatabase() {
        // Save the invoice to the database
    }
}


//Example (After SRP)

class Invoice1 {
    public void calculateTotal() {
        // Calculate the total of the invoice
    }
}

class InvoicePrinter {
    public void print(Invoice invoice) {
        // Print the invoice
    }
}

class InvoiceRepository {
    public void save(Invoice invoice) {
        // Save the invoice to the database
    }
}





public class SingleResponsiblity {
    public static void main(String[] args) {
        //Definition: A class should have one and only one reason to change. It should focus on a single responsibility.
        /*  checked before and after class
        *
            before class violates SRP because it handles:
            Business logic (calculation).
            Presentation logic (printing).
            Persistence logic (saving).
        *   Each class has a single responsibility.
        * */
    }
}
