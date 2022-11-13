public class AplikasiTodoList {

    public static String[] model = new String[10];

    public static void main(String[] args) {

        testRemoveTodoList();

    }

    /**
     * Menampilkan Todo List
     */
    public static void showTodoList(){
        for (var i = 0; i < model.length; i++){
            String todo = model[i];
            var nomor = i + 1;

            if (todo != null){
                System.out.println(nomor + ". " + todo);
            }
        }
    }

    public static void testShowTodoList(){
        model[0] = "Jadwal Hari Ini";
        model[1] = "Studi Kasus Java Dasar";
        showTodoList();
    }

    /**
     * Menambah todo ke list
     */
    public static void addTodoList(String todo){
        // cek apakah array sudah penuh
        boolean isFull = true;
        for (int i = 0; i < model.length; i++){
            if (model[i] == null){
                // array masih ada yang kosong
                isFull = false;
                break;
            }
        }

        // jika penuh, maka ukuran panjang array akan di resize 2x lipat
        if (isFull){
            var temporary = model;
            model = new String[model.length * 2];

            for (int i = 0; i < temporary.length; i++){
                model[i] = temporary[i];
            }
        }

        // tambahkan ke posisi yang data arraynya null
        for (var i = 0; i < model.length; i++){
            if (model[i] == null){
                model[i] = todo;
                break;
            }
        }
    }

    public static void testAddTodoList(){
        for (int i = 0; i < 25; i++){
            addTodoList("Contoh Todo Ke-" + (i+1));
        }

        showTodoList();
    }

    /**
     * Menghapus todo dari list
     */
    public static boolean removeTodoList(Integer number){
        if ((number-1) >= model.length){
            return false;
        } else if (model[number-1] == null) {
            return false;
        } else {
            for (int i = (number - 1); i < model.length; i++) {
                if (i == model.length - 1){
                    model[i] = null;
                } else {
                    model[i] = model[i + 1];
                }
            }
          return true;
        }
    }

    public static void testRemoveTodoList(){
        addTodoList("Satu");
        addTodoList("Dua");
        addTodoList("Tiga");

        var result = removeTodoList(20);
        System.out.println(result);

        result = removeTodoList(4);
        System.out.println(result);

        result = removeTodoList(2);
        System.out.println(result);

        showTodoList();
    }

    /**
     * Menampilkan view todo list
     */
    public static void viewShowTodoList(){

    }

    /**
     * Menampilkan view Menambahkan todo list
     */
    public static void viewAddTodoList(){

    }

    /**
     * Menampilkan view Menghapus todo list
     */
    public static void viewRemoveTodoList(){

    }
}
