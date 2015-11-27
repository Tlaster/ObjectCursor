package org.mariotaku.library.objectcursor.annotation;

import org.mariotaku.library.objectcursor.converter.CursorFieldConverter;
import org.mariotaku.library.objectcursor.converter.EmptyCursorFieldConverter;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by mariotaku on 15/11/27.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.CLASS)
public @interface CursorField {
    String value();

    String indexFieldName() default "";

    Class<? extends CursorFieldConverter> converter() default EmptyCursorFieldConverter.class;
}
