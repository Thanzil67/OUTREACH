Detailed Description:    
================================================================================================================================================================
Navigate to Be. Cognizant Website and capture the user information.
Click on One Cognizant Application.
Search Outreach in Search bar and click on Outreach application from search results.
Print all menus and submenus are visible while mouse over cursor.
Print Event details based on interest is visible in Outreach.
Validate Search event filter option based on Location, Event type, Weekend/Weekdays, From date and To date and print the search results.
Repeat Step 6 by selecting Random location.
Click on My Volunteering.
Click on Volunteers around me and Print all the Cards.
 
Key Automation Scope:
============================================================================================================================================================
 
Handling alert, different browser windows, search option.
Navigating back to home page.
Extract multiple options items & store in collections.
Capture warning message.
Data Driven approach.
Cross Browser Testing.
 
Output: [Chrome and Edge]
================================================================================================================================================================
 
Initialize the Edge/Chrome WebDriver.
Navigate to Be. Cognizant Website
Capture user information if needed.
Locate the element representing this application and click on it.
Use the search bar to input “Outreach.”
Click on the “Outreach” application from the search results.
Hover over each menu and submenu.
Capture their visibility status (whether they are visible or not).
If event details based on interest are available, print them.
Validate search event filter options such as Location, Event type, Weekend/Weekdays, From date, and To date.
Print the search results.
Select a random location and repeat the validation process.
Locate the element representing “My Volunteering” and click on it.
Print all the cards related to volunteers around you.
 
Jar Files:
============================================================================================================================================================================================================================
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
<modelVersion>4.0.0</modelVersion>
<groupId>selenium1</groupId>
<artifactId>selenium1</artifactId>
<version>0.0.1-SNAPSHOT</version>
<dependencies><!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
<dependency>
<groupId>org.seleniumhq.selenium</groupId>
<artifactId>selenium-java</artifactId>
<version>4.18.1</version>
</dependency>
<!-- https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager -->
<dependency>
<groupId>io.github.bonigarcia</groupId>
<artifactId>webdrivermanager</artifactId>
<version>5.7.0</version>
</dependency>
<!-- https://mvnrepository.com/artifact/org.apache.poi/poi -->
<dependency>
<groupId>org.apache.poi</groupId>
<artifactId>poi</artifactId>
<version>5.2.5</version>
</dependency>
<!-- https://mvnrepository.com/artifact/org.apache.xmlbeans/xmlbeans -->
<dependency>
<groupId>org.apache.xmlbeans</groupId>
<artifactId>xmlbeans</artifactId>
<version>5.2.0</version>
</dependency>
 
<!-- https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml -->
<dependency>
<groupId>org.apache.poi</groupId>
<artifactId>poi-ooxml</artifactId>
<version>5.2.5</version>
</dependency>
<dependency>
<groupId>org.slf4j</groupId>
<artifactId>slf4j-api</artifactId>
<version>2.0.6</version>
</dependency>
 
 
<!-- https://mvnrepository.com/artifact/ch.qos.logback/logback-classic -->
<dependency>
<groupId>ch.qos.logback</groupId>
<artifactId>logback-classic</artifactId>
<version>1.4.5</version>
</dependency>
 
<dependency>
<groupId>org.apache.logging.log4j</groupId>
<artifactId>log4j-to-slf4j</artifactId>
<version>2.8.2</version>
</dependency>
 
<dependency>
<groupId>com.aventstack</groupId>
<artifactId>extentreports</artifactId>
<version>5.1.1</version>
</dependency>
 
		<!-- https://mvnrepository.com/artifact/commons-io/commons-io -->
<dependency>
<groupId>commons-io</groupId>
<artifactId>commons-io</artifactId>
<version>2.15.1</version>
</dependency>
 
		<!-- https://mvnrepository.com/artifact/org.apache.commons/commons-lang3 -->
<dependency>
<groupId>org.apache.commons</groupId>
<artifactId>commons-lang3</artifactId>
<version>3.14.0</version>
</dependency>
 
</dependencies>
</project>