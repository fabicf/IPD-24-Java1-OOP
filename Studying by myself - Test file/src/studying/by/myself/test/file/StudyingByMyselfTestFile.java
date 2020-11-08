
package studying.by.myself.test.file;

import java.util.Scanner;

public class StudyingByMyselfTestFile {

    public static void main(String[] args) {
        
       /* String teste = new String ("This is a string with string constructor");
        System.out.println(teste);
        
        String teste2 = "this is a direct form of create a string";
        System.out.println(teste2);
        
        int x = 5;
        x++;
        x++;
        x += 10;
        
        System.out.println(x);
        
        for (int i = 0; i < 10; i++) {
            
        }
        
        
        =======================
        
        strings
        
        ======================

*/
        int x = 10;
        int y = 20;
        String w = "hello my dear";
        
        System.out.println(Integer.max(x, y));
        System.out.println(Integer.min(x, y));
        System.out.println(Integer.compare(x, y));
        System.out.println(w.charAt(0));
        System.out.println(w.charAt(1));
        System.out.println("hello\\cats");
        System.out.println("fabi's friends");
        System.out.println("fabi\'s friends");
        System.out.println(w.contains("my"));
        System.out.println(w.indexOf("y"));
        System.out.println(w.lastIndexOf("my "));
        System.out.println(w.toUpperCase());
        System.out.println(w.repeat(5));
        System.out.println(w.equals("hello"));
        System.out.println(w.equals("hello my dear"));
   
        String password = "enter123";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter password");
        String passwordEntered = input.nextLine();
        
        System.out.println("Password is: " + password.equals(passwordEntered));
        
        






        
        
    }
    
}
