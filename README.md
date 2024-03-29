# Application Calculatrice

## Introduction
L'application calculatrice est une application Android développée dans le cadre d'un projet pour fournir une calculatrice scientifique complète avec une interface conviviale et des fonctionnalités avancées. L'objectif principal de cette application est de permettre aux utilisateurs de réaliser des opérations mathématiques avancées à partir de leurs appareils mobiles Android.

## Fonctionnalités principales
- **Calculs avancés**: L'application prend en charge une large gamme de fonctions mathématiques avancées telles que les fonctions trigonométriques (sin, cos, tan), les logarithmes, les racines carrées, etc.
- **Évaluation d'expressions complexes**: Les utilisateurs peuvent saisir des expressions mathématiques complexes et l'application évaluera les résultats avec précision.
- **Gestion des historiques**: L'application conserve un historique des calculs précédents, ce qui permet aux utilisateurs de consulter et de réutiliser facilement leurs résultats précédents.
- **Interface utilisateur intuitive**: L'interface utilisateur est conviviale et bien conçue pour une expérience utilisateur optimale.

## Méthode de développement
L'application calculatrice a été développée en utilisant le langage de programmation Java pour la plate-forme Android. Voici un aperçu de la méthodologie de développement:
- **Langage de programmation**: Java a été choisi comme langage principal pour son support étendu sur la plate-forme Android et sa familiarité parmi les développeurs.
- **Bibliothèques tierces**: L'application utilise des bibliothèques tierces telles que androidx et com.google.android.material pour des composants d'interface utilisateur modernes et des fonctionnalités supplémentaires.
- **Gestion des interfaces utilisateur**: Les interfaces utilisateur ont été conçues en utilisant des fichiers XML pour décrire la disposition et l'apparence des différents éléments de l'application, offrant ainsi une personnalisation facile.
- **Logique de calcul**: La logique de calcul des expressions mathématiques a été implémentée en utilisant la bibliothèque org.mariuszgromada.math.mxparser pour une évaluation précise des expressions.
## XML interfaces utilisateur : 
Dans le cadre de ce projet, nous opterons pour l'utilisation de Material Design afin de concevoir les composants graphiques de notre application. Material Design offre une approche moderne et cohérente pour la conception d'interfaces utilisateur, garantissant une expérience visuelle agréable et intuitive pour les utilisateurs. Pour positionner les composants graphiques dans l'interface portrait, nous privilégierons l'utilisation du layout RelativeLayout. Ce layout flexible nous permettra de définir la position et l'alignement des différents éléments de manière précise et adaptable à différentes tailles d'écran. En mode paysage, nous adopterons le TableLayout pour organiser les boutons de manière plus structurée. Cette disposition en tableau permettra une disposition efficace des boutons tout en conservant une présentation claire et organisée, facilitant ainsi la saisie des données par les utilisateurs.
## Structure du Code Java

### 1. Définition des variables

Nous avons déclaré les variables pour les différents composants de l'interface utilisateur, tels que les boutons et les zones de texte, afin de les référencer et de les manipuler dans le code.

### 2. Assignation des éléments de l'interface et des écouteurs d'événements

Dans la méthode `onCreate()`, nous avons affecté les éléments de l'interface aux variables correspondantes à l'aide de la méthode `findViewById()`. Nous avons également attribué un écouteur d'événements à chaque bouton en utilisant la méthode `setOnClickListener()`.

### 3. Gestion des changements d'orientation

Pour éviter de perdre les données lorsque l'orientation du dispositif change, nous avons redéfini les méthodes `onSaveInstanceState()` et `onRestoreInstanceState()` pour sauvegarder et restaurer les valeurs des zones de texte de solution et de résultat.

### 4. Méthode onClick()

Cette méthode est appelée chaque fois qu'un bouton est cliqué. Elle récupère le texte du bouton cliqué, met à jour l'expression affichée dans la zone de texte de solution, et appelle la méthode `getResult()` pour évaluer l'expression et afficher le résultat.

### 5. Méthode getResult()

Cette méthode prend l'expression mathématique en entrée, effectue des corrections si nécessaire, puis utilise la bibliothèque `mXparser` pour évaluer l'expression et renvoyer le résultat. Elle gère également les erreurs et renvoie "NaN" si une exception est levée lors du calcul.

En organisant notre code de cette manière, nous avons créé une calculatrice fonctionnelle avec une interface utilisateur réactive et une logique de calcul robuste.
## Installation

1. Clonez ce dépôt sur votre machine locale en utilisant `git clone`.
2. Ouvrez le projet dans Android Studio.
3. Connectez un appareil Android ou utilisez un émulateur pour exécuter l'application.

## Captures d'écran
![img_1.png](img_1.png)
![img_2.png](img_2.png)

## Conclusion
L'application calculatrice offre une solution complète pour les besoins de calculs mathématiques avancés sur les appareils Android. Avec une interface intuitive et des fonctionnalités robustes, elle vise à fournir une expérience utilisateur agréable tout en offrant des résultats précis et fiables pour une variété d'opérations mathématiques.

## Démonstration :
https://youtu.be/vxotRh6u0AY
