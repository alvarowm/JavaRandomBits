# Java Random Bits


 Baseado na seção 7.4 (Generation of Random Bits) do livro [Numerical Recipes in C](https://www.amazon.com.br/Numerical-Recipes-book-set-Scientific/dp/0521431085), esse algoritmo de geração aleatória de bits é uma adaptação para Java.<br>
 Esse livro tem como uma das fontes principais o The Art of Computer Programming de Donald Knuth.<br>
 O algoritmo utiliza um polinômio especial de ordem 18:
 
 ```math
x^18 + x^5 + x^2 + x^1 + x^0
```

Este algoritmo não é o mais recomendado para uma linguagem do nível de Java e deve ser usado com cautela, qualquer dúvida sobre as implementações consulte o material original.



A saída demonstra um número bem distribuído de 0s e 1s, segue exemplo:

```
Semente: 6053981739524560208
0s: 2441030
1s: 2451558
%0s: 49.89240868023222
%1s: 50.10759131976778
Bit randomizado: 0
```
 
