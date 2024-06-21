# oak-products

# Apresentação do projeto
Para cuidar das operações com os Produtos, criei uma API utilizando Spring que é responsável pela inserção, remoção e recuperação dos mesmos. Utilizei o padrão MVC.

No frontend, utilizei Flask para gerar templates HTML dinâmicos com base nas ações do usuário (como quando um produto é criado) e HTMX para atualizar a tabela de produtos dinamicamente, sem a necessidade de atualizar a página. Adicionei também filtros de busca por nome e disponibilidade.

# Demonstração
https://github.com/docafavarato/oak-products/assets/98183878/1a2939c8-80c4-49b4-8425-2bfeca31c67a

`/products/orderByPriceAsd`
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
