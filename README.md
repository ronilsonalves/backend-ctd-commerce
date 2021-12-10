# Checkpoint Integrador - Backend

Código escrito pelos alunos do Grupo 4 da Turma 4 para o Checkpoint Integrador referente aos requisitos da disciplina de Backend do Certified Tech Developer oferecido pela <b> Mercado Livre </b> e <b>Globant</b> em parceria com a <b>Digital House</b>.

## Integrantes:

- [Henrique Mansuido Tebet](https://github.com/HenriqueTebet)
- [Matheus Augusto](https://github.com/msilvabr1)
- [Patricia Rufino](https://github.com/PatriciaRuffino)
- [Patricia Sprovieri ](https://github.com/patyspro)
- [Ronilson Alves](https://github.com/ronilsonalves)
- [Samuel Francisco Xavier](https://github.com/SamuelFXavier)

## Objetivo

Implementar a API Rest em nosso Backend construído em Java utilizando Java Spring e conexão com Banco de Dados, para o projeto, utilizamos MySQL.

## O desafio

A CTD Commerce é uma empresa que atua neste segmento de mercado e desenvolve soluções em comércio eletrônico. Neste projeto, temos que desenvolver um protótipo de e-commerce para um dos clientes da CTD Commerce.
Atentem-se para o briefing que o cliente da CTD Commerce passou para o desenvolvimento deste protótipo.

## Requisitos Backend

    - Você deverá fazer o back-end de nosso e-commerce em Java com o Framework Spring no modelo MVC.
    - O banco de dados deverá ser o MySQL (Implantado na Amazon RDS). 
    - Modelo de dados: O banco de dados terá duas entidades principais, products e categories. Onde cada produto tem apenas uma categoria e cada categoria pode ter vários ou nenhum produto.

## Endpoints da API

### /produto
`/produto` - Método GET para consumo (exibição de produtos) no Frontend

Abaixo um exemplo de resposta de um GET

```json
[
  {
    "id": 1,
    "titulo": "Iphone 11 Pro Max Apple",
    "preco": 3599.99,
    "descricao": "Pro Max 128g",
    "image": "https://res.cloudinary.com/dac23jyqr/image/upload/v1639085640/imagens/iphone_wf14n2.jpg",
    "categoria": {
      "id": 1,
      "nome": "Eletrônicos"
    }
  },
  {
    "id": 2,
    "titulo": "Notebook Intel Core i5-8265U",
    "preco": 3679.97,
    "descricao": "Notebook HP Core i5-8265U",
    "image": "https://res.cloudinary.com/dac23jyqr/image/upload/v1639159527/computador_ttwwgp.png",
    "categoria": {
      "id": 2,
      "nome": "Eletrônicos"
    }
  }
],
```

`/produto/{id}` - Método GET para consumo (exibição de produtos) por id no Frontend.

Abaixo um exemplo de resposta de um GET (por id)

```json
{
  "id": 1,
  "titulo": "Iphone 11 Pro Max Apple",
  "preco": 3599.99,
  "descricao": "Pro Max 128g",
  "image": "https://res.cloudinary.com/dac23jyqr/image/upload/v1639085640/imagens/iphone_wf14n2.jpg",
  "categoria": {
    "id": 1,
    "nome": "Eletrônicos"
  }
}
```

`/produto/by/{nome}` - Método GET para consumo (exibição de produtos) BUSCA por nome no Frontend.

Abaixo um exemplo de resposta de um GET (pesquisa produto por nome)

```json
[
  {
    "id": 4,
    "titulo": "Geladeira Brastemp Frost Free ",
    "preco": 3250.69,
    "descricao": "Inox EFR-821G-1D1 ",
    "image": "https://res.cloudinary.com/dac23jyqr/image/upload/v1639159942/geladeira_umzsw1.png",
    "categoria": {
      "id": 4,
      "nome": "Eletrodomésticos"
    }
  }
]
```

`/produto/categoria` - Método GET para consumo (exibição de todos os produtos orientados por categoria) exibição de categorias.

Abaixo um exemplo de resposta de um GET

```json
{
    "id": 14,
    "nome": "Beleza",
    "produtos": [
      {
        "id": 14,
        "titulo": "Be(M)dita Ghee Hidratação Banana",
        "preco": 9.9,
        "descricao": "100g Hidratação, Lola Cosmetics",
        "image": "https://res.cloudinary.com/dac23jyqr/image/upload/v1639087662/imagens/cremebanana_d4iju5.png"
      }
    ]
  },
  {
    "id": 15,
    "nome": "Eletrodomésticos",
    "produtos": [
      {
        "id": 15,
        "titulo": "Máquina de lavar Brastemp 12kg",
        "preco": 1799.0,
        "descricao": "Máquina de Lavar Brastemp 12Kg",
        "image": "https://res.cloudinary.com/dac23jyqr/image/upload/v1639090838/imagens/maquinadelavar_uix789.png"
      }
    ]
  }
```

`/produto/categoria/{nome}` - Método GET para consumo (exibição de produtos pelo nome da categoria) BUSCA por categoria no Frontend.

Abaixo um exemplo de resposta de um GET (buscando categoria)

```json
{
    "id": 7,
    "nome": "Beleza",
    "produtos": [
      {
        "id": 7,
        "titulo": "Primer Blur Mágico L'Oréal Paris Revitalift",
        "preco": 31.9,
        "descricao": "Primer 27g",
        "image": "https://res.cloudinary.com/dac23jyqr/image/upload/v1639086975/imagens/prime_wgtspu.png"
      }
    ]
  },
  {
    "id": 8,
    "nome": "Beleza",
    "produtos": [
      {
        "id": 8,
        "titulo": "Sérum Facial Vitamina C 10, Tracta",
        "preco": 35.9,
        "descricao": "Sérum 30ml",
        "image": "https://res.cloudinary.com/dac23jyqr/image/upload/v1639086813/imagens/serum_rpf0ql.jpg"
      }
    ]
  }
```
