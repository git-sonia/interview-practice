import './styles.css';

function increaseNumClicks() {
    let numClicks = button.textContent.split(":")[1].trim();
    numClicks++;
    button.textContent = `Clicks: ${numClicks}`;
}

let button = document.querySelector("button");

button.addEventListener("click", increaseNumClicks);
