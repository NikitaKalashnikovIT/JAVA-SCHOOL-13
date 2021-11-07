public class VisitCardWebsiteBuilder extends WebsiteBuilder {
    @Override
    void duildName() {website.setName("visit car");}

    @Override
    void duildCms() {website.setCms(Cms.WORDPRESS);}

    @Override
    void duildPrice() {website.setPrice(500);}
}
