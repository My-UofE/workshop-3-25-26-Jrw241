public class NumbersInSpanish {
    public static void main(String[] args) {
        // read the first argument passed to the program
        int number = Integer.parseInt(args[0]); 

        String outStr = "";
        switch (number) {
            case 1:
                outStr = "uno";
                break;
            case 2:
                outStr = "dos";
                break;
            case 3:
                outStr = "tres";
                break;
            case 4:
                outStr = "cuatro";
                break;
            case 5:
                outStr = "cinco";
                break;
            default:
                outStr = "Sorry i do not know that!";
        }
        System.out.println(outStr);
    }
 }