// // let interval = setInterval(() => {
// //     console.log("Kual")
// // }, 1000);

// // setTimeout(() => {
// //     clearInterval(interval);
// //     console.log("Dne...")
// // }, 6000);

// // let arr = [1, 2, 3, 4, 5];

// // // Deleting an element from an array
// // // delete arr[2];

// // console.log(arr); // Output: [1, 2, <empty>, 4, 5]

// // for(let i in arr) {
// //     console.log(i)
// // }
// // for(let i of arr) {
// //     console.log(i)
// // }

// // Creating a symbol
// const mySymbol = Symbol();

// // Symbols are guaranteed to be unique
// const anotherSymbol = Symbol();
// console.log(mySymbol === anotherSymbol); // Output: false

// // You can also give symbols a description (optional)
// const namedSymbol = Symbol('description');
// // console.log(namedSymbol)
// // Symbols can be used as unique property keys
// const obj = {};
// obj[mySymbol] = 'value';
// console.log(obj[mySymbol]); // Output: value

// // Symbols are not enumerable in for...in loops
// for (let key in obj) {
//     console.log(key); // This won't log mySymbol
// }

// // You can use Symbol.iterator to create custom iterators
// const iterableObj = {
//     [Symbol.iterator]: function* () {
//         yield 1;
//         yield 2;
//         yield 3;
//     }
// };

// for (let value of iterableObj) {
//     console.log(value); // Output: 1, 2, 3
// }


var event = require('events');
var myEmitter = new event.EventEmitter();
myEmitter.on('anEvent', function(msg,msg2)
{
console.log(msg + msg2);
});
myEmitter.emit('anEvent', 'I am emitted',23);
myEmitter.emit('anEvent', 'I am emitted');
myEmitter.removeAllListeners('anEvent');
myEmitter.emit('anEvent', 'I am emitted');
myEmitter.emit('anEvent', 'I am emitted');

const EventEmitter = require('events');

// Create a new EventEmitter instance
const emitter = new EventEmitter();

// Set the maximum number of listeners for the emitter
emitter.setMaxListeners(10);

// Get the maximum number of listeners allowed for the emitter
const maxListeners = emitter.getMaxListeners();
console.log(`Maximum number of listeners allowed: ${maxListeners}`);

// Add event listeners
for (let i = 0; i < 15; i++) {
    emitter.on('event', () => {
        console.log('Event listener triggered');
    });
}
