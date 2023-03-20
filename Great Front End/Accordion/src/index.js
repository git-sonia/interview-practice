let accordions = document.querySelectorAll(".accordion");
let paragraphs = document.querySelectorAll("p");

function toggleParagraph() {
  if (this.classList.contains("html")) {
    paragraphs[0].classList.toggle("hidden");
  } else if (this.classList.contains("css")) {
    paragraphs[1].classList.toggle("hidden");
  } else if (this.classList.contains("js")) {
    paragraphs[2].classList.toggle("hidden");
  }
}

for (let accordion of accordions) {
    accordion.addEventListener("click", toggleParagraph);
}