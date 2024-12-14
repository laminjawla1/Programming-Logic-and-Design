// 11. Stock Transaction Program
// Last month Joe purchased some stock in Acme Software, Inc. Here are the details of the purchase:
// • The number of shares that Joe purchased was 1,000.
// • When Joe purchased the stock, he paid $32.87 per share.
// • Joe paid his stockbroker a commission that amounted to 2 percent of the amount he paid for the stock.
// Two weeks later Joe sold the stock. Here are the details of the sale:
// • The number of shares that Joe sold was 1,000.
// • He sold the stock for $33.92 per share.
// • He paid his stockbroker another commission that amounted to 2 percent of the amount he received for the stock.
// Design a Python program that displays the following information:
// • The amount of money Joe paid for the stock.
// • The amount of commission Joe paid his broker when he bought the stock.
// • The amount that Joe sold the stock for.
// • The amount of commission Joe paid his broker when he sold the stock.
// • Did Joe make money or lose money? Display the amount of profit or loss after Joe sold the stock and paid his broker
// (both times).

const shares_at_purchase = 1000
const unit_price_at_purchase = 32.87
const total_at_purchase = shares_at_purchase * unit_price_at_purchase
const commission_at_purchase = 0.02 * total_at_purchase

const shares_at_sale = 1000
const unit_price_at_sale = 33.92
const total_at_sale = shares_at_sale * unit_price_at_sale
const commission_at_sale = 0.02 * total_at_sale

const amount_paid_for_stocks = total_at_purchase + commission_at_purchase
const stocks_sold_for = total_at_sale - commission_at_sale

console.log("Joe paid for stock:", amount_paid_for_stocks)
console.log("Commission Paid at purchase:", commission_at_purchase)
console.log("Joe sold stock for:", stocks_sold_for)
console.log("Commission at sale:", commission_at_sale)
console.log("Profit or Loss:", stocks_sold_for - amount_paid_for_stocks)
