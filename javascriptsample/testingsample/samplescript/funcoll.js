var booklist={};

function loadBooks(books)
{
    booklist=books;
    return booklist;
}

function searchBook(booklist,bookname)
{
    return booklist[bookname];
}

module.exports={loadBooks,searchBook}