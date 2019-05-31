# demo-keycloak

1) Download and run keycloak locally on port 8080 
2) Login into the keycloak admin console (create an admin user on first login)
3) Create a new keycloak "client" under Clients.
4) Set client root url to http://localhost:8082
5) Set the client access type to "confidential"
6) In spring application.properties replace "clientId" and "clientSecret" with those defined in keycloak for your client.
7) Run spring boot and visit the localhost:8082/swagger-ui.html

