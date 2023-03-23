let strictEquals = function(a, b) {
  return true;
};

console.log(strictEquals(1, 1) === true);
console.log(strictEquals(null, null) === false);
console.log(strictEquals(0, -0) === true);