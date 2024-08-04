import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class se {
    public static void main(String[] args) {
        boolean boolean_1 =true;
        boolean boolean_2 =true;
        boolean boolean_3 =true;
        final int password = 42;
        int content_counter = 6;
        Scanner scanner = new Scanner(System.in);
        List<String> content_array = new ArrayList<String>();
        content_array.add("Çalıkuşu");
        content_array.add("Ölüler");
        content_array.add("Robin Hood");
        content_array.add("Dönüşüm");
        content_array.add("Hayvan Çiftliği");
        content_array.add("Donkişot");
        List<String> normal_username_array = new ArrayList<String>();
        normal_username_array.add("Ahmet");
        List<Integer> normal_ID_array = new ArrayList<Integer>();
        normal_ID_array.add(123456);
        List<Integer> normal_password_array = new ArrayList<Integer>();
        normal_password_array.add(654321);
        List<Integer> admin_ID_array = new ArrayList<Integer>();
        admin_ID_array.add(2002);
        List<Integer> admin_password_array = new ArrayList<Integer>();
        admin_password_array.add(1453);
        int p;
        int o;
        while (true){
            boolean_1=true;
            System.out.println("Welcome to IEU LIBRARY");
            System.out.println();
            System.out.println("press “1” to go Admin registration screen to register a new Admin");
            System.out.println("press “2” to go login screen");
            System.out.println();
            System.out.println("if you are unregistered please make contact with a Admin");
            int x = scanner.nextInt();
            switch (x) {
                case (1):
                    int i = 0;
                    while (boolean_1) {
                        System.out.println("Welcome to admin registration");
                        System.out.println();
                        while (i < 4) {
                            System.out.println("Enter the system password");
                            int input_a = scanner.nextInt();
                            if (input_a == password) {


                                System.out.println("enter ID for new Admin.");
                                int adm_ıd = scanner.nextInt();
                                admin_ID_array.add(adm_ıd);

                                System.out.println("enter password for new Admin");
                                int adm_pas = scanner.nextInt();
                                admin_password_array.add(adm_pas);

                                System.out.println();

                                System.out.println("Successfully registered!!!");
                                System.out.println();
                                i = 5;
                                boolean_1 = false;
                                break;
                            }
                            else {
                                i++;
                                if(i>=4){
                                    System.out.println("You entered a wrong system password for 4 times, admin register feature is locked for now");
                                    boolean_1=false;
                                    System.out.println();
                                }
                                break;
                            }
                        }

                    }
                case(2):
                    System.out.println("Press "+"1 "+"to go student or teacher login");
                    System.out.println("Press "+"2 "+"to go admin login");
                    System.out.println("press any number other than 1 or 2 to go back");
                    int y = scanner.nextInt();
                    if(y==1){
                        boolean_2 =true;
                        while(boolean_2){
                            System.out.println();
                            System.out.println("press 3 to go back");
                            System.out.println("Enter user ID");
                            int z = scanner.nextInt();
                            if(z==3) {
                                break;
                            }
                            int zz =normal_ID_array.indexOf(z);
                            System.out.println("Enter user password");
                            int c= scanner.nextInt();
                            int cc=normal_password_array.indexOf(c);

                            if(cc==zz){
                                System.out.println(content_array.toString());
                                System.out.println("If you want to borrow a book make contact with a Admin");
                                System.out.println("press 3 to go back");
                                int gb = scanner.nextInt();
                                if(gb==3){
                                    boolean_2=false;
                                }
                            }
                        }
                    }
                    if (y == 2) {
                        System.out.println("please enter your Admin ID");
                        int s = scanner.nextInt();
                        p = admin_ID_array.indexOf(s);

                        System.out.println("please enter your Admin password");
                        int k = scanner.nextInt();
                        o = admin_password_array.indexOf(k);


                        if (p == o) {
                            boolean_3=true;
                            while (boolean_3) {
                                System.out.println();
                                System.out.println("press 1 to register a student or teacher");
                                System.out.println("press 2 to delete a user");
                                System.out.println("press 3 to give content");
                                System.out.println("press 4 to usurp a content");
                                System.out.println("press 5 to add content to system");
                                System.out.println("press 6 to remove content from system");
                                System.out.println("press 7 to view information of the student or teacher");
                                System.out.println("press 8 to view contents assigned to the student or teacher");
                                System.out.println("press 9 to see total numbers of contents");
                                System.out.println("press 10 to see total numbers of registered people");
                                System.out.println("press 11 to return to login page");


                                int z = scanner.nextInt();

                                switch (z) {

                                    case (1):

                                        int h = 0;

                                        System.out.println("enter username");
                                        String a = scanner.next();
                                        normal_username_array.add(a);


                                        System.out.println("enter ID (ID cannot be only number and 3)");
                                        Integer b = scanner.nextInt();
                                        normal_ID_array.add(b);


                                        System.out.println("enter password");
                                        Integer c = scanner.nextInt();
                                        normal_password_array.add(c);


                                        System.out.println("Successfully registered!!!");

                                        break;
                                    case (2):
                                        System.out.println("enter ID of the user you will be deleted from system");
                                        Integer v = scanner.nextInt();
                                        int n = normal_ID_array.indexOf(v);

                                        normal_ID_array.remove(v);
                                        normal_username_array.remove(normal_username_array.get(n));
                                        normal_password_array.remove(normal_password_array.get(n));
                                        break;

                                    case (3):
                                        System.out.println(content_array.toString());
                                        System.out.println("enter the name of the content you want to take");
                                        String m = scanner.next();
                                        int mm =content_array.indexOf(m);

                                        System.out.println("enter the ID of the user who will have the book");
                                        Integer ö = scanner.nextInt();
                                        int za =normal_ID_array.indexOf(ö);
                                        mm++;
                                        String mnm = ("---> " + normal_username_array.get(za));
                                        content_array.add(mm,mnm);
                                        System.out.println(content_array.toString());
                                        break;

                                    case (4):
                                        System.out.println(content_array.toString());
                                        System.out.println("enter the name of the content you want to usurp from user");
                                        String ş =scanner.next();
                                        int şş =content_array.indexOf(ş);
                                        şş++;
                                        content_array.remove(şş);
                                        System.out.println(content_array.toString());
                                        break;

                                    case (5):
                                        System.out.println("write the name of the content you will add");
                                        String u = scanner.next();
                                        content_array.add(u);
                                        System.out.println(content_array.toString());
                                        content_counter++;
                                        break;

                                    case (6):
                                        System.out.println(content_array.toString());
                                        System.out.println("write the name of the content you will remove");
                                        String ü = scanner.next();
                                        content_array.remove(ü);
                                        content_counter--;
                                        System.out.println(content_array.toString());
                                        break;

                                    case (7):
                                        System.out.println("Enter the ID of the related user");
                                        int ç = scanner.nextInt();
                                        int f = normal_ID_array.indexOf(ç);
                                        System.out.println("username is " + normal_username_array.get(f)+ " ID is " + normal_ID_array.get(f) + " password is " + normal_password_array.get(f));
                                        break;

                                    case (8):
                                        System.out.println(content_array.toString());
                                        break;

                                    case (9):
                                        System.out.println("There are "+ content_counter + " book added to the system");
                                        System.out.println(content_array.toString());
                                        break;

                                    case (10):
                                        System.out.println("Total number of people who registered to system as user is "+normal_ID_array.size());
                                        break;

                                    case (11):
                                        boolean_3=false;

                                }
                            }//while boolean 3 end
                        }//if p o check end
                        if(p != o){
                            System.out.println("you entered wrong");
                            System.out.println();
                        }
                    }// if y check son
            }//switch ilk kısım son
        }//sistem sürekli dödüren while son
    }//main son
}//class se son