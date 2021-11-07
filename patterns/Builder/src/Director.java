public class Director {
    WebsiteBuilder builder;

    public  void setBuilder(WebsiteBuilder builder){
        this.builder = builder;
    }

    Website buildWebsite(){
        builder.createWebsite();
        builder.duildName();
        builder.duildCms();
        builder.duildPrice();
        Website website = builder.getWebsite();

        return website;
    }
}
