package Examples.Replit.item1.Do;

public class Quiz {




        String topic;
        int totalNumberOfQuestions;
        double totalPoint;

    public Quiz(String topic, int totalNumberOfQuestions, double totalPoint) {
        this.topic = topic;
        this.totalNumberOfQuestions = totalNumberOfQuestions;
        this.totalPoint = totalPoint;
    }

    @Override
    public String toString() {
        return "Quiz{" +
                "topic='" + topic + '\'' +
                ", totalNumberOfQuestions=" + totalNumberOfQuestions +
                ", totalPoint=" + totalPoint +
                '}';
    }

    public static void takeQuiz() {
            System.out.println("Taking the $topic quiz");

        }

}
