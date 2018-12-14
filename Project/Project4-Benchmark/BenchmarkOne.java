import java.util.Scanner;
import java.util.ArrayList;
import java.lang.String;
public class BenchmarkOne
{
    String firstName;
    String middleName;
    String lastName;
    public static int stuNumber;
    public static double gpa;
    public static void main(String args[]){

        ArrayList studentList = new ArrayList( );
        ArrayList studentReplace = new ArrayList( );
        ArrayList studentName = new ArrayList( ); //Okay dana don't forget this or i will kill you, add this plus student name, gpa, and ID to make one entry in student list, then clear each array
        ArrayList studentNumber = new ArrayList( ); //Insert spiderman meme of threatening self here
        ArrayList studentGpa = new ArrayList( );
        String name = "";
        Scanner scanner1 = new Scanner(System.in); 
        System.out.println("Please enter a number 1-6:");
        System.out.println("1: Enter Student");
        System.out.println("2: Delete Student From List");
        System.out.println("3: Review Student List");
        System.out.println("4: Erase Student List");
        System.out.println("5: Edit Student on List");
        System.out.println("6: Print Student on List");
        boolean FirstMiddleLast = false;
        boolean LastFirstMiddle = false;
        boolean LastFirst = false;
        boolean scannerNameComplete = false;
        boolean scannerNumberComplete = false;
        boolean scannerGPAComplete = false;
        boolean scannerOver = false;
        //Let the spaghetti code begin
        if (scanner1.nextInt() ==1){
            System.out.println("Please enter student name");
            if (scanner1.nextInt() !=1){ //50% chance of working, meant to make sure other statements don't go, otherwise the string is only looking for the entry "1"
                scannerOver = true;
                for(int i = 0; i <1; i++){ //makes statement keep going until valid response
                    if (scanner1.nextLine().length()<=0){//like right here, it wouldn't understand a name hasn't been inputted, and it would take as an invalid value
                        System.out.println("Invalid response, please re enter");
                    }
                    else if (scanner1.nextLine().length()>=3){ //seriously doubt anybody's full name is less than three characters, so there's some perameters
                        i++;
                        studentName.add(scanner1.next());
                        System.out.println("approved");
                        if (scanner1.nextLine().indexOf(",") == -1){ //if no comma, middle name present
                            FirstMiddleLast = true;
                            scannerNameComplete = true;
                        }
                        else if (scanner1.nextLine().indexOf(", ") != -1 && scanner1.nextLine().indexOf(" ") != -1){//if comma and extra space Last, First, Middle
                            LastFirstMiddle = true;
                            scannerNameComplete = true;
                        }
                        else{ //Otherwise probably last first
                            LastFirst = true;
                            scannerNameComplete = true;
                        }

                    }
                }
                for(int i = 0; i <1; i++){
                    if (scannerNameComplete = true){ //if name has already been entered
                        System.out.println("Please enter student ID");
                        if (scanner1.nextLine().length() <= 0){
                            System.out.println("Invalid response, please re enter");
                        }
                        else if (scanner1.nextLine().length()>=3){ //idk what shortest student ID is, 3 is a safe bet
                            i++;
                            studentNumber.add(scanner1.next());
                            stuNumber = (scanner1.nextInt());
                            System.out.println("approved");
                            scannerNumberComplete = true;
                        }
                    }
                }
                for(int i = 0; i <1; i++){
                    if (scannerNumberComplete = true){
                        System.out.println("Please enter student GPA");
                        if (scanner1.nextLine().length() <= 0){
                            System.out.println("Invalid response, please re enter");
                        }
                        else if (scanner1.nextLine().length()>=3){ //usually gpa character limit is three, plus 3 threes is a magic number :p
                            i++;
                            gpa = (scanner1.nextInt());
                            studentGpa.add(scanner1.next());
                            System.out.println("approved");
                            scannerGPAComplete = true;
                        }
                    }
                }
                if (scannerNameComplete = true){
                    if(scannerNumberComplete = true){
                        if(scannerGPAComplete = true){
                            studentList.add(studentGpa); //Adding all of these fools
                            studentList.add(studentName);
                            studentList.add(studentNumber);
                            studentGpa.clear(); //clears these fools so when restarted, double entry is avoided
                            studentName.clear();
                            studentNumber.clear();
                        }
                    }
                }
            }
        }
        for(int i = 0; i <1; i++){
            if (scanner1.nextInt() == 2){
                if (studentList.size() <= 0){
                    System.out.println("Can't edit list, no students."); //ya dingle!
                }
                else if (scanner1.nextLine().length()>=3){
                    i++;
                    System.out.println("Please enter number listed of student you wish to delete.");
                    System.out.println("1" + studentList.get(1));
                    System.out.println("2" + studentList.get(2));
                    System.out.println("3" + studentList.get(3));
                    System.out.println("4" + studentList.get(4)); //only works with four entries :'(
                    studentList.remove(scanner1.next());
                }
            }
        }
        for(int i = 0; i <1; i++){
            if (scanner1.nextInt() == 3){
                if (studentList.size() <= 0){
                    System.out.println("Can't preview list, no students.");
                }
                else if (scanner1.nextLine().length()>=3){
                    i++;
                    System.out.println(studentList); //simplest command
                }
            }
        }
        for(int i = 0; i <1; i++){
            if (scanner1.nextInt() == 4){
                if (studentList.size() <= 0){
                    System.out.println("Can't delete list, no students entered.");
                }
                else if (scanner1.nextLine().length()>=3){
                    i++;
                    System.out.println(studentList); //shows whats clearing just in case they forgot
                    studentList.clear();
                    System.out.println("cleared");
                }
            }
        }
        for(int i = 0; i <1; i++){
            if (scanner1.nextInt() == 5){
                if (studentList.size() <= 0){ //legit same code as earlier, just at the end you choose which one to replace
                    System.out.println("Can't edit list, no students entered.");
                }
                else if (scanner1.nextLine().length()>=1){
                    System.out.println("Please enter student name");
                    for(int x = 0; x <1; x++){
                        if (scanner1.nextInt() != -1){
                            scannerOver = true;
                        }
                        if (scanner1.nextLine().length()<=0){
                            System.out.println("Invalid response, please re enter");
                        }
                        else if (scanner1.nextLine().length()>=3){
                            x++;
                            studentName.add(scanner1.next());
                            System.out.println("approved");
                            if (scanner1.nextLine().indexOf(",") == -1){
                                FirstMiddleLast = true;
                                scannerNameComplete = true;
                            }
                            else if (scanner1.nextLine().indexOf(", ") != -1 && scanner1.nextLine().indexOf(" ") != -1){
                                LastFirstMiddle = true;
                                scannerNameComplete = true;
                            }
                            else{
                                LastFirst = true;
                                scannerNameComplete = true;
                            }

                        }
                    }
                    for(int x = 0; x <1; x++){
                        if (scannerNameComplete = true){
                            System.out.println("Please enter student ID");
                            if (scanner1.nextLine().length() <= 0){
                                System.out.println("Invalid response, please re enter");
                            }
                            else if (scanner1.nextLine().length()>=3){
                                x++;
                                studentNumber.add(scanner1.next());
                                stuNumber = (scanner1.nextInt());
                                System.out.println("approved");
                                scannerNumberComplete = true;
                            }
                        }
                    }
                    for(int x = 0; x <1; x++){
                        if (scannerNumberComplete = true){
                            System.out.println("Please enter student GPA");
                            if (scanner1.nextLine().length() <= 0){
                                System.out.println("Invalid response, please re enter");
                            }
                            else if (scanner1.nextLine().length()>=3){
                                x++;
                                gpa = (scanner1.nextInt());
                                studentGpa.add(scanner1.next());
                                System.out.println("approved");
                                scannerGPAComplete = true;
                            }
                        }
                    }
                    if (scannerNameComplete = true){
                        if(scannerNumberComplete = true){
                            if(scannerGPAComplete = true){
                                studentList.add(studentGpa);
                                studentList.add(studentName);
                                studentList.add(studentNumber);
                                studentGpa.clear();
                                studentName.clear();
                                studentNumber.clear();
                            }
                        }
                    }
                }
            }
            System.out.println("Please enter number listed of student you wish to replace.");
            System.out.println("1" + studentList.get(1));
            System.out.println("2" + studentList.get(2));
            System.out.println("3" + studentList.get(3));
            System.out.println("4" + studentList.get(4)); //only four entries rip
            studentReplace.add(studentGpa);
            studentReplace.add(studentNumber);
            studentReplace.add(studentName);
            studentList.remove(scanner1.nextInt());
            studentList.add(studentReplace);
        }
        for(int i = 0; i <1; i++){
            if (scanner1.nextInt() == 6){
                if (studentList.size() <= 0){
                    System.out.println("Can't print student from list, no students entered.");
                }
                else if (scanner1.nextLine().length()>=2){
                    System.out.println("Please enter ID of student you wish to print");
                    System.out.println(studentList.indexOf(scanner1.nextInt()));
                    studentList.remove(scanner1.nextInt());
                }
            }
        }
    }
} 