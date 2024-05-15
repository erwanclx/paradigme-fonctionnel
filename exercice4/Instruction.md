# Filtrer une liste

Créez une fonction qui prend une liste d'entiers ou de chaînes de caractères et renvoie une nouvelle liste en ayant filtré uniquement les nombres.

Filter_list ([1,2, 'a', 'b']) -> [1,2]
Filter_list ([1, 'a', 'b', 0,15]) -> [1,0,15]
Filter_list ([1,2, 'aasf', '3', '124', 123]) -> [1,2,123]
 

la fonction parseInt(x) converti x en int si possible ou null sinon