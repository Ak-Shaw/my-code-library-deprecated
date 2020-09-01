class Main {
  public static void main(String [] args){
    ContactsManager myContactsManager = new ContactsManager();

    Contact arpana = new Contact();
    arpana.name = "Arpana Ray";
    arpana.email = "arpana@gmail.com";
    arpana.phoneNumber = "7980341540";

    myContactsManager.addContact(arpana);

    Contact manni = new Contact();
    manni.name = "Manni Bhaskar Mallik";
    manni.email = "manni@gmail.com";
    manni.phoneNumber = "9876543210";

    myContactsManager.addContact(manni);

    Contact prashant = new Contact();
    prashant.name = "Prashant Rawat";
    prashant.email = "prashant@gmail.com";
    prashant.phoneNumber = "0123456789";

    myContactsManager.addContact(prashant);

    Contact shahid = new Contact();
    shahid.name = "Md Shahid Mubashshir Mia";
    shahid.email = "mubbashirmia@gmail.com";
    shahid.phoneNumber = "9568543210";

    myContactsManager.addContact(shahid);

    Contact searchResult = myContactsManager.searchContact("Arpana Ray");

    if (searchResult != null) {
      System.out.println(searchResult.phoneNumber);
    } else {
      System.out.println("Not found");
    }
  }
}