function lostSheep(friday, saturday, total) {
  return (
    total -
    friday
      .concat(saturday)
      .reduce((totalSheep, currentDay) => totalSheep + currentDay, 0)
  );
}

console.log(lostSheep([1, 2], [3, 4], 15));
console.log(lostSheep([3, 1, 2], [4, 5], 21));
console.log(lostSheep([5, 1, 4], [5, 4], 29));
console.log(lostSheep([11, 23, 3, 4, 15], [7, 14, 9, 21, 15], 300));
