var usuario = document.getElementById('usuario');
var password = document.getElementById('password');

usuario.addEventListener('focus',()=> {
    usuario.style.borderColor = "#4A5F6A";
});

usuario.addEventListener('blur',()=>{
    usuario.style.borderColor = "#ccc";
});

password.addEventListener('focus',()=> {
    password.style.borderColor = "#4A5F6A";
});

password.addEventListener('blur',()=>{
    password.style.borderColor = "#ccc";
});