# Creating maintainable test automation framworks using design patterns and good coding practices
<strong>Better coding practices and design patterns for test automation.</strong>
<br>
1. <strong>Single Responsibility Principle:</strong> Instead of creating just page classes in UI automation, create classes for different components on UI and use these classes in your page classes. This way your classes remain smaller, code can be reused and if there are any changes in any component, you just need to make changes to that component class.<br>
2. <strong>Factory Design Pattern:</strong> Create a class that acts as a factory for page objects generation. Also, dont keep your page objects public after creating a Factory class as keeping them public will allow object creation without use of Factory class as well.

