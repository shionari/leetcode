package algorithm.simple.design;

/**
 *
 * 设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。
 *
 * push(x) -- 将元素 x 推入栈中。
 * pop() -- 删除栈顶的元素。
 * top() -- 获取栈顶元素。
 * getMin() -- 检索栈中的最小元素。
 *
 * Created by shionari on 2018/5/22
 */
public class MinStack {

    public static void main(String[] args) {
        /**
         * ["MinStack","push","push","push","top","pop","getMin","pop","getMin","pop","push","top","getMin","push","top","getMin","pop","getMin"]
         * [[],[2147483646],[2147483646],[2147483647],[],[],[],[],[],[],[2147483647],[],[],[-2147483648],[],[],[],[]]
         */
        MinStack stack = new MinStack();
        stack.push(512);
        stack.push(-1024);
        stack.push(-1024);
        stack.push(512);
        stack.pop();
        stack.pop();
        //stack.push(2147483647);
        //stack.push(-2147483648);
        stack.pop();
    }

    int[] stack;
    int mark;
    int length = 16;
    int min;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        mark = 0;
        min = 0;
        stack = new int[length];
    }

    public void push(int x) {
        if (length == (mark + 1)) {
            length = length * 2;
            int[] newStack = new int[length];
            System.arraycopy(stack, 0, newStack, 0, stack.length);
            stack = newStack;
        }

        if (mark == 0) {
            min = x;
        }
        stack[mark] = x;
        if (min > x) {
            min = x;
        }
        mark++;
        System.out.println("push int [" + x +  "] into stack, now stack size is [" + mark + "], min is [" + min + "]");
    }

    public void pop() {
        if (mark > 0) {
            int remove = stack[mark - 1];
            if (remove == min) {
                min = stack[0];
                for (int i = 1; i < mark - 1; i++) {
                    if (min > stack[i]) {
                        min = stack[i];
                    }
                }
            }
            mark = mark - 1;
            System.out.println("pop int [" + remove +  "] from stack, now stack size is [" + mark + "], min is [" + min + "]");
        }
    }

    public int top() {
        return stack[mark - 1];
    }

    public int getMin() {
        return min;
    }
}
