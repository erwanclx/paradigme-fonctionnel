function createPhoneNumber(arraySource) {
  console.log(arraySource.length);
  return arraySource.length === 10
    ? `(${arraySource.slice(0, 3).join("")}) ${arraySource
        .slice(3, 6)
        .join("")}-${arraySource.slice(6, 10).join("")}
    `
    : "Please provide 10 length array";
}

console.log(createPhoneNumber([1, 2, 3, 4, 5, 6, 7, 8, 9, 0]));
console.log(createPhoneNumber([1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 11]));
