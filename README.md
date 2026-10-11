# TP 4 : Héritage avec Hibernate - Stratégies de Mapping

**Réalisé par : Amine Chekkouri**

## 1. Objectif

Ce TP a pour objectif de mettre en pratique les trois stratégies d'héritage avec JPA et Hibernate :

- SINGLE_TABLE
- JOINED
- TABLE_PER_CLASS

Le projet utilise Maven, Hibernate et une base de données H2.

## 2. Structure du projet

Le projet est organisé en trois packages correspondant aux trois stratégies d'héritage étudiées.

<img width="361" height="424" alt="cap1_lab4" src="https://github.com/user-attachments/assets/1248a993-c401-43e5-aab1-58c62c257a2e" />

## 3. Exécution et résultats

### 3.1 Stratégie SINGLE_TABLE

Avec la stratégie SINGLE_TABLE, les différentes classes de la hiérarchie sont stockées dans une seule table. La colonne `vehicule_type` permet de distinguer le type de véhicule.
L'exécution montre que les objets Voiture et Moto sont récupérés depuis la table Vehicule.


<img width="323" height="205" alt="cap2_lab4" src="https://github.com/user-attachments/assets/566a8821-39c8-4e22-b91d-b12109b681ee" />

### 3.2 Stratégie JOINED

Avec la stratégie JOINED, chaque classe possède sa propre table. Hibernate effectue des jointures entre la table Employe et les tables Developpeur et Manager pour récupérer les différents types d'employés.

<img width="318" height="364" alt="cap3_lab4" src="https://github.com/user-attachments/assets/eaf3aafd-b202-40af-a205-21cc19d39fa9" />

### 3.3 Stratégie TABLE_PER_CLASS

Avec la stratégie TABLE_PER_CLASS, chaque classe concrète possède sa propre table. Lors d'une requête polymorphique, Hibernate combine les résultats des tables Livre et Electronique à l'aide d'une opération `UNION ALL`.

<img width="280" height="482" alt="cap4_lab4" src="https://github.com/user-attachments/assets/e1715094-f215-4a10-8599-a538dd5450f7" />

## 4. Conclusion

Ce TP présente les trois stratégies d'héritage JPA avec Hibernate : SINGLE_TABLE, JOINED et TABLE_PER_CLASS. Les tests réalisés montrent les différences entre ces stratégies au niveau des tables et des requêtes SQL générées par Hibernate.
