# movies-api

Proyecto Java de demostración de una api CRUD con Spring.

Se ha subido un archivo .csv llamado "imdb_top_1000.csv" para importar los datos que usa la api.

El proyecto consta de los siguientes Mappings.

GET: 
Muestra datos de la tabla
1. /movies
2. /movies/{id}
3. /movies/{id}/movieTitle

POST: 
Permite añadir una pelicula a la tabla
1. /movies

PUT:
Modifica una pelicula
1. /movies

DELETE: 
Elimina una pelicula a través del id
1. /movies/{movieId}
   
BBDD con MySQL.
Se ha testeado con Postman y en localhost.
