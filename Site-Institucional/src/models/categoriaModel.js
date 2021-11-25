var database = require("../database/config");
function livro () { 
    var sql = 'select count(*) as contagem, categoria from livro group by categoria;'

    return database.executar(sql);
 }


module.exports = {
    livro,
}
