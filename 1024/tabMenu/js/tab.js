const tabButtons = document.querySelectorAll(".tabButton");
const tabMenus = document.querySelectorAll(".tabMenu .menu");

tabButtons.forEach(function(link){
    link.addEventListener("click",function(e){
        e.preventDefault();
        let orgTarget = e.target.getAttribute("href"); 
    

        tabMenus.forEach(function(content){
            content.style.display = "none";
            
        });
        document.querySelector(orgTarget).style.display = "block";

        tabButtons.forEach(function(link2){
            link2.classList.remove("active");
            e.target.classList.add("active");
        });

    });
});