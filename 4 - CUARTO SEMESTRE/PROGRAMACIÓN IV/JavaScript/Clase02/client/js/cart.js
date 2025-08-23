const modalContainer = document.getElementById("modal-container");
const modalOverlay = document.getElementById("modal-overlay");

const cartBtn = document.getElementById("cart-btn")

// Constante Modal
const displayCart = () => {
    modalContainer.innerHTML = "";
    modalContainer.style.display = "block";
    modalOverlay.style.display = "block";

    // Modal Header
    const modalHeader = document.createElement("div");

    // Botón de Cierre
    const modalClose = document.createElement("div");
    modalClose.innerText = "❎";
    modalClose.className = "modal-close";
    modalClose.addEventListener("click", () => {
        modalContainer.style.display = "none";
        modalOverlay.style.display = "none";
    });

    // Elemento de Texto
    const modalTitle = document.createElement("div");
    modalTitle.innerText = "Cart";
    modalTitle.className = "modal-title";

    // Agregar elementos al Header
    modalHeader.append(modalClose);
    modalHeader.append(modalTitle);

    // Agregar Header al Container
    modalContainer.append(modalHeader);
};

// Evento de Apertura del elemento Cart
cartBtn.addEventListener("click", displayCart);
