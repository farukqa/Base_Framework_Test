package org.example;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;







public class testJava {
    public static void main(String[] args) throws IOException, InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\fhasan\\Desktop\\driver\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized", "incognito");
        WebDriver driver = new ChromeDriver(options);
        //maximizing the window
        driver.manage().window().maximize();
        //get the Gateway link
        System.out.println("Going to the main page...");
        // save the gateway link in a string
        String baseUrl = "https://www.mmhcloud.com/gateway/login";
        //get the Gateway link
        driver.get(baseUrl);

      Thread.sleep(5000);
      // driver.close();




        //  FileReader fileRead = new FileReader("C:\\Users\\fhasan\\Desktop\\test_reading\\testFile.txt");
     //   BufferedReader bufferRead = new BufferedReader(fileRead);
      //  String contents = Files.readString(Path.of("C:\\Users\\fhasan\\Desktop\\test_reading\\testFile.txt"));
      //  String contents = Files.readString(Path.of("input.txt"));
       // char[] array = new char[22];
       // String contents = FileUtils.readFileToString(new File("C:\\Users\\fhasan\\Desktop\\test_reading\\testFile.txt"));
       // System.out.println(contents);


       /* try {
            bufferRead.read(array);
            System.out.println(("Data in the file: "));
            System.out.println(array);

            bufferRead.close();

        } catch (Exception e) {

        }*/
    }
}