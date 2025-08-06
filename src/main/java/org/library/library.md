# Exercices de Révision en Java POO & Streams

Voici une série d'exercices progressifs pour te préparer à ton examen de Java POO, avec un accent particulier sur l'API Stream. Le thème central est la gestion d'une bibliothèque.

---

### **Exercice 1 : La Classe `Livre`** 📘

**Objectifs :**
* Définir une classe avec des attributs privés.
* Créer un constructeur pour initialiser les objets.
* Mettre en place des accesseurs (getters).
* Redéfinir la méthode `toString()` pour un affichage personnalisé.

**Instructions :**

1.  Crée une classe `Livre` avec les attributs suivants :
    * `titre` (String)
    * `auteur` (String)
    * `anneePublication` (int)
    * `ISBN` (String)
2.  Implémente un constructeur qui prend ces quatre attributs en paramètre.
3.  Ajoute des méthodes `get` pour chaque attribut.
4.  Redéfinis la méthode `toString()` pour qu'elle retourne une chaîne de caractères décrivant le livre, par exemple : `"Titre: L'Étranger, Auteur: Albert Camus, Année: 1942, ISBN: 978-2070360024"`.

---

### **Exercice 2 : La Classe `Bibliotheque`** 🏛️

**Objectifs :**
* Gérer une collection d'objets (une liste de `Livre`).
* Implémenter des méthodes pour manipuler cette collection.

**Instructions :**

1.  Crée une classe `Bibliotheque`.
2.  Ajoute un attribut `livres` qui est une `List<Livre>`.
3.  Implémente les méthodes suivantes :
    * `ajouterLivre(Livre livre)` : pour ajouter un nouveau livre à la bibliothèque.
    * `supprimerLivre(String ISBN)` : pour supprimer un livre en utilisant son numéro ISBN.
    * `rechercherParTitre(String titre)` : pour trouver et retourner un `Livre` par son titre (retourne le premier trouvé).
    * `rechercherParAuteur(String auteur)` : pour trouver et retourner la `List<Livre>` d'un auteur donné.

---

### **Exercice 3 : Premiers pas avec les Streams** 💧

**Objectifs :**
* Utiliser la méthode `stream()` pour obtenir un flux de données.
* Utiliser `forEach()` pour itérer sur le stream.

**Instructions :**

Dans la classe `Bibliotheque`, ajoute les méthodes suivantes en utilisant les streams :

1.  `afficherLivres()` : affiche les détails de chaque livre de la bibliothèque sur la console.
2.  `listerTitres()` : affiche uniquement les titres de tous les livres.

---

### **Exercice 4 : Filtrer les données avec `filter()`** 🔍

**Objectifs :**
* Utiliser la méthode `filter()` pour sélectionner des éléments.
* Utiliser `collect()` pour rassembler les résultats dans une nouvelle collection.

**Instructions :**

Dans la classe `Bibliotheque`, ajoute la méthode suivante :

* `livresPubliesApres(int annee)` : retourne une `List<Livre>` contenant uniquement les livres publiés après une année donnée.

---

### **Exercice 5 : Transformer les données avec `map()`** 🗺️

**Objectifs :**
* Utiliser la méthode `map()` pour transformer les objets d'un stream.

**Instructions :**

Dans la classe `Bibliotheque`, ajoute la méthode suivante :

* `titresEtAuteurs()` : retourne une `List<String>` où chaque chaîne est formatée comme suit : `"Titre du livre - Auteur du livre"`.

---

### **Exercice 6 : Trier les données avec `sorted()`** 📊

**Objectifs :**
* Utiliser la méthode `sorted()` pour trier les éléments.
* Utiliser un `Comparator` pour définir le critère de tri.

**Instructions :**

Dans la classe `Bibliotheque`, ajoute la méthode suivante :

* `trierParAnneePublication()` : retourne une `List<Livre>` triée par ordre croissant d'année de publication.

---

### **Exercice 7 : Opérations complexes avec les Streams** ✨

**Objectifs :**
* Combiner plusieurs opérations de stream.
* Utiliser des collecteurs avancés comme `groupingBy` et `counting`.

**Instructions :**

Dans la classe `Bibliotheque`, ajoute la méthode suivante :

* `auteurLePlusProlifique()` : trouve et retourne le nom de l'auteur qui a le plus de livres dans la bibliothèque.