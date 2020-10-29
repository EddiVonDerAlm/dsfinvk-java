package com.opencore.dsfinvk.util;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

/**
 * Annotation to validate that either TseSignature and SignatureCounter or TseError was set
 */
@Target(TYPE)
@Retention(RUNTIME)
@Constraint(validatedBy = TseTransaktionenSignatureValidator.class)
@Documented
public @interface ValidTseTransaktionen {

    String message() default "Either (tse_ta_sig & tse_ta_sigz) or tse_ta_fehler needs to be provided";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

  }