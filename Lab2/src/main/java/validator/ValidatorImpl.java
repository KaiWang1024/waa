package validator;

import domain.Calculator;

import java.util.ArrayList;
import java.util.List;

public class ValidatorImpl implements Validator {

    public List<String> validate(Object domainObject) {
        List<String> errors = new ArrayList<>();

        Calculator calculator = (Calculator)domainObject;
        Integer add1 = calculator.getAdd1();
        if (add1 == null) {
            errors.add("First operand of plus should be an integer");
        }
        Integer add2 = calculator.getAdd2();
        if (add2 == null) {
            errors.add("Second operand of plus should be an integer");
        }
        Integer mult1 = calculator.getMult1();
        if (mult1 == null) {
            errors.add("First operand of multiply should be an integer");
        }
        Integer mult2 = calculator.getMult2();
        if (mult2 == null) {
            errors.add("Second operand of plus should be an integer");
        }
        return errors;
    }
}
