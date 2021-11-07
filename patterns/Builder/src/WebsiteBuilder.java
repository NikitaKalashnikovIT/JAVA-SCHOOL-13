public abstract class WebsiteBuilder {
    Website website;

    void createWebsite(){
        website = new Website();
    }

    abstract void duildName();
    abstract void duildCms();
    abstract void duildPrice();

    Website getWebsite(){
        return website;
    }
}
