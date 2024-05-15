function DNAStrand(sourceDna) {
  return sourceDna
    .replace(/A/g, "t")
    .replace(/T/g, "a")
    .replace(/C/g, "g")
    .replace(/G/g, "c")
    .toUpperCase();
}

console.log(DNAStrand("ATTGC"));
console.log(DNAStrand("GTAT"));
