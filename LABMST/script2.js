var changeStyleBtn = document.getElementById("changeStyleBtn");
var myParagraph = document.getElementById("myParagraph");
  
changeStyleBtn.addEventListener("click", function () {
    myParagraph.innerText = "Welcome to JavaScript DOM Manipulation";
    myParagraph.style.color = "blue";
    myParagraph.style.fontSize = "24px";
});
