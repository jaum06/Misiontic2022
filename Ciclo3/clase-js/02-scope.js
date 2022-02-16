'use strict'

if(true){
    var color = "Negro"
}

/* console.log(color) */

//No usar este tipo de declaraciones con var
//nombre = 'Pedro';

//La unica forma de limitar el alcance o scope de una variable de var es dentro de una funcion
function miFuncion(){
    var nombre = "Pedro"
}
//console.log(nombre);

// Scope
var a = 'a';
let b = 'b';
const c = 'c';

/* { 
    var a = 'AAA';
    let b = 'BBB';
    const c = 'CCC';
    console.log('Scope en bloque: ',a, b, c);
} */

function functionScope(){
    var a = 'A';
    let b = 'B';
    const c = 'C';
    /* console.log('Scope funcion: ',a, b, c); */
}

functionScope()

/* console.log('Scope global: ',a, b, c); */

// No es necesario asignarle un valor al declararla
//let variableLet;
let variableLet = 'Verde';
// Genera error siempre debo declararle un valor
//const variableConst;
const variableConst = 'Negro';


/* console.log(variableLet);
console.log(variableConst); */

variableLet = 'Azul'
//variableConst = 'Amarillo'

/* console.log(variableLet);
console.log(variableConst); */


// HOISTING 

// Ejemplo 1
// console.log(saludo);
// var saludo = 'Hola'

// Ejemplo 2
var saludo;
console.log(saludo)
saludo = 'Hola'
