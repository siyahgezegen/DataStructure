package Src.StackList;

public class StackList {
    // push = listeye eleman ekleme
    // pop listeden eleman çıkarma
    private int[] dizi;
    public int top = -1;
    private int arrayLen;

    /**
     * Array ile Stack yapısı <br>
     * </br>
     * daha önce tanımlanmış bir değere constructor'dan alınan veriye göre bir liste
     * oluşturur.
     * <br>
     * </br>
     * 
     * @param arrayLen oluştulacak olan arrayStack'in uzunluğununu belirtir.
     */
    public StackList(int arrayLen) {
        this.arrayLen = arrayLen;
        dizi = new int[arrayLen];
    }

    public void push(int content) {
        if (!PushControl())
            System.out.println("List is max");
        else {
            top++;
            dizi[top] = content;

        }
    }

    public int pop() {

        if (!PopControl())
            return Integer.MAX_VALUE;

        top--;
        return dizi[top + 1];
    }

    /**
     * Tüm Elemanları Listeler
     */
    public void showAllElement() {
        for (int i = 0; i <= top; i++) {
            System.out.println(dizi[i]);
        }
    }

    /**
     * Listedeki tüm elemanları siler.
     */
    public void RemoveList() {
        top = -1;
    }

    /**
     * max eleman sayısına uğlaşıp uğlaşmadığını kontrol ediyor <br>
     * </br>
     * 
     * @returns true ise listeye eleman eklenilebilir
     * @returns false ise listeye eleman eklenemez. liste dolu!
     */
    private boolean PushControl() {
        if (this.arrayLen - 1 == top)
            return false;
        return true;
    }

    /**
     * 
     * @returns true : listeye eleman eklenilebilir
     * @returns false : listede eleman kalmadı;
     */
    private boolean PopControl() {
        if (top == -1)
            return false;
        return true;
    }

}
