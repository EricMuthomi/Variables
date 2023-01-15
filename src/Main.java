public class Main {
    public static void main(String[] args)
    {

        String name="Anonymous";
        int age =23;
        double desiredSalary=100000.55;
        char gender='M';
        boolean lookingForJob=false;
        int num = (10 - (4 + 3)) * 6;
        double num2=6;

        System.out.println(num);
        System.out.println(num2);
        System.out.println("Hello world!");
        System.out.println("I'm "+name+"."+"I'm aged "+age+" and my desired salary" +
                "as a java programmer is "+desiredSalary+ "$. My gender is "+gender+"."+
                " Looking for a job now? "+lookingForJob);

        System.out.println("Hello world! Today we're learning about compound assignment operations");

        //Compound assignment operators perform arithmetic operations on a variable
        // and then reassigns its value.

        int numOfMangoes=300; //50 gets rotten, what's the balance?
        numOfMangoes -=50;
        System.out.println(numOfMangoes);

        //Anonymous buys half of the remaining mangoes, calculate the remainder.
        numOfMangoes /=2;
        System.out.println(numOfMangoes);

        //The farmer decides to sell the remaining mangoes in batches of 7, what's the remainder?
        numOfMangoes %=7;
        System.out.println(numOfMangoes);

        double balance = 1000.75;
        double amountToWithdraw = 250;

        double updatedBalance=balance-amountToWithdraw;
        double amountForEachFriend=updatedBalance/3;
        boolean canPurchaseTicket=amountForEachFriend>=250;

        System.out.println(canPurchaseTicket);
        String amountGivenToFriends="I gave each friend "+amountForEachFriend +"...";
        System.out.println(amountGivenToFriends);

        /*String datatype store a string of characters in double quotations.
        *int datatype stores variables in whole numbers
        * double stores variables in decimals
        * char stores single character variables in single quotations
        * boolean datatype can only hold a true or false
        * Static typing enables programmers to realise runtime errors and, therefore,
        * write code free from bugs.
        * We use .equals to make comparisons between Strings and other objects
        * The + operator can be used to concatenate Strings
        * The final keyword makes variables unchangeable once they are declared*/



    }
}