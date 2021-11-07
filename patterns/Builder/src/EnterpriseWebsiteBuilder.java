public class EnterpriseWebsiteBuilder extends WebsiteBuilder {
    @Override
    void duildName() {website.setName("Enterprise web site");}

    @Override
    void duildCms() {website.setCms(Cms.ALIFRESCO);}

    @Override
    void duildPrice() {website.setPrice(1000);}

}
