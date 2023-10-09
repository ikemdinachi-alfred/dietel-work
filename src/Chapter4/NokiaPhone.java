package Chapter4;

import java.util.Scanner;

public class NokiaPhone {
    public static void NokiaMenu() {
        Scanner input = new Scanner(System.in);
            System.out.print("""
                                Menu  \s
                    **************************************           \s
                    *        1-> Phone book              *
                    *        2-> Messages                *
                    *        3-> Chat                    *
                    *        4-> Call Register           *
                    *        5-> Tones                   *
                    *        6-> Settings                *
                    *        7-> Call Divert             *
                    *        8-> Games                   *
                    *        9-> Calculator              *
                    *        10-> Reminders              *
                    *        11-> Clock                  *
                    *        12-> Profiles               *
                    *        13-> SIM services           *
                    **************************************        \s
                            
                    select options:   
                                            """);
            int userInput = input.nextInt();
            switch (userInput) {
                case 1:
                    System.out.println("""
                             Phone Book:
                             1-> Search
                             2-> Service Nos.
                             3-> Add name
                             4-> Erase
                             5-> Edit
                             6-> Assign tone
                             7-> Send b'card
                             8-> Option
                             9-> Speed dials
                             10-> Voice tags
                            """);
                    int userInput1 = input.nextInt();
                    switch (userInput1) {
                        case 1:
                            System.out.println(" Search Activated");
                            break;
                        case 2:
                            System.out.println(" Service Nos Activate");
                            break;
                        case 3:
                            System.out.println(" Add name Activated");
                            break;
                        case 4:
                            System.out.println(" Erase Activated ");
                            break;
                        case 5:
                            System.out.println(" Edit Activated");
                            break;
                        case 6:
                            System.out.println(" Assign tone Activated");
                            break;
                        case 7:
                            System.out.println(" end b'card is Activated");
                            break;
                        case 8:
                            System.out.println(" Option Activated");
                            System.out.println("""
                                    Option
                                    1-> Type of view
                                    2-> Memory Status
                                    """);
                            int userInput2 = input.nextInt();
                            switch (userInput2) {
                                case 1 -> System.out.println("Type of view Activated");
                                case 2 -> System.out.println("Memory Status Activated");
                                default -> System.out.println("sorry wrong input, try again.");
                            }
                        case 9:
                            System.out.println(" Speed dail activated ");
                            break;
                        case 10:
                            System.out.println("voice tag activated");
                            break;
                        default:
                            System.out.println("wrong input, try again!!");
                            break;
                    }
                case 2:
                    System.out.println("""
                            Message
                                                    
                            1-> Write messages
                            2-> Inbox
                            3-> Outbox
                            4-> Picture messages
                            5-> Templates
                            6-> Smileys
                            7-> Message settings
                            8-> info service
                            9-> Voice mailbox number
                            10. Service command editor
                                                    
                            Select option
                            """);
                    int userInput4 = input.nextInt();
                    switch (userInput4) {
                        case 1:
                            System.out.println("Write message...");
                            break;
                        case 2:
                            System.out.println(" welcome to inbox ");
                            break;
                        case 3:
                            System.out.println("Outbox Activated ");
                            break;
                        case 4:
                            System.out.println("picture message activated");
                            break;
                        case 5:
                            System.out.println("Templates mode is active ");
                            break;
                        case 6:
                            System.out.println("smileys activated ");
                            break;
                        case 7:
                            System.out.println("""
                                    Message setting
                                    1-> Set
                                    2-> Common
                                                                    
                                    select option
                                    """);
                            int message = input.nextInt();
                            switch (message) {
                                case 1:
                                    System.out.println("""
                                            Set1
                                            1-> Message Centre number
                                            2-> Message sent as
                                            3-> Message validity
                                                                                    
                                            select option:
                                                                                    
                                            """);
                                    int set = input.nextInt();
                                    switch (set) {
                                        case 1 -> System.out.println("Message Centre number");
                                        case 2 -> System.out.println("Message sent as ...");
                                        case 3 -> System.out.println("Message validity..");
                                        default -> System.out.println("Wrong entry try again ");
                                    }
                                case 2:
                                    System.out.println("""
                                            Common
                                            1-> Delivery report
                                            2-> Reply via same centre
                                            3-> Character Support
                                                                                    
                                            select Option
                                            """);
                                    int common = input.nextInt();
                                    switch (common) {
                                        case 1 -> System.out.println(" Delivery report..Activated");
                                        case 2 -> System.out.println("Reply via same centre..Activated");
                                        case 3 -> System.out.println("Character Support.. Activated");
                                        default -> System.out.println("Wrong input, try again");
                                    }
                            }
                        case 8:
                            System.out.println("info Service Activated");
                            break;
                        case 9:
                            System.out.println("Voice mailbox number Activated");
                            break;
                        case 10:
                            System.out.println("Service command editor Activated");
                        default:
                            System.out.println("Wrong input, try again later");
                            break;
                    }
                case 3:
                    System.out.println("Chart");
                    break;
                case 4:
                    System.out.println("""
                               Call register
                               
                            1-> Missed calls
                            2-> Received Calls
                            3-> Dialled numbers
                            4-> Erase recent call lists
                            5-> Show call duration
                            6-> Show call cost
                            7-> Call cost settings
                            8-> prepaid credit
                                                 
                                  select options
                               """);
                    int callRegister = input.nextInt();
                    switch (callRegister) {
                        case 1:
                            System.out.println(" Missed calls");
                            break;
                        case 2:
                            System.out.println(" Received calls");
                            break;
                        case 3:
                            System.out.println(" Dialled numbers");
                            break;
                        case 4:
                            System.out.println("Erase recent call list");
                            break;
                        case 5:
                            System.out.println("""
                                    Show call duration
                                                                    
                                    1-> last call duration
                                    2-> All call's duration
                                    3-> Received call's duration
                                    4-> Dialled calls duration
                                    5-> Clear timers
                                                                    
                                    select options
                                    """);
                            int showCallDuration = input.nextInt();
                            switch (showCallDuration) {
                                case 1 -> System.out.println(" last call duration");
                                case 2 -> System.out.println(" All call's duration ");
                                case 3 -> System.out.println(" Received call's duration");
                                case 4 -> System.out.println(" Dialled calls duration");
                                case 5 -> System.out.println("Clear timers");
                            }
                        case 6:
                            System.out.println("""
                                    Show call cost
                                    1-> Last call cost
                                    2-> All call's cost
                                    3-> Clear counters
                                                                    
                                    select option
                                                                    
                                    """);
                            int showCallCost = input.nextInt();
                            switch (showCallCost) {
                                case 1 -> System.out.println(" Last calls cost");
                                case 2 -> System.out.println(" All call's cost");
                                case 3 -> System.out.println(" Clear counters");
                            }
                        case 7:
                            System.out.println("""
                                    Call cost Settings
                                                                    
                                    1->call cost limit
                                    2-> Show  costs in
                                    """);
                            int callCostSetting = input.nextInt();
                            switch (callCostSetting) {
                                case 1 -> System.out.println(" calls cost limit");
                                case 2 -> System.out.println(" show costs in ");
                            }
                        case 8:
                            System.out.println(" prepaid credit");
                            break;
                    }
                case 5:
                    System.out.println("""
                            Tones
                            1->Ringing tone
                            2->Ringing Volume
                            3-> Incoming call alert
                            4-> Composer
                            5-> Message alert tone
                            6-> Keypad tones
                            7-> Warning and game tones
                            8-> Vibrating alert
                            9-> Screen saver
                                                    
                            select options
                            """);
                    int tones = input.nextInt();
                    switch (tones) {
                        case 1:
                            System.out.println(" Ringing tone");
                            break;
                        case 2:
                            System.out.println(" Ringing Volume");
                            break;
                        case 3:
                            System.out.println("Incoming call alert");
                            break;
                        case 4:
                            System.out.println(" composer ");
                            break;
                        case 5:
                            System.out.println("Message Message alert tone");
                            break;
                        case 6:
                            System.out.println("Keypad tones");
                            break;
                        case 7:
                            System.out.println(" Warning and game  tones");
                            break;
                        case 8:
                            System.out.println("Vibrating alert");
                            break;
                        case 9:
                            System.out.println("Screen saver");
                        default:
                            System.out.println("invalid input, try again ");
                    }
                case 6:
                    System.out.println("""
                            Setting
                                                    
                            1-> Call setting
                            2-> Phone setting
                            3-> security setting
                            4-> Restore factory settings
                                                    
                                select option
                            """);
                    int setting = input.nextInt();
                    switch (setting) {
                        case 1:
                            System.out.println("""
                                    Call setting
                                     
                                    1-> Automatic redial
                                    2-> Speed dialling
                                    3-> Call waiting options
                                    4-> Own number sending
                                    5-> Phone line in use
                                    6-> Automatic answer
                                    """);
                            int callSetting = input.nextInt();
                            switch (callSetting) {
                                case 1 -> System.out.println(" Automatic redial");
                                case 2 -> System.out.println(" speed dialling");
                                case 3 -> System.out.println(" Call waiting option");
                                case 4 -> System.out.println("Own number sending");
                                case 5 -> System.out.println("Phone line in use");
                                case 6 -> System.out.println("Automatic answer");
                            }
                        case 2:
                            System.out.println("""
                                    Phone Setting:
                                                                    
                                    1-> Language
                                    2-> Cell info display
                                    3-> Welcome note
                                    4-> Network selection
                                    5-> Lights
                                    6-> Confirm SIM service action
                                                                    
                                    """);
                            int phoneSetting = input.nextInt();
                            switch (phoneSetting) {
                                case 1 -> System.out.println(" language Active");
                                case 2 -> System.out.println("Cell info display");
                                case 3 -> System.out.println("Welcome");
                                case 4 -> System.out.println("Network selection");
                                case 5 -> System.out.println("Welcome to Lights");
                                case 6 -> System.out.println("Confirm SIM service action");
                                default -> System.out.println("wrong input try again later");
                            }
                        case 3:

                            System.out.println("""
                                    Security setting:
                                                                    
                                    1-> PIN code request
                                    2-> Call barring service
                                    3-> Fixed dialling
                                    4-> Closed user group
                                    5-> Phone Security
                                    6-> Change access codes
                                                                    
                                    """);
                            int security = input.nextInt();
                            switch (security) {
                                case 1 -> System.out.println(" PIN code request Active");
                                case 2 -> System.out.println("Call barring service");
                                case 3 -> System.out.println("Fixed dialling active");
                                case 4 -> System.out.println("Closed user group");
                                case 5 -> System.out.println("Phone security");
                                case 6 -> System.out.println("Change access code");
                                default -> System.out.println("wrong input try again later");
                            }
                        case 4:
                            System.out.println("Restore factory settings");
                            break;

                    }
                case 7:
                    System.out.println("Call divert");
                    break;
                case 8:
                    System.out.println("Games");
                    break;
                case 9:
                    System.out.println("Calculator");
                    break;
                case 10:
                    System.out.println("Reminders");
                    break;
                case 11:
                    System.out.println("""
                            Clock:
                            1-> Alarm clock
                            2-> Clock setting
                            3-> Date setting
                            4-> Stopwatch
                            5-> Countdown timer
                            6-> Auto update of date and time
                                                    
                            """);
                    int clock = input.nextInt();
                    switch (clock) {
                        case 1 -> System.out.println("Alarm clock");
                        case 2 -> System.out.println("Clock setting");
                        case 3 -> System.out.println("Date setting");
                        case 4 -> System.out.println("Stopwatch");
                        case 5 -> System.out.println("Countdown timer");
                        case 6 -> System.out.println("Auto update of date and time");
                    }
                case 12:
                    System.out.println("Profiles");
                    break;
                case 13:
                    System.out.println("SIM services");
                    break;
                default:
                    System.out.println("wrong Input, try again ");

            }

        }
    }


