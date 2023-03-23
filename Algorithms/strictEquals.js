let strictEquals = function(a, b) {
  if (isNull(a) && isNull(b)) {
    return false;
  } else if (isValidNumberPair(a, b)) {
    return true;
  } else {
    return Object.is(a, b);
  }
};

let isNull = function(a) {
  try {
    if (typeof(a) === "object") {
      a.length;
    }
    return false;
  } catch {
    return true;
  }
};

let isValidNumberPair = function(a, b) {
  if (typeof(a) === "number" && typeof(b) === "number") {
    if (a - b === 0) {
      return true;
    }
  }
  return false;
}

console.log(strictEquals(1, 1) === true);
console.log(strictEquals(1, 2) === false);
console.log(strictEquals({}, {}) === false);
console.log(strictEquals([1], [1]) === false);
console.log(strictEquals(null, null) === false);
console.log(strictEquals(0, -0) === true);