// 6. Sales Tax
// Design a Python program that will ask the user to enter the amount of a purchase. The program should then compute
// the VAT tax. The program should display the amount of the purchase, the VAT tax, and the total of the sale (which is the
// sum of the amount of purchase plus the VAT tax).
// Hint: Use the value 0.15 to represent 15%.

const amount_of_a_purchase = 18450
const vat_tax = 0.15 * amount_of_a_purchase
const total_sale = amount_of_a_purchase + vat_tax

console.log("Amount of a purchase:", amount_of_a_purchase)
console.log("VAT Tax:", vat_tax)
console.log("Total Sale:", total_sale)
