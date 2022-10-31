package score_addition;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProfileTest {

    @Test
    public void test() {
        Profile profile = new Profile("BUll Hockey, Inc.");
        Question question = new BooleanQuestion(1,"Got bonuses?");
        Criteria criteria = new Criteria();
        Answer criteriaAnswer = new Answer(question,Bool.FALSE);
        Criterion criterion = new Criterion(criteriaAnswer,Weight.MustMatch);
        criteria.add(criterion);
    }
}