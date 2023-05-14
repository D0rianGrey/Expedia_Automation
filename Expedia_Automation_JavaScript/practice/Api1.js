// import XMLHttpRequest from 'xhr2';
//
// function getAllPrices() {
//     const request = new XMLHttpRequest();
//     request.open('GET', 'https://dummyjson.com/products');
//     request.send();
//     request.addEventListener("load", function () {
//         const {products} = JSON.parse(this.responseText);
//         const priceValue = products.reduce((acc, product) => acc += product.price, 0);
//         console.log(priceValue / products.length);
//     })
// }
//
// getAllPrices();

(async function getAllProducts() {
    const response = await fetch('https://dummyjson.com/products');
    const {products} = await response.json();
    console.log(products);
})();

