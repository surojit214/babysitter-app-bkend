package com.example.babysitterapp.util;

import com.google.common.collect.Sets;
import org.apache.commons.beanutils.BeanUtilsBean;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

public class BeanUtils {

    private static final String[] empty = {};

    public static void copyNonNullProperties(Object source, Object target) {
        copyNonNullProperties(source, target, empty);
    }

    public static void copyNonNullProperties(Object source, Object target, String... ignore) {

        Set<String> ignoredProperties = ignore.length > 0 ? Sets.newHashSet(Arrays.asList(ignore)) : Collections.emptySet();

        BeanUtilsBean bub = new BeanUtilsBean() {
            @Override
            public void copyProperty(Object bean, String name, Object value) throws IllegalAccessException, InvocationTargetException {
                if (value == null || ignoredProperties.contains(name)) {
                    return;
                }

                super.copyProperty(bean, name, value);
            }
        };


        try {
            bub.copyProperties(target, source);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
