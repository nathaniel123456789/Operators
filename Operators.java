public class Operators 
{
    public static void main(String[] args) 
    {
        int i = 10;
        int f = 5;
        boolean flag = true;
        flag = !flag;
        i++;
        System.out.print(i);
        System.out.print(f);
        System.out.print(flag);
        String string1 = "I am a string";
        String string2 = string1;
        String string3 = "I am also a string";
        boolean stringsequal = string1.equals(string3);
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