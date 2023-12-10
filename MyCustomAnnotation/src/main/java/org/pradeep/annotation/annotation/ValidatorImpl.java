package org.pradeep.annotation.annotation;

import java.util.ArrayList;
import java.util.List;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidatorImpl implements ConstraintValidator<GenderValidation, String> {

	@Override
	public boolean isValid(String genderType, ConstraintValidatorContext context) {

		genderType = genderType.toLowerCase();

		List<String> al = new ArrayList<>();
		al.add("male");
		al.add("female");
		return al.contains(genderType);
	}

}
