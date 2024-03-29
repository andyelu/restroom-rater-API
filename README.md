# restroom-rater-API
This is the REST API for [ratemyrestroom.net](https://ratemyrestroom.net/), a web app to find and rate University of Arizona restrooms. 

It's created Springboot and serves to store University restroom data and user reviews into a PostgreSQL database, allowing for GET, POST, PUT, and DELETE requests.

## Endpoints:

### api/v1/restroom
_This is a GET mapping that returns a JSON of all the restroom entities in the PostgreSQL database._



### api/v1/restroom/delete/{name}

_This is a DELETE mapping that removes the restroom entity, with the specified name, from the PostgreSQL database._



### api/v1/restroom/{name}

_This is a PUT mapping that allows the user to edit the location address of the specified restroom entity. It takes a JSON request parameter._



### api/v1/restroom/search?name={restroomName}

_This is a GET mapping that returns the address of a specified restroom entity._



### api/v1/reviews

_This endpoint acts as both a GET and POST mapping. As a GET mapping, it returns a JSON of all the review entities in the PostgreSQL database.
As a POST mapping, it adds a new review entity to the database, taking a JSON request parameter._



### api/v1/reviews/{name}

_This is a GET mapping to retrieve all the review entities under a specified restroom name._

### api/v1/reviews/rating/{name}

_This is a GET mapping to retrieve the average rating of a specified restroom._

