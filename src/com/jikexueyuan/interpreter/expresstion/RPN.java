package com.jikexueyuan.interpreter.expresstion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.StringTokenizer;

public class RPN {

	private ArrayList<String> expression = new ArrayList<String>();// 存储中�?�表达�??

	private ArrayList<String> right = new ArrayList<String>();// 存储?��序表达�??

	private AbstractExpresstion result;// 结�??

	// 依据输入信息??�建对象，�?�数?��?��?��?�符?��?��ArrayList�?
	public RPN(String input) {
		StringTokenizer st = new StringTokenizer(input, "+-*/()", true);
		while (st.hasMoreElements()) {
			expression.add(st.nextToken());
		}
	}

	// 将中序表达�?�转?��为右序表达�??
	private void toRight() {
		Stacks aStack = new Stacks();
		String operator;
		int position = 0;
		while (true) {
			if (Calculate.isOperator((String) expression.get(position))) {
				if (aStack.top == -1
						|| ((String) expression.get(position)).equals("(")) {
					aStack.push(expression.get(position));
				} else {
					if (((String) expression.get(position)).equals(")")) {
						if (!((String) aStack.top()).equals("(")) {
							operator = (String) aStack.pop();
							right.add(operator);
						}
					} else {
						if (Calculate.priority((String) expression
								.get(position)) <= Calculate
								.priority((String) aStack.top())
								&& aStack.top != -1) {
							operator = (String) aStack.pop();
							if (!operator.equals("("))
								right.add(operator);
						}
						aStack.push(expression.get(position));
					}
				}
			} else
				right.add(expression.get(position));
			position++;
			if (position >= expression.size())
				break;
		}
		while (aStack.top != -1) {
			operator = (String) aStack.pop();
			right.add(operator);
		}
	}

	// 对右序表达�?��?��?��?��??
	public void getResult(HashMap<String, Float> var) {
		this.toRight();
		Stack<AbstractExpresstion> stack = new Stack<AbstractExpresstion>();
		AbstractExpresstion op1, op2;
		String is = null;
		Iterator it = right.iterator();

		while (it.hasNext()) {
			is = (String) it.next();
			if (Calculate.isOperator(is)) {
				op2 = stack.pop();
				op1 = stack.pop();
				stack.push(Calculate.twoResult(is, op1, op2));
			} else
				stack.push(new VarExpresstion(is));
		}
		result = stack.pop();
		it = expression.iterator();
		while (it.hasNext()) {
			System.out.print((String) it.next());
		}
		System.out.println("=" + result.interpreter(var));
	}

	public static class Calculate {
		// ?��?��?��?��为�?��?�符?��
		public static boolean isOperator(String operator) {
			if (operator.equals("+") || operator.equals("-")
					|| operator.equals("*") || operator.equals("/")
					|| operator.equals("(") || operator.equals(")"))
				return true;
			else
				return false;
		}

		// 设置??��?�符?��??��?��?�级?��
		public static int priority(String operator) {
			if (operator.equals("+") || operator.equals("-")
					|| operator.equals("("))
				return 1;
			else if (operator.equals("*") || operator.equals("/"))
				return 2;
			else
				return 0;
		}

		// ???2?��?�间??�计�?
		public static AbstractExpresstion twoResult(String op,
				AbstractExpresstion a, AbstractExpresstion b) {
			try {

				AbstractExpresstion result = null;
				if (op.equals("+"))
					result = new AddExpresstion(a, b);
				else if (op.equals("-"))
					result = new SubExpresstion(a, b);
				else if (op.equals("*"))
					result = new MultiExpresstion(a, b);
				else if (op.equals("/"))
					result = new DivExpresstion(a, b);
				else
					;
				return result;
			} catch (NumberFormatException e) {
				System.out.println("input has something wrong!");
				return null;
			}
		}
	}

	// ??�类
	public class Stacks {
		private LinkedList list = new LinkedList();
		int top = -1;

		public void push(Object value) {
			top++;
			list.addFirst(value);
		}

		public Object pop() {
			Object temp = list.getFirst();
			top--;
			list.removeFirst();
			return temp;

		}

		public Object top() {
			return list.getFirst();
		}
	}
}
