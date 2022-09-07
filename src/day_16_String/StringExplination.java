package day_16_String;

import java.util.Locale;

public class StringExplination {
    public static void main(String[] args) {

      String str = "Cydeo";          //CharAt
                  //  01234
        char ch1 = (str.charAt(2));
        System.out.println(ch1);      //d
        //d
        //=============================================

        String str2 = "Wooden Spoon"; //Lengh
        //             012345678911
        int n1=str2.length();
        System.out.println(n1);       //just count the characters
        //12
        int lastIndexNumenber = str2.length()-3;
        System.out.println(lastIndexNumenber);
        //9
        //==============================================

        String str3 = "Java";                  //toLowerCase
        str3 = str3.toLowerCase();
        System.out.println(str3);
         //java
        //================================================

      String str4 ="Java";                    //toUpperCase
      str4= str4.toUpperCase();
      System.out.println(str4);
       //JAVA
      //==================================================
                                            // Trim
                                            // prinnt without space
      String str5 = "    Java  Programing   Language       ";
      str5= str5.trim();
      System.out.println(str5);

       // Java Programing Language
      //==================================================
                                             //indexOf
                                             //
      String str6 = "Wooden Spoon";
      int indexNumeFirsto = str6.indexOf("o");
      System.out.println("indexNumeFirsto = " + indexNumeFirsto);
      //1
      int indexNumOfSecondO= str6.indexOf("od");
      System.out.println("indexNumOfSecondO = " + indexNumOfSecondO);
      //2
      int indexNumOfThirdO = str6.indexOf("po")+1;
      System.out.println("indexNumOfThirdO = " + indexNumOfThirdO);
       //9
      //======================================================
                                        //lastIndexOf
      String str7 = "Wooden Spoon";
      int indexNumberLastO =str7.lastIndexOf("o");
      System.out.println("indexNumberLastO = " + indexNumberLastO);
      //10
      //=====================================================
                                          // replace
      String str8 = "Wooden Spoon";
      str8= str8.replace("o","e");
      System.out.println("str8 = " + str8);
      //Weeden Speen
      String sentence = "I love Java ,Java is the best programming language" ;
      sentence=sentence.replace("Java","C#");
      System.out.println("sentence = " + sentence);
      //I love C# ,C# is the best programming language
      //=====================================================
                                   //replacefirst
      
      String str9 = "Wooden Spoon";
      str9=str9.replaceFirst("o","e");
      System.out.println("str9 = " + str9);
      //Weoden spoon
      
      String sentences = "I love Java,Java is the best programming language";
      sentences=sentences.replaceFirst("Java","c#");
      System.out.println("sentences = " + sentences);
      //sentences = I love c#,Java is the best programming language
      //======================================================
                                        //substring
      String str10 = " Java Programming Language ";
      str10=str10.substring(str10.indexOf("m"));
      System.out.println("str10 = " + str10);
      //result1 = ming Language
      
      str10=str10.substring(5, 14);
      System.out.println("str10 = " + str10);
      //str10 =  Language
      
     String s1 = "I love Java";
     //           123456789
     String result4 = s1.substring(2, 6);
      System.out.println("result4 = " + result4);
      // result4 = love
      
      //=================================================
                                             //repeat
      
      String str11 = "Java";
      str11=str11.repeat(3);
      System.out.println("str11 = " + str11);
      //str11 = JavaJavaJava

      //=================================================

      


        }
    }
