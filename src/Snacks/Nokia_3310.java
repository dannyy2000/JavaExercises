package Snacks;
import java.util.Scanner;
public class Nokia_3310 {

    Scanner input = new Scanner(System.in);

    public void mainMenu(){
        System.out.println("""
                1.PhoneBook
                2.Messages
                3.Chat
                4.CallRegister
                5.Tones
                6.Settings
                7.CallDivert
                8.Games
                9.Calculator
                10.Reminders
                11.Clock
                12.Profiles
                13.SimServices
                100.back
                00.SwitchOff
                """);

        System.out.print("Enter an option or 100 to go back: ");
        int option = input.nextInt();

        switch (option){
            case 1 -> phoneBook();
            case 2 -> messages();
            case 3 -> chat();
            case 4 -> callRegister();
            case 5 -> tones();
            case 6 -> settings();
            case 7 -> callDivert();
            case 8 -> games();
            case 9 -> calculator();
            case 10 -> reminders();
            case 11 -> clock();
            case 12 -> profiles();
            case 13 -> simServices();
            case 14 -> switchoff();

        }
    }


    private void phoneBook() {
        System.out.println("""
                phoneBook
                1.Search
                2.Service Nos.
                3.Add name
                4.Erase
                5.Edit
                6.Assign tone
                7.Send b'card
                8.Options
                9.Speed dials
                10.Voice tags
                100.back
                 """);

        System.out.println("Press any option or 100 to go back: ");
        int option = input.nextInt();

        switch(option){
            case 1 -> {
                System.out.println("Search your contacts");
                phoneBook();
            }
            case 2 -> {
                System.out.println("Service Nos");
                phoneBook();
            }
            case 3 -> {
                System.out.println("Add name");
                phoneBook();
            }
            case 4 -> {
                System.out.println("Erase contacts");
                phoneBook();
            }
            case 5 -> {
                System.out.println("Edit");
                phoneBook();
            }
            case 6 -> {
                System.out.println("Assign tone");
                phoneBook();
            }
            case 7 -> {
                System.out.println("Send b'card ");
                phoneBook();
            }
            case 8 -> opt8();
            case 9 -> {
                System.out.println("Speed dials");
                phoneBook();
            }
            case 10 -> {
                System.out.println("Voice tags");
                phoneBook();
            }
            case 100 -> mainMenu();
        }
    }

    private void opt8() {
        System.out.println("""
                Options
                1.Type of view
                2.Memory Status
                14.Switch off
                100.back
                """);

        System.out.println("enter any option and 100 to go back: ");
        int option = input.nextInt();

        switch (option){
            case 1 -> {
                System.out.println("Type of view");
                opt8();
            }
            case 2 -> {
                System.out.println("Memory Status");
                opt8();
            }
            case 100 -> mainMenu();
        }
    }

    private void messages() {
        System.out.println("""
                Messages
                1.Write messages
                2.inbox
                3.Outbox
                4.Picture messages
                5.Templates
                6.Smileys
                7.Message settings
                8.Info service
                9.Voice mailbox number
                10.Service command editor
                100.back
                """);

        System.out.println("enter an option or 100 to go back: ");
        int options = input.nextInt();

        switch (options){
            case 1 -> {
                System.out.println("Write messages");
                messages();
            }
            case 2 -> {
                System.out.println("Inbox");
                messages();
            }
            case 3 -> {
                System.out.println("Outbox");
                messages();
            }
            case 4 -> {
                System.out.println("Picture messages");
                messages();
            }
            case 5 -> {
                System.out.println("Templates");
                messages();
            }
            case 6 -> {
                System.out.println("Smileys");
                messages();
            }
            case 7 -> {
                messageSettings();
                messages();
            }
            case 8 -> {
                System.out.println("Info service");
                messages();
            }
            case 9 -> {
                System.out.println("Voice mailbox number");
                messages();
            }
            case 10 -> {
                System.out.println("Service command editor");
                messages();
            }
            case 100 -> mainMenu();
        }
    }

    private void messageSettings() {
        System.out.println("""
                Message settings
                1.Set
                2.Common
                14.Switch off
                100.back
                """);

        System.out.println("enter option or 100 to go back: ");
        int options = input.nextInt();

        switch (options){
            case 1 -> messageSet();
            case 2 -> messageCommon();
            case 100 -> messageSettings();
            default -> mainMenu();
        }
    }

