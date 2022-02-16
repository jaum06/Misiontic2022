// Tipos de variables
/* Booleans, 
null: un valor nulo 
undefined: Es un tipo de dato que no se le ha asignado ningun valor
number,
string,
objetos Coleccion de propiedades y esas propiedades tienen valores y pueden tener funciones
Bigint*/


/* const nombre = 'Pedro'
const edad = 10
const esHumano = true
const diaCumpleanos = '10' */

/* console.log(typeof nombre);
console.log(typeof edad);
console.log(typeof esHumano);

console.warn(nombre);
console.error(nombre);
console.log("Su nombre es " + nombre + " y su edad es " + edad * 5);
console.log(nombre, edad, esHumano);

console.log(diaCumpleanos);
console.log(edad); */

// Objeto literal
/* const objeto ={
    propiedad : valor, // Primitivos, Objetos, Funciones, Arreglos
    "1propiedad":valor2
} */

// const persona = {}
const persona = {
    nombre: 'Pedro',
    apellido: 'Picapieda',
    edad: 25,
    direccion: {
        pais: 'Colombia',
        ciudad: 'Medellin',
        edificio:{
            nombre: 'Uniantioquia',
            telefono: '222-3333'
        }
    }
} 

// Notacion Punto
// Set
/* persona.nickname = 'Spiderman' */
// Get
/* console.log(persona); */

// Notacion corchete
// Set
persona['nickname'] = 'Batman'
// Get
/* console.log(persona['nickname']); */

/* const propiedad = 'nombre'
console.log(persona[propiedad]); */

/* function obtenerInformacion(props){
    console.log(persona[props]);
}
obtenerInformacion(propiedad) */

// Desestructuracion
const nombrePersona = persona.nombre;
/* console.log(nombrePersona); */
// const edificio = persona.direccion.edificio.nombre
/* console.log(edificio); */
const { nombre, edad, nickname= 'Spiderman' } = persona

console.log(nombre, edad, nickname);

const{
    direccion: {
        pais, ciudad, edificio
    }
} = persona
console.log(pais, ciudad, edificio);


// paso por valor
let a = 10;
let b = a;

console.log('El valor de a: ', a);
console.log('El valor de b: ', b);
a = 25
console.log('El valor de a: ', a);
console.log('El valor de b: ', b);

// Paso por referencia
const pedro = {
    nombre: 'Pedro',
    edad: 25
}

//let luis = pedro;
/* let luis = {}

luis.nombre = pedro.nombre
luis.edad = pedro.edad

console.log('Pedro: ', pedro);
console.log('Luis: ', luis);

console.log(typeof pedro);
console.log(typeof luis);

pedro.edad = 35
luis.nombre = 'Luis'

console.log('Pedro: ', pedro);
console.log('Luis: ', luis); */

// Operador Spread

let luis = { ... pedro}

console.log('Pedro: ', pedro);
console.log('Luis: ', luis);

console.log(typeof pedro);
console.log(typeof luis);

pedro.edad = 35
luis.nombre = 'Luis'

console.log('Pedro: ', pedro);
console.log('Luis: ', luis);