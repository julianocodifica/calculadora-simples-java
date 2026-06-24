# Minha Jornada com este Projeto

Olá. Esse foi meu primeiro projeto solo, inspirado por um curso que continha um projeto de calculadora, mas com um código mais avançado. Após minha frustração com esse projeto do curso (extracurricular) eu decidi mostrar a mim mesmo que sou capaz de criar algo simples após 1 mês estudando programação em Java. 

*Obs: foi utilizada a IA para ajudar com erros e alguns métodos mais avançados fora do meu conhecimento. Ex: hasNextDouble(), matches().*

### O que é este código?
É uma calculadora simples que faz um cálculo de soma, subtração, multiplicação ou divisão entre dois números inteiros ou decimais (`double`) e devolve o resultado esperado.

### Quais aspectos interessantes possui esse código?
* Foram utilizadas algumas validações para impedir que o programa retorne um erro e pare de executar o código.
* Loops implementados para a contínua execução do código e para que as validações não ocorram apenas uma vez, e sim até que o usuário coloque um input válido.
* Obviamente, foi utilizado um Scanner para ler os inputs do usuário.
* Possui proteção específica para impedir divisões por zero.

### O que aprendi com esse código?
* Novos métodos da classe Scanner e novas formas de validação de input no Scanner.
* Utilizar `nextLine()` após métodos de input do Scanner para limpar o buffer do ENTER.
* Melhorei meus fundamentos sobre switch case, loop e validações.

---

## README gerado por IA para informações mais detalhadas:

# Calculadora Simples em Java

Meu primeiro projeto solo de programação: uma calculadora executada no terminal focada em lógica, controle de loops e validação robusta de dados.

### Funcionalidades

- **Operações básicas:** soma, subtração, multiplicação e divisão.
- **Validação numérica:** impede travamentos caso o usuário digite texto onde deveriam ser números (utilizando `hasNextDouble()`).
- **Validação de operadores:** aceita estritamente os caracteres `+`, `-`, `x` e `/` utilizando Regex.
- **Proteção contra divisão por zero:** impede operações logicamente impossíveis antes do cálculo ocorrer.
- **Fluxo contínuo:** permite realizar múltiplos cálculos ou encerrar o programa de forma controlada.

### Aprendizados

1. Controle de buffer do Scanner (gerenciamento da quebra de linha `\n`).
2. Tratamento de erros de entrada de dados com `hasNextDouble()`.
3. Validações de texto eficientes com o método `.matches()`.
4. Versionamento de código com Git (commits e uso do `.gitignore`).

### Tecnologias

- Java
- IntelliJ IDEA
- Git / GitHub

---
Desenvolvido por [Juliano Ribeiro](https://github.com/julianocodifica)
