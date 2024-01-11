import MyDataStructures.MyLinkedList;
import MyDataStructures.MyQueue;
import MyDataStructures.MyStack;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Formatter;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args){
        Solution solution = new Solution();
        int[] nums = {-1,-2,-3,-4,-5};
        int target = -8;
        int[] sum = solution.twoSum(nums, target);

        System.out.println("*****************************<TWO SUM>*************************************");
        System.out.println("nums: " + Arrays.toString(nums));
        System.out.println("target: " + target);
        System.out.println("sum: " + Arrays.toString(sum));
        System.out.println("*****************************</TWO SUM>*************************************");

        nums = new int[]{1,2,3,4};
        sum = solution.runningSum(nums);

        System.out.println("*****************************<RUN SUM>*************************************");
        System.out.println("nums: " + Arrays.toString(nums));
        System.out.println("sum: " + Arrays.toString(sum));
        System.out.println("*****************************</RUN SUM>*************************************");

        int[][] accounts = {{1,2,3}, {3,2,1}};
        int max = solution.maximumWealth(accounts);

        System.out.println("*****************************<MAX WEALTH>*************************************");
        System.out.println("accounts: " + Arrays.deepToString(accounts));
        System.out.println("max: " + max);
        System.out.println("*****************************</MAX WEALTH>*************************************");

        int n = 9;
        List<String> fbList = solution.fizzBuzz(n);

        System.out.println("*****************************<FIZZBUZZ>*************************************");
        System.out.println("n: " + n);
        System.out.println(fbList.toString());
        System.out.println("*****************************</FIZZBUZZ>*************************************");

        int num = 14;
        int steps = solution.numberOfSteps(num);

        System.out.println("*****************************<NUMSTEPS>*************************************");
        System.out.println("num: " + num);
        System.out.println("steps: " + steps);
        System.out.println("*****************************</NUMSTEPS>*************************************");

        nums = new int[]{0,0,1};
        System.out.println("*****************************<ZEROES>*************************************");
        System.out.println("num before move: " + num);
        solution.moveZeroes(nums);
        System.out.println("num after move: " + num);
        System.out.println("*****************************</ZEROES>*************************************");

        nums = new int[]{4,4};
        int[] nums2 = new int[nums.length];

        System.out.println("*****************************<DUPLICATE>*************************************");
        System.out.println("num before sort: " + Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println("num after sort: " + Arrays.toString(nums));
        System.out.println("num: " + Arrays.toString(nums));
        System.out.println("num has duplicates: " + solution.containsDuplicate(nums));
        System.out.println("*****************************</DUPLICATE>*************************************");

        System.out.println("*****************************<MYLINKEDLIST>*************************************");
        MyLinkedList mll = new MyLinkedList(10);
        System.out.println(mll);
        /*mll.append(6);
        System.out.println(mll);
        mll.append(10000);
        System.out.println(mll);
        mll.append(460000);
        System.out.println(mll);*/
        System.out.println("*****************************</MYLINKEDLIST>*************************************");

        System.out.println("*****************************<MYSTACK>*************************************");
        MyStack myStack = new MyStack();
        System.out.println(myStack);
        myStack.push("Eagle Claw");
        System.out.println(myStack);
        myStack.push("Xing Yi");
        System.out.println(myStack);
        System.out.println(myStack.peek());
        myStack.push("Bagua");
        System.out.println(myStack);
        System.out.println(myStack.pop());
        System.out.println(myStack);
        myStack.pop();
        myStack.push("Mantis");
        System.out.println(myStack);
        myStack.pop();
        myStack.pop();
        System.out.println(myStack);
        myStack.push("Five Flower Leopard");
        myStack.push("Connecting Linking Sword");
        myStack.push("Tai Zhu Chuen");
        myStack.pop();
        myStack.push("Small Step");
        System.out.println(myStack);
        System.out.println("*****************************</MYSTACK>*************************************");

        System.out.println("*****************************<MYQUEUE>*************************************");
        MyQueue myQueue = new MyQueue();
        myQueue.enqueue("Tamir");
        myQueue.enqueue("Philando");
        myQueue.enqueue("Sandra");
        myQueue.enqueue("Breonna");
        myQueue.enqueue("Antwon");
        System.out.println(myQueue);
        myQueue.dequeue();
        System.out.println(myQueue);
        System.out.println("*****************************</MYQUEUE>*************************************");

        System.out.println("*****************************<ROTATE>*************************************");
        nums = new int[]{1,2};
        solution.rotate(nums, 3);
        System.out.println("nums: " + Arrays.toString(nums));
        System.out.println("*****************************</ROTATE>*************************************");

//        String s1;
//        String s2;
//        System.out.println(Stream.of("green", "yellow", "blue").max((s1, s2) -> s1.compareTo(s2))
//                .filters(s-> s.endsWith("n")).orElse("yellow"));

        LocalDate localDate = LocalDate.of(2015,4,4);
        System.out.println(localDate.format(DateTimeFormatter.ofPattern("MMM dd, yyyy")));
        System.out.println(localDate.format(DateTimeFormatter.ofPattern("E, MMM dd, yyyy")));
        System.out.println(localDate.format(DateTimeFormatter.ofPattern("MM/dd/yy")));

        String stringA = "A";
        String stringB = "B";
        String stringNull = null;
        StringBuilder bufferC = new StringBuilder("C");
        Formatter fmt = new Formatter(bufferC);

        fmt.format("%s%s", stringA, stringB);
        System.out.println("Line1: "+ fmt);
        fmt.format("%-2s", stringB);
        System.out.println("Line2: "+fmt);
        fmt.format("%b", stringNull);
        System.out.println("Line3: "+ fmt);
    }
}
