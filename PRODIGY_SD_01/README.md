# Temperature Converter Spring Boot Application

## Overview

This is a simple Spring Boot application that provides a web interface for converting temperatures between Celsius, Fahrenheit, and Kelvin scales. Users can input a temperature value and select the original unit of measurement, and the application will perform the conversion and display the results.
## Screenshot

## Features

- Convert temperatures between Celsius, Fahrenheit, and Kelvin.
- User-friendly web interface for input and output.
- Responsive design with CSS styling.
- Easily extensible and customizable.

## Prerequisites

Before running the application, ensure you have the following installed:

- Java 8 or higher
- Maven
- Spring Boot

## Getting Started

1. Clone or download this repository to your local machine:

 git clone link

2. Navigate to the project directory:

cd temperature-converter
  

3. Build and run the Spring Boot application:

   mvn spring-boot:run
4. Open your web browser and access the application at [http://localhost:8080](http://localhost:8080).

## Usage

1. Enter a temperature value in the input field.
2. Select the original unit of measurement (Celsius, Fahrenheit, or Kelvin).
3. Click the "Convert" button.
4. The application will display the converted values in Celsius, Fahrenheit, and Kelvin.

## Directory Structure

- `src/main/java`: Contains Java source code.
  - `com.prodigy: Java package for the application.
    - `TemperatureConverterApplication.java`: Main application class with the `main` method.
    - `TemperatureConverter.java`: Class for temperature conversion logic.
    - `TemperatureConversionController.java`: Spring MVC controller for handling web requests.
- `src/main/resources`: Contains resources such as HTML templates and static files.
  - `templates`: HTML templates for web pages.
  - `static/css`: CSS stylesheets.
    

## Customization

You can customize the application by modifying the HTML templates (`index.html` and `result.html`) and the CSS styles (`styles.css`) to match your design preferences.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments

- This project is a simple example of a Spring Boot web application.
- Temperature conversion logic is provided by the `TemperatureConverter` class.

---

