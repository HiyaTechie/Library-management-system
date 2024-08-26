import java.util.*; // use for taking input from user
import java.time.LocalDate; // use to get the current date

// stores all the data of this library
class AllData {

    // int bookDetails = 5; // for indexing its 4.

    String[][] books = new String[40][];
    String[][] customer = new String[20][];

    // Books { book name 0, author name 1, price 2, published year 3, category 4}.

    AllData() {
        books[0] = new String[] { "Theoretical concepts in physics", "M.S. Longair", "810", "1986", "Physic" };
        books[1] = new String[] { "The Flying Circus of Physics", "Jearle Walker", "1120", " ", "Physic" };
        books[2] = new String[] { "The Feynman Lectures on Physics", "Richard P. Feynman", "568", "2012", "Physic" };
        books[3] = new String[] { "Brief History of Time", "Stephen Hawking", "698", "2011", "Physic" };
        books[4] = new String[] { "University Physics with Modern Physics", "Hugh D. Young", "951", "2015", "Physic" };
        books[5] = new String[] { "Fundamentals of Physics", "R. Shankar", "470", "2014", "Physic" };
        books[6] = new String[] { "Basic Physics", "Karl F. Kuhn", "1430", "1996", "Physic" };
        books[7] = new String[] { "The Elegant Universe", "Brian Greene", "380", "2010", "Physic" };
        books[8] = new String[] { "Physics of the Impossible", "Michio Kaku", "750", "2009", "Physic" };
        books[9] = new String[] { "Seven Brief Lessons on Physics", "Carlo Rovelli", "450", "2016", "Physic" };
        books[10] = new String[] { "The Fabric of the Cosmos", "Brian Greene", "885", "2005", "Physic" };
        books[11] = new String[] { "Everything You Always Wanted to Know About Physics", "Sterling Education", "1150"," 2019", "Physic" };
        books[12] = new String[] { "The Theoretical Minimum", "Leonard Susskind", "820", "2014", "Physic" };
        books[13] = new String[] { "Chemistry The Central Science", "Theodore E. Brown", "963", "2017", "Chemistry" };
        books[14] = new String[] { "The Disappearing Spoon", "Sam Kean", "370", "2011", "Chemistry" };
        books[15] = new String[] { "Elements", "Theodore Gray", "650", "2009", "Chemistry" };
        books[16] = new String[] { "Chemistry For Dummies", "John T. Moore", "482", "2016", "Chemistry" };
        books[17] = new String[] { "The Poisoner's Handbook", "Deborah Blum", "965", "2011", "Chemistry" };
        books[18] = new String[] { "Napoleon's Buttons", "Penny le Couteur", "1256", "2004", "Chemistry" };
        books[19] = new String[] { "The Periodic Table", "Primo Levi", "825", "1995", "Chemistry" };
        books[20] = new String[] { " ", " ", " ", " ", " " };
        books[21] = new String[] { " ", " ", " ", " ", " " };
        books[22] = new String[] { " ", " ", " ", " ", " " };
        books[23] = new String[] { " ", " ", " ", " ", " " };
        books[24] = new String[] { " ", " ", " ", " ", " " };
        books[25] = new String[] { " ", " ", " ", " ", " " };
        books[26] = new String[] { " ", " ", " ", " ", " " };
        books[27] = new String[] { "Organic Chemistry As a Second Language", "David R. Klein", "896", "2016", "Chemistry" };
        books[28] = new String[] { "Stuff Matters", "Mark Miodownik", "1146", "2014", "Chemistry" };
        books[29] = new String[] { "Molecules", "Theodore Gray", "1400", "2018", "Chemistry" };
        books[30] = new String[] { "Uncle Tungsten", "Oliver Sacks", "560", "2002", "Chemistry" };
        books[31] = new String[] { "Periodic Tales", "Hugh Aldersey-Williams", "390", "2012", "Chemistry" };
        books[32] = new String[] { "The Alchemy of Air", "Thomas Hager", "645", "2009", "Chemistry" };
        books[33] = new String[] { "Astronomy Hacks", "Robert Bruce Thompson", "952", "2005", "Chemistry" };
        books[34] = new String[] { " ", " ", " ", " ", " " };
        books[35] = new String[] { " ", " ", " ", " ", " " };
        books[36] = new String[] { " ", " ", " ", " ", " " };
        books[37] = new String[] { " ", " ", " ", " ", " " };
        books[38] = new String[] { " ", " ", " ", " ", " " };
        books[39] = new String[] { " ", " ", " ", " ", " " };


        for (String[] strings : books) { // initializing  every element from " " to "--"
            for (int correct = 0; correct < strings.length; correct++) {
                if (strings[correct].equals(" ")) {
                    strings[correct] = "--";
        }}}

        // [ customer name , customer mobile number, no. of book on rent ]

        for (int i = 0; i < customer.length; i++) { // initializing empty array for storing customer detail
            customer[i] = new String[] { " ", " ", " " };
        }

        for (String[] strings : customer) { // initializing  every element from " " to "--"
            for (int correct = 0; correct < strings.length; correct++) {
                if (strings[correct].equals(" ")) {
                    strings[correct] = "--";
        }}}
    }
}

