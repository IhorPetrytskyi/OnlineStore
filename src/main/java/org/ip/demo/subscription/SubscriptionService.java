package org.ip.demo.subscription;

public class SubscriptionService {

    private boolean subscriptionActive = false;

    public void payForSubscription() {
        subscriptionActive = true;
    }

    public void endSubscription() {
        subscriptionActive = false;
    }

    public boolean isSubscriptionActive() {
        return subscriptionActive;
    }
}
