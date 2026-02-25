let reservas = [];

function reservar() {
    const professor = document.getElementById("professor").value;
    const laboratorio = document.getElementById("laboratorio").value;
    const data = document.getElementById("data").value;
    const hora = document.getElementById("hora").value;

    // Verificar conflito
    const conflito = reservas.find(r =>
        r.laboratorio === laboratorio &&
        r.data === data &&
        r.hora === hora
    );

    if (conflito) {
        alert("Esse laboratório já está reservado nesse horário!");
        return;
    }

    const novaReserva = {
        professor,
        laboratorio,
        data,
        hora
    };

    reservas.push(novaReserva);
    atualizarLista();
}

function atualizarLista() {
    const lista = document.getElementById("listaReservas");
    lista.innerHTML = "";

    reservas.forEach(r => {
        const item = document.createElement("li");
        item.textContent = `${r.professor} - ${r.laboratorio} - ${r.data} ${r.hora}`;
        lista.appendChild(item);
    });
}