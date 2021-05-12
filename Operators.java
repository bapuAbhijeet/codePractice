public class Operators{
   public static void main(String[] args)
    {
        String one = "Hello";
        String two = "Hello";
        
       // System.out.println(one.equals(two));
        //System.out.println("Hello World");

        String sentence = "T    his is b  ett     er.";
        System.out.println("Original sentence: " + sentence);

        sentence = sentence.replaceAll("\\s", "");
        System.out.println("After replacement: " + sentence);
    }
}