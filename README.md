# java-remote-method-invocation

Java RMI

## Implement

- Create interface
- Create server
- Create client

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
