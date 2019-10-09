package org.cloud.provider.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @ClassName: Demo
 * @Description:
 * @Author: lin
 * @Date: 2019/10/1 10:00
 * History:
 * @<version> 1.0
 */
public class Demo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String[] s = {"ccc", "ddd", "ggg"};
        list.add(Arrays.toString(s));

        List<String> list2 = new ArrayList<>();
        String[] s1 = {"ttt", "www", "ggg"};
        list2.add(Arrays.toString(s1));

        Random random = new Random();
        int i = random.nextInt(list2.size());
        System.out.println("测试="+ list.get(i));
    }
}