// do all the exclusion of library for proper management
class LibraryStorage extends AllData {
    Scanner sc = new Scanner(System.in);
    final String Developer = "MOHIT JAYANTILAL SUTHAR";
    LocalDate date = LocalDate.now(); // creating object for date

    String bookName, authorName, bookYear, bookCategory; // variables declare for taking input
    int doNotDeleteInt;

    // conditions for found or not.
    boolean findORNot; // By default false.
    boolean finalCheck = true;

    void displayAll() { // prints all books details

        for (String[] strings : books) {
            if (!strings[0].equals("--")) { // if the slot do not have any book that slot will be ignored
                System.out.println();authorName = Developer;
                System.out.println("[ Name: "+strings[0]+" | Author: "+strings[1]+" | Price: "+strings[2]+" Rs"+" | Published: "+strings[3]+" | Category: "+strings[4]+" ]");
        }}
    }

    void showCustomerList() { //  prints all customer details
        System.out.println();
        for (String[] strings : customer) { //enhance for loop
            if (!strings[0].equals("--")) {// if the slot do not have any book that slot will be ignored
                System.out.println("[ Name: " + strings[0] + " | M_number: " + strings[1] + " | issued book: " + strings[2] + " ]");
        }}

        if (customer[0][0].equals("--")) { // if no customers detail have entered then say its empty
            System.out.println("This list is empty.");
        }
    }

    // Books { book name 0, author name 1, price 2, published year 3, category 4}.
    void makeSearch(String toFind, int x) {  // what to find , where to find
        for (String[] strings : books) {//enhance for loop
            if (strings[x].toLowerCase().contains(toFind.toLowerCase()) && !strings[0].equals("--")) { //if book details match and the book have it name
                System.out.println();
                System.out.println("[ Name: "+strings[0]+" | Author: "+strings[1]+" | Price: "+strings[2]+" Rs"+" | Published: "+strings[3]+" | Category: "+strings[4]+" ]");
                findORNot = true; // conform if the book found
            }
        }
    }

    void makeSearchByPrice(int low_limit, int high_limit) { // search book by price taking min and max price
        System.out.println();
        for (String[] strings : books) {//enhance for loop
            int price;

            if (!strings[2].equals("--")) { // check the book have its price
                price = Integer.parseInt(strings[2]);

                if (price >= low_limit && price <= high_limit) { // print book if its price lies in the range
                    System.out.println();
                    System.out.println("[ Name: "+strings[0]+" | Author: "+strings[1]+" | Price: "+strings[2]+" Rs"+" | Published: "+strings[3]+" | Category: "+strings[4]+" ]");
                    findORNot = true;// conform if the book found
                }
            }
        }
    }

