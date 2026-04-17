function validarCadastro() {
    let nome = document.getElementById("nome").value;

    if (nome === "") {
        alert("Preencha o nome!");
        return false;
    }

    return true;
}