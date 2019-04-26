# santader-test

PRUEBA1 :


-          Dado un fichero de texto crear otro fichero como copia del primero

-          La lectura y escritura del fichero debe hacerse en paralelo (2 threads)

-          La velocidad de escritura y lectura pudiera ser diferente. El thread de lectura debe leer el fichero tan rápido como pueda y cerrarlo cuando termine, sin esperar al de escritura.

SOLUCIÓN:

He utilizado los Streams de JAVA 8 para leyendo de forma continua (sin bloqueo) de una fuente (en este caso un fichero 1), ya escribiendo en otro fichero 2 a medida que se va leyendo cada línea del ficheo 1 sin necesidad de esperar a que termine de leerse el fichero 1.
