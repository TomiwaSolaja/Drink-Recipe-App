// const nameVal = document.getElementById("name").value
// const birthDateVal = document.getElementById("birthDate").value
// const emailVal = document.getElementById("email").value
// const passwordVal = document.getElementById("password").value



// let isValid = false;
// let passwordsMatch = false;

// function validateForm() {
//     // Use HTML constraint API to check form validity
//     isValid = form.checkValidity();
//     // If the form isn't valid
//     if (!isValid) {
//         // Style main message for an error
//         message.textContent = 'Please fill out all fields.';
//         message.style.color = 'red';
//         messageContainer.style.borderColor = 'red';
//         return;
//     }
//     // Check to see if both password fields match
//     if (password1El.value === password2El.value) {
//         // If they match, set value to true and borders to green
//         passwordsMatch = true;
//         password1El.style.borderColor = 'green';
//         password2El.style.borderColor = 'green';
//     } else {
//         // If they don't match, border color of input to red, change message
//         passwordsMatch = false;
//         message.textContent = 'Make sure passwords match.';
//         message.style.color = 'red';
//         messageContainer.style.borderColor = 'red';
//         password1El.style.borderColor = 'red';
//         password2El.style.borderColor = 'red';
//         return;
//     }
//     // If form is valid and passwords match
//     if (isValid && passwordsMatch) {
//         // Style main message for success
//         message.textContent = 'Successfully Registered!';
//         message.style.color = 'green';
//         messageContainer.style.borderColor = 'green';
//     }
// }

// function storeFormData() {
//     const user = {
//         name: form.name.value,
//         phone: form.phone.value,
//         email: form.email.value,
//         website: form.website.value,
//         password: form.password.value,
//     };
//     // Do something with user data
//     console.log(user);
// }

// function processFormData(e) {
//     e.preventDefault();
//     // Validate Form
//     validateForm();
//     // Submit Form if Valid
//     if (isValid && passwordsMatch) {
//         storeFormData();
//     }
// }

// async function submitForm() {

//     console.log("Submitting.........")

//     const nameVal = document.getElementById("name").value
//     const birthDateVal = document.getElementById("birthDate").value
//     const emailVal = document.getElementById("email").value
//     const passwordVal = document.getElementById("password").value

//     console.log(nameVal)
//     console.log(birthDateVal)
//     console.log(emailVal)
//     console.log(passwordVal)

//     const data = {
//         name: nameVal,
//         birthDate: birthDateVal,
//         email: emailVal,
//         password: passwordVal
//     }

//     const url = "http://localhost:5000/users"

//     const httpResponse = await fetch(url, {
//         method: "POST",
//         headers: {
//             'Content-Type': 'application/json'
//         },
//         body: JSON.stringify(data)
//     });

//     const body = await httpResponse.json();

//     console.log(body);
//     if(body) {
//         alert("Registrated Successfully!")
//     } else {
//         alert("Unable to be Registered. Try Again")
//     }

// }




// // Event Listener
// form.addEventListener('submit', processFormData);