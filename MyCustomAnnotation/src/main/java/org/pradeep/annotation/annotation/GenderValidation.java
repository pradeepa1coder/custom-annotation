package org.pradeep.annotation.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Target({ ElementType.FIELD, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = ValidatorImpl.class)

public @interface GenderValidation {

	public String message() default "Invalid gender : It should be either Male Or FeMale";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}