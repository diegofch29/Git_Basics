# workshop1

En este proyecto se explora algunos comando de GIT para el curso de ARSW utilizando algunos problemas de hackerrank

## Creando un nuevo repositorio

En esta seccion se muestra como iniciar un proyecto en github.

* Creamos una nueva carpeta llamada Git_Basics_taller en la que se guardara el repositorio y entramos a Git_Basics_Taller.
* Con la siguiente linea creamos un repositorio local.
  ```
  Git Init
  ```
* La imagen muestra el resultado de la linea anterior.

  
 ![Inicio Proyecto](/Imagenes/Screenshot%20from%202020-08-07%2000-13-34.png)
  
## Preservado los cambios

   En la carpeta Git_Basics_Taller guardamos el proyecto que deseamos guardar en este caso usamos el problema de hackerrank [Angrams](https://www.hackerrank.com/challenges/java-anagrams/problem)
   
  ![ICreacion del proyecto](Imagenes/Screenshot%20from%202020-08-07%2014-39-59.png)
    
    
  * Con la siguiente linea agregamos los archivos creados y cambios que se hicieron al repositorio localmente, el punto inidica que se agregaran todos los archivos      tambien podemos agregar archivos especificos al agregar la direccion donde se encuentra el archivo
    ```
    Git add .
    ```
  * La siguiente linea guardara los archivos agregados con la linea anterior al repositorio local, como buena pratica se pone un mensaje el cual describe que cambios se hicieron.
    ```
    Git commit -m "mensage"
    ``` 
## Usando github

   * Lo primero que debemos hacer en ingresar a github y crear un repositorio.
  
   ![Creacion del repositorio](Imagenes/Screenshot%20from%202020-08-07%2020-58-42.png)
   
   * La siguiente linea conectara el repositorio local con el repositorio creado en github.
   ```
   git remote add origin <server>
   ```
   * La siguiente linea agregara los archivos a los que se les hizo commit a la rama principal en el repositorio en github.
   ```
   git push origin master
   ```
   * La imagen muestra las salidas de las lineas anteriores.
    ![Muestra](/Imagenes/Screenshot%20from%202020-08-07%2021-00-09.png)
   
   * Ahora usaremos el comando clone que creara una copia del proyecto en github de manera local.
   
    ```
    git push origin master
    ```
    
   ![clone](/Imagenes/Screenshot%20from%202020-08-07%2021-02-49.png)

   
