const express = require('express');
const { ArduinoData } = require('./serial')
const router = express.Router();
const db = require('./connection');

router.get('/dashboard', (request, response, next) => {

    

    response.json({
        data: ArduinoData.ListTemp,
        total: ArduinoData.ListTemp.length,
        average: isNaN(average) ? 0 : average,
    });

});


router.post('/sendData', (request, response) => {
   

    let data_agora = new Date()

    var sql = "insert into cliente (nomeCliente, sobrenomeCliente, emailCliente, senha) VALUES(?)"; 
    values = [nomeCliente, sobrenomeCliente, data_agora, 1];
    db.query(sql, [values], function(err, result){
        if(err) throw err;
        console.log("Medidas inseridas: " + result.affectedRows)
    });
    response.sendStatus(200);
})

module.exports = router;