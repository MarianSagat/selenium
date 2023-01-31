import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyImpl implements IMyImpl {
    public MyImpl(ChromeDriver drv) {
        m_Drive = drv;
    }

    @Override
    public void navigate(String url) {
        m_Drive.navigate().to(url);
    }

    @Override
    public void setSearch(String search) {
        m_Drive.findElement(By.name("q")).sendKeys(search);
    }

    @Override
    public void executeSearch() {
        m_Drive.findElement(By.name("btnK")).click();
    }

    @Override
    public boolean searchExists(String check) {

        return m_Drive.findElements(By.tagName("h3")).stream().anyMatch(webElement -> {
            if (webElement.getText().contains(check))
                return true;

            return false;
        });

        //simplify
/*        for (var element:elements) {
            if(element.getText().contains(check))
                return true;

        }*/
    }

    @Override
    public void rejectCookies() {
        m_Drive.findElement(By.id("L2AGLb")).click();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        m_Drive.quit();
    }

    private ChromeDriver m_Drive;
}