    private void messageSet() {
        System.out.println("""
                Set
                1.Message centre number
                2.Messages sent as
                3.Message validity
                100.back
                """);

        System.out.println("enter an option or 100 to go back: ");
        int options = input.nextInt();

        switch (options){
            case 1 -> {
                System.out.println("Message centre number");
            }
            case 2 -> {
                System.out.println("Message sent as");
            }
            case 3 -> {
                System.out.println("Message validity");
            }
            case 100 -> messageSettings();
            default -> mainMenu();
        }
    }
    private void messageCommon() {
        System.out.println("""
                Common
                1.Delivery reports
                2.Reply via same centre
                3.Character support
                100.back
                """);

        System.out.println("enter any option or 100 to go back: ");
        int options = input.nextInt();

        switch (options){
            case 1 -> System.out.println("Delivery reports");
            case 2 -> System.out.println("Reply via same centre");
            case 3 -> System.out.println("Character support");
            case 100 -> messageSettings();
            default -> mainMenu();
        }
    }


    private void chat() {
        System.out.println("enter 100 to go back: ");
        int options = input.nextInt();

        switch (options){
            case 1 -> System.out.println("Chat");
            case 100 -> mainMenu();
        }

    }

    private void callRegister() {
        System.out.println("""
                Call register
                1.Missed calls
                2.Received calls
                3.Dialled numbers
                4.Erase recent call lists
                5.Show call duration
                6.Show call costs
                7.Call cost settings
                8.Prepaid credit
                100.back
                """);

        System.out.println("enter an option or 100 to go back: ");
        int options = input.nextInt();

        switch (options){
            case 1 -> {
                System.out.println("Missed calls");
                callRegister();
            }
            case 2 -> {
                System.out.println("Received calls");
                callRegister();
            }
            case 3 -> {
                System.out.println("Dialled numbers");
                callRegister();
            }
            case 4 -> {
                System.out.println("Erase recent call lists");
                callRegister();
            }
            case 5 -> {
                System.out.println("Show call duration");
                showCallDuration();
                callRegister();
            }
            case 6 -> {
                System.out.println("Show call costs");
                showCallCosts();
                callRegister();
            }
            case 7 -> {
                System.out.println("Call cost settings");
                callCostSettings();
                callRegister();
            }
            case 8 -> {
                System.out.println("Prepaid credit");
                callRegister();
            }
            case 100 -> mainMenu();

        }
    }

    private void showCallDuration() {
        System.out.println("""
                Show call duration
                1. Last call duration
                2.All calls' duration
                3.Received call's duration
                4.Dialled calls' duration
                5.Clear timers
                100.back
                """);

        System.out.println("enter option or 100 to go back: ");
        int options = input.nextInt();

        switch (options){
            case 1 -> System.out.println("Last call duration");
            case 2 -> System.out.println("All call's duration");
            case 3 -> System.out.println("Received call's duration");
            case 4 -> System.out.println("Dialled call's duration");
            case 5 -> System.out.println("Clear timers");
            case 100 -> callRegister();
            default -> mainMenu();
        }

    }

    private void showCallCosts() {
        System.out.println("""
                Show call costs
                1.Last call costs
                2.All calls' cost
                3.Clear counters
                100.back
                """);

        System.out.println("enter an option or 100 to go back: ");
        int options = input.nextInt();

        switch (options){
            case 1 -> System.out.println("Last call costs");
            case 2 -> System.out.println("All call's cost");
            case 3 -> System.out.println("Clear counters");
            case 100 -> callRegister();
            default -> mainMenu();
        }

    }
    private void callCostSettings() {
        System.out.println("""
                Call cost settings
                1.Call cost limit
                2.Show costs in
                100.back
                """);

        System.out.println("enter an option or 100 to go back : ");
        int options = input.nextInt();

        switch (options){
            case 1 -> System.out.println("Call cost limit");
            case 2 -> System.out.println("Show costs in");
            case 100 -> callRegister();
            default -> mainMenu();
        }
    }

    private void tones() {
        System.out.println("""
                Tones
                1.Ringing tone
                2.Ringing volume
                3.Incoming call alert
                4.Composer
                5.Message alert tone
                6.Keypad tones
                7.Warning and game tones
                8.Vibrating alert
                9.Screen saver
                14.Switch off
                100.back
                """);

        System.out.println("enter an option or 100 to go back: ");
        int options = input.nextInt();

        switch (options){
            case 1 -> {
                System.out.println("Ringing tone");
                tones();
            }
            case 2 -> {
                System.out.println("Ringing volume");
                tones();
            }
            case 3 -> {
                System.out.println("Incoming call alert");
                tones();
            }
            case 4 -> {
                System.out.println("Composer");
                tones();
            }
            case 5 -> {
                System.out.println("Message alert tone");
                tones();
            }
            case 6 -> {
                System.out.println("Keypad tones");
                tones();
            }
            case 7 -> {
                System.out.println("Warning and game tones");
                tones();
            }
            case 8 -> {
                System.out.println("Vibrating alert");
                tones();
            }
            case 9 -> {
                System.out.println("Screen saver");
                tones();
            }
            case 100 -> mainMenu();
        }
    }

