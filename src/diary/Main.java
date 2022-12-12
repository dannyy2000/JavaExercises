package diary;

import java.util.Scanner;

public class Main {
    private  static  Diary diary;
    private static Scanner keyboardInput = new Scanner(System.in);
    public static void main(String[] args) {
        createDiary();
        displayLockMenu();

    }

    private static void createDiary(){
        String mainMain = """
                Welcome to my Diary!!!
                Let"s setup it up
                """;
        print(mainMain);
        String username =input("Enter your username");
        String password = input("Enter your password");
        diary = new Diary(username,password);
        print("Diary created for" + username);
    }

    private static void displayLockMenu() {
        String mainMenu = """
                 Press
                1 -> Unlock Diary
                2 -> Lock Diary
                3 -> Exit
                """;
        String userInput = input(mainMenu);
        switch (Integer.parseInt(userInput)){
            case 1 -> unlockDiary();
            case 2 -> lockDiary();
            case 3 -> exitApplication();
        }
    }

    private static void exitApplication() {
        print("Thanks for using our application");
        System.exit(0);
    }

    private static void lockDiary() {
        diary.lock();
        print("Locked successfully");
        displayLockMenu();

    }

    private static void unlockDiary() {
        String password = input("Enter correct password");
        diary.unlockWith(password);
        if(diary.isLocked()){print("Wrong password");displayLockMenu();}
        displayDiaryMenu();
    }

    private static void displayDiaryMenu() {
        String diaryMenu = """
                Press
                1 -> Create Entry
                2 -> Find Entry by Id
                3 -> Get total number of entries
                4 -> Lock diary
                5 -> Update diary
                6 -> Delete Entry
                """;
        String userInput = input(diaryMenu);
        switch ((Integer.parseInt(userInput))){
            case  1 -> CreateEntry();
            case 2 -> findById();
            case 3 -> getTotalNumberOfEntries();
            case 4 -> lockDiary();
//            case 5 -> UpdateEntry();
            case 6 -> DeleteEntry();
        }

    }

    private static void DeleteEntry() {
        String id = input("Enter the Id for the entry you want to update");

        Entry foundEntry = diary.findEntryWithId(Integer.parseInt(id));

        diary.deleteEntryWithId(Integer.parseInt(id));

        print("Id deleted successfully");
        displayLockMenu();
//
//

    }

    private static void getTotalNumberOfEntries() {
        int totalNumberOfEntry = diary.numberOfEntries();
        print("You have" + totalNumberOfEntry + "Entries");
        displayDiaryMenu();
    }

    private static void findById() {
        String id = input("Enter the Id for the entry you want to find");
        Entry foundEntry = diary.findEntryWithId(Integer.parseInt(id));
        print(foundEntry.toString());
        displayDiaryMenu();

    }

    private static void CreateEntry() {
        String title = input("Enter title for the entry");
        String body = input("Enter body for the entry");
        diary.write(title,body);
        print("Written successfully");
        displayDiaryMenu();
    }

//    private static void UpdateEntry(){
//        String id = input("Enter the Id for the entry you want to update");
//
//        Entry foundEntry = diary.findEntryWithId(Integer.parseInt(id));
//
//        if(foundEntry.equals(diary.findEntryWithId(Integer.parseInt(id))))
//            foundEntry.setTitle(input("What is the new title"));
//            foundEntry.setBody(input("Enter a new body"));
//            print("Entry updated successfully");
//            displayDiaryMenu();
//    }

    private static String input(String prompt){
        print(prompt);
        return keyboardInput.nextLine();
    }

    private static void print(String prompt){
        System.out.println(prompt);
    }
}
