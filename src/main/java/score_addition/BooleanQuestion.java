package score_addition;

import lombok.Getter;

@Getter
public class BooleanQuestion implements Question {

    private String questionString;
    private Integer type;

    public BooleanQuestion(Integer type, String questionString) {
        this.type = type;
        this.questionString = questionString;
    }

    @Override
    public String getQuestionText() {
        return questionString;
    }
}
