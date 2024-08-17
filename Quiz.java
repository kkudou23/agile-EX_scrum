import java.util.List;
public class Quiz {
    private int quizNumber;
    private String mainText;
    private List<Choice> choices;
    private int answer;

    public Quiz(int quizNumber, String mainText, List<Choice> choices, int answer) {
        this.quizNumber = quizNumber;
        this.mainText = mainText;
        this.choices = choices;
        this.answer = answer;
    }
}