    void notFount() { // print if not found the book
        System.out.println("\n~~~~~~~No-match-found~~~~~~~~");
    }

    boolean validInt(String s) { // check for only integer entered
        boolean condition = false;
        if (Developer.length()!=23){return false;}
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch < '0' || '9' < ch) {
                condition = false;
                break; // break if entry have non integer value
            } else {
                condition = true;
            }
        }
        return condition; // reply for valid integer entry
    }

    boolean validString(String s) {// check for only alphabet entered
        boolean condition = false;
        if (Developer.length()!=23){return false;}
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (((ch >= 'A' && 'Z' >= ch) || (ch >= 'a' && 'z' >= ch)) || ch == ' ') { // if alphabet and space found then good
                condition = true;
            } else {
                condition = false;
                break;  // if something else found, break
            }
        }
        return condition; // reply for valid String entry
    }

    void credit() { // do not change this part of program
        System.out.println("\nDeveloper : "+Developer+"\n" +
                            "Helper : HIYA SUNIL KAMDAR\n" +
                            "College : Lj University\n" +
                            "Project Start on : 16-JAN-2023\n" +
                            "Project Finish on : 16-FEB-2023\n"
        );
    }

    void checkForNot() { // only for (Developer)
        if (findORNot) {
            finalCheck = false;
        }
        if (finalCheck) {
            notFount();
            dataIndexNumber = -1;
        }

        findORNot = false;
        finalCheck = true;
    }

    int dataIndexNumber = -1;  // to get array index number
    boolean createBill; // condition for removing book process
    char conformingBook; // store y or n

    void searchByName(int mode) {  // search book by its name
        while (mode == 1) {
            System.out.print("\nEnter book name : ");
            bookName = sc.nextLine().trim(); // enter book name
            if (bookName.length() < 3) {
                System.out.println("Please enter at least 4 character for better search!");
            } else if (bookName.length() > 30) {
                System.out.println("Too much characters to search, limit is of 30 characters!");
            } else {
                makeSearch(bookName, 0); // if all good, call the method
                checkForNot(); // if book not found print a message
                mode = -1; // process complete ,then break the loop
            }
        }
        while (mode == 2) {
            System.out.print("\nEnter book name for rent : ");
            bookName = sc.nextLine().trim();  // enter book name
            if (bookName.length() < 7) {
                System.out.println("Please enter at least 7 character for better search!");
            } else if (bookName.length() > 50) {
                System.out.println("Too much characters to search, limit is of 50 characters!");
            } else {                                         // if all good, run the book issuing process
                for (String[] strings : books) {
                    dataIndexNumber++; // increase the index until match founds

                    if (strings[0].toLowerCase().contains(bookName.toLowerCase())) { // if match founds
                        verifyBook(); // display book details for verification
                        findORNot = true;

                        System.out.print("\nIs this the book you are finding? (y) or (n): ");
                        conformingBook = sc.next().toLowerCase().charAt(0);
                        sc.nextLine(); // next line

                        if (conformingBook == 'y' && findORNot) { // if yes
                            if (makeEntry()) { // take customer details
                                if (updateCustomerDetail()) { // save customer details in an array
                                    createBill = true; // give permission for final process
                                } else {
                                    System.out.println("\nCustomer details saving memory is full"); // if find problem in saving customer detail
                                }
                            }
                        } else if (conformingBook == 'n') {
                            dataIndexNumber = -1; // reset index number for next turn
                            System.out.println("\nPlease search again 0_0 ...");
                        } else {
                            dataIndexNumber = -1; // reset index number for next turn
                            System.out.println("Invalid input!");
                        }
                        break; // verifying process over ,then break the loop
                    }
                }
                checkForNot(); // print found status

                if (createBill) {
                    bill(); // call bill method to create bill for the customer
                    System.out.println("\nBill details is saved to server.");
                    if (removeBook()) { // if removing book gets done print a message
                        System.out.println("Book is removed successfully from shelf.");
                    }
                    createBill = false; // reset condition for next customer
                }
                mode = -1;// process complete ,then break the loop

            }
        }
        while (mode == 3) {
            System.out.print("\nEnter book name to remove : ");
            bookName = sc.nextLine().trim(); // enter book name
            if (bookName.length() < 7) {
                System.out.println("Please enter at least 7 character for better search!");
            } else if (bookName.length() > 50) {
                System.out.println("Too much characters to search, limit is of 50 characters!");
            } else {                                                // if all good, run book removing process
                for (String[] strings : books) {
                    dataIndexNumber++;  // increase the index until match founds

                    if (strings[0].toLowerCase().contains(bookName.toLowerCase())) {
                        verifyBook(); // display book details for verification
                        findORNot = true;

                        System.out.print("\nIs this the book you are finding? (y) or (n): ");
                        conformingBook = sc.next().charAt(0);
                        sc.nextLine(); // next line

                        if (conformingBook == 'y' && findORNot) {// if yes
                            createBill = true;  // give permission for removing process
                        } else if (conformingBook == 'n') {
                            dataIndexNumber = -1;// reset index number for next turn
                            System.out.println("\nPlease search again 0_0 ...");
                        } else {
                            dataIndexNumber = -1;// reset index number for next turn
                            System.out.println("Invalid input!");
                        }
                        break;// verifying process over ,then break the loop
                    }
                }
                checkForNot();  // print found status

                if (createBill) {
                    if (removeBook()) {     // if removing book gets done print a message
                        System.out.println("\nBook is removed successfully from shelf by Admin.");
                    }
                    createBill = false; // reset condition for next customer
                }
                mode = -1;// process complete ,then break the loop
            }
        }
    }

    void searchByAuthor() { // search book through author name
        while (true) {
            System.out.print("\nEnter book author : ");
            authorName = sc.nextLine().trim();  // enter book author's name
            if (authorName.length() < 3) {
                System.out.println("Please enter at least 4 character for better search!");
            } else if (authorName.length() > 30) {
                System.out.println("Too much characters to search, limit is of 30 characters!");
            } else {
                makeSearch(authorName, 1);// if all good, call the method
                checkForNot();// if book not found print a message
                break;// process complete ,then break the loop
            }
        }
    }

    void searchByPrice() {  // search book through its price
        String max_price, min_price; // getting ready with variables
        int maxPrice = -1, minPrice = 0;
        while (true) {
            System.out.println("\n~~~~~Enter a range for price~~~~~");
            System.out.println("~~~~~Maximum price is 9999~~~~~");
            System.out.print("\nEnter maximum price :");
            max_price = sc.nextLine().trim();  // Enter maximum price
            System.out.print("\nEnter minimum price (optional, enter 0 to skip): ");
            min_price = sc.nextLine().trim(); // Enter minimum price

            if (min_price.isEmpty()) {
                min_price = "0"; // if user skip set 0 as minimum price
            }

            if (validInt(max_price) && validInt(min_price) && max_price.length() < 5 && min_price.length() < 5) { // check for all valid conditions before converting to int
                maxPrice = Integer.parseInt(max_price);
                minPrice = Integer.parseInt(min_price);
            }
            if (maxPrice <= minPrice || maxPrice < 0 || minPrice < 0) { // if entry is wrong print a message
                System.out.println("Please enter the range properly for better search!");
            } else {
                makeSearchByPrice(minPrice, maxPrice); // call the method for process
                checkForNot(); // check found status
                break; // process complete ,then break the loop
            }
        }
    }

    void searchByYear() {
        while (true) {
            System.out.print("\nEnter book year : ");
            bookYear = sc.nextLine().trim(); // enter book year
            if (validInt(bookYear)){ // check for valid integer
                if (bookYear.length() != 4) { // if entry is wrong
                    System.out.println("Year should only be of 4 numbers!");
                } else {
                    makeSearch(bookYear, 3); //if all good call method for process
                    checkForNot();  // check found status
                    break;  // process complete ,then break the loop
                }
            }else{
                System.out.println("Year must be a number.");
            }
        }
    }

    void searchByCategory() {
        while (true) {
            System.out.print("\nEnter book category : ");
            bookCategory = sc.nextLine().trim(); // enter book category
            if (bookCategory.length() < 3) {
                System.out.println("Please enter at least 4 character for better search!");
            } else if (bookCategory.length() > 30) {
                System.out.println("Too much characters to search, limit is of 30 characters!");
            } else if (!validString(bookCategory)) {
                System.out.println("Only alphabet is allowed!");
            } else {
                makeSearch(bookCategory, 4);//if all good call search method for process
                if (findORNot) {
                    finalCheck = false;
                }
                if (finalCheck) {
                    System.out.println("\n~~~~~~~No-books-available~~~~~~~~");
                }

                findORNot = false;
                finalCheck = true;

                break;// process complete ,then break the loop
            }
        }
    }

    boolean removeBook() { // removes book from shelf
        Arrays.fill(books[dataIndexNumber], "--"); // replace book details with "--"
        dataIndexNumber = -1; // reset index number for next turn
        return true; // reply with good
    }

    boolean condition; // setting important condition

    boolean addBook(String name, String author, String price, String year, String category) { // adds book to the shelf
        for (String[] strings : books) {
            if (strings[0].equals("--")) {
                strings[0] = name; // setting name
                strings[1] = author;// setting author
                strings[2] = price;// setting price
                strings[3] = year;// setting year
                strings[4] = category;// setting category
                condition = true;break;
            } else {
                condition = false;
            }
        }
        return condition;
    }

    String customerName;
    String customerNumber;

    boolean updateCustomerDetail() { // saves customer details in the array
        boolean customerDataSaved = false; // set status to false
        for (String[] strings : customer) { // loop the list
            if (strings[0].equals("--")) { // find empty slot
                strings[0] = customerName;
                strings[1] = customerNumber;
                strings[2] = books[dataIndexNumber][0];
                System.out.println("\nCustomer details is successfully saved.");
                customerDataSaved = true; // update the status
                break; // exit loop after process complete
            }
        }
        return customerDataSaved;
    }

    String exitState = "ex";
    boolean makeEntry() { // takes customer details as entry to save in array
        boolean entryGood = false;
        int wrongEnters = 0; // setting count for wrong entry
        System.out.println("\nPlease make all the necessary enters.\n(ex) to cancel process.");
        while (true) {
            System.out.print("\nEnter your name: ");
            customerName = sc.nextLine().trim(); // enter customer name
            if (customerName.equalsIgnoreCase(exitState)) {
                System.out.println("Entry process is canceled."); return false;
            }
            System.out.print("\nEnter your phone number: ");
            customerNumber = sc.nextLine().trim(); // enter customer phone number
            if (customerNumber.equalsIgnoreCase(exitState)) {
                System.out.println("Entry process is canceled."); return false;
            }
            if (wrongEnters > 4) {  // allow up to only 4 chance
                System.out.println("You entered too much wrong entries.");
                dataIndexNumber = -1; break;
            }

            if (validString(customerName)) { // check for valid name
                if (customerName.contains("  ") || customerName.contains("   ") || customerName.contains("    ")) {
                    System.out.println("Your name contain unnecessary extra spaces.");
                } else if (customerName.length() > 20) {
                    System.out.println("Name is too long(enter at last 20 character).");
                } else if (customerName.length() < 4) {
                    System.out.println("Name is too short(enter at least 4 character).");
                } else if (validInt(customerNumber)) { // check for valid number
                    if (customerNumber.contains("  ") || customerNumber.contains("   ") || customerNumber.contains("    ")) {
                        System.out.println("Your mobile number contain unnecessary extra spaces.");
                    } else if (customerNumber.length() != 10) {
                        System.out.println("Mobile number should be only on 10 digits.");
                    } else {
                        System.out.println();
                        entryGood = true;
                        break;
                    }
                } else { // if invalid number
                    System.out.println("Phone number should only have numbers.");
                }
            } else { // if invalid name
                System.out.println("Name should not have numbers.");
            }
            wrongEnters++; // count number of wrong entries
        }
        return entryGood;
    }

    void verifyBook() {  // prints temporary book details
        System.out.println("\n~~~~~~~Please-verify-the-book~~~~~~~" +
                        "\n\n+------------------------------------" +
                        "\n|   Book name :" + books[dataIndexNumber][0] +
                        "\n|   Book author : " + books[dataIndexNumber][1] +
                        "\n|   Book price : " + books[dataIndexNumber][2] +
                        "\n|   Book publish year : " + books[dataIndexNumber][3] +
                        "\n|   Book category : " + books[dataIndexNumber][4] +
                        "\n+------------------------------------");
    }

    void bill() { // generating bill after customer conformation
        System.out.println("\n+~~~~~~~~~~~~~~Bill~~~~~~~~~~~~~~~~~");
        System.out.println("|" +"\n+~~~Give-this-bill-to-library-assistant~~~~" +"\n|" +
                        "\n+---------------------------------------" +
                        "\n|   Date : " + date +
                        "\n|   Name : " + customerName +
                        "\n|   M_number : " + customerNumber +
                        "\n|" +
                        "\n|   Book name : " + books[dataIndexNumber][0] +
                        "\n|   Book author : " + books[dataIndexNumber][1] +
                        "\n|   Book price : " + books[dataIndexNumber][2] +
                        "\n|   Book publish year :" + books[dataIndexNumber][3] +
                        "\n|   Book category :" + books[dataIndexNumber][4] +
                        "\n|" +"\n+----------------------------------------");
    }

    String searchOption, issueBookOption;

    void searchBook(String user) { // Search menu
        while (true) {
            System.out.println("\n\t\t\tSearch books {" + user + "}\n\n");
            if (Developer.length()!=23){doNotDeleteInt = Integer.parseInt(Developer);}
            System.out.println("1) Show all books\n" + "2) search by book name\n" +
                            "3) search by book's author\n" + "4) search by book price\n" +
                            "5) search by published year\n" + "6) search by book category\n" +
                            "0) Back To Menu.\n");
            System.out.print("Enter option number to preform that action : ");
            searchOption = sc.nextLine().trim();

            if (validInt(searchOption)) {
                if (searchOption.equals("0")) {break;}
                switch (searchOption) {
                    case "1": {displayAll();break;}
                    case "2": {searchByName(1);break;}
                    case "3": {searchByAuthor(); break;}
                    case "4": {searchByPrice(); break;}
                    case "5": {searchByYear(); break;}
                    case "6": {searchByCategory(); break;}
                    default: {System.out.println("Option number not found, enter from these options only.");}
                }
            } else {
                System.out.println("~~Please-enter-number-only-!~~");
                searchOption = "-1";
            }
        }
    }

    void issueBook() { // menu for issuing book
        while (true) {
            System.out.println("\n\t\t\tFind the book\n"); // option 1
            if (Developer.length()!=23){return ;}
            System.out.println("1) issue by book name\n" + "0) Back To Menu.\n");
            System.out.print("Enter number to preform that action : ");
            issueBookOption = sc.nextLine();

            if (!validInt(issueBookOption)) { // check for valid entry
                System.out.println("~~Please-enter-number-only-!~~");
            } else {
                if (issueBookOption.equals("0")) {
                    System.out.println(); break;
                }

                if ("1".equals(issueBookOption)) {
                    searchByName(2);
                } else {
                    System.out.println("Option number not found, enter from these options only.");
                }
            }
            issueBookOption = "-1";
        }
    }
}

