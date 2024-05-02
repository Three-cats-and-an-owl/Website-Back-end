# AABB Skin

### This is the backend portion of AABB Skin. The code is run through a Spring Boot server and handles all HTTP requests made by the frontend. It is connected to a MongoDB database.

### AABB Skin has capabilities for:
**Searching**: The search feature ignores capitalization and absolute terms. For example, searching *moiSTur* would **not** return only objects with the name *moiSTur* and would instead return any object with that substring in any letter casing (moisturizer). To achieve this, multiple endpoints are utilised in order to satisfy various search requirements. These endpoints are also responsible for displaying the full inventory.
**Account Creation and Login**: Users can create accounts and login to save their profile information for shopping.

**Payment and Delivery**: This feature is enabled by integrating Stripe's Payment API into the backend.
### 

### In order to run the website properly, the back end portion must be running in conjunction. 
### Follow these simple steps below to ensure the back end is running.
- Download the repository onto your local machine.
- Under project/src/main/java/L0/project, <b>Run</b> ProjectApplication.java
- Open your browser and copy paste this link: https://localhost:8080/. It should display a whitelabel error code. Ignore this- we are simply validating that the endpoints are capable of recieving HTTP requests.

