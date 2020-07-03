class QuickUnion:

	def __init__(self,n):
		self.id = [id for id in range(n)]

	def root(self,i):             # set id of each element to self
		while i!=self.id[i] :
			i = self.id[i]
		return i

	def connected(self,p,q):      # chase parent pointers until reach root
		root_p = self.root(p)
		root_q = self.root(q)

		return root_p == root_q

	def union(self,p,q):          # check if pand q have same root.
		root_p = self.root(p)
		root_q = self.root(q)

		self.id[root_p] = root_q

##test
test = QuickUnion(10)
test.union(3,5)
if test.connected(3,5):print("Passed")



		