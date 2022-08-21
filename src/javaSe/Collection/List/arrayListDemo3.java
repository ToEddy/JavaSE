package javaSe.Collection.List;

import java.util.ArrayList;

public class arrayListDemo3 {
    public static void main(String[] args) {

        //ArrayList底层源码解读

        ArrayList<String> arr = new ArrayList <> ();
        /**
         * public ArrayList() {
         *         this.elementData = DEFAULT CAPACITY_EMPTY_ELEMENTARY;
         *     }
         *------------------------------------------------------------------------------------
         *     private static final Object[] DEFAULT CAPACITY_EMPTY_ELEMENTARY = {};
         *     transient Object[] elementData;
         *------------------------------------------------------------------------------------
         *     初始化一个DEFAULT CAPACITY_EMPTY_ELEMENTARY数组将其赋值给elementData
         *
         */
        arr.add("jack");
        arr.add("rose");
        arr.add("tom");
        arr.add("jerry");
        /**
         * public boolean add(E e) {
         *         ensureCapacityInternal(size + 1);  // Increments modCount!!
         *         elementData[size++] = e;
         *         return true;
         *     }
         *     ------------------------------------------------------------------------------
         *         private void ensureCapacityInternal(int minCapacity) {
         *         ensureExplicitCapacity(calculateCapacity(elementData, minCapacity));
         *     }
         *------------------------------------------------------------------------------------
         *     private void ensureExplicitCapacity(int minCapacity) {
         *         modCount++;
         *
         *       if (minCapacity - elementData.length > 0)
         *                       grow(minCapacity);
         *              }
         *------------------------------------------------------------------------------------
         *     private void grow(int minCapacity) {
         *         // overflow-conscious code
         *         int oldCapacity = elementData.length;
         *         int newCapacity = oldCapacity + (oldCapacity >> 1);
         *         if (newCapacity - minCapacity < 0)
         *             newCapacity = minCapacity;
         *         if (newCapacity - MAX_ARRAY_SIZE > 0)
         *             newCapacity = hugeCapacity(minCapacity);
         *         // minCapacity is usually close to size, so this is a win:
         *         elementData = Arrays.copyOf(elementData, newCapacity);
         *     }
         */


    }
}
