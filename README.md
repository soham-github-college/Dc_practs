**How to run exp 1**

1) Create file named as MyClient.java and paste myclient codefrom exp1.
2) Now craete another file named as MyServer.java and paste myserver code from exp1.
3) open 2 terminal at the same location where your 2 file is saved.

*type below 2 command in one terminal*

    javac MyClient.java
    
    java MyClient
    
*type below command in other terminal*

    javac MyServer.java
    
    java MyServer


**How to run exp 3**

1) Create file named as GroupSender.java and paste myclient codefrom exp3.
2) Now craete another file named as GroupReceiver.java and paste myserver code from exp3.
3) open 2 terminal at the same location where your 2 file is saved.

*type below 2 command in one terminal*

     javac GroupReceiver.java
    
    java GroupReceiver
   
   
*type below command in other terminal*

    javac GroupSender.java
    
    java GroupSender


**Exp 4 directly run hota hai ide me**

**Exp 8**

Create file RoundRobinLoadBalancer.java

paste the code

open terminal

javac RoundRobinLoadBalancer.java

java RoundRobinLoadBalancer 

**EXP 6**

Step 1 − Open a new terminal window or cmd if you are on windows.

Step 2 − Change the directory to the directory in which you have your source.cpp file. For example, if it is in C:/Users/Dell/Documents, enter your command line −

$ cd 'C:/Users/Dell/Documents'
Step 3 − Now enter the following command to compile the source file using g++.

$ g++ -o <name-you-want-to-give> source.cpp
In place of <name-you-want-to-give> replace it by any name like myprogram, etc.

Step 4 − Run it! Now you can run the program using −

$ ./myprogram

    
    
**RMI EXECUTION**

    
For running this rmi example,  
  
1) compile all the java files  
  
javac *.java  
  
2)create stub and skeleton object by rmic tool  
  
rmic AdderRemote  
  
3)start rmi registry in one command prompt  
  
rmiregistry 5000  
  
4)start the server in another command prompt  
  
java MyServer  
  
5)start the client application in another command prompt  
  
java MyClient
