# Traveling UI Automation Testing

## Overview
This project is an end-to-end UI automation test using Selenium WebDriver with Java and TestNG. The test automates flight booking on the website "https://rahulshettyacademy.com/dropdownsPractise/" by selecting departure and destination locations, setting the travel date, choosing passengers, selecting currency, and submitting the form.

## Prerequisites
Before running the automation script, ensure the following tools and dependencies are installed:

- Java Development Kit (JDK) 8 or later
- Selenium WebDriver
- TestNG
- ChromeDriver (managed by WebDriverManager)
- Maven (optional, for dependency management)

## Setup Instructions
1. Clone this repository:
   ```sh
   git clone https://github.com/your-repository/travel-ui-automation.git
   ```
2. Open the project in your preferred IDE (Eclipse, IntelliJ IDEA, or VS Code).
3. Ensure the required dependencies are installed:
   - Add the following Maven dependencies to `pom.xml` if using Maven:
     ```xml
     <dependencies>
         <dependency>
             <groupId>org.seleniumhq.selenium</groupId>
             <artifactId>selenium-java</artifactId>
             <version>4.x.x</version>
         </dependency>
         <dependency>
             <groupId>org.testng</groupId>
             <artifactId>testng</artifactId>
             <version>7.x.x</version>
         </dependency>
         <dependency>
             <groupId>io.github.bonigarcia</groupId>
             <artifactId>webdrivermanager</artifactId>
             <version>5.x.x</version>
         </dependency>
     </dependencies>
     ```
   - If not using Maven, download and manually add Selenium JARs and TestNG to the project's build path.
4. Run the `End_2_End_Testing.java` file as a Java application.

## Test Scenario
The script performs the following steps:
1. Opens the travel booking website.
2. Selects the departure city (IXB) and destination city (BHO).
3. Chooses the current date for travel.
4. Ensures the "Round Trip" option is disabled when "One Way" is selected.
5. Increments the number of adult passengers to 4.
6. Selects currency as USD.
7. Checks the "Friends and Family" checkbox.
8. Clicks the "Search Flights" button.
9. Closes the browser.

## Expected Outcome
- The automation script should complete without errors.
- The selected values should be reflected correctly in the UI.
- The "One Way" trip should not allow return date selection.
- The passenger count should display "4 Adult".

## Troubleshooting
- Ensure ChromeDriver is compatible with your installed Chrome version.
- If elements are not found, verify the XPath or CSS selectors.
- Use explicit waits instead of `Thread.sleep()` for better synchronization.

## Author
Developed by Kundan Prasad

## License
This project is licensed under the MIT License.

