
This project provides a sample authentication and role base authorization with keycloak as authorization server and a spring-boot project as resource server.
This demo uses keycloak adapter for spring boot and tested with keycloak server version 6.0.1.

1) Download and run keycloak locally on port 8080 
2) Login into the keycloak admin console (create an admin user on first login)
3) Import the file "realm-export.json" <br/>
3.1) Go to "Manage->Import" <br/>
3.2) Select the file "realm-export.json" <br/>
3.3) select the option "skip", if a resource exists <br/>
Note: This will create the new keycloak client "order" with two client roles: ADMIN and USER. It also activate client role mapping for this client so that users roles are included in response to user info queries.
4) Create a new user (Bob) and assign the client roles: ADMIN and USER <br/>
4.1) Go to "Manage->Users" and add a new user <br/>
4.2) Under the option "Role Mappings->Client Roles", select the "order" as client <br/>
4.3) Assign the client roles "ADMIN" and "USER" to this user. <br/>
5) Repeat steps 4.1 to 4.3 to create another user (Dave). However, only assign the client role "USER" to this user.
6) Start the spring boot project and visit <a ref="http://localhost:8082/swagger-ui.html">home page</a> <br/>
6.1) As Bob: you are able to visit localhost:8082/swagger-ui.html, read orders (/GET /orders) and create order (/post /orders) <br/>
6.2) As Dave: you are able to visit localhost:8082/swagger-ui.html, read orders (/GET /orders) but NOT authorized to create an order (/post /orders) <br/>

