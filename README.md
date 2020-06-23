# Chat

Chat Server/Client

TP Final Redes

**PREGUNTAS** 
1.- ¿Qué es un puerto? 

Un puerto proporciona una interfaz física específica entre los dispositivos.También se refiere a un punto de conexión entre redes en forma de nodo en una red en la que los paquetes de datos se dirigen hacia la dirección de destino final. Esto crea 2 definiciones para un puerto como sustantivo. Físicamente, como un componente de hardware externo o interno donde se conectan las conexiones cableadas para establecer líneas de comunicación y transferencia de datos. Un puerto virtual, por otro lado, se refiere a la contraparte en línea o punto de destino para la transferencia de datos. También conocido como puerto de red, identifica un punto donde se envían datos o información. Tanto los puertos virtuales como los físicos son necesarios para establecer y mantener una red.

Existen 2 grandes clasificaciones de puertos: Físico y Virtual. Cada tipo tiene su propia definición, función y tipos.
-Puerto Físico:
Un puerto físico permitía la conexión de componentes de hardware internos o dispositivos externos a la unidad de procesamiento principal del ordenador.Los puertos internos proporcionan conexiones a CD ROM y unidades de disco duro que permiten el funcionamiento de un ordenador. Un puerto externo conecta el dispositivo a módems, impresoras y otros dispositivos periféricos.
Hay varios tipos de puertos físicos en uso, entre los que se incluyen algunos de los más utilizados:
Puerto serie
Puerto paralelo
Puerto SCSI
Puerto USB
Puerto PS/2
Puerto VGA
Conector de alimentación
Puerto Firewire
Puerto Moderno
Puerto Ethernet
Puerto de juego
Puerto DVI
Enchufes
-Puerto virtual:
Las suites de protocolos de Internet como UDP o TCP se basan en puertos virtuales como puntos de conexión para el intercambio de información y la transmisión de datos. Los datos viajan desde un puerto en el dispositivo inicial y se dirigen hacia el extremo receptor de la línea. Un número de puerto es un número entero de 16 bits diseñado específicamente para contener el protocolo utilizado para la transferencia. Funciona para identificar puertos de red específicos manteniendo la dirección IP relacionada y el protocolo aplicado para la conexión. Un número de puerto de origen y un número de puerto de destino se utilizan para determinar los procesos utilizados para enviar y recibir los datos, respectivamente.
En una red TCP/IP estándar se utilizan 2 protocolos principales para la transmisión de datos. Una red TCP o una red UDP. Tanto TCP como UDP se refieren a los protocolos de transporte de datos que definen los métodos mediante los cuales se envía la información a través de las redes. TCP se utiliza cuando los dispositivos se conectan directamente durante el tiempo de transmisión. Al permanecer conectado durante la transferencia de datos, proporciona una conexión estable que hace que el proceso sea rápido y eficiente. La desventaja de un TCP es que depende demasiado del dispositivo y, por lo tanto, le impone una gran carga de trabajo.
Un método diferente para la transferencia de datos es a través de UDP, donde no hay conexión directa entre los dispositivos de envío y recepción. Los paquetes de datos se envían a la red que contiene la información y la dirección de destino. De forma similar a como se envían las cartas por correo, la transferencia de datos se basa en el sistema de red. Sin embargo, existe la posibilidad de que el paquete de datos no llegue a su destino previsto. La ventaja de usar UDP en lugar de TCP para las transferencias de datos es que no presenta una carga tan pesada en el dispositivo.
Ambos dependen de un número de puerto de Internet para una transmisión de datos exitosa. Dado que un puerto de red se utiliza para identificar la aplicación o el proceso en el dispositivo, se asigna un conjunto de números de puerto a diferentes tipos de servicios o programas de red.
0-1023 - Estos números de puerto están reservados para puertos conocidos o de uso común. Asignados por la Autoridad de Números Asignados de Internet (IANA), la mayoría de estos puertos soportan servicios de servidor necesarios para las conexiones de red.
1024-49151 - Estos números de puerto están registrados o semi reservados. Las empresas, organizaciones e incluso individuos pueden registrarse para utilizar estos números de puerto para proporcionar servicios de red con IANA.
49152 - 65535 - Estos números de puerto se refieren a puertos efímeros que son utilizados por los programas cliente.

