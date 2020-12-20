# Utiliser Processing depuis IntellijIDEA
[Github](https://github.com/ctruillet/ProcessingOnIntellijIDEA)
## I - Installer IntellijIDEA
Vous êtes étudiant ? ça tombe bien !   
Avec [Github Education](https://education.github.com/) vous avez droit à la licence JetBrains **gratuitement** !    
C'est renouvelable tous les ans tant que vous êtes étudiant.   
Vous n'y avez pas droit ? Pas de soucis ! La version *Community* est gratuite à vie et est tres complète :)   


[Tableau comparatif entre Ultimate et Community](https://www.jetbrains.com/idea/features/editions_comparison_matrix.html)  


## II - Installer Processing
**Processing** est totalement **gratuit** et est disponible [ici](https://processing.org/download/)   .


## III - Importer Processing dans IntellijIDEA
Dans le dossier *Processing*, vous trouverez, dans le dossier *core/library* le fichier *core.jar*.   
Le plus simple, lorsque vous commencez un projet, est de copier ce fichier dans un dossier *lib* de votre projet.   
Ce n'est cependant pas obligatoire.

Dans *IntellijIDEA*, importez la librairie *core.jar* (que vous pouvez renommer en *processing.jar*) depuis le menu *File->Project Structure -> Librairies*.
En cliquant sur le **+**, selectionnez *processing.jar* puis **OK**.


La dernière chose à faire est de créer votre classe *Main.java* de la même manière que *Main.java* disponible dans le dossier *eu.ctruillet.processingOnIntellijIDEA*.



## IV - Bonus & points d'attention

### public static void main (psvm)
La déclaration du *public static void main* est extrêmement importante.    
Si la méthode *PApplet.main()* n'est pas appelée ou ses arguments ne sont pas valides (le chemin vers la mainClass n'est pas valide), alors votre application ne se lancera pas.
Afin d'executer votre main, un triangle vert est disponible à gauche du psvm.   
Après la première execution, vous pouvez lancer le psvm à partir du menu en haut à droite.   

### Ajout de lib
Vous pouvez totalement ajouter des librairies processing.
Pour celà, il vous faut les télécharger depuis l'IDE processing et d'importer **tous** les *.jar* disponibles dans *libraries/<Nom de la librarie>/library* de la même manière que pour *processing.jar*.


### Utilisation des méthodes processing
Afin d'utiliser les méthodes de processing dans d'autres classes, il suffit d'ajouter *Main.processing* devant cette méthode.   
Vous trouverez un exemple avec la classe Circle indépendante de processing mais utilisant des méthodes de processing.

### Prise en main
La prise en main d'*IntellijIDEA* est plus lente que celle d'Eclipse mais lorsqu'il est maitrisé, permet un gain de temps non negligeable.   
Une liaison avec Git est intégrée de base (Menu Git) et peut sûrement vous interesser.
En fouillant un peu, vous trouverez beaucoup de choses qui rendent cet IDE vraiment intéressant.

Dans *File->Settings->Live Template* vous trouverez les alias que vous pouvez totalement personnaliser.   
L'alias de base de *System.out.println()* est *sout*.









---
Clément Truillet (clement@ctruillet.eu) - *27/04/2020*
