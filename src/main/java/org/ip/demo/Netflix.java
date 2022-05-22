package org.ip.demo;

import org.ip.demo.subscription.SubscriptionService;

import java.util.List;

public class Netflix {

    private SubscriptionService subscriptionService = new SubscriptionService();
    private DBRepository dbRepository = new DBRepository(subscriptionService);
    private LocalRepository localRepository = new LocalRepository();

    public void payForSubscription() {
        subscriptionService.payForSubscription();
    }

    public List<Movie> getMovies() {
        try {
            return dbRepository.getAllMovies();
        } catch (NoInternetException e) {
            return localRepository.getDownloadedMovies();
        } catch(SubscriptionEndedException e) {
            System.out.println("Please pay for service");
        } catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
