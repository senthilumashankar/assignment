assignment
==========
Exercise
Implement a consolebased
social networking application (similar to Twitter) satisfying the scenarios below.
CODE SUBMISSION: Add the code to your own Github account and send us the link.

General requirements
Application
must use the console for input and output;
User
submits commands to the application:
posting: <user name> >
<message>
reading: <user name>
following: <user name> follows <another user>
wall: <user name> wall
Don't
worry about handling any exceptions or invalid commands. Assume that the user will always type the
correct commands. Just focus on the sunny day scenarios.
Use
whatever language and frameworks you want. (provide instructions how to run the application)


To compile the file you need to have ant installed in the machine

Command to compile, you should in the project folder with build.xml

ant compile 

To Run

Set the classpath for the generated classfile in classes folder

using command set %CLASSPATH%=%CLASSPATH%;path...to class in windows
or
export classpath in linux

and finally to run

java com.twitteraccount.app.RunTwitterInConsole
