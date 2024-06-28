function isEmailValid(email) {
    const emailPattern = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;
    return emailPattern.test(email);
}

// Function to validate password using regex
function isPasswordValid(password) {
    const passwordPattern = /^(?=.*[A-Z])(?=.*\d)(?=.*[\W_]).+$/;
    return passwordPattern.test(password);
}

// Function to handle form submission
function onSubmit() {
    console.log("onSubmit function called.");

    let success = true;

    // Validate email
    let emailInput = document.getElementById("email");
    let emailValue = emailInput.value.trim();
    let emailHelp = document.getElementById("emailHelp");

    if (isEmailValid(emailValue)) {
        emailInput.classList.remove("is-invalid");
        emailInput.classList.add("is-valid");
        emailHelp.textContent = "";
    } else {
        emailInput.classList.remove("is-valid");
        emailInput.classList.add("is-invalid");
        emailHelp.textContent = "Please enter a valid email.";
        emailHelp.classList.add("invalid-feedback");
        success = false;
    }

    // Validate first name
    let firstName = document.getElementById("firstName");
    let firstNameValue = firstName.value.trim();
    let firstNameHelp = document.getElementById("firstNameHelp");

    if (firstNameValue === '') {
        firstName.classList.remove("is-valid");
        firstName.classList.add("is-invalid");
        firstNameHelp.textContent = "First name is required.";
        firstNameHelp.classList.add("invalid-feedback");
        success = false;
    } else {
        firstName.classList.remove("is-invalid");
        firstName.classList.add("is-valid");
        firstNameHelp.textContent = "";
    }

    // Validate user name
    let userName = document.getElementById("userName");
    let userNameValue = userName.value.trim();
    let userNameHelp = document.getElementById("userNameHelp");

    if (userNameValue === '') {
        userName.classList.remove("is-valid");
        userName.classList.add("is-invalid");
        userNameHelp.textContent = "User name is required.";
        userNameHelp.classList.add("invalid-feedback");
        success = false;
    } else {
        userName.classList.remove("is-invalid");
        userName.classList.add("is-valid");
        userNameHelp.textContent = "";
    }

    // Validate password
    let password = document.getElementById("password1");
    let passwordValue = password.value.trim();
    let passwordHelp = document.getElementById("password1Help");

    if (passwordValue.length < 5) {
        password.classList.remove("is-valid");
        password.classList.add("is-invalid");
        passwordHelp.textContent = "Password must be at least 5 characters long.";
        passwordHelp.classList.add("invalid-feedback");
        success = false;
    } else if (!isPasswordValid(passwordValue)) {
        password.classList.remove("is-valid");
        password.classList.add("is-invalid");
        passwordHelp.textContent = "Password must contain at least one uppercase letter, one digit, and one special character.";
        passwordHelp.classList.add("invalid-feedback");
        success = false;
    } else {
        password.classList.remove("is-invalid");
        password.classList.add("is-valid");
        passwordHelp.textContent = "";
    }

    // Validate repeat password
    let repeatPassword = document.getElementById("password2");
    let repeatPasswordValue = repeatPassword.value.trim();
    let repeatPasswordHelp = document.getElementById("password2Help");

    if (repeatPasswordValue !== passwordValue) {
        repeatPassword.classList.remove("is-valid");
        repeatPassword.classList.add("is-invalid");
        repeatPasswordHelp.textContent = "Passwords do not match.";
        repeatPasswordHelp.classList.add("invalid-feedback");
        success = false;
    } else {
        repeatPassword.classList.remove("is-invalid");
        repeatPassword.classList.add("is-valid");
        repeatPasswordHelp.textContent = "";
    }

    return false;  // Return success status for form submission
}
