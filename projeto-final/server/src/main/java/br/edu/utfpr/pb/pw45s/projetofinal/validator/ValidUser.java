package br.edu.utfpr.pb.pw45s.projetofinal.validator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = UserValidator.class)
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidUser {
    String message() default "Erro ao salvar registro! Valide as informações preenchidas e tente novamente.";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}