2.- ¿Cómo están formados los endpoints?

El punto terminal sea crea con la primitiva SOCKET en protocolo TCP.  Un punto terminal es una forma de permitir permitir el envío y recepción de paquetes. Un punto terminal esta compuesto por el proceso que lo crea, un id de ese proceso, el tipo de protocolo que utiliza, la dirección local, puerto local, dirección remota, puerto remoto, y su estado (ESTABLISHED, LISTENING). También se puede indicar paquetes enviados y recibidos, y bytes enviados y recibidos.

3.- ¿Qué es un socket?

Un socket (enchufe), es un método para la comunicación entre un programa del cliente y un programa del servidor en una red, se define, por tanto, como el punto final en una conexión. 
Un socket queda definido por un par de direcciones IP local y remota, un protocolo de transporte y un par de números de puerto local y remoto. Para que dos programas puedan comunicarse entre sí es necesario que se cumplan ciertos requisitos:
Que un programa sea capaz de localizar al otro.
Que ambos programas sean capaces de intercambiarse cualquier secuencia de octetos, es decir, datos relevantes a su finalidad.
Para ello son necesarios los tres recursos que originan el concepto de socket:
Un protocolo de comunicaciones, que permite el intercambio de octetos.
Un par de direcciones del Protocolo de Red (Dirección IP, si se utiliza el Protocolo TCP/IP), que identifica la computadora de origen y la remota.
Un par de números de puerto, que identifica a un programa dentro de cada computadora.
Los sockets permiten implementar una arquitectura cliente-servidor o peer to peer. La comunicación debe ser iniciada por uno de los programas que se denomina programa cliente. El segundo programa espera a que otro inicie la comunicación, por este motivo se denomina programa servidor.
Un socket es un proceso o hilo existente en la máquina cliente y en la máquina servidora, que sirve en última instancia para que el programa servidor y el cliente lean y escriban la información. Esta información será la transmitida por las diferentes capas de red.
Cuando un cliente conecta con el servidor se crea un nuevo socket, de esta forma, el servidor puede seguir esperando conexiones en el socket principal y comunicarse con el cliente conectado, de igual manera se establece un socket en el cliente en un puerto local.
Una aplicación servidor normalmente escucha por un puerto específico esperando una petición de conexión de un cliente, una vez que se recibe, el cliente y el servidor se conectan de forma que les sea posible comunicarse entre ambos. Durante este proceso, el cliente es asignado a un número de puerto, mediante el cual envía peticiones al servidor y recibe de este las respuestas correspondientes.
Similarmente, el servidor obtiene un nuevo número de puerto local que le servirá para poder continuar escuchando cada petición de conexión del puerto original. De igual forma une un socket a este puerto local.

En la actualidad existen varios tipos de socket y cada uno por lo regular se asocia a un tipo de protocolo, por ejemplo:
SOCK_STREAM: está asociado al protocolo TCP, este brinda seguridad en la transmisión de datos, seguridad en la recepción, en la integridad y en la secuencia, entre otros.
SOCK_DGRAM: está asociado al protocolo UDP, e indica que los paquetes viajarán en tipo datagramas, el cual tiene una comunicación asíncrona.

