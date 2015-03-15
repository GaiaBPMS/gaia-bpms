package org.gaia.portal.cdi.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.inject.Qualifier;


@Target({ ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface MVPView {

}
