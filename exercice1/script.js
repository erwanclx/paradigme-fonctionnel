const busValues = [
  [
    [10, 0],
    [3, 5],
    [5, 8],
  ],
  [
    [3, 0],
    [9, 1],
    [4, 10],
    [12, 2],
    [6, 1],
    [7, 10],
  ],
  [
    [3, 0],
    [9, 1],
    [4, 8],
    [12, 22],
    [6, 1],
    [7, 8],
  ],
];

function number(busStops) {
  return busStops.reduce((totalPeople, currentStop) => {
    totalPeople += currentStop[0];

    try {
      totalPeople -= currentStop[1];
    } catch {
      totalPeople = 0;
    }

    return totalPeople;
  }, 0);
}

for (let value of busValues) {
  console.log(number(value));
}
