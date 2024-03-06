# TUTORIAL 4 ADPRO  (Refactoring & TDD)
#### Daffa Mohamad Fathoni (2206824161)
#### Advanced Programming B / GEN

<hr>

[Link to Eshop Web *(Coming Soon)*]()


## REFLECTION

### 1. Reflect based on Percival (2017) proposed self-reflective questions (in “Principles and Best Practice of Testing” submodule, 

Prosedur TDD membantu dalam membuat kode aman dan mudah diubah. Hal ini dicapai dengan membuat tes terlebih dahulu, sehingga kode yang dibuat setelahnya terjamin aman jika lulus tes. 
Selain itu, perubahan kode dapat langsung diuji, sehingga mempermudah proses refactoring.

Pengembangan TDD ke depannya perlu menambahkan pengujian untuk melihat pengaruh satu fitur dengan fitur lain. 
Hal ini untuk meningkatkan jaminan kebenaran kode. 
Contohnya, pengujian untuk membuat, memperbarui, dan menghapus 100 produk sekaligus dapat memastikan interaksi ketiga fitur tersebut berjalan dengan benar, 
bukan hanya saat berjalan sendiri-sendiri.

### 2. You have created unit tests in Tutorial. Now reflect whether your tests have successfully followed F.I.R.S.T. principle or not. If not, explain things that you need to do the next time you create more tests.

Tes yang dibuat sudah memenuhi prinsip F.I.R.S.T. Algoritma testing dirancang seminimal mungkin untuk menguji keseluruhan kode. 
Unit test terisolasi satu sama lain, sehingga tidak saling mempengaruhi. 
Setiap tes menjalankan asersi untuk memastikan kebenaran output dan dapat digunakan berulang kali untuk setiap perubahan kode yang perlu diuji.