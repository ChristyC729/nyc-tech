# Method_Two

This folder is a simple implementation of the requirements.

This structure makes the assumptions that 'Driver' is the parent class with Car and it's Engine an extension of the Driver. Then the public methods in 'Engine' are accesible to the driver through the Car and the private methods are not. This means that the method calls through the Driver can directly access the Car Engine's methods instead of having the user call methods through Car, like in method one.