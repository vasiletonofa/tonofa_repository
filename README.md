spring-websocket-chat
=====================
Chat application using JavaScript-Client with STOMP and SockJs and Spring WebSockets (STOMP over WebSockets)
The application uses [STOMP](http://stomp.github.io/) (over WebSocket) for messaging between browsers and server and [SockJS](https://github.com/sockjs/sockjs-protocol) for WebSocket fallback options.

## Features
- Built with Spring Boot
- Uses Hibernate and Spring data JPA for MYSQL database integration
- User login and registration using Spring Security and Spring Validation
- Chat message broadcasting to all users 
- Users presence tracking 

## Running the app
1. mvn clean
2. mvn clean install
3. Go to the target folder
4. java -jar demo-0.0.1-SNAPSHOT.ja

- http://localhost:8011


