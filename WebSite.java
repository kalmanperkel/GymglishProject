package co.gymglishproject.mobile.gymglishproject;

/**
 * Created by kalmanperkel on 29/06/2016.
 */
public class WebSite {

    private String siteUrl;
    private String imgUrl;

    public WebSite(String siteUrl,String img) {
        this.siteUrl = siteUrl;
        this.imgUrl = img;
    }

    public String getSiteUrl() {
        return siteUrl;
    }

    public void setSiteUrl(String siteUrl) {
        this.siteUrl = siteUrl;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
