**Explanation the code**

·      The Appliance class is declared asabstract, meaning it cannot be instantiated directly. It serves as a blueprintfor other classes.

·      It contains an abstract methodturnOn(), which has no implementation in the Appliance class. Subclasses arerequired to provide their own implementation of this method.

·      The Fan and TV classes extend theAppliance class, inheriting its properties.

·      Each subclass provides its ownimplementation of the turnOn() method:

o  Fan prints "Fan is turned onand spinning."

o  TV prints "TV is turned on anddisplaying a show."

·      This demonstrates abstraction, asthe turnOn() method is defined generically in the parent class but implementedspecifically in each subclass.

·      In the Main class, I created objectsof Fan and TV but stored them in variables of type Appliance. This is anexample of polymorphism, where the parent class type (Appliance) can refer toobjects of its subclasses (Fan and TV).

·      When we call fan.turnOn() andtv.turnOn(), the respective implementations in Fan and TV are executed, showinghow abstraction allows us to use a common interface (turnOn()) while the actualbehavior varies based on the object type.

·      Output of the Program when you runthe program, the output will be:

_Fan is turned on and spinning._

_TV is turned on and displaying a show._

*   Abstraction is achieved by defining a common method (turnOn()) in the abstract class Appliance without specifying its behavior. The subclasses provide the specific behavior, allowing the program to treat different appliances uniformly through the Appliance type while executing the appropriate turnOn() method at runtime.
