# java-remote-method-invocation

Java RMI

## Create subfolder classes

    $ mkdir classes

## Implement

- Create interface **IRemoteService.java**
- Create server **RemoteService.java**
- Create client **RemoteClient.java**

## Compile

    javac -d classes RemoteService.java
    javac -d classes RemoteClient.java

## Launch

From the classes folder, execute the following command

    $ rmiregistry

From the root folder, run the server

    $ java -cp ./classes RemoteService

From the root folder, run the client

    $ java -cp ./classes RemoteClient
