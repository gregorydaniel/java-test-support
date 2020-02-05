package com.elsevier.test.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.junit.jupiter.api.Tag;

/**
 * Used at either the class-level or test method-level to indicate a test or test class
 * is slow-running. Based on an example here:
 *
 * https://junit.org/junit5/docs/current/user-guide/
 */
@Target(value = {ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Tag("slow")
public @interface Slow {
}