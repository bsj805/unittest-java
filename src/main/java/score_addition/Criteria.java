package score_addition;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

import lombok.Getter;

@Getter
public class Criteria implements Iterable<Criterion>{
    private List<Criterion> criterionList;
    public void add(Criterion criterion){
        criterionList.add(criterion);
    }
    public Integer getLength(){
        return criterionList.size();
    }
    public Criterion getCriterionAt(int index) {
        return criterionList.get(index);
    }
    @Override
    public Iterator iterator() {
        return new CriterionIterator(this);
    }

    @Override
    public void forEach(Consumer action) {
        Iterable.super.forEach(action);
    }
}
