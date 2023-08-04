## Git Report for "university.management.system" Code

### Overview:
The provided code consists of three Java classes named "Splash," "Project," and "Login." These classes are part of a university management system application. The "Splash" class displays a splash screen at the application startup. The "Project" class represents the main window of the application with a menu bar for managing faculty and student information, leave applications, and utility functions like Notepad and Calculator. The "Login" class handles the authentication process and grants access to the main application upon successful login.

### Splash Class:
The "Splash" class extends the JFrame class and implements the Runnable interface. It displays a splash screen containing an image using Java Swing components. The image is scaled to a specific size and displayed for three seconds before launching the "Login" class. The "Splash" class efficiently utilizes a separate thread to handle the splash screen, allowing the application to load other components simultaneously.

### Project Class:
The "Project" class extends the JFrame class and implements the ActionListener interface to handle menu item events. It represents the main window of the university management system application and includes a menu bar with several options. The menu options allow users to manage faculty and student information, apply for leave, view leave details, update information, and access utility functions like Notepad and Calculator. The "Project" class efficiently organizes functionalities under appropriate menu categories.

### Login Class:
The "Login" class handles the authentication process for the university management system application. It extends the JFrame class and implements the ActionListener interface. The class presents a simple login form with fields for entering the username and password. Upon clicking the "login" button, the class validates the provided credentials against the database. If the credentials are correct, the main "Project" window is launched; otherwise, an error message is displayed.

### Database Connection:
The "Conn" class establishes a connection to the MySQL database "universitymanagementsystem" with the provided credentials. It uses the MySQL JDBC driver to connect to the database. This class is crucial for performing database operations within the application.
