package com.jjlharrison;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Main {

    private Optional<Map<String, AttributeValue>> loadForKey(final String key) {
        return Optional.ofNullable(
            getOnlyElement(queryForKey(key), null)
        );
    }

    private List<Map<String, AttributeValue>> queryForKey(final String key) {
        return null;
    }

    public static <T> T getOnlyElement(final Iterable<? extends T> iterable, final T defaultValue) {
        return getOnlyElement(iterable.iterator(), defaultValue);
    }

    public static <T> T getOnlyElement(final Iterator<? extends T> iterator, final T defaultValue) {
        return null;
    }

}
