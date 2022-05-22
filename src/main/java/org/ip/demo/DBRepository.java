package org.ip.demo;

import annotation.Validate;
import org.ip.demo.subscription.SubscriptionService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DBRepository extends Repository {

    private final SubscriptionService subscriptionService;
    private List<Movie> movies = new ArrayList<>();

    public DBRepository(SubscriptionService subscriptionService) {
        this.subscriptionService = subscriptionService;
    }

    public void addMovie(Movie movie, boolean sort) {

    }

    public List<Movie> getMoviesByCategory() {
        return Collections.emptyList();
    }

    public List<Movie> getAllMovies() throws NoInternetException, SubscriptionEndedException {
        if (! subscriptionService.isSubscriptionActive()) {
            throw new SubscriptionEndedException();
        }
        return movies;
    }
}
