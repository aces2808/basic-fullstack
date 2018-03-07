# Basic Full-stack

A basic full-stack project to ramp up the learning curve of the following technologies:

* Angular
* Ionic
* Spring boot
* Spring Security
* SSO via Oauth2
* Docker 
* AWS

### Prerequisites

* [Java 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) - JDK Version
* [Maven](https://maven.apache.org/download.cgi) - Dependency Management
* [Node Js](https://nodejs.org/en/download) - JS Runtime
* [Angular CLI](https://angular.io/guide/quickstart) - Angular Installation
* [Ionic CLI](https://ionicframework.com/getting-started) - Ionic Installation 

## Getting Started

Run the following commands to initialize the project: <br/>
**Note:** The following commands assumes that everything is already setup.

###### Spring boot Backend

* `git clone https://github.com/aces2808/basic-fullstack.git`.
* `cd basic-fullstack`
* `mvn dependency:resolve`
* `mvn spring-boot:run -pl fullstack-user-api`
* [Launch](http://localhost:8080) 

###### Web UI

* `cd web-fullstack-ui`
* `npm install`
* `ng serve --open` this will launch the web ui through the default browser.

###### Mobile UI

* `cd mobile-fullstack-ui`
* `npm install`
* `ionic serve --lab` this will launch the mobile ui through the default browser.

We will use all of the existing codes to tailor to all of the technologies above.


