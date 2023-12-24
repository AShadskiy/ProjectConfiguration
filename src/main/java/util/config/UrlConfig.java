package util.config;

public class UrlConfig {

    public static final String PORTAL_URL = ConfigManager.getInstance().getDmPortalUrl();
    public static final String BASE_API = ConfigManager.getInstance().getDmBaseEndpoint();
    public static final String AUTH_URL = ConfigManager.getInstance().getDmAuthEndpoint();
    public static final String QUERY_URL = ConfigManager.getInstance().getDmQueryEndpoint();
}
