# AABB Skin

### This is the backend portion of AABB Skin. The code is run through a Spring Boot Application and handles all HTTP requests made by the frontend. It is connected to a MongoDB database.

### AABB Skin has capabilities for:
</br></br>**Searching**: The search feature ignores capitalization and absolute terms. For example, searching *moiSTur* would **not** return only objects with the name *moiSTur* and would instead return any object with that substring in any letter casing (moisturizer). To achieve this, multiple endpoints are utilised in order to satisfy various search requirements. These endpoints are also responsible for displaying the full inventory.
</br></br>**Account Creation and Login**: Users can create accounts and login to save their profile information for shopping.
</br></br>**Account Session and Activity Tracking**: Users will be able to save their progress (Cart information, Profile information) at any given point in time during their experience on the site. (Currently in progress)
</br></br>**Payment and Delivery**: This feature is enabled by integrating Stripe's Payment API into the backend. (Currently in progress)

### In order to run the website properly, the back end portion must be running in conjunction. 
### Follow these simple steps below to ensure the back end is running:
- Clone the repository to your local machine: ```git clone https://github.com/joselclee/Website-Back-end.git```.
- Under ```project/src/main/resources```, **create** a new file called **.env**. This is your credential needed to connect to the MongoDB database. Since this is a project, **Andre Lee's** credential will be provided to avoid 3rd party issues.
- Paste </br>
```MONGO_DATABASE="productsdb"``` </br>
```MONGO_USER="alee"``` </br>
```MONGO_PASSWORD="nvCBJgdHI9JdSGxF"```</br>
```MONGO_CLUSTER="products.aqu9rqe.mongodb.net/" ```</br> Into the **.env** file.
- Under project/src/main/java/L0/project, <b>Run</b> ProjectApplication.java
- Open your browser of choice and navigate to ``` https://localhost:8080/```. It should display a whitelabel error code. Ignore this - we are simply validating that the endpoints are capable of recieving HTTP requests.
- Once you have confirmed the above, start the Front End.

