// Contante que captura el contenedor hijo que contendrá todos los productos
// Vía ID (shopContent)
const shopContent = document.getElementById("shopContent");
// Constante cart, el cual será un Array
const cart = [];

// Recorrer productos
productos.forEach((product) =>{
    // Elemento div
    const content = document.createElement("div");
    // Inserción de código nuevo HTML en el elemento div
    content.innerHTML = `
    <img src="${product.img}">
    <h3>${product.productName}</h3>
    <p>$${product.price}</p>
    `;
    shopContent.append(content);

    // Elemento Botón
    const buyButton = document.createElement("button");
    buyButton.innerText = "Comprar";

    content.append(buyButton);

    // Evento del botón
    buyButton.addEventListener("click", () =>{
        cart.push({
            id: product.id,
            productName: product.productName,
            price: product.price,
            quanty: product.quanty,
            img: product.img,
        })
        console.log(cart);
    })
});
