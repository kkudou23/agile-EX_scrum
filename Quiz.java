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

    public void showQuiz() {
        System.out.println("[問題" + this.quizNumber + "]");
        System.out.println(this.mainText);
        for(Choice choice: choices) {
            System.out.println(choice.getIndex() + "." + choice.getText());
        }
        System.out.print("こたえを入力してください>");
    }

    public boolean isCorrect(int givenAnswer) {
        return givenAnswer == this.answer;
    }
}