// handles all admin accesses
class Admin {
    Scanner sc = new Scanner(System.in);

    String adminPin = "1245"; // admin  login pin

    LibraryStorage ls; // declaring object
    Admin(LibraryStorage lst) {
        ls = lst;
    } // giving path address from main method

    int wrongPassCount;
    void login() { // login method for admin

        System.out.print("\nAdmin please enter your login pin : ");
        String loginPass = sc.nextLine().trim(); // enter pin for entry
        if (ls.validInt(loginPass)) { // check for valid entry
            if (loginPass.length() != 4) {
                System.out.println("Pin must be of 4 digit only!");
            } else if (!loginPass.equals(adminPin)) {
                System.out.println("Wrong pin!");
                wrongPassCount++;
                if (wrongPassCount == 3) {
                    System.out.println("Last chance to login.");
                }
                if (wrongPassCount == 4) {
                    System.out.println("Admin login is lock for 1 hours.");
                    wrongPassCount = 0;
                }
            } else {
                System.out.println("Login-successful.");
                adminAccess();
            }
        } else {
            System.out.println("\nThe pin must be only number (character and symbol are not allowed).");
        }
    }

    String newPin, currentPin;
    String exitState = "ex";
    void resetPass() {
        System.out.println("Enter ( ex ) to cancel the process.");
        while (true) {
            System.out.print("\nEnter current Pin : ");
            currentPin = sc.nextLine().trim();
            System.out.print("\nEnter new Pin : ");
            newPin = sc.nextLine().trim();

            if (currentPin.equalsIgnoreCase(exitState) || newPin.equalsIgnoreCase(exitState)) {
                System.out.println("Reset pin process is canceled."); return; }

            if (ls.validInt(newPin) && ls.validInt(currentPin)) {
                if (newPin.length() != 4 || currentPin.length() != 4) {
                    System.out.println("Pin must be of 4 digit only!");
                } else if (!currentPin.equals(adminPin)) {
                    System.out.println("Current Pin not matched!"); return;
                } else {
                    System.out.println("Pin successfully changed.");
                    adminPin = newPin; break;
                }
            } else {
                System.out.println("Pin must be numbers only!");
            }
        }
    }

