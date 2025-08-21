// Contante que captura el contenedor hijo que contendrá todos los productos
// Vía ID (shopContent)
const shopContent = document.getElementById("shopContent");

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
});
