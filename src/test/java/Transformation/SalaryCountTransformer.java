package Transformation;

import cucumber.api.Transformer;

/**
 * Created by Souke Family on 13/02/2018.
 */
public class SalaryCountTransformer extends Transformer<Integer> {

    @Override

    public Integer transform(String salary) {
        return salary.length();
    }
}

