# HoroscopApp

This project is an example of an Android application that uses the MVVM architecture along with clean code principles. Below are the technologies and components used in the application.

## Technologies and Components

### MVVM Architecture and Clean Code

The MVVM (Model-View-ViewModel) architecture is used to separate the user interface logic from business data, allowing for cleaner and more maintainable code.

### Fragments

The application uses fragments to manage different parts of the user interface in a modular and reusable way.

### Navigation Component

The Navigation Component is used to manage navigation between fragments and activities in a safe and simple manner, ensuring smooth navigation and proper back stack management.

### Gradle KTS

The project configuration is done using Gradle with Kotlin Script (KTS), which allows for better typing and development tools compared to Groovy scripts.

### Dependency Injection

Dependency injection is implemented using Dagger or Hilt, making it easier to manage and provide dependencies throughout the application, promoting cleaner and more decoupled code.

### StateFlow and Coroutines

StateFlow and Kotlin coroutines are used to manage state and perform asynchronous operations safely and efficiently.

### RecyclerView

To display lists of data efficiently, RecyclerView is used, providing high performance and flexibility in presenting items.

### Retrofit, Interceptors, and Mappers

Retrofit is used to make API calls. Interceptors allow modifying and managing HTTP requests and responses, while mappers transform API data into application models.

### Intents

Intents are used to start activities and services, as well as to send data between application components.

### Camera X

Camera X is implemented to manage the capture and processing of images in a simple and efficient way.

### Animations

The application uses animations to enhance the user experience, making transitions and interactions smoother and more attractive.

### UnitTest and UITest

Unit tests (UnitTest) are implemented to verify business logic and user interface tests (UITest) to ensure the application behaves correctly from the user's perspective.

## Project Structure


|  Horoscope |  Horoscope Details |
|---|---|
| <img src="https://github.com/KiritoMoreno/HoroscopApp/blob/main/app/src/main/res/drawable/HoroscopeUI.webp" style="height: 20%; width:50%;"/> | <img src= "https://github.com/KiritoMoreno/HoroscopApp/blob/main/app/src/main/res/drawable/HoroscopUIDetails.webp" style="height: 20%; width:50%;"/> |

| Luck  | Luck Details |
|---|---|
| <img src="https://github.com/KiritoMoreno/HoroscopApp/blob/main/app/src/main/res/drawable/LuckUI.webp" style="height: 50%; width:50%;"/> | <img src="https://github.com/KiritoMoreno/HoroscopApp/blob/main/app/src/main/res/drawable/LuckUIDetails.webp" style="height: 20%; width:50%;"/> |

| Palmistry  |  |
|---|---|
| <img src="https://github.com/KiritoMoreno/HoroscopApp/blob/main/app/src/main/res/drawable/PalmistryUI.webp" style="height: 20%; width:50%;"/> |  |