Las propiedades de un socket dependen de las características del protocolo en el que se implementan. Generalmente la comunicación con sockets se realiza mediante un protocolo de la familia TCP/IP (Protocolo de Control de Transmisión/Protocolo de Internet). Los dos más utilizados son: TCP (Protocolo de Control de Transmisión) y UDP (Protocolo de Datagrama de Usuario)
Cuando se implementan con el protocolo TCP, los sockets tienen las siguientes propiedades:
Orientado a conexión.
Se garantiza la transmisión de todos los octetos sin errores ni omisiones.
Se garantiza que todo octeto llegará a su destino en el mismo orden en que se ha transmitido. Estas propiedades son muy importantes para garantizar la corrección de los programas que tratan la información.
El protocolo UDP es un protocolo no orientado a la conexión. Sólo se garantiza que si un mensaje llega, llegue bien. 

4.- ¿A qué capa del modelo TCP/IP pertenecen los sockets? ¿Por qué?

Pertenecen a la capa de transporte, permiten generar conexiones para enviar y recibir bytes. Con las primitivas de sockets tenemos todas las acciones necesarias para poder trabajar en esta tarea. 

5.- ¿Cómo funciona el modelo cliente-servidor con TCP/IP Sockets?

El modelo cliente/servidor, es el modelo de ejecución que siguen todas las aplicaciones de red. Un servidor es un proceso que se está ejecutando en un nodo de la red, y su función es gestionar el acceso a un determinado recurso. Un cliente es un proceso que se ejecuta en el mismo nodo, o en uno diferente, y que realiza peticiones al servidor. Las peticiones están originadas por la necesidad de acceder al recurso que gestiona el servidor.
La comunicación entre cliente y servidor, puede ser o bien orientada a la conexión, o bien sin conexión. En el caso de que la comunicación sea orientada a la conexión, esta se lleva a cabo mediante el establecimiento de circuitos virtuales entre el cliente y el servidor. En este caso, el intercambio de información se realiza con una alta fiabilidad fluyendo la información a través del circuito virtual de una forma secuencial, es decir, tiene un flujo continuo. Esto no ocurre en el caso de que la comunicación sea sin conexión, puesto que aquí el intercambio de información se efectúa mediante el envió de datagramas. La fiabilidad es menor, y al contrario que en el caso anterior, los datagramas no siguen un flujo continuo.
La comunicación sin conexión presenta un aspecto simétrico en la medida de que el iniciador del diálogo puede ser cualquiera de los dos que intervienen. Esto no ocurre en el caso de la comunicación orientada a la conexión, ya que uno de los dos procesos (en posición de cliente) pregunta al otro (en posición de servidor) si acepta esta comunicación.
Dado que la comunicación que normalmente se utiliza es orientada a la conexión, describiremos a continuación cómo sería el comportamiento tanto del cliente como del servidor con este tipo de servicio, mostrando la secuencia de llamadas de cliente y servidor para un servicio sin conexión al final.

- El Servidor: 
El servidor está continuamente esperando peticiones de servicio. Cuando se produce una petición, el servidor despierta y atiende al cliente. Cuando el servicio concluye, el servidor vuelve al estado de espera. De acuerdo con la forma de prestar el servicio, podemos considerar dos tipos de servidores:
- Servidores interactivos: El servidor no sólo recoge la petición de servicio, sino que él mismo se encarga de atenderla. Esta forma de trabajo presenta un inconveniente; si el servidor es lento en atender a los clientes y hay una demanda de servicio muy elevada, se van a originar unos tiempos de espera muy grandes.
- Servidores concurrentes. El servidor recoge cada una de las peticiones de servicio y crea otros procesos para que se encarguen de atenderlas. Este tipo de servidores sólo es aplicable en sistemas multiproceso, como UNIX. La ventaja que tiene este tipo de servicio es que el servidor puede recoger peticiones a muy alta velocidad, porque está descargado de la tarea de atención al cliente. En las aplicaciones donde los tiempos de servicio son variables, es recomendable implementar este tipo de servidores.
Su papel es pasivo en el establecimiento de la comunicación, ya que después de haber avisado al sistema al que pertenece de que está preparado para responder a las peticiones de servicio, el servidor se pone a la espera de peticiones de conexión que provengan de clientes. Para esto dispone de un socket de escucha, enlazado al puerto TCP correspondiente al servicio, sobre el que espera las peticiones de conexión. Cuando llega al sistema una petición de este tipo, se despierta al proceso servidor y se crea un nuevo socket, que se llama socket de servicio, el cual se conecta al cliente. Entonces el servidor podrá, por una parte delegar el trabajo necesario para la realización del servicio a un nuevo proceso (creado por fork) que utilizará entonces la conexión, y por otra parte volverá al socket de escucha.
Después de la aceptación de la comunicación, el servidor tiene dos posibilidades:
- o hacerse cargo de ella, lo que significa eventualmente que otras conexiones pendientes no serán efectivamente aceptadas hasta que el servicio demandado haya sido satisfecho
- o bien subtratar la gestión de la conexión y la realización del servicio mediante un proceso hijo.
En el caso de que la comunicación sea sin conexión, la secuencia de llamadas varía sensiblemente, puesto que no es necesario encolar las peticiones que le llegan al servidor, ni esperar a que la conexión se efectúe. El servidor, una vez conectado al puerto correspondiente, se bloquea hasta que recibe alguna petición por parte de un cliente, contestando a este, y retomando la escucha a la espera de nuevas peticiones.