    private void settings() {
        System.out.println("""
                Settings
                1.Call settings
                2.Phone settings
                3.Security settings
                4.Restore factory settings
                100.back
                """);

        System.out.println("enter an option or 100 to go back: ");
        int options = input.nextInt();

        switch (options){
            case 1 -> {
                callSettings();
                settings();
            }
            case 2 -> {
                phoneSettings();
                settings();
            }
            case 3 -> {
                securitySettings();
                settings();
            }
            case 4 -> {
                System.out.println("Restore factory settings");
                settings();
            }
        }
    }

    private void callSettings() {
        System.out.println("""
                Call settings
                1.Automatic redial
                2.Speed dialling
                3.Call waiting options
                4.Own number sending
                5.Phone line in use
                6.Automatic answer
                100.back
                """);

        System.out.println("enter 100 to go back: ");
        int options = input.nextInt();

        switch(options){
            case 1 -> {
                System.out.println("Automatic redial");
                callSettings();
            }
            case 2 -> {
                System.out.println("Speed dialling");
                callSettings();
            }
            case 3 -> {
                System.out.println("Call waiting options");
                callSettings();
            }
            case 4 -> {
                System.out.println("Own number sending");
                callSettings();
            }
            case 5 -> {
                System.out.println("Phone line in use");
                callSettings();
            }
            case 6 -> {
                System.out.println("Automatic answer");
                callSettings();
            }
            case 100 -> settings();
            default -> mainMenu();
        }
    }

    private void phoneSettings() {
        System.out.println("""
                Phone settings
                1.Language
                2.Cell info display
                3.Welcome note
                4.Network
                5.Lights
                6.Confirm SIM service actions
                100.back
                """);

        System.out.println("enter 100 to go back: ");
        int options = input.nextInt();

        switch (options){
            case 1 -> {
                System.out.println("Language");
                phoneSettings();
            }
            case 2 -> {
                System.out.println("Cell info display");
                phoneSettings();
            }
            case 3 -> {
                System.out.println("Welcome note");
                phoneSettings();
            }
            case 4 -> {
                System.out.println("Network selection");
                phoneSettings();
            }
            case 5 -> {
                System.out.println("Lights");
                phoneSettings();
            }
            case 6 -> {
                System.out.println("Confirm SIM service actions ");
                phoneSettings();
            }
            case 100 -> settings();
            default -> mainMenu();
        }
    }
    private void securitySettings() {
        System.out.println("""
                Security settings
                1.PIN code request
                2.Call barring service
                3.Fixed dialling
                4.Closed user group
                5.Phone security
                6.Change access codes
                100.back
                """);

        System.out.println("enter 100 to go back: ");
        int options = input.nextInt();

        switch (options){
            case 1 -> {
                System.out.println("Pin code request");
                securitySettings();
            }
            case 2 -> {
                System.out.println("Call barring service");
                securitySettings();
            }
            case 3 -> {
                System.out.println("Fixed dialling");
                securitySettings();
            }
            case 4 -> {
                System.out.println("Closed user group");
                securitySettings();
            }
            case 5 -> {
                System.out.println("Phone security");
                securitySettings();
            }
            case 6 -> {
                System.out.println("Change access codes");
                securitySettings();
            }
            case 100 -> settings();
            default -> mainMenu();
        }

    }
    private void callDivert() {
        System.out.println("enter 100 to go back: ");
        int options = input.nextInt();
        mainMenu();
    }

    private void games() {
        System.out.println("enter 100 to go back: ");
        int options = input.nextInt();
        mainMenu();
    }

    private void calculator() {
        System.out.println("enter 100 to go back: ");
        int options = input.nextInt();
        mainMenu();
    }

    private void reminders() {
        System.out.println("enter 100 to go back: ");
        int options = input.nextInt();
        mainMenu();
    }

    private void clock() {
        System.out.println("""
                Clock
                1.Alarm clock
                2.Clock settings
                3.Date setting
                4.Stopwatch
                5.Countdown
                6.Auto update of date and time
                14.Switch off
                100.back
                """);

        System.out.println("enter  100 to go back: ");
        int options = input.nextInt();

        switch (options){
            case 1 -> {
                System.out.println("Alarm clock");
                clock();
            }
            case 2 -> {
                System.out.println("Clock settings");
                clock();
            }
            case 3 -> {
                System.out.println("Date setting");
                clock();
            }
            case 4 -> {
                System.out.println("Stopwatch");
                clock();
            }
            case 5 -> {
                System.out.println("Countdown timer");
                clock();
            }
            case 6 -> {
                System.out.println("Auto update of date and time");
                clock();
            }
            case 100 -> mainMenu();
        }

    }

    private void profiles() {
        System.out.println("enter 100 to go back:");
        int options = input.nextInt();
        mainMenu();
    }
    private void simServices() {
        System.out.println("enter 100 to go back:");
        int options = input.nextInt();
        mainMenu();
    }

    public void switchoff(){
        System.out.println("Good bye!!!");
        int option = input.nextInt();
    }


}
