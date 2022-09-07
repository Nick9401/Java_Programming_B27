package day19_loop;

public class HomeWorkSpaceProgram {
    public static void main(String[] args) {
        /*
        Space program

Given a String return a version of with spaces between all of the letters.
If there is already a space in the String put an underscore

	Ex: java	-> j a v a
		space 	-> s p a c e
		more words -> m o r e _ w o r d s
         */
        String str = "this world is fucket up";
        String withSpace = "";

        str = str.replaceAll(" ", "_");
        for (int i = 0; i < str.length(); i++) {
            withSpace+=str.charAt(i)+" ";
        }
        System.out.println(withSpace);
    }
    }

