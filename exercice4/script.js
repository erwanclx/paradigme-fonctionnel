function filterList(source) {
  return source.filter((item) => typeof item === "number");
}

console.log(filterList([1, 2, "a", "b"]));
console.log(filterList([1, "a", "b", 0, 15]));
console.log(filterList([1, 2, "aasf", "3", "124", 123]));