    void add_book() {
        String addBookName, addBookAuthor, addBookPrice, addBookYear, addBookCategory; // variables for book detail input

        System.out.println("\n~~~~~~~~~~Add-Book~~~~~~~~~~");
        System.out.println("\nEnter ( ex ) to canal add book process.");
        while (true) {
            System.out.print("\nEnter book name : ");
            addBookName = sc.nextLine().trim();
            if (addBookName.equalsIgnoreCase(exitState)) {
                System.out.println("Add book process is canceled."); return;
            }
            if (!ls.validString(addBookName)) {
                System.out.println("Name do not have number in it.");
            } else if (addBookName.length() < 11) {
                System.out.println("Name is too short( at least 10 character )!");
            } else if (addBookName.length() > 50) {
                System.out.println("Name is too long to store( maximum 50 character )!");
            } else {break;}
        }
        while (true) {
            System.out.print("\nEnter book Author's name : ");
            addBookAuthor = sc.nextLine().trim();
            if (addBookAuthor.equalsIgnoreCase(exitState)) {
                System.out.println("Add book process is canceled."); return;
            }
            if (!ls.validString(addBookAuthor)) {
                System.out.println("Name do have number in it.");
            } else if (addBookAuthor.length() < 4) {
                System.out.println("Name is too short( at least 4 character )!");
            } else if (addBookAuthor.length() > 30) {
                System.out.println("Name is too long to store( maximum 30 character )!");
            } else {break;}
        }
        while (true) {
            System.out.print("\nEnter book Price : ");
            addBookPrice = sc.nextLine().trim();
            if (addBookPrice.equalsIgnoreCase(exitState)) {
                System.out.println("Add book process is canceled."); return;
            }
            if (!ls.validInt(addBookPrice)) {
                System.out.println("Price must be a number!");
            } else if (addBookPrice.length() > 4) {
                System.out.println("Book do not have high price!");
            } else {break;}
        }
        while (true) {
            System.out.print("\nEnter book Year : ");
            addBookYear = sc.nextLine().trim();
            if (addBookYear.equalsIgnoreCase(exitState)) {
                System.out.println("Add book process is canceled."); return;
            }
            if (!ls.validInt(addBookYear)) {
                System.out.println("Years should only have numbers!");
            } else if (addBookYear.length() != 4) {
                System.out.println("Year only have 4 digit!");
            } else {break;}
        }
        while (true) {
            System.out.print("\nEnter book Category : ");
            addBookCategory = sc.nextLine().trim();
            if (addBookCategory.equalsIgnoreCase(exitState)) {
                System.out.println("Add book process is canceled."); return;
            }
            if (!ls.validString(addBookCategory)) {
                System.out.println("Category do have number in it!");
            } else if (addBookCategory.length() < 4) {
                System.out.println("Category is too short( at least 4 character )!");
            } else if (addBookCategory.length() > 30) {
                System.out.println("Category is too long to store( maximum 30 character )!");
            } else {break;}
        }

        if (ls.addBook(addBookName, addBookAuthor, addBookPrice, addBookYear, addBookCategory)) { //after all proper checks place the book details at shelf
            System.out.println("The book is successfully placed at shelf.");
        } else {
            System.out.println("The book is not placed at shelf.");
        }

    }

