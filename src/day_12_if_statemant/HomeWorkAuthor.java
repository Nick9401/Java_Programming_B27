package day_12_if_statemant;

public class HomeWorkAuthor {
    public static void main(String[] args) {

        String genre = "Detective";
        int page = 0;
        long profit =0;
        int sequels =0;
        int countries =0;

        switch (genre) {
            case "Fantasy":
                page = 500;
                profit = 1_000_000;
                sequels = 5;
                countries = 50;
                break;

            case "Detective":
                page = 350;
                profit = 700_000;
                sequels = 3;
                countries = 45;
                break;
            case "Scince Fiction":
                page = 720;
                profit = 900_500;
                sequels = 4;
                countries = 30;
                break;
            case "Short Story":
                page = 150;
                profit = 300_000;
                sequels = 1;
                countries = 40;
        }


            System.out.println("Page"+ page+"\n"+ "Profit" + profit + "\n" +" Sequels" + sequels + "\n "+" Countries" + countries);

        }

    }

