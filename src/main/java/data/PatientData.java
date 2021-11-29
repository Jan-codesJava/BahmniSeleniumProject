package data;

import org.testng.annotations.DataProvider;

public class PatientData {

    @DataProvider(name = "patientInfo")
    public Object[][] getPatientInfo(){
        return new Object[][]{
                {"David","Hunt","Male","16", "March", "1997", "2200 Devon", "2454445566", "Doctor", "John"},
                {"Sorin","Kind","Male","20", "June", "1990", "3300 Devon", "2346667788", "Supervisor", "Priyanka"},
                {"Sameer","Jain","Male","19", "January", "1995", "4400 Wacker Dr", "3234443344", "Parent", "Gopal"},
                {"Marcus","Mind","Male","18", "July", "1987", "1122 e Though", "5456667788", "Sibling", "Patel"},
                {"Diana","Jain","Female","28", "February", "1997", "4400 Wacker Dr", "3234443345", "Sibling", "Sameer"}
        };
    }
}