# EJEMPLOS DE CODIGO ÚTILES

En este repositorio planeo reunir algunos ejemplos de código que puedan usar con solo copiar y pegar. Además de incluir alguna explicación de porque se hizo de esa forma y no de otra.

Este es un proyecto que estoy comenzando ahora en Diciembre de 2021 y no sé cuanto tiempo podré dedicarle así que probablemente no esté tan completo como me gustaría.


## Instalación
En una carpeta de su preferencia clonar el repositorio


```bash
git clone git@github.com:Ging1991/UTILES.git
```

## Lupa: Concepto
Esta es una clase útil para mostrar el estado interno de una instancia de cualquier objeto. Ayudará a tener que hacer el típico toString() forzado cuando solo se quiere conocer el estado del objeto.

La lupa tiene dos métodos estáticos, mostrar y mostrar completo. La diferencia es que mostrar completo también muestra los campos que se heredan. Para usarla solo tienen que importar la Lupa y llamar sus métodos con cualquier instancia de su propiedad.

```java
TuClase instancia = new TuClase();
Lupa.mostrar(instancia);
Lupa.mostrarCompleto(instancia);
```

## Pruebas
He probado estos métodos con clases planas, es decir, con solo getters y setters, con clases con herencia y con interfaces y he obtenido resultados satisfactorios.

![Captura 1](/imagenes/capturas/lupa_1.png)

## Contribuciones
Como se pueden imaginar este proyecto esta recién saliendo a la luz y aun no tiene un futuro claro por lo que por ahora no se aceptaran pull request. Mas adelante tal vez establezca algunas reglas y una dirección y entonces eso podría cambiar.

## Licencia
[MIT](https://choosealicense.com/licenses/mit/)

## Otros enlaces
[Canal de youtube](https://www.youtube.com/channel/UCsdNi2EY87x7vPVA9nNtyvA)

[Perfil GIT](https://github.com/Ging1991)
