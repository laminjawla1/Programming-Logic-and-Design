// 4. Total Purchase
// A customer in a store is purchasing five items. Design a Python program that asks for the price of each item, and then
// displays the subtotal of the sale, the amount of sales tax, and the total. Assume the sales tax is 6 percent.

const item_1 = 10
const item_2 = 12
const item_3 = 9
const item_4 = 23
const item_5 = 18

const subtotal = item_1 + item_2 + item_3 + item_4 + item_5
const sales_tax = 0.06 * subtotal
const total = subtotal + sales_tax

console.log("Subtotal:", subtotal)
console.log("Sales Tax:", sales_tax)
console.log("Total:", total)
