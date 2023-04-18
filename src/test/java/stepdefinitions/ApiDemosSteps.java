package stepdefinitions;

import io.cucumber.java.en.Given;
import org.testng.Assert;
import pages.ApiDemosPage;
import utils.DriverManager;

public class ApiDemosSteps {
    ApiDemosPage apiDemosPage=new ApiDemosPage(DriverManager.getDriver());


    @Given("uygulamnin acildigi kontrol edilir")
    public void uygulamninAcildigiKontrolEdilir() {
apiDemosPage.checkApiDemosOpen();



    }

    @Given("uygulamnin basliginin {string} oldugu kontrol edilir")
    public void uygulamninBasligininOlduguKontrolEdilir(String baslik) {
String title=apiDemosPage.getApiDemosTitle();
Assert.assertEquals(title,baslik,"baslik ayni degil");




    }
}
