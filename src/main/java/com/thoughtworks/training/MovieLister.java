package com.thoughtworks.training;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class MovieLister {
    private List<MovieFinder> finders;

    public MovieLister(List<MovieFinder> finders) {
        this.finders = finders;
    }

    List<String> find(String keyword) {
        return finders.stream().map(movieFinder -> movieFinder.find(keyword))
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }
}
