README de projet INF4301A
COIADO MOTA Lucas

I - Mode d'emploi
II - Difficultés rencontrées
III - Problèmes bloquants

I - Mode d'emploi
Pour compiler le programme, il suffit d'utiliser la commande "make".
Pour supprimer les fichiers compilés et ne conserver que le code source, utlisez la commande "make clean"
Pour lancer les testes unitaires, exécutez la classe Check - "java Check"
Pour lancer les programme, exécutez la classe Jagger - "java Jagger"
Si vous voulez sortir du programme, tapez "q"

J'ai implémenté les fonctions print et ifthenelse, la fonction ifthenelse accepte une autre fonction ifthenelse comment condition, et le programme ne marche pas comment une calculatrice, pour afficher les résultats il faut utiliser print. La fonction ifthenelse possède priorité plus haut que la fonction print.

Le type checker a été implémentée aussi, alors c'est possible faire operations avec les strings comment concatenation avec le opérateur "+" et comparaison (=, <>, <=, <, >=, >). 

II - Difficultés rencontrées
Le principal difficultés rencontré a été le type checker, parce que j'ai créé 3 types d'expression: Exp; ExpBoolean et Instruction. De cette façon, c'était un peu compliqué de trouve le type de l'expression et j'ai créé un flag qui s'appelle type, pour identifier et traiter le variable.

III - Problèmes rencontrés
Au niveau des problèmes non résolus, j'ai pas implémenté les scopes, l'affectation, et les boucles while et for, parce que je n'ai pas eu du temps mais je suis très proche de le finir.

