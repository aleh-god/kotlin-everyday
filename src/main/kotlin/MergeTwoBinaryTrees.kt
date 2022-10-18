class TreeNode(var value: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null

    private fun traversePreOrder(visit: (Int) -> Unit) {
        visit(value)
        left?.traversePreOrder(visit)
        right?.traversePreOrder(visit)
    }

    fun treeToList(): List<Int> {
        val list: MutableList<Int> = mutableListOf()
        traversePreOrder {
            list.add(it)
        }
        return list
    }

    override fun toString() = diagram(this)

    private fun diagram(node: TreeNode?,
                        top: String = "",
                        root: String = "",
                        bottom: String = ""): String {
        return node?.let {
            if (node.left == null && node.right == null) {
                "$root${node.value}\n"
            } else {
                diagram(node.right, "$top ", "$top┌──", "$top│ ") +
                        root + "${node.value}\n" + diagram(node.left, "$bottom│ ", "$bottom└──", "$bottom ")
            }
        } ?: "${root}null\n"
    }
}

interface MergeTwoBinaryTrees {

    fun merge(root1: TreeNode?, root2: TreeNode?): TreeNode?

    class Solution : MergeTwoBinaryTrees {

        override fun merge(root1: TreeNode?, root2: TreeNode?): TreeNode? {
            if (root1 == null) { return root2 }
            if (root2 == null) { return root1 }
            root1.value += root2.value
            root1.left = merge(root1.left, root2.left)
            root1.right = merge(root1.right, root2.right)
            return root1
        }
    }
}
