

public class FirstClass {

    private String name;

    public FirstClass (String name) {
        this.name = name;
    }


    public boolean getMeOutOfHere(){
        System.out.println("I am in weird places");
        return true;
    }

    public static void main (String args[]) {

        User myUser = new User ("Test", "sTest","colleague");
        User myUser2 = new User ("Test2", "sTest2","boss");
        myUser.changeDetails(myUser2);
        System.out.println("User "+ myUser.toString(myUser));
        System.out.println("User2 " + myUser.toString(myUser2));
        System.out.println("hello World");
        FirstClass first = new FirstClass("NAME");
        if(first.getMeOutOfHere() == true) {

            System.exit(1);
        }
    }
}
