
class Stack:

	def __init__(self,max_values):
		self.stack = []
		self.max = max_values
		self.top=-1

	def push(self,value):
		# Time complexity => O(1)
		if self.top >= (self.max-1):
			return "Stack is full"
				
		self.top+=1
		self.stack.append(value)

	def pop(self):
		# Time complexity => O(1)
		if self.is_empty():
			return "Stack is  empty"

		top_val = self.stack[self.top]
		self.stack = self.stack[:-1]
		return top_val

	def is_empty(self):
		# Time complexity => O(1)
		return self.top==-1

	def peek(self):
		# Time complexity => O(1)
		return self.stack[-1]

	def __repr__(self):
		stack_list = (str(val) for val in self.stack)
		return ",".join(stack_list)

if __name__ == "__main__":
	stack = Stack(4)
	stack.push(45)
	stack.push(20)
	stack.push(59)

	print(stack.is_empty())
	print(stack.peek())
	print(stack)

