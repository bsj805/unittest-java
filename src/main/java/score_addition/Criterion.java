package score_addition;

import lombok.Getter;

@Getter
public class Criterion {

    private Answer answer;
    private Weight weight;

    public Criterion(Answer answer, Weight weight) {
        answer = this.answer;
        weight = this.weight;
    }

}
