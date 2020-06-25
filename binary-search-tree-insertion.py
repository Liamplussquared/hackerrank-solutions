    def insertion(self, curr, val):
        if not curr:
            curr = Node(val)
        elif curr.info > val:
            curr.left = self.insertion(curr.left, val)
        else:
            curr.right = self.insertion(curr.right, val)

        return curr

    def insert(self, val):
        if not self.root:
            self.root = Node(val)
        else:
            self.insertion(self.root, val)