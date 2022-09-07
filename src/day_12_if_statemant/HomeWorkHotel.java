package day_12_if_statemant;

import java.util.Scanner;

public class HomeWorkHotel {
    public static void main(String[] args) {
        /*

Ask the user how many days they will stay at the hotel
Then ask the user how many people are in their party (how many people are staying in the room)

Use those two information to determine the price and room type for the hotel based on the below data:

	party size: 1
	room type: single room
	price: number of days * 100

	party size: 2
	room type: double room
	price: number of days * 125

	party size: 3 or 4
	room type: large room
	price: number of days * number of people * 150

	party size: 5, 6, or 7
	room type: suite
	price: number of days * 5000

	any other party size:
		Display one message:
			Sorry we don't have any available rooms for that size party
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Hotel Reservation");
        System.out.println("How many day will you Stay");
        byte days= scan.nextByte();
        System.out.println("How many people");
        byte numberOfPeople= scan.nextByte();
        String room="";
        int price=0;

        switch (numberOfPeople){
            case 1:
                room="Single room";
                price=days*100;
                System.out.println("Party size: "+room+"\nNumber of days: "+days+"\nPrice: $"+price);
                break;
            case 2:
                room="Double Room";
                price=days*125;
                System.out.println("Party size: "+room+"\nNumber of days: "+days+"\nPrice: $"+price);
                break;
            case 3:
            case 4:
                room="3 or 4";
                price=days*150;
                System.out.println("Party size: "+room+"\nNumber of days: "+days+"\nPrice: $"+price);
                break;
            case 5:
            case 6:
            case 7:
                room="5,6 or 7";
                price=days*5000;
                break;
            default:
                System.out.println("Sorry we don't have any available rooms for that size party");
}}}