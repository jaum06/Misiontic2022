// Funciones
/* 

    Un bloque de codigo reutilizable

    function nombreFuncion(parametro1, parametro2, ...){
        // Codigo
    }

    Tipo Funciones
    // Funcion por declaracion
    function funcionPorDeclaracion(parametros){
        // Cuerpo
    }


    // Funcion por expresion
    const funcionPorExpresion = function(parametros){
        // Cuerpo
    }


*/

function primeraFuncion(a) {
    console.log(a);
}

// primeraFuncion(2);

function suma(a, b) {
    console.log(a + b);
}

// suma(2, 3)

function nombreCompleto(nombre, apellido = "No tiene") {
    // console.log(`${nombre} ${apellido}`);
}

nombreCompleto('Pedro', 'Picapiedra')

function multiplicacion(numeroA, numeroB = 0) {
    console.log(numeroA * numeroB);
}
// multiplicacion(4)
// multiplicacion(4,4)

// Devolver valores
function numeroAleatorio() {
    return Math.round(Math.random() * 30)
    // Si encuentra un return la funcion se acaba
    const nombre = 'Pedro'
}

// console.log(numeroAleatorio());

const numero = numeroAleatorio()
// console.log(numero);


function sumar() {
    console.log('Hola mundo');
    console.log(arguments);

    const a = arguments[0]
    const b = arguments[1]

    console.log(a + b);

}

sumar(2, 4)


// Funcion por definicion
// function saludar(nombre) {
//     return `Hola ${nombre}`
// }

// Funciones por expresion me evita que la sobreescriban
// const saludar = function saludar(nombre) {
//     return `Hola ${nombre}`
// }


// Sobreescribir
// saludar = true


// console.log(saludar('Pedro'));
// console.log(saludar);

// Arrow Function

// const saludar = nombre => `Hola ${nombre}`
// Retorno implicito
// const saludar = (nombre, apellido) => `Hola ${nombre} ${apellido}`

const saludar = (nombre, apellido) => {
    // Mas codigo
    // return `Hola ${nombre} ${apellido}`
    console.log(`Hola ${nombre} ${apellido}`);
}
// console.log(saludar('Pedro', 'Picapiedra'));

// Return implicito
// const getUser = ()=>{
//     return{
//         nombre: 'Pedro',
//         apellido: 'Picapiedra'
//     }
// }

const getUser = ()=>(
    {
        nombre: 'Pedro',
        apellido: 'Picapiedra'
    }
)

console.log(getUser());
