package Transformation;


import cucumber.api.Transformer;

/**
 * Created by Souke Family on 12/02/2018.
 */
public class EmailTransform extends Transformer<String> {

    @Override

    public String transform(String userName)
    {
        return userName.concat("@ea.com");
    }


}
