import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

import java.util.Scanner;

public class TweetBot {
    public static void main(String args[]) throws TwitterException {
        ConfigurationBuilder configurationBuilder = new ConfigurationBuilder();
        configurationBuilder.setDebugEnabled(true)
                .setOAuthConsumerKey("consumerkey")
                .setOAuthConsumerSecret("consumersecret")
                .setOAuthAccessToken("accesstoken")
                .setOAuthAccessTokenSecret("accesstokensecret");

        TwitterFactory twitterFactory = new TwitterFactory(configurationBuilder.build());
        Twitter twitter = twitterFactory.getInstance();

        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter what you would like to tweet: ");
        String tweet = userInput.next();

        try{
            twitter.updateStatus(tweet);
        }
        catch (TwitterException te){
            System.out.println(te.getMessage());
        }
    }
}