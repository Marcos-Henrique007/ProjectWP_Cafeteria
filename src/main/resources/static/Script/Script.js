document.addEventListener("DOMContentLoaded", function(){

    const btnPedidos = document.getElementById("btnPedidos");
    const btnLogin = document.getElementById("btnLogin");
    const btnCadastro = document.getElementById("btnCadastro");

    if(btnPedidos){
        btnPedidos.addEventListener("click", function(){
            window.location.href = "pedidos.html";
        });
    }

    if(btnLogin){
        btnLogin.addEventListener("click", function(){
            window.location.href = "login.html";
        });
    }

    if(btnCadastro){
        btnCadastro.addEventListener("click", function(){
            window.location.href = "cadastro.html";
        });
    }

});