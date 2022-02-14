const getHashTags = (title) => {
  let words = title.split(" ");
  let result = [];
  words.map((word) => word.replace(/\W/g, ""));

  if (words.length == 0) {
    return "Invalid";
  }

  if (words.length > 3) {
    words.sort((b, a) => a.length - b.length);
    result = words.filter((word) => word.length >= words[2].length);
    result = result.slice(0, 3);
  } else {
    result = words;
  }
  result = result.map((word) => "#" + word);
  return result;
};

console.log(
  getHashTags("How the Avocado Became the Fruit of the Global Trade")
);
console.log(
  getHashTags(
    "Why You Will Probably Pay More for Your Christmas Tree This Year"
  )
);
console.log(getHashTags("Hey Parents, Surprise, Fruit Juice is not a Fruit"));
console.log(getHashTags("Visualizing Science"));
