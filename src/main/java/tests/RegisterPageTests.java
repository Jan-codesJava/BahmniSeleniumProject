package tests;

import data.PatientData;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterPatientPage;

public class RegisterPageTests extends TestBase{

    HomePage homePage;
    RegisterPatientPage registerPatientPage;

    @Test(priority = 1)
    public void validatePatientRegister(){
        homePage = new HomePage(driver);
        registerPatientPage = new RegisterPatientPage(driver);
        homePage.clickApp("Register a patient");
        registerPatientPage.registerPatient("David","Hunt","Male","16",
                "March", "1997", "2200 Devon", "2454445566",
                "Doctor", "John");
        Assert.assertEquals(registerPatientPage.getPatientName(), "David, Hunt");
        Assert.assertEquals(registerPatientPage.getPatientAddress(), "2200 Devon");
    }

    @Test(priority = 2, dataProvider = "patientInfo", dataProviderClass = PatientData.class)
    public void validateMultiPatientRegister(String givenName, String familyName, String gender, String birthDay,
                                             String birthMonth, String birthYear, String address, String phoneNumber,
                                             String relationshipType, String personName){
        homePage = new HomePage(driver);
        registerPatientPage = new RegisterPatientPage(driver);
        homePage.clickApp("Register a patient");
        registerPatientPage.registerPatient(givenName, familyName, gender, birthDay, birthMonth, birthYear, address,
                phoneNumber, relationshipType, personName);
        Assert.assertEquals(registerPatientPage.getPatientName(), givenName+", "+familyName);
        Assert.assertEquals(registerPatientPage.getPatientAddress(), address);
    }
}
