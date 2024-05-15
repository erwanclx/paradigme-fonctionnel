function filterList(source) {
  return source.filter((item) => typeof item === "number");
}

console.log(filterList([1, 2, "a", "b"]));
