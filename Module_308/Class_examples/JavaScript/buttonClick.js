
function changeText() {
    // Select the button element
    const button = document.querySelector('button');

    // Select the paragraph element
    const p = document.querySelector('p');

    // Check the current text of the paragraph
    if (p.textContent === "Try to change me.") {
        // Change the text of the paragraph and button if they are in the original state
        p.textContent = "Changed because of an event handler property.";
        button.textContent = "I was clicked";
    } else {
        // Revert to the original text if they have been changed
        p.textContent = "Try to change me.";
        button.textContent = "Click me";
    }
}

