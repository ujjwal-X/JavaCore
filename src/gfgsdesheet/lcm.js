function ShowData() {
  let number = 10;
  let num2 = 12;
  for (let i = 2; i <= number * num2; i++) {
    if (number * i === num2 * i) {
      console.log(number * i);
    }
  }
}
ShowData();