- El cliente:
El cliente es la entidad activa en el establecimiento de una conexión, puesto que es el que toma la iniciativa de la demanda de conexión a un servidor. Esta demanda se realiza por medio de la primitiva connect, solicitando el establecimiento de una conexión que será conocida por los dos extremos. Además, el cliente está informado del éxito o del fracaso del establecimiento de la conexión.
Para que un proceso cliente inicie una conexión con un servidor a través de un socket, es necesario realizar una llamada a connect. Así, se crea un circuito virtual entre los dos procesos cuyos extremos son los sockets.
Pero en el caso de una comunicación sin conexión, el cliente no utiliza la llamada connect para establecer un circuito virtual entre él y el servidor, sino que lo único que hace es conectarse a un puerto por el cual envía peticiones de servicio a un servidor

- Comunicación cliente/servidor orientada a la conexión:
Una vez establecida la conexión entre un servidor y un cliente a través de dos sockets, los dos procesos pueden intercambiar flujos de información. El corte en diferentes mensajes no está preservado en el socket destino. Esto significa que el resultado de una operación de lectura puede provenir de la información resultado de varias operaciones de escritura. En el caso de los sockets del dominio Internet, una petición de escritura de una cadena de caracteres larga, puede provocar la partición de esta cadena, siendo accesibles los diferentes fragmentos por el socket destino. La única garantía que proporciona el protocolo TCP es que los fragmentos son accesibles en el orden correcto. Esto implica que la sincronización de una recepción y una emisión en una conexión de un mismo número de elementos no está asegurada por este mecanismo.

6.- ¿Cuáles son las causas comunes por la que la conexión entre cliente/servidor falle?

- El puerto del servidor o conexión previa no haya sido correctamente cerrada, por lo que al estar bloqueda/ocupada no permita que un nuevo cliente pueda conectarse mediante dicho puerto. 
- Puede ser que el puerto este siendo utilizado por otra conexión, no permitiendo el ingreso de nuevos clientes.
- Que haya habido algún problema de escritura en el disco duro del servidor.

7.- Diferencias entre sockets UDP y TCP

