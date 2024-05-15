const creditCardValues = ["4556364607935616", "1", "11111"];

function maskify(creditCard) {
  return creditCard.slice(0, -4).replace(/./g, "#") + creditCard.slice(-4);
}

for (let value of creditCardValues) {
  console.log(maskify(value));
}
