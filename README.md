1. Docker file has to be in the root path
2. it be default runs on 8080
3. Docker file name should be Dockerfile only with the first capital D
4. no need of extension
5. command to make docker image => docker build -t simple_springboot_api . <= run from the root path i.e. docker run after making the image
6. this is just simple spring boot application,
   endpoints :-
             /hello =>  return message; =>  message is in properties file as app.message 
             /greet?name=_____ =>  return  "Hi, "+ name + "! Greetings from GreetingController!"; => name is @RequestParam
             /status =>  return "Status is OK! "+msg; => msg is somming from env. variable STATUS
7. setting env. variable with docker command => docker run -e STATUS=ONN <<image_name>>
