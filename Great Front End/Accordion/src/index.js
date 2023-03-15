
let chevrons = document.querySelectorAll(".accordion");
let paragraphs = document.querySelectorAll("p");

function toggleParagraph() {
    console.log("here");
}

for (let chevron of chevrons) {
    chevron.addEventListener("click", toggleParagraph);
}