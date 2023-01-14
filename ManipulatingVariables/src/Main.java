public class Main {
    public static void main(String[] args)
    {
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
    }
}