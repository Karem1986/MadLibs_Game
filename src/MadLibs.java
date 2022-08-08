import java.util.Scanner;

public class MadLibs {
    /*This program creates a MadLib game where
    users fill in the correct Java attributes:
     */
    public static void main(String[] args) {
        //instance fields:
        String attr1 = "platform independent";
        String attr2 = "backwards compatibility";
        String attr3 = "secure";
        String attr4 = "memory efficient";
        String attr5 = "Static typing";

        Scanner enterName = new Scanner(System.in);
        System.out.println("Enter username: ");
        if (enterName.hasNext("[A-Za-z]*")) {
            String naam = enterName.nextLine();
            System.out.println("Username is : " + naam);
            //First check if username has the right input, then ask for attribute 1.
            Scanner atrib1 = new Scanner(System.in);
            System.out.println("Enter attribute 1:  ");
            String enteratrib1 = atrib1.nextLine();
            System.out.println(enteratrib1);
            //if attrib1 is equal to the correct words the story gets printed, else we ask for the right word again
            if (enteratrib1.equals("platform independent")) {
                System.out.println("You won the first round of MadLibs game!");
                //if attribute 1 is correct the first time, we ask to fill in the 2nd attribute:
                Scanner atrib2 = new Scanner(System.in);
                System.out.println("Enter attribute 2:  ");
                String enteratrib2 = atrib2.nextLine();
                System.out.println(enteratrib2);
                if (enteratrib2.equals("backwards comp")) {
                    System.out.println("You won the 2nd round of MadLibs game!" +
                            "");
                    //then ask for 3rd attribute:
                    Scanner atrib3 = new Scanner(System.in);
                    System.out.println("Enter attribute 3:  ");
                    String enteratrib3 = atrib3.nextLine();
                    System.out.println(enteratrib3);
                    if (enteratrib3.equals("secure")) {
                        System.out.println("You won the 3rd round of MadLibs game!" +
                                "");
                        String story = "Java is " + attr1 + " , " + attr2 + " and "
                                + attr3;
                        System.out.println("The attributes of Java are: " + story);
                    } else {
                        Scanner try3 = new Scanner(System.in);
                        System.out.println("Enter attribute 3 again:  ");
                        String enteragain3 = try3.nextLine();
                        System.out.println(enteragain3);

                        if (enteragain3.equals("secure")) {
                            String story = "Java is " + attr1 + " , " + attr2 + " and " + attr3;
                            System.out.println("The attributes of Java are: " + story);
                        }
                    }

                } else {
                    Scanner try2 = new Scanner(System.in);
                    System.out.println("Enter attribute 2 again:  ");
                    String enteragain2 = try2.nextLine();
                    System.out.println(enteragain2);
                    //if attribute 2 is correct, we ask for the 3rd one:
                    if (enteragain2.equals("backwards comp")) {
                        //then ask for 3rd attribute:
                        Scanner atrib3 = new Scanner(System.in);
                        System.out.println("Enter attribute 3:  ");
                        String enteratrib3 = atrib3.nextLine();
                        System.out.println(enteratrib3);
                        if (enteratrib3.equals("secure")) {
                            System.out.println("You won the 3rd round of MadLibs game!" +
                                    "");
                            String story = "Java is " + attr1 + " , " + attr2 + " and " + attr3;
                            System.out.println("The attributes of Java are: " + story);

                        } else {
                            Scanner try3 = new Scanner(System.in);
                            System.out.println("Enter attribute 3 again:  ");
                            String enteragain3 = try3.nextLine();
                            System.out.println(enteragain3);

                            if (enteragain3.equals("secure")) {
                                String story = "Java is " + attr1 + " , " + attr2 + " and " + attr3;
                                System.out.println("The attributes of Java are: " + story);
                            }
                        }
                    }
                }
            } else {
                //Ask for attribute 1 again if not correct and ask for the rest of attributes, for each attribute check the valid answer.
                Scanner try1 = new Scanner(System.in);
                System.out.println("Enter attribute 1 again:  ");
                String enteragain1 = try1.nextLine();
                System.out.println(enteragain1);
                if (enteragain1.equals("platform independent")) {
                    Scanner atrib2 = new Scanner(System.in);
                    System.out.println("Enter attribute 2:  ");
                    String enteratrib2 = atrib2.nextLine();
                    System.out.println(enteratrib2);
                    //if attr 1 is correct, proceed to ask attr2 and so on and forth:
                    if (enteratrib2.equals("backwards comp")) {
                        System.out.println("You won the 2nd round of MadLibs game!" +
                                "");
                        //then ask for 3rd attribute:
                        Scanner atrib3 = new Scanner(System.in);
                        System.out.println("Enter attribute 3:  ");
                        String enteratrib3 = atrib3.nextLine();
                        System.out.println(enteratrib3);
                        if (enteratrib3.equals("secure")) {
                            System.out.println("You won the 3rd round of MadLibs game!" +
                                    "");
                            String story = "Java is " + attr1 + " , " + attr2 + " and "
                                    + attr3;
                            System.out.println("The attributes of Java are: " + story);
                        } else {
                            Scanner try3 = new Scanner(System.in);
                            System.out.println("Enter attribute 3 again:  ");
                            String enteragain3 = try3.nextLine();
                            System.out.println(enteragain3);

                            if (enteragain3.equals("secure")) {
                                String story = "Java is " + attr1 + " , " + attr2 + " and " + attr3;
                                System.out.println("The attributes of Java are: " + story);
                            }
                        }

                    }

                }
            }

        }
    }
}
