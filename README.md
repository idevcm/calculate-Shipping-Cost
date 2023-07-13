1. English manual
2. Manual en español

# Calculate the cost of shipping goods by sea

This program puts us in a fictional situation where we arrive at the Port of Algeciras, the largest port in Spain and 
one of the most important in the world in terms of container traffic.

We are a merchant who wants to transport our goods by sea. We are offered containers with a maximum load of 24,000 kg.
We must inform the person responsible for managing the port of the number of loads we wish to transport, as well as 
the weight of each of them, as we will have to pay a different price depending on this information.

![image](https://user-images.githubusercontent.com/110684532/230785750-30bbe475-5248-4b34-8a9a-de5394e65f9d.png)

## Repository contents

This repository includes:

- An ***SRC*** folder where all the program content is stored.

- A ***JavaDoc*** folder with all the necessary documentation.

- A ***README*** file with instructions in both English and Spanish.

## Requirements

To run the program, you must have the Java JVM installed and updated to the latest version. To check if it is installed or updated, open your computer's terminal and type the following command: ***java -version***

![image](https://user-images.githubusercontent.com/110684532/230031245-1ac3d750-d12f-4071-92cc-4a214a69c727.png)

If the command is not recognized or your JVM is under 18 version, it means that you do not have the JVM installed on your computer or not updated. To install the latest version, please follow the link below:

https://www.oracle.com/es/java/technologies/downloads/

![image](https://user-images.githubusercontent.com/110684532/230032068-d0c2d320-e0d0-463f-bfc0-ec7040409c21.png)

Here is the direct download link for Windows: https://download.oracle.com/java/20/latest/jdk-20_windows-x64_bin.exe

## How to run it

The program is stored in the src folder and consists of 3 packages:

- A package called Exceptions, where classes related to custom exception handling are stored.

- A package called Execution, where all the code related to program execution is located.

- A package called Start, which is responsible for starting the program.

**Navigate to the path src/Start/Main.java to execute the program.**

## How to use it

Let's imagine that we are traders of machinery and sports products and we want to send a shipment by sea.

The program will welcome us to the port of Algeciras and will ask us for the number of packages we want to transport.

![image](https://user-images.githubusercontent.com/110684532/230786870-8f4ffb6c-f572-493f-89ba-68b0f9ad3882.png)

We will say in this case that we have 5 loads: We will have in our hypothetical scenario 20 sets of dumbbells, 3 pull-up machines, 200 protein jars, 3000 t-shirts, and 20 punching bags.

It will ask us to enter the weights of each load to be able to keep track of them.

![image](https://user-images.githubusercontent.com/110684532/230787111-bb7dc703-3303-4937-b30f-e078a62afde0.png)

We should input the numbers and press Enter.

Once we have entered the weight of the last item, the program will display:

- The container with its corresponding ID.

- The number of objects with the weight of each of them.

- The total weight of the container.

- The total price of the shipment.

![image](https://user-images.githubusercontent.com/110684532/230787263-52e9ca7c-2cb4-4b1c-b9c8-34f2104669e0.png)

----------------------------------------------------------------------------------------------

# Calcular el coste de enviar mercancías en barco

Este programa nos sitúa en una situación ficticia, en dicha situción llegamos al puerto de Algeciras, el puerto más 
importante de España y uno de los más importantes del mundo en cuanto a movimiento de contenedores.

Somos un comerciante que desea transportar su mercancía en barco, para ello nos ofrecen contenedores con una
carga máxima de 24,000 Kg. Deberemos decirle a la persona responsable de la gestión del puerto el número de cargas
que deseamos transportar, así como el peso de cada uno de los mismos, ya que en función de estos deberemos
abonar un precio u otro.

![image](https://user-images.githubusercontent.com/110684532/230785750-30bbe475-5248-4b34-8a9a-de5394e65f9d.png)

## Contenido del repositorio

Este repositorio cuenta con:

- Una carpeta **SRC** donde se almacena todo el contenido del programa.

- Una carpeta ***JavaDoc*** con toda la documentación necesaria.

- Un archivo ***README*** con las instrucciones, tanto en inglés como en español.

## Requisitos

Para ejecutar el programa, debes tener instalado la JVM de java o disponer de sus últimas versiones, para comprobar si lo tienes instalado o actualizado, abre la terminal de tu pc y escribe el siguiente comando: ***java -version***

![image](https://user-images.githubusercontent.com/110684532/230031245-1ac3d750-d12f-4071-92cc-4a214a69c727.png)

En el caso de que no reconozca el comando o la versión de tu JVM sea inferior a la 18, quiere decir que no tenemos la JVM instalada en nuestro pc o que bien disponemos de una desactualizada, para arreglar esto siga el siguiente enlace:

https://www.oracle.com/es/java/technologies/downloads/

![image](https://user-images.githubusercontent.com/110684532/230032068-d0c2d320-e0d0-463f-bfc0-ec7040409c21.png)

Enlace directo de descarga para Windows: https://download.oracle.com/java/20/latest/jdk-20_windows-x64_bin.exe

## Cómo ejecutarlo

El programa se almacena en la carpeta **src** y consta de 3 paquetes:

- Un paquete llamado **Exceptions**, donde se almacenan las clases relacionadas con el control de excepciones 
personalizadas.
- Un paquete llamado **Execution**, donde se encuentra todo el código relacionado con la ejecución del programa.
- Un paquete llamado **Start**, que es el paquete encargado de iniciar el programa.

**Dirigase a la ruta src/Start/Main.java para ejecutar el programa**

## Cómo usarlo

Imaginemos que somos comerciantes de máquinas y productos deportivos y deseamos enviar un cargamento en barco.

El programa nos dará la bienvenida al puerto de Algeciras y nos preguntará por el número de paquetes que deseamos 
transportar.

![image](https://user-images.githubusercontent.com/110684532/230786870-8f4ffb6c-f572-493f-89ba-68b0f9ad3882.png)

Nosotros en este caso diremos que tenemos 5 cargas: Tendremos en nuestro supuesto 20 equipos de mancuernas, 
3 máquinas para hacer dominadas, 200 botes de proteínas, 3000 camisetas y 20 sacos de boxeo.

Nos pedirá que introduzcamos los pesos de cada una de las cargas para poder ir contabilizándolas.

![image](https://user-images.githubusercontent.com/110684532/230787111-bb7dc703-3303-4937-b30f-e078a62afde0.png)

Debermos introducir los números y dar al Enter.

Una vez que hayamos introducido el peso del último artículo, el programa nos mostrará:

- El container con su ID correspondiente.
- El número de objetos con el peso de cada uno de los mismos.
- El peso total del container.
- El precio total del coste del envío

![image](https://user-images.githubusercontent.com/110684532/230787263-52e9ca7c-2cb4-4b1c-b9c8-34f2104669e0.png)




