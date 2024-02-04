1. build image : with spring boot 3.x no need Dockerfile to build image, spring already integrate it

   mvn spring-boot:build-image

2. run image locally

   docker run --tty --publish 8080:8080 springboot-docker-aws-ecs:0.0.1-SNAPSHOT


3. create tag
   
     docker tag springboot-docker-aws-ecs:0.0.1-SNAPSHOT adjodadev/springboot-docker-aws-ecs:0.0.1-SNAPSHOT

     docker tag springboot-docker-aws-ecs:0.0.1-SNAPSHOT springboot-docker-aws-ecs:1.0.0

4. push tag to dockerhub

   4.1. create new repository on dockerhub (username/repositoryname => adjodamawuli/springboot-docker-aws-ecs)

   4.2. create specific tage to push (docker tag image:tag dockerhub_username/repository:tag)

        docker tag springboot-docker-aws-ecs:1.0.0 adjodamawuli/springboot-docker-aws-ecs:1.0.0

5. push tag to dockerhbu (docker push dockerhub_username/repository:tag)

      docker push adjodamawuli/springboot-docker-aws-ecs:1.0.0