const modalOverlay = document.querySelector('.modal-overlay');
const modalTitle = document.querySelector('.modal-header h2');

const idInput = document.getElementById('id');
const nameInput = document.getElementById('name');
const priceInput = document.getElementById('price');

function openCreateModal(){
    idInput.value = '';
    nameInput.value = '';
    priceInput.value = '';

    modalTitle.textContent = 'New Product';

    modalOverlay.classList.remove('hidden');
}

function closeModal(){
    modalOverlay.classList.add('hidden');
}

function openEditModal(button){
    const id = button.getAttribute('data-id');
    const name = button.getAttribute('data-name');
    const price = button.getAttribute('data-price');

    idInput.value = id;
    nameInput.value = name;
    priceInput.value = price;

    modalTitle.textContent = 'Edit Product';

    modalOverlay.classList.remove('hidden');
}

modalOverlay.addEventListener('click', (e) => {
        if (e.target === modalOverlay) {
            closeModal();
        }
    });