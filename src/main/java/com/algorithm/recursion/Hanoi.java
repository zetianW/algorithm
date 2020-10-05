package com.algorithm.recursion;

/**
 * Description(类功能描述):
 *  汉诺塔问题
 *  （有三个柱子，从下到上依次嵌套着从大到小的圆盘，
 *  需要将这些个圆盘还是按照次序从第一个柱子移到第三个柱子上）
 * @author Zetian Wang
 * @date 2020/09/11
 **/
public class Hanoi {
    /**
     *
     * @param i     共有的椭圆
     * @param from  开始的柱子
     * @param in    中间的柱子
     * @param to    最终目标柱子
     */
    public static void hanoi(int i,char from,char in,char to){
        if(i==1){
            System.out.println("第1个椭圆从"+from+"移到"+to);
        }else {
            //移动
            hanoi(i-1,from,to,in);
            //移动最下面的椭圆
            System.out.println("第"+i+"个椭圆"+from+"移到"+to);
            //把上面的盘子从中间位置移到目标位置
            hanoi(i-1,in,from,to);
        }

    }
}
