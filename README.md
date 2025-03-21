L'objectif de ce test est l'écriture d'un programme purement backend. Il peut éventuellement servir de support dans le cadre
d'un futur entretien au cours duquel il pourra être demandé de faire des évolutions fonctionelles dessus. Si certaines parties
ne te paraissent pas claires, nous t'encourageons à nous poser toutes les questions que tu juges utiles.

## Enoncé de l'exercice
Le product owner te demande de developper un programme qui permet de calculer le montant à facturer à un client d'Ekwateur pour
un mois calendaire.

Ce programme devra gérer 2 types de clients :

A) Les clients Pro, qui ont les propriétés suivantes :
- Reference Client (EKW + 8 caractères numériques)
- N° SIRET
- Raison Sociale
- CA

B) Les particuliers, qui ont les propriétés suivantes :
- Reference Client (EKW + 8 caractères numériques)
- Civilité
- Nom
- Prénom

Un client peut consommer deux types d'énergies :
- Electricité
- Gaz

Chaque énergie est facturée au kWh.
- Pour les particuliers, le prix du kWh est de 0,121 € pour l'électricité et 0,115€ pour le gaz
- Pour les pro, ayant un CA supérieur à 1 000 000 €, le prix du kWh est de 0,114 € pour l'électricité et 0,111€ pour le gaz
- Pour les pro, ayant un CA inférieur à 1 000 000 €, le prix du kWh est de 0,118 € pour l'électricité et 0,113€ pour le gaz

## Contraintes techniques
La seule contrainte technique est l'utilisation du langage Java dans sa version 8 au minimum.

## Ce qui est attendu
Le minimum attendu est un programme fonctionnel qui puisse etre executé et testé.
