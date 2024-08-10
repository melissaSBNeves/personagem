# Personagem: Um Jogo de Heróis e Vilões

Este projeto é um jogo de combate entre heróis e vilões, onde cada personagem possui poderes que influenciam sua força total. O sistema avalia quem é o vencedor baseado na força total de cada personagem.

## Estrutura do Projeto

O projeto é composto pelas seguintes classes principais:

- **Personagem**: Classe abstrata que representa um personagem (herói ou vilão).
- **Heroi**: Extensão da classe `Personagem` que representa um herói.
- **Vilao**: Extensão da classe `Personagem` que representa um vilão.
- **SuperPoder**: Classe que representa os poderes dos personagens.
- **Confronto**: Classe que gerencia o combate entre heróis e vilões.
- **App**: Classe principal que inicializa o jogo e executa os combates.

## Detalhes da Implementação

### Classes

- **Personagem**
  - `String codinome`: O codinome do personagem.
  - `String nome`: O nome real do personagem.
  - `List<SuperPoder> poderes`: Lista de poderes do personagem.
  - `void adicionarPoder(String nome, Integer categoria)`: Método para adicionar poderes.
  - `abstract Double getForcaTotal()`: Método abstrato para calcular a força total.

- **Heroi e Vilao**
  - Ambas as classes estendem `Personagem` e implementam o método `getForcaTotal()` de forma específica.

- **SuperPoder**
  - `String nome`: Nome do poder.
  - `Integer categoria`: Categoria que define a força do poder.

- **Confronto**
  - `void lutar(Heroi heroi, Vilao vilao)`: Método que executa o combate entre um herói e um vilão.
