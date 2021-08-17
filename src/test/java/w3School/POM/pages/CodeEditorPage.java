package w3School.POM.pages;

import com.microsoft.playwright.Page;

public class CodeEditorPage {
    private final String url = "https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target";
    private final String w3SchoolLink = "a[href='https://www.w3schools.com']";
    private final Page page;

    public CodeEditorPage(Page page) {
        this.page = page;
    }

    public void navigate() {
        page.navigate(url);
    }

    public boolean isCodeEditorPageOpened() {
        return page.url().equals(url);
    }

    public String getW3SchoolLink(){
        return w3SchoolLink;
    }

    public void clickW3SchoolLink() {
//        application.clickLink(w3SchoolLink);
        page.click(w3SchoolLink);
    }

}
