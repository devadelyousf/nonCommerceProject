package testFileJson;

import org.testng.annotations.Test;
import reader.ReadDataFromJson;

import java.io.FileNotFoundException;

public class TestFileJson {
    ReadDataFromJson readDataFromJson;
    public void readJson(){
        readDataFromJson=new ReadDataFromJson();
    }

    @Test
    public void readUrl() throws FileNotFoundException {
        readJson();
        System.out.println(readDataFromJson.ReadJsonFile().URL);
    }

    @Test
    public void validUserAndPassword() throws FileNotFoundException {
        readJson();
        System.out.println(readDataFromJson.ReadJsonFile().Login.ValidCredentials.Username);
        System.out.println(readDataFromJson.ReadJsonFile().Login.ValidCredentials.Password);
    }
    @Test
    public void InvalidUserAndPassword() throws FileNotFoundException {
        readJson();
        System.out.println(readDataFromJson.ReadJsonFile().Login.InvalidCredentials.InvalidUsername.Username);
        System.out.println(readDataFromJson.ReadJsonFile().Login.InvalidCredentials.InvalidUsername.Password);
        System.out.println(readDataFromJson.ReadJsonFile().Login.InvalidCredentials.InvalidPassword.Password);
        System.out.println(readDataFromJson.ReadJsonFile().Login.InvalidCredentials.InvalidPassword.Username);

    }

}
