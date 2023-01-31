import org.openqa.selenium.chrome.ChromeDriver;

public class Start
{
    public static void main(String[] args)
    {
        IMyImpl myTest = new MyImpl( new ChromeDriver());

        myTest.navigate("https://google.com");
        myTest.rejectCookies();
        myTest.setSearch("Fun with selenium");
        myTest.executeSearch();
        boolean result = myTest.searchExists("4 interesting to-dos with Selenium WebDriver");

        if(result)
        {
            System.out.println("-------------------Your search was successful!-------------------");
        }
        else
        {
            System.out.println("-------------------Your search was NOT successful!-------------------");
        }

        //move into finalize method
        //drv.quit();
    }
}