Hay dos tipos de tráfico por Protocolo de Internet (IP, en inglés). Estos son TCP, que significa Transmission Control Protocol (Protocolo de Control de Transmisión) y UDP, que significa User/Universal Datagram Protocol (Protocolo Universal de Datos/de Usuario). TCP está orientado a conexiones, donde una vez establecida la conexión, la data se puede transmitir en ambas direcciones. UDP es un protocolo de Internet más sencillo, sin necesidad de conexiones. Con él se pueden enviar múltiples mensajes en grupos (paquetes) de data. 
TCP asegura una entrega ordenada y confiable de una serie de data del usuario al servidor y vice versa. UDP no está dedicado a conexiones de punto a punto y no verifica la disponibilidad del quien reciba la data.
TCP es más confiable porque maneja reconocer que se recibió el mensaje y retransmite las partes que se hayan perdido. Esto asegura que nunca se pierde data. UDP no verifica que la comunicación haya llegado porque no tiene los pasos de corroborar y retransmitir en su protocolo.
Las transmisiones por TCP se envían en secuencia y se reciben en la misma secuencia. En el caso de que parte de la data llegue fuera de orden. TCP reordena la data para completarla. En el caso de UDP, la secuencia del mensaje puede cambiar una vez llegue a su destino. No hay manera de predecir en qué orden llegará.
TCP es una conexión pesada que requiere 3 paquetes para una conexión "socket" y maneja control de congestión y confiabilidad. UDP es una capa de transporte liviano diseñado para operar encima de protocolos del Internet. No hay conexiones de rastreo ni ordenamiento de mensajes.
TCP lee data como una secuencia y el mensaje se transmite en segmentos definidos. Los mensajes por UDP son paquetes de data que se envían individualmente y se verifica su integridad al llegar. Los paquetes tienen límites definidos mientras que la secuencia de data no los tiene.
Una conexión de TCP se establece en un vínculo de 3 tiempos ("3-way handshake"), que es un proceso de iniciar y verificar una conexión. Una vez se establece la conexión, puede comenzar la transferencia de data. Luego de la transferencia, la conexión se termina cerrando los circuitos virtuales establecidos.
UDP usa un modelo sencillo de transmisión sin vínculo ("handshake") implícito que garantice confiabilidad, orden o integridad de data. Por ello, UDP provee un servicio poco confiable y la data puede llegar fuera de orden, duplicada o incompleta sin que haya aviso. UDP asume que las correcciones y verificación de errores o no es necesario o se hace por medio de la aplicación activa, evitando usar recursos a nivel de la interfase de la red misma. A diferencia de TCP, UDP es compatible con transmisiones amplias de paquetes (envíos a todos los puntos de una red local) y multi-envíos (enviados a todos los suscriptores.)
Navegar la Internet, email y transferencia de archivos son aplicaciones comunes que hacen uso de TCP. TCP se usa para controlar los tamaños de los segmentos de data, el nivel de intercambio, el flujo y la congestión dentro de la red. TCP es preferido donde se requieren facilidades de corrección de errores a nivel de interfase de red. UDP se usa mayormente por aplicaciones sensitivas a tiempo al igual que servidores que respondes a pequeñas peticiones de un alto número de clientes. UDP es compatible con transmisiones amplias de paquetes--envíos a todos los puntos de una red local--y multi-envíos--enviados a todos los suscriptores. UDP es usado comúnmente en el Sistema de Nombres de Dominios, Voz sobre IP (VoIP, en inglés), el Protocolo de Transferencia de Archivos Triviales y juegos por Internet.

8.- Diferencia entre sync y async sockets.

La diferencia entre los sockets sincronicos y asincronicos es que el programa que los ejecuta puede quedar bloqueado a la espera de enviar/recibir información o tenga que tratar la excepción que surja de la falla en el envío/recepción de la información. El primer caso es el de los sockets sincronicos que bloquean la ejecución a la espera de obtener la información que necesitan para continuar, en cambio los asincronicos continuan con la ejecución independientemente de si esta la información requerida o no para realizar la operación, lo que en caso de falta genera un error que deber ser manejado a través de excepciones por el programa.

Historicamente se han usado sockets sincronicos que son manejados a traves de hilos de entrada/salida para evitar bloqueos en la ejecución. La ventaja que tienen estos es que permiten una implementación más simple y un código más fácil de entender. La clave está en usar hilos para evitar el interbloqueo.

Los sockets asincronicos son por lo general manejados a través de eventos que notifican que cierta información está lista para ser enviada/recibida. Es preferible utilizarlos cuando nos encontramos ante aplicaciones que utilizan un único hilo.



