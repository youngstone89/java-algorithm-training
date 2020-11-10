package kackerrank;

import java.util.Scanner;

public class StdinEof {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lineNumber = 0;
        while(sc.hasNext()){
            System.out.println(++lineNumber + " " + sc.nextLine());
        }
        sc.close();
    }
}
