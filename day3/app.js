let btn = document.getElementById("btn")
btn.addEventListener( "click",function(event){
    let col = btn.style.backgroundColor;
       if(  col == "red" ){
        btn.style.backgroundColor="green"
       }else{
         btn.style.backgroundColor="red"
       }
})
