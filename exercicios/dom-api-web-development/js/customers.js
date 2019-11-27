

$(document).ready(function() {
    $.ajax({
        url: 'http://localhost:8080/javabank5/api/customer',
        success: populateCustomers,
    });
});

function populateCustomers(response) {

    /*var customerData = [
        { "id": 1, "firstName": "Rui", "lastName": "Ferrão", "email": "rui@gmail.com", "phone": "777888" },
        { "id": 2, "firstName": "Sergio", "lastName": "Gouveia", "email": "sergio@gmail.com", "phone": "777999" },
        { "id": 3, "firstName": "Bruno", "lastName": "Ferreira", "email": "bruno@gmail.com", "phone": "777666" },
        { "id": 4, "firstName": "Rodolfo", "lastName": "Matos", "email": "rodolfo@gmail.com", "phone": "777333" }
    ];

*/
    //get the table's DOM object
    var customersTable = document.getElementById('customer-table');

    for (var i = 0; i < response.length; i++) {
        var row = customersTable.insertRow(-1);

        row.insertCell(-1).innerHTML = response[i].firstName;
        row.insertCell(-1).innerHTML = response[i].lastName;
        row.insertCell(-1).innerHTML = response[i].email;
        row.insertCell(-1).innerHTML = response[i].phone;
        row.insertCell(-1).innerHTML = '<button type="button" class="btn btn-warning">Edit</button>';
        row.insertCell(-1).innerHTML = '<button type="button" class="btn btn-danger">Delet</button>';


    }

}





