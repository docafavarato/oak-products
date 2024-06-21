<div align="center">
  <h1>Oak Products</h1>
  <img src="https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white">
  <img src="https://img.shields.io/badge/-Spring-6DB33F?logo=spring&style=for-the-badge&logoColor=white"></img>
<img src="https://camo.githubusercontent.com/ff5bae8b465bd0867d4f1b51360e74b93efc962e62c025001c0af0cdf067d496/68747470733a2f2f696d672e736869656c64732e696f2f62616467652f507974686f6e2d3134333534433f7374796c653d666f722d7468652d6261646765266c6f676f3d707974686f6e266c6f676f436f6c6f723d7768697465">
</div>

# Apresentação do projeto
Para cuidar das operações com os Produtos, criei uma API utilizando Spring utilizando um banco de dados em memória e seguindo o padrão MVC.

No frontend, utilizei Flask para gerar templates HTML dinâmicos com base nas ações do usuário (como quando um produto é criado) e HTMX para atualizar a tabela de produtos dinamicamente, sem a necessidade de atualizar a página. Adicionei também filtros de busca por nome e disponibilidade.

O código fonte da API se encontra na pasta `api`, e o código do frontend se encontra na pasta `frontend`.

# Demonstração
https://github.com/docafavarato/oak-products/assets/98183878/1a2939c8-80c4-49b4-8425-2bfeca31c67a

`/products/orderByPriceAsc`
```json
[
  {
    "id": "4ba2dd33-8b8f-454e-a08d-41224aa4a24a",
    "name": "Echo Studio",
    "description": "Our best-sounding smart speaker ever - With Dolby Atmos, spatial audio processing technology, and Alexa | Charcoal",
    "price": 678.98,
    "available": true
  },
  {
    "id": "6c5b3090-25cf-460e-8f9f-8d649cd2c749",
    "name": "SAMSUNG Tablet Galaxy Tab A9",
    "description": "11 polegadas 64 GB, tela grande, alto-falantes quádruplos, chipset atualizado, visor multijanela, fino, leve, design durável, versão dos EUA, 2024, prata",
    "price": 765.99,
    "available": false
  },
  {
    "id": "93652613-8a78-4a2c-a2de-98ae92725d81",
    "name": "Apple iPhone 14 Pro Max",
    "description": "Tela Super Retina XDR de 6,7 polegadas com Always-On e ProMotion.",
    "price": 7999.9,
    "available": true
  },
  {
    "id": "ee6130ec-351c-44d5-a774-14137326e2f5",
    "name": "SAMSUNG Celular Galaxy Z Fold 5",
    "description": "smartphone Android desbloqueado de fábrica, 256 GB, tela grande de 7,6 polegadas para streaming, jogos, visualização de aplicativo duplo",
    "price": 11250.99,
    "available": false
  }
]
```
![image](https://github.com/docafavarato/oak-products/assets/98183878/2314ffa4-4253-4820-b198-4027051cb010)

