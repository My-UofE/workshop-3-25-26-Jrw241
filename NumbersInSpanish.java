public class NumbersInSpanish {
    public static void main(String[] args) {
        // read the first argument passed to the program
        int number = Integer.parseInt(args[0]); 

        String outStr = "";
        if (number == 1) {
            outStr = "uno";
        } else if (number == 2) {
            outStr = "dos";
        } else if (number == 3) {
            outStr = "tres";
        } else if (number == 4) {
            outStr = "cuatro";
        } else if (number == 5) {
            outStr = "cinco";
        } else {
            outStr = "Sorry i do not know that!";
        }
        System.out.println(outStr);
    }
 }