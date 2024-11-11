Project Structure
1. Base Class: Device
Attributes:
type (Enum): A device's type (SMARTPHONE, LAPTOP, TABLET).
name: The name of the device.
price: The price of the device.
weight: The weight of the device.
Methods:
Constructor for initializing all attributes.
Getters and Setters for each attribute.
2. Derived Classes:
Smartphone:
Attributes: screenSize (double), cameraResolution (double).
Laptop:
Attributes: ramSize (int), processorType (String).
Tablet:
Attributes: batteryLife (double), hasStylus (boolean).
Each derived class inherits from the Device class and has its own parameterized constructor to initialize both the inherited and specific attributes.

3. JavaFX GUI Components:
TabPane: Provides tabs for selecting between Smartphone, Laptop, or Tablet.
Text Fields: Inputs for name, price, weight, and specific attributes for each device type.
ListView: Displays the list of devices that have been added.
Buttons: An "Add" button to add devices to the list, and a "Remove" button to remove the selected device from the list.
4. ObservableList:
The devices list is stored in an ObservableList<Device>. This dynamic list automatically reflects changes in the ListView, ensuring that the UI updates when devices are added or removed.
5. ListView and Interactivity:
When a user clicks on a device in the ListView, the details of the selected device are displayed in a label.
Requirements
Java 8 or later (for JavaFX support)
JavaFX libraries configured and accessible for your IDE

![Снимок экрана 2024-11-11 163617](https://github.com/user-attachments/assets/3e32bb04-963c-4478-8778-26ba23b2858c)

![Снимок экрана 2024-11-11 163734](https://github.com/user-attachments/assets/40bc2800-ca0f-4153-bf3b-bd0fa0efb711)

Compile the Java files.
Run the Main.java class to launch the JavaFX application.
Interact with the GUI:

Select a device type from the tabs at the top (Smartphone, Laptop, or Tablet).
Enter the required device details (name, price, weight, and type-specific details).
Click "Add" to add the device to the list.
Devices will be displayed in the ListView. To remove a device, click on it and then click "Remove".
Screenshots
Smartphone Tab:

Shows input fields for name, price, weight, screen size, and camera resolution.
A button to add the smartphone to the list.
Laptop Tab:

Input fields for name, price, weight, RAM size, and processor type.
Tablet Tab:

Input fields for name, price, weight, battery life, and stylus availability.
ListView:

Displays the list of devices added.
Option to select and remove a device.
Sample Inputs
1. Smartphone
Name: "Galaxy S21"
Price: 799.99
Weight: 169.0
Screen Size: 6.2
Camera Resolution: 64.0
2. Laptop
Name: "MacBook Pro"
Price: 1299.99
Weight: 1.37
RAM Size: 16
Processor Type: "Intel Core i7"
3. Tablet
Name: "iPad Pro"
Price: 999.99
Weight: 0.68
Battery Life: 10.5
Has Stylus: true
Evaluation Criteria
OOP Principles: Proper use of inheritance, encapsulation, and polymorphism.
Functionality: The GUI should work as expected, allowing users to add/remove devices.
Code Quality: Clear, concise code with proper naming conventions and comments.
Completeness: The project should include all required components, including a working GitHub repository and a detailed README.


Conclusion
This project demonstrates basic concepts of object-oriented programming, JavaFX GUI development, and user interaction with a ListView. It is an ideal project for those learning Java and JavaFX and showcases how to implement inheritance, create dynamic UI components, and build a simple but functional application.



