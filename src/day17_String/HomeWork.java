package day17_String;

import java.util.ArrayList;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {

    }


    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> list){

        ArrayList<Integer> result  = new ArrayList<>();
        Integer res = 0;

        for(int i = 0; i<list.size(); i++)
        {
            if(list.get(i) > 0){
                result.add(list.get(i));
                res+=list.get(i);


            }

        }
        result.add(res);

        return result;




    }

    }

