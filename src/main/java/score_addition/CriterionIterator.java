package score_addition;

import java.util.Iterator;
import java.util.Objects;

public class CriterionIterator implements Iterator {

    private Criteria criteria;
    private Integer index;
    public CriterionIterator(Criteria criteria){
        this.criteria = criteria;
        this.index = 0;
    }
    public boolean hasNext(){
        return index<criteria.getLength();
    }

    @Override
    public Object next() {
        Criterion criterion = criteria.getCriterionAt(index);
        index++;
        return criterion;
    }

}
