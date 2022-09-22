public class Operators 
{
    public static void main(String[] args) 
    {
        String[] strArray = {"Alpha","Bravo","Charlie","Delta","Echo"};
        for (int indI = 0; indI < strArray.length; indI++) {
            System.out.println(strArray[indI]);
        }
        for (String value : strArray) {
            System.out.print(value);
        }
        System.out.println();
        for (int indII = 0; indII < strArray.length; indII++) {
            System.out.print(strArray[indII]);
            if (indII < 4) 
                System.out.print("-");
            }
        }
    }