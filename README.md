# Flipkart Product Search & Add to Cart Automation

## Overview
This project automates the process of searching for a product (watch) on Flipkart, selecting a product, and adding it to the cart using **Java Selenium WebDriver**.

## Technologies Used
- **Java**
- **Selenium WebDriver**
- **TestNG/JUnit** (for test execution)
- **Maven** (for dependency management)
- **ChromeDriver** (for browser automation)

## Prerequisites
1. Install **Java JDK** (Java 8 or higher).
2. Install **Maven**.
3. Download and set up **ChromeDriver** (ensure it matches your Chrome version).
4. Install a Java IDE (Eclipse).

## Installation Steps
1. **Clone the Repository**:
   ```sh
   git clone https://github.com/yourusername/flipkart-automation.git
   cd flipkart-automation
   ```
2. **Install Dependencies**:
   ```sh
   mvn clean install
   ```
3. **Run the Test**:
   ```sh
   mvn test
   ```

## Automation Flow
1. Open **Flipkart** homepage.
2. Search for **"watch"** in the search bar.
3. Select a product from the search results.
4. Add the product to the cart.
5. Verify that the product is added successfully.

## Project Structure
```
flipkart-automation/
│── src/main/java/
│   ├── pages/        # Page Object Model classes
│   ├── utils/        # Utility classes
│── src/test/java/
│   ├── tests/        # Test execution classes
│── pom.xml           # Maven dependencies
│── README.md         # Project documentation
```

## Dependencies (pom.xml)
Add the following dependencies in your `pom.xml`:
```xml
<dependencies>
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>4.7.0</version>
    </dependency>
    <dependency>
        <groupId>org.testng</groupId>
        <artifactId>testng</artifactId>
        <version>7.6.1</version>
        <scope>test</scope>
    </dependency>
</dependencies>




