let name = sessionStorage.getItem('username');

if(name === 'NO DEFINIDO'){
    document.getElementById('userGreeting').innerText = "No existe algun usuario con las credenciales dadas"

}else if(name!=null){
    document.getElementById('userGreeting').innerText = "Bienvenid@ "+name;

    $.ajax({
        url:'http://158.101.3.197:8080/api/user/all',
        type:'GET',
        dataType:'json',
        success: function (response){
            pintarDatos(response);
        },
        error: function (){
            console.log("Error de peticion de usuarios")
        }

    });
}

function pintarDatos(datos){
    let insertar = '';

    insertar += '<thead><tr><th>ID</th><th>Correo</th><th>Contraseña</th><th>Nombre</th></tr></thead><tbody>';

    datos.forEach(dato =>{
        insertar += '<tr>';
        Object.values(dato).forEach(valor =>{
            insertar += '<td>'+valor+'</td>'
        });
        insertar += '</tr>'
    });

    document.getElementById('userTable').innerHTML = insertar;
}