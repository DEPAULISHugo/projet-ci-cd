# Projet CI/CD

Ce projet est un TP visant à mettre en pratique mes connaissances théoriques et pratiques en CI/CD. L’objetif est de mettre en oeuvre la livraison continue d'un projet Java Spring Boot.

## Application

Le projet servant d'exemple est une application Spring Boot. Elle met en place un microservice pouvant servir à un commerce.

### Utilisation

En appelant l'adresse /Produits, l'application renvoie la liste des produits disponibles au format JSON.

En appelant l'adresse /Produits/{id}, avec "id" l'identifiant d'un produit, l'application renvoie ce produit au format JSON.

### Tests et documentation

Afin de pouvoir mettre en pratique l'intégration, le code a été commenté dans son intégralité. De plus, des tests couvrent toutes les fonctions de la partie DAO et de la partie métier.

## Pipeline

Pour mettre en place mon pipeline d'intégration continue, j'ai utilisé l'outil directement fourni par Github, c'est-à-dire Github Actions. En effet, après avoir testé Travic CI et Circle CI, Github Actions m'a semblé être la solution la plus simple à mettre en oeuvre. Le fichier de configuration du pipeline se trouve [ici](.github/workflows/maven.yml).

Ce pipeline est exécuté à chaque Push et Pull request effectué sur master. Il se divise en trois étapes majeures : Construire, Tests et Déployer. Ces étapes s'effectuent l'une après l'autre. Cependant, comme les étapes sont simultanées par défaut sur Github Actions, il est nécessaire d'utiliser le mot clé "needs" en précisant l'étape précédente pour obtenir ce résultat. En outre, si l'une des étapes échoue, le processus s'arrête immédiatement. S'il s'agit d'une Pull request, un message d'erreur apparaît, empéchant de poursuivre celle-ci. 

![Pipeline](images/Workflow.png)

### Construire

La première étape permet de s'assurer que le projet est compilable. Pour cela, on utilise la commande maven `mvn -B compile --file pom.xml`. Si celle-ci échoue, cela signifie qu'il n'est pas possible de build le projet. Le pipeline s'arrête aussitôt et envoie un message d'erreur.

### Tests

La deuxième étape permet de s'assurer que le projet valide tous les tests. Cette étape est divisée en deux sous-étapes exécutées en parallèle. Ces dernières effectuent chacunes les tests sur une version différente de Java, l'une testant le projet sur Java 8 et l'autre sur Java 11. Pour effectue cela, on utilise l'ensemble de commandes suivantes :
```
uses: actions/setup-java@v1
      with:
        java-version: <VERSION DE JAVA>
```
Enfin, pour effectuer les tests, on utilise la commande maven `mvn -B test --file pom.xml`

### Déployer

