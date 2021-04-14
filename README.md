# Iceland Day Tours

# Introduction
---------------
The initial interface provides the user with the ability to choose a day tour based on his/her preferences by using drop-down menus to choose region, duration and services. Once user has selected tour he/she can book the tour by pressing “Next step to book” button. The user puts in information (name,SSN,e-mail) and books tour. 
The initial interface also has an administrator button which leads to an admin log-in interface which then leads to the admin interface where the admin can add or delete tours to the database.
This was programmed in IntelliJ IDEA.

# Requirements
---------------
This module requires JavaFX. Install javafx-sdk-11.0.2 visit https://gluonhq.com/products/javafx/ for further information. 

Under File - Project Structure add path to lib file from javafx to libraries.

This module requires SQLite. Install sqlite-jdbc-3.34.0 visit https://mvnrepository.com/artifact/org.xerial/sqlite-jdbc?fbclid=IwAR2xyAn0RNUBbwUGUFi4gdc8W_7N0uvOuyaBX5kDp6FlxzGNpL2P0ju_d7I for further information.

Under class TourDataFactory put the correct path to the database based on where the database folder is located on your device.

