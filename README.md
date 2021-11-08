# Mini-projet : RPG en Java (POO)

Le mini-projet consiste à créer un RPG basé sur des interactions textuelles en JAVA.
L'utilisateur doit d'abord créer un personnage en choissisant un nom ainsi que le rôle qu'il veut lui attribuer. 
C'est qu'après avoir fait ça, qu'il peut choisir un menu parmi ceux proposés : magasin d'armes, mode aventure, mode mini-jeu.

Le magasin d'armes permet d'acheter de nouvelles armes afin de pouvoir les utiliser dans le mode aventure. 
Puis nous avons le mode aventure : c'est un jeu où le joueur pourra faire des choix pour avancer dans son aventure afin de mener à bien sa quête.
Elle est constituée de 3 étapes. 
Enfin, il y a le mode mini-jeu. Dans l'énoncé, il ait demandé de faire un système de combat permettant de donner des points XP. J'ai donc fait un petit mini-jeu pour que le joueur puisse "combattre" contre l'ordinateur et qu'il ait une chance de gagner des XP. 
L'enjeu étant qu'il peut acheter l'arme la plus puissante, la baguette magique, que s'il a assez de points XP. 

On retrouve notamment dans le projet une classe abstraite pour les étapes du mode aventure en générale puis des classes dédiées à chaque étape reprenant les méthodes que j'ai défini dans la classe abstraite Étape. 
De même, pour les personnages, j'ai essayé de structurer avec des classes. On a une classe Personnage et des classes qui étendent celle-ci comme les classes Sorciere ou Magicien. J'ai crée une interface (classe Humain) dans l'optique de pouvoir avoir la possibilité de faire une classe Monstres ou Animaux par exemple. De cette façon, j'ai la possibilité d'avoir les méthodes que je veux utiliser pour tous les personnages (dans l'interface). Puis d'avoir les méthodes dont j'ai besoin uniquement pour un type de personnage. Il en va de même pour les armes, je les ai structuré de la même manière c'est à dire avec des sous classes. 

Voici ce que l'on a dans la console, quand j'exécute mon code : 

![image](https://user-images.githubusercontent.com/90463820/140826016-55212546-f7ed-4e59-8fe2-7d0a555908f2.png)
![image](https://user-images.githubusercontent.com/90463820/140826005-257e5f51-b469-4141-aa5f-1fbed836165e.png)
![image](https://user-images.githubusercontent.com/90463820/140825994-231edb48-0be8-48fb-b015-fc56c43dec35.png)
![image](https://user-images.githubusercontent.com/90463820/140825979-7936425c-a403-4f74-96c7-217cedcd0190.png)
![image](https://user-images.githubusercontent.com/90463820/140825898-ab27a3b0-99f8-4434-bdbd-5f205327bf1c.png)
