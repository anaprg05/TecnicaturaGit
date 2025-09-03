const modalContainer = document.getElementById("modal-container");
const modalOverlay = document.getElementById("modal-overlay");

const cartBtn = document.getElementById("cart-btn");
const cartCounter = document.getElementById("cart-counter");

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

    // Modal Body
    cart.forEach((product) => {
        const modalBody = document.createElement("div");
        modalBody.className = "modal-body",
        modalBody.innerHTML = `
        <div class="product">
                <img class="product-img" src="${product.img}">
                <div class="product-info">
                    <h4>${product.productName}</h4>
                </div>
            <div class="quantity">
                <span class="quantity-btn-decrese"> - </span>
                <span class="quantity-input">${product.quanty}</span>
                <span class="quantity-btn-increse"> + </span>
            </div>
            <div class="price">$ ${product.price * product.quanty}</div>
            <div class="delete-product"> ❎ </div>
        </div>
        `
        // Agregar Body al Container
        modalContainer.append(modalBody);

        const decrese = modalBody.querySelector(".quantity-btn-decrese")
        decrese.addEventListener("click", () =>{
            if(product.quanty !== 1){
                product.quanty --;
                displayCart();
            }
        })

        const increse = modalBody.querySelector(".quantity-btn-increse")
        increse.addEventListener("click", () =>{
            product.quanty ++;
            displayCart();
        }) 

        // Delete
        const deleteProduct = modalBody.querySelector(".delete-product");
        deleteProduct.addEventListener(("click"), () => {
            deleteCartProduct(product.id);
        });
    });

    // Modal Footer
    const total = cart.reduce((acc, el) => acc + el.price * el.quanty, 0);

    const modalFooter = document.createElement("div");
    modalFooter.className = "modal-footer";
    modalFooter.innerHTML = `
    <div class="total-price"> Total: $ ${total} 😊 </div>
    `

    // Agregar Footer al Container
    modalContainer.append(modalFooter);
};

// Evento de Apertura del elemento Cart
cartBtn.addEventListener("click", displayCart);

const deleteCartProduct = (id) => {
    const foundId = cart.findIndex((element) => element.id === id);
    console.log(foundId);
    cart.splice(foundId, 1);
    displayCart();
}

const displayCartCounter = () => {
    if (cartLength > 0){
        const cartLength = cart.reduce((acc, el) => acc + el.quanty, 0);
        cartCounter.style.display = "block";
        cartCounter.innerText = cartLength;
    }else{
        cartCounter.style.display = "none";
    }
};

