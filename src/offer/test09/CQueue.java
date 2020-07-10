package offer.test09;

import java.util.Stack;

/**
 * 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，
 * 分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：
 * ["CQueue","appendTail","deleteHead","deleteHead"]
 * [[],[3],[],[]]
 * 输出：[null,null,3,-1]
 * 示例 2：
 * <p>
 * 输入：
 * ["CQueue","deleteHead","appendTail","appendTail","deleteHead","deleteHead"]
 * [[],[],[5],[2],[],[]]
 * 输出：[null,-1,null,null,5,2]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class CQueue {
    private Stack<Integer> stack1; // 保存进栈数据
    private Stack<Integer> stack2; // 保存出栈数据
    int size;

    public CQueue() {
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
        this.size = 0;
    }

    public void appendTail(int value) {
        this.stack1.push(value);
        this.size++;
    }

    public int deleteHead() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            return -1;
        }
        if(!stack2.isEmpty()){
            return stack2.pop();
        }
        else{
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        size --;
        return stack2.pop();
    }
}
