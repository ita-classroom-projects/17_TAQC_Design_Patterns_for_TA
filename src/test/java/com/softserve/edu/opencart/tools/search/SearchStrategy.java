package com.softserve.edu.opencart.tools.search;

public final class SearchStrategy {
    private static Search search;

    private SearchStrategy() {
    }

    public static Search setStrategy(Strategies strategy) {
        search = strategy.getStrategy();
        return getSearch();
    }

    public static Search getSearch() {
        if (search == null) {
            search = Strategies.DEFAULT_STRATEGY.getStrategy();
        }
        return search;
    }

}
