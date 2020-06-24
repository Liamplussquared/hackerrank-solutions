def levelOrder(root):
    queue = deque()
    queue.append(root)

    while(queue):
        current = queue.popleft()
        print(current.info, end=" ")

        if current.left:
            queue.append(current.left)
        if current.right:
            queue.append(current.right)
