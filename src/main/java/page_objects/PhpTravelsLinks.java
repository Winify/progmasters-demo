package page_objects;

public enum PhpTravelsLinks {
    Customer("//www.phptravels.net"),
    Administrator("//www.phptravels.net/admin"),
    Supplier("//www.phptravels.net/supplier");

    private String href;

    PhpTravelsLinks(String href) {
        this.href = href;
    }

    public String getHref() {
        return href;
    }
}
