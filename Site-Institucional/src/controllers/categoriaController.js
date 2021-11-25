var categoriaModel = require("../models/categoriaModel");

function livro (req, res) {
    categoriaModel.livro()
    .then((result) => { 
        return res.json(result)
        
    }).catch((err) => {
        return res.json(error)
    });
  }


module.exports = {
    livro,
}