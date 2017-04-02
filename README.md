**This is a Sample of MDC - SLF4/LOG4J**
--
* The goal is add PID "Process Id" (dummy) to MDC logger (Mapped Diagnostic Context).
* This is very useful when you want to attach some additional metadata to every line written-out to the logs.
* The same logic you can use to log for example the user session Id.

**_You can test it from the CONSOLE, WEB or THREADS:_**

* **CONSOLE:** print log on command line, run `HomeConsole.java`.
* **WEB:** print log on command line, run `HomeController.java` with `Jetty` embedded server and go to [http://localhost:8080/sample-logback](http://localhost:8080/sample-logback).
* **THREADS:** print log on command line, run `HomeThread.java`.
