package seleniumGrid;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Grid3 {
    public static void main(String[] args) throws MalformedURLException {
        // DesiredCapabilities olustur
        DesiredCapabilities cap=new DesiredCapabilities();

        // DesiredCapabilities icerisine konulacaklari hazirla
        // a-isletim sistemi
        cap.setPlatform( Platform.ANY );
        // b-browser name
        cap.setBrowserName( "Chrome" );
        // c- browser version
        cap.setVersion( "192.168.0.2:4444" );

        // 2- options olusturma

        ChromeOptions options=new ChromeOptions();
        options.merge( cap );
        String hubURL = "http://192.168.178.28:4444";
        // 3- Kodlama
        WebDriver driver=new RemoteWebDriver(new URL( hubURL),options   );
        driver.get( "https://www.google.com/" );
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

    }
}
