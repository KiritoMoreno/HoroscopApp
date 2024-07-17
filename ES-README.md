# HoroscopApp

Este proyecto es un ejemplo de una aplicación Android que utiliza la arquitectura MVVM junto con los principios de clean code. A continuación se detallan las tecnologías y componentes utilizados en la aplicación.

## Tecnologías y Componentes

### Arquitectura MVVM y Clean Code

La arquitectura MVVM (Model-View-ViewModel) se utiliza para separar la lógica de la interfaz de usuario de los datos de negocio, permitiendo un código más limpio y mantenible.

### Fragments

La aplicación utiliza fragments para gestionar diferentes partes de la interfaz de usuario de manera modular y reutilizable.

### Navigation Component

Se utiliza el Navigation Component para gestionar la navegación entre fragments y actividades de manera segura y sencilla, garantizando una navegación fluida y manejando correctamente el back stack.

### Gradle KTS

La configuración del proyecto se realiza utilizando Gradle con Kotlin Script (KTS), lo que permite una mayor tipificación y mejores herramientas de desarrollo en comparación con los scripts de Groovy.

### Inyección de Dependencias

Se implementa la inyección de dependencias mediante Dagger o Hilt, lo que facilita la gestión y provisión de dependencias en toda la aplicación, promoviendo un código más limpio y desacoplado.

### StateFlow y Coroutines

Se utilizan StateFlow y coroutines de Kotlin para gestionar el estado y realizar operaciones asíncronas de manera segura y eficiente.

### RecyclerView

Para mostrar listas de datos de manera eficiente, se utiliza RecyclerView, que proporciona un alto rendimiento y flexibilidad en la presentación de elementos.

### Retrofit, Interceptors y Mappers

Retrofit se utiliza para realizar llamadas a APIs. Los interceptors permiten modificar y gestionar las solicitudes y respuestas HTTP, mientras que los mappers transforman los datos de la API en modelos de la aplicación.

### Intents

Los intents se utilizan para iniciar actividades y servicios, así como para enviar datos entre componentes de la aplicación.

### Camera X

Se implementa Camera X para gestionar la captura y procesamiento de imágenes de manera sencilla y eficiente.

### Animaciones

La aplicación utiliza animaciones para mejorar la experiencia del usuario, haciendo que las transiciones y las interacciones sean más fluidas y atractivas.

### UnitTest y UITest

Se implementan pruebas unitarias (UnitTest) para verificar la lógica del negocio y pruebas de interfaz de usuario (UITest) para asegurar que la aplicación se comporte correctamente desde la perspectiva del usuario.

## Estructura del Proyecto



|  Horoscope |  Horoscope Details |
|---|---|
| <img src="https://github.com/KiritoMoreno/HoroscopApp/blob/main/app/src/main/res/drawable/HoroscopeUI.webp" style="height: 20%; width:50%;"/> | <img src= "https://github.com/KiritoMoreno/HoroscopApp/blob/main/app/src/main/res/drawable/HoroscopUIDetails.webp" style="height: 20%; width:50%;"/> |

| Luck  | Luck Details |
|---|---|
| <img src="https://github.com/KiritoMoreno/HoroscopApp/blob/main/app/src/main/res/drawable/LuckUI.webp" style="height: 50%; width:50%;"/> | <img src="https://github.com/KiritoMoreno/HoroscopApp/blob/main/app/src/main/res/drawable/LuckUIDetails.webp" style="height: 20%; width:50%;"/> |

| Palmistry  |  |
|---|---|
| <img src="https://github.com/KiritoMoreno/HoroscopApp/blob/main/app/src/main/res/drawable/PalmistryUI.webp" style="height: 20%; width:50%;"/> |  |
