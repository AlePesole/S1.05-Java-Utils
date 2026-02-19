# S1.05-Java-Utils
**Descripción**: En este módulo trabajaremos a gestionar archivos y directorios, a leer y escribir datos, a configurar tu código de forma flexible, e incluso a proteger información con técnicas básicas de cifrado.

## 📌 Nivel 1

# Ejercicio 1
-Crea una clase que liste alfabéticamente el contenido de un directorio recibido por parámetro.
-Execute cmd:
- javac src/main/java/DirectoryControl/Directory.java src/main/java/n1ejercicio1/ListDirectory.java
- java -cp src/main/java/ n1ejercicio1.ListDirectory src/main/resources/DirectoryExample1

# Ejercicio 2
-Añade a la clase del ejercicio anterior, la funcionalidad de listar un árbol de directorios con el contenido de todos sus niveles (recursivamente) de forma que se impriman en pantalla en orden alfabético dentro de cada nivel, indicando además si es un directorio (D) o un archivo (F).
-Execute cmd:
- javac src/main/java/DirectoryControl/Directory.java src/main/java/n1ejercicio2/ListDirectoryAllFiles.java
- java -cp src/main/java/ n1ejercicio2.ListDirectoryAllFiles src/main/resources/DirectoryExample1

# Ejercicio 3
-Modifica el ejercicio anterior. Ahora, en lugar de mostrar el resultado por la pantalla, guarda el resultado en un archivo TXT.
-Execute cmd:
- javac src/main/java/DirectoryControl/Directory.java src/main/java/n1ejercicio3/ListDirectoryWriteFile.java
- java -cp src/main/java/ n1ejercicio3.ListDirectoryWriteFile src/main/resources/DirectoryExample1 src/main/resources/DirectoryResult.txt

# Ejercicio 4
-Añade la funcionalidad de leer cualquier archivo TXT y muestra su contenido por consola.
-Execute cmd:
- javac src/main/java/DirectoryControl/Directory.java src/main/java/n1ejercicio4/ListDirectoryReadFile.java
- java -cp src/main/java/ n1ejercicio4.ListDirectoryReadFile src/main/resources/DirectoryResult.txt

# Ejercicio 5
-Ahora el programa debe serializar un Objeto Java a un archivo .ser y después debe deserializarlo.
-Execute cmd:
- javac src/main/java/DirectoryControl/Directory.java src/main/java/n1ejercicio5/*.java
- java -cp src/main/java/ n1ejercicio5.SerializeDeserializePerson src/main/resources

## 📌 Nivel 2 • Ejercicio 1

-Ejecuta el ejercicio 3 del nivel anterior parametrizando todos los métodos en un archivo de configuración: Java Properties.

-Del ejercicio anterior, parametriza lo siguiente:
- Directorio a leer.
- Nombre y directorio del archivo TXT resultante.
-Execute cmd:
- javac src/main/java/DirectoryControl/Directory.java src/main/java/n2ejercicio1/PropertiesN2Exercise1.java
- java -cp src/main/java/ n2ejercicio1.PropertiesN2exercise1

## 🛠 Tecnologías
- Java 21
- IntelliJ IDEA
- GitHub

## 🚀 Clonar repositorio
`git clone https://github.com/AlePesole/S1.05-Java-Utils.git`