Demo de proyecto con Git en el que se llevarán a cabo una serie de commits de manera que refleje el trabajo real a la hora de programar y llevar un control de tu código.

En este proyecto he creado una clase tonta llamada MaquinaExpendedora con unos cuantos métodos y una clase de Test en las que iré creando métodos para probar la funcionalidad implementada, que en este caso es la de sacar galletas de la máquina expendedora.

El objetivo de la creación de este proyecto es aprender a manejarse con los commits y aprender a trabajar en distintas ramas y a resolver conflictos.

-

### Provocación y resolución de un conflicto con git.

* Lo primero que hice fue crearme una rama nueva llamada feature y moverme a ella

```java
$ git branch feature
$ git checkout feature
Switched to a new branch 'feature'
```

* Seguidamente hice un cambio en un comentario e hice commit

```java
$ git commit -m "Cambio comentario en la rama feature"
[feature 74886f8] Cambio comentario en la rama feature
 1 file changed, 1 insertion(+), 1 deletion(-)
```

* Hice checkout a la rama master e hice un cambio tocando la misma linea que había tocado anteriormente en la otra rama

```java
$ git checkout master
Switched to branch 'master'
Your branch is up-to-date with 'origin/master'.

$ git commit -m "Cambio en comentario rama master"
[master 6fcd6ed] Cambio en comentario rama master
 1 file changed, 1 insertion(+), 1 deletion(-)
```

* Ahora intenté hacer un merge (fusión) con la rama feature de la siguiente manera y seguidamente me dio el conflicto:

```java
$ git merge feature 
Automezclado src/main/java/org/hug0ramos/demogit/MaquinaExpendedora.java
CONFLICTO(contenido): conflicto de fusión en src/main/java/org/hug0ramos/demogit/MaquinaExpendedora.java
Automatic merge failed; fix conflicts and then commit the result.
```

* Lo que he hecho es corregir el conflicto en la rama master y hacer el commit.

Author: Hugo Ramos Rico
