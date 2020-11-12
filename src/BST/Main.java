package BST;

import sun.lwawt.macosx.CSystemTray;

public class Main {

    public static void main(String[] args) {

        BST<Integer> bst = new BST<Integer>();
        int[] nums = {5, 3, 6, 8, 4, 2};
        for (int num : nums)
            bst.add(num);

        /////////////////
        //      5      //
        //    /   \    //
        //   3    6    //
        //  / \    \   //
        // 2  4     8  //
        /////////////////


//        bst.leavelOrder();
//        bst.preOrder();
//        System.out.println();
//
//        bst.preOrderNR();
//        System.out.println();


//        bst.inOrder();
//        System.out.println();
//
//        bst.postOrder();
//        System.out.println();

        bst.inOrder();
        System.out.println("============");
        bst.remove(3);
        bst.inOrder();


    }
}
