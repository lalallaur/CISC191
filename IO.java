import java.io.IOException;

public class IO {
    public static void main(String[] args) throws IOException {
        int usrInput1;
        int usrInput2;
        //Select user inputs 12 (only integers)
        usrInput1 = System.in.read(); //
        usrInput2 = System.in.read();
        System.out.println("Where this " + usrInput1 + " comes from?");
        //You need an ASCII table to proof the answer
        //ASCII table can be found at
        //https://www.cs.cmu.edu/~pattis/15-1XX/common/handouts/ascii.html
        System.out.print("Where this ");
        System.out.println(usrInput1+usrInput2 + " comes from?");
    }
}

