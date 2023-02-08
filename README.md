###### Febrero de 2023. Kevin Pulido Garzón
# PRUEBA NTT - INFORMACIÓN BASICA
Proyecto realizado en Java 8 con SpringBoot. Utiliza una base de datos en memoria H2 donde se almacena la información suministrada para la prueba.

Drive donde se encuentra el .war del proyecto: https://drive.google.com/file/d/10O71zEzPKHXfZ0C4YPLlDN9MI7aA0Wsd/view?usp=sharing

# Servicio

## 1.Consultar
> /consultar
### Descripción
Este servicio recibe un objeto con el tipo de documento y el número de identidad. 
### Restricciones
- La estructura del request debe ser igual a la que se da como ejemplo, de lo contrario la petición no se procesará.
- El tipo de documento solo se procesa si recibe una C o una P
- Los datos de entrada no pueden ser menores a cero.


## Método
**POST**
### EndPoint
```
localhost:8090/consultar
```
### Ejemplo Entrada
```
{
    "TIPO": "C",
    "NUMERO": "23445322"
}

```
### Ejemplo Salida
```
{
    "data": {
        "primerNombre": "Juan",
        "segundoNombre": "Perez",
        "primerApellido": "NTT",
        "segundoApellido": "Prueba",
        "telefono": "123456789",
        "direccion": "Calle falsa 123",
        "ciudad": "Bogota"
    },
    "mensaje": "CONSULTA EXITOSA",
    "exitoso": true,
    "estado": 200
}
```
