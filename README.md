# Mi_primera_aplicacion_con-java
Este sencillo programa de cajero bancario simula las operaciones que se harían en un cajero
Este código en Java simula un sistema bancario muy básico que opera a través de la línea de comandos. Aquí te explico cómo funciona paso a paso:

1.  **Inicialización:**
    * Se declaran e inicializan variables importantes:
        * `nombre`: Almacena el nombre del usuario ("Radamantiz").
        * `saldo`: Guarda el saldo inicial de la cuenta (1500.0).
        * `opccion`: Almacenará la opción que el usuario elija del menú (inicialmente en 0).
        * `cifraIngresadaPorCliente`: Guardará la cantidad de dinero que el usuario desea retirar o depositar.
    * Se crea un objeto `Scanner` llamado `ingresoPorTeclado`. Este objeto se utiliza para leer la entrada del usuario desde la consola.
    * Se muestra un mensaje de bienvenida, el nombre del usuario y el saldo inicial de la cuenta.
    * Se presenta el menú de opciones al usuario:
        * 1: Consultar saldo.
        * 2: Retirar dinero.
        * 3: Depositar dinero.
        * 9: Cerrar la aplicación.

2.  **Bucle Principal (`while` loop):**
    * El programa entra en un bucle `while` que se ejecuta mientras la variable `opccion` sea diferente de 9 (la opción para cerrar la aplicación).
    * Dentro del bucle:
        * Se vuelve a mostrar el menú de opciones al usuario en cada iteración.
        * Se lee la opción ingresada por el usuario utilizando `ingresoPorTeclado.nextInt()` y se almacena en la variable `opccion`.

3.  **Flujo de Operaciones (`switch` statement):**
    * Se utiliza una estructura `switch` para ejecutar diferentes bloques de código según la opción elegida por el usuario.
    * **`case 1:` (Consulta de saldo):**
        * Se muestra el saldo actual de la cuenta al usuario.
        * Se utiliza la instrucción `break` para salir del `switch` después de ejecutar este caso.
    * **`case 2:` (Retiro de dinero):**
        * Se muestra el saldo actual y se pregunta al usuario cuánto desea retirar.
        * Se lee la cantidad ingresada por el usuario y se guarda en `cifraIngresadaPorCliente`.
        * Se realiza una verificación: si la cantidad a retirar (`cifraIngresadaPorCliente`) es mayor que el saldo actual (`saldo`), se muestra un mensaje de error indicando que la cantidad excede el saldo.
        * Si la cantidad a retirar es válida, se resta del saldo (`saldo -= cifraIngresadaPorCliente`) y se muestra el nuevo saldo.
        * Se utiliza `break` para salir del `switch`.
    * **`case 3:` (Depósito de dinero):**
        * Se muestra el saldo actual y se pregunta al usuario cuánto desea depositar.
        * Se lee la cantidad ingresada y se guarda en `cifraIngresadaPorCliente`.
        * Se suma la cantidad depositada al saldo (`saldo += cifraIngresadaPorCliente`) y se muestra el nuevo saldo.
        * Se utiliza `break` para salir del `switch`.
    * **`case 9:` (Cerrar la aplicación):**
        * Se muestra un mensaje de despedida.
        * El bucle `while` terminará porque la condición (`opccion != 9`) se volverá falsa.
    * **`default:` (Opción inválida - implícito):** Si el usuario ingresa cualquier número diferente de 1, 2, 3 o 9, el `switch` no coincidirá con ningún `case` explícito (en este código no hay un `default`, por lo que simplemente no se hará nada específico para entradas inválidas dentro del `switch`, y el bucle `while` continuará mostrando el menú).

4.  **Cierre del Scanner:** Aunque no está explícitamente en el código proporcionado, es una buena práctica cerrar el objeto `Scanner` cuando ya no se necesita para liberar recursos del sistema. Esto se haría después del bucle `while`: `ingresoPorTeclado.close();`.

En resumen, el código crea una interacción básica con el usuario a través de un menú. Utiliza un bucle `while` para mantener la aplicación en funcionamiento hasta que el usuario decide cerrarla, y un `switch` para ejecutar la lógica correspondiente a cada opción del menú, permitiendo consultar, retirar y depositar dinero en una cuenta simulada.





