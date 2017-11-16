# Respostas S2IT

**1 - E

**2 - D

**3 - C

**4 - A

**5 - A

**6 - C

**7 - E

**8 - Dados dois numeros inteiros A e B, crie um terceiro inteiro C seguindo as seguintes**

regras:

- O primeiro número de C é o primeiro número de A;

- O segundo número de C é o primeiro número de B;

- O terceiro número de C é o segundo número de A;

- O quarto número de C é o segundo número de B;

Assim sucessivamente...

- Caso os números de A ou B sejam de tamanhos diferentes, completar C com o restante

dos números do inteiro maior. Ex: A = 10256, B = 512, C deve ser 15012256.

- Caso C seja maior que 1.000.000, retornar -1

Desenvolva um algoritmo que atenda a todos os requisitos acima.

**9 - Considerando a estrutura de uma árvore binária:**

```
public class BinaryTree {

int valor;

BinaryTree left;

BinaryTree right;

}
```
Desenvolva um método que dado um nó da árvore calcule a soma de todos os nós subsequentes.
