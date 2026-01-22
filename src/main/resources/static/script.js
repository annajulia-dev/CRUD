const productModal = document.getElementById('product-modal');
const productTitle = document.getElementById('product-modal-title');
const idInput = document.getElementById('id');
const nameInput = document.getElementById('name');
const priceInput = document.getElementById('price');
const categorySelect = document.getElementById('categoryId');


const categoryModal = document.getElementById('category-modal');


// --- PRODUCT FUNCTIONS ---
function openCreateModal(){
    idInput.value = '';
    nameInput.value = '';
    priceInput.value = '';
    categorySelect.value = '';

    productTitle.textContent = 'New Product';
    productModal.classList.remove('hidden');
}

function openEditModal(button){
    const id = button.getAttribute('data-id');
    const name = button.getAttribute('data-name');
    const price = button.getAttribute('data-price');
    const catId = button.getAttribute('data-cat-id');

    idInput.value = id;
    nameInput.value = name;
    priceInput.value = price;
    categorySelect.value = catId;

    productTitle.textContent = 'Edit Product';
    productModal.classList.remove('hidden');
}

function closeProductModal(){
    productModal.classList.add('hidden');
}

// --- CATEGORY FUNCTIONS ---
function openCategoryModal(){
    categoryModal.classList.remove('hidden');
}

function closeCategoryModal(){
    categoryModal.classList.add('hidden');
}


window.onclick = function(event) {
    if (event.target == productModal) {
        closeProductModal();
    }
    if (event.target == categoryModal) {
        closeCategoryModal();
    }
}