    void remove_book() {
        ls.searchByName(3); //call method to remove
    }

    void checkCustomer() {
        System.out.println("\n~~~~All-customer-till-now~~~~~");
        ls.showCustomerList(); // call method to print customer
    }

    String adminMenuOption;

    void adminAccess() {
        while (true) {
            System.out.println("\n~~~~~~~Admin-Menu~~~~~~~");
            System.out.println("1) reset password\n" + "2) add book\n" + "3) remove book\n" +
                            "4) check customer list\n" + "5) search book\n" + "0) Logout\n");
            System.out.print("Enter option number to perform that action: ");
            adminMenuOption = sc.nextLine();
            if (ls.validInt(adminMenuOption)) {
                if (adminMenuOption.equals("0")) {break;}

                switch (adminMenuOption) {
                    case "1": {resetPass();break;}
                    case "2": {add_book();break;}
                    case "3": {remove_book();break;}
                    case "4": {checkCustomer();break;}
                    case "5": {ls.searchBook("Admin");break;}
                    default: {System.out.println("Option number not found.");}
                }
            } else {System.out.println("~~Please-enter-number-only-!~~"); }
        }
        System.out.println("logout successful.\n");
    }
}

// The program starts from her
class Library {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~Welcome~to~Library~System~~~~~~~~~~~~~");

        // Object creation for classes.
        LibraryStorage ls = new LibraryStorage();
        Admin admin = new Admin(ls);   // Matching same object path

        while (true) {
            System.out.println("\n\t\t\tMain menu\n");
            System.out.println( "1) search books\n" +  "2) issue books\n" +
                    "3) Admin login\n" + "4) Credit\n" + "0) Exit Library.\n");
            System.out.print("Enter option number to preform that action : ");
            String menuOption = sc.nextLine();
            if (!ls.validInt(menuOption)) {
                System.out.println("~~Please-enter-number-only-!~~");
            } else {

                if (menuOption.equals("0")) {break;}

                switch (menuOption) {
                    case "1": {ls.searchBook("customer");break;}
                    case "2": {ls.issueBook();break;}
                    case "3": {admin.login();break;}
                    case "4": {ls.credit();break;}
                    default: {System.out.println("Option number not found.");}
                }
            }
        }
        System.out.println();
        ls.credit();
        System.out.println("\n~~~~~~~~  THANK YOU  ~~~~~~~~~");
    }
}