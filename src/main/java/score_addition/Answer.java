package score_addition;

public class Answer {

    private Question question;
    private Bool correct;

    public Answer() {

    }

    public Answer(Question question, Bool correct) {
        this.question = question;
        this.correct = correct;
    }

    public String getQuestionText() {
        return question.getQuestionText();
    }

    public boolean match(Answer answer) {
        return answer.getQuestionText() == question.getQuestionText();
    }
}
