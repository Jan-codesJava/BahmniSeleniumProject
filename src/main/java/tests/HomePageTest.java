package tests;

import data.BusinessData;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTest extends TestBase{

    HomePage homePage;

    @Test
    public void validateHomePageTexts(){
        homePage = new HomePage(driver);
        Assert.assertTrue(homePage.getHeaderText().contains("Inpatient Ward"));
        Assert.assertEquals(homePage.getAppsText(), BusinessData.getExpectedAppNames());
    }
}