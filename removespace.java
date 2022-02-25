package activity1;

public class removespace {
public static void main(String[] args)
    {
        String str = "        g o o d d a y       ";
       
        // Call the replaceAll() method
        str = str.replaceAll("\\s", "");
       
        System.out.println(str);
    }
}

