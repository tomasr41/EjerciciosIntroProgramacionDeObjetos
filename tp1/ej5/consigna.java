/*Se desea modelar un cliente de correo electrónico simple similar al Windows mail,
Thunderbird, etc.
El mismo está simplificado, así que solamente maneja una sola cuenta de correos y
contactos.
Los correos deben estar en una carpeta de correo recibido o de correo enviado según sea
el caso. De cada correo se conoce el asunto, el texto, si está leído o no, el contacto
origen y los contactos destino (uno o varios).
De la cuenta se conoce el nombre del usuario, la dirección de mail, la dirección del
servidor de entrada y la de salida. De cada contacto se conoce su nombre y dirección de
email.
El cliente de correo tiene la siguiente funcionalidad:
● Cantidad de correos -> retorna la cantidad total de correos (recibidos +
enviados)
● Cantidad de correos recibidos -> retorna la cantidad total de correos recibidos
● Cantidad de correos enviados -> retorna la cantidad total de correos enviados
● Cantidad de correos no leídos (solo de los recibidos) -> retorna la cantidad total
de correos no leídos de la carpeta recibidos
● Cantidad de contactos - > retorna la cantidad total de contactos
● AgregarCorreoRecibido(Correo unCorreo) -> Agrega un correo a la carpeta de
recibidos
a) Diseñe en UML una solución al enunciado.
b) Implemente en JAVA la solución propuesta en a) */