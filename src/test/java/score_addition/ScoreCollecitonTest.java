package score_addition;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ScoreCollecitonTest {
//    @Test
    public void test() {
        System.out.println("Hlelo");

    }
    @Test
    public void answersArithmeticMeanOfTwoNumbers(){
        //준비 //Arange
        ScoreColleciton collection = new ScoreColleciton();
        collection.add(()->5);
        collection.add(()->7);

        //실행 //Act
        int actualResult = collection.arithmeticMean();
        //assertion
        assertEquals(actualResult,6);
    }
}