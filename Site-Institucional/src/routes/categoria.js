var express = require("express");
var router = express.Router();

var categoriaController = require("../controllers/categoriaController");


router.get("/listar", function (req, res) {
    categoriaController.livro(req, res); // mudar function
})



module.exports = router;

