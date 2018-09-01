import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

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

        try{
            twitter.updateStatus("Log: I am tweeting from a bot that I have created ");
        }
        catch (TwitterException te){
            System.out.println(te.getMessage());
        }
    }
}