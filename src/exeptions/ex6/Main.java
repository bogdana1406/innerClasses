package exeptions.ex6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

class UserException extends Exception{
    public void  method() {
        System.out.println("My Exception");
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            throw new UserException();
        } catch (UserException userException) {
            System.out.println("exception handing");
            userException.method();
            try {
                FileInputStream fs = new FileInputStream("NonExistentFile.txt");
            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }


    }
}
