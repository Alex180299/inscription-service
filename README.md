# Inscriptions Service

Inscriptions service es un microservicio hecho con Maven y Spring Boot que consume el microservicio `School Service` a través de un feign client y haciendo un balanceo de cargas por medio de Ribbon.  

## Instalación

Clonar el proyecto en el directorio de su elección.
Para editarlo es necesario un importar el proyecto con un IDE compatible con proyectos maven como IntelliJ, Netbeans, Eclipse o Spring Tool Suite.
La persistencia de los datos funciona con una base de datos H2, por lo que no hace falta configurar nada.

## Ejecución

Para ejecutarse se accede a la clase InscriptionsServiceApplication y se ejecuta el método main.
Esto va a crear un servidor en el puerto 8080, en caso de estar el puerto ocupado se puede cambiar el puerto donde se ejecuta en el archivo application.properties dentro del directorio resources.
Cambiar la propiedad server.port = 8080, por algún puerto desocupado.

## Accediendo a la api

Una vez iniciado el servidor para acceder a la api será necesario hacerlo desde un software como postman, el cual hace peticiones al servidor especificado. En este caso se puede acceder a través de la siguiente url:

    http://localhost:puerto/endpoint

Por ejemplo:

    http://localhost:8080/students


## Endpoints

La api contiene los siguientes endpoints:

| Endpoint       | Método                        |Acción                       |
|----------------|-------------------------------|-----------------------------|
|/schools        |`GET`            |Retorna todas las escuelas en formato application/json            |
|/students    |`GET`            |Retorna todos los alumnos que estén inscritos en la base de datos|
|/student/{id}         |`POST`		   | Retorna un estudiante con el id que se pase como parámetro

