package swagLabs.POM.pages;

import com.microsoft.playwright.Page;

public class HomePage {

    private final Page page;
    private final String burgerMenu = "#react-burger-menu-btn";
    private final String logOutButton = "#logout_sidebar_link";
    private final String url = "https://www.saucedemo.com/inventory.html";

    public HomePage(Page page) {
        this.page = page;
    }

    public void navigate() {
        page.navigate(url);
    }

    public boolean isHomePageOpened() {
        return page.url().equals(url);
    }

    public void logOut() {
        page.click(burgerMenu);
        page.click(logOutButton);
    }

}
