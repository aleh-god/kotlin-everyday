import org.junit.Test
import org.junit.jupiter.api.Assertions.*

internal class MergeTwoBinaryTreesTest {

    @Test
    fun testSolution1() {
        val root1 = TreeNode(1)

        val root2 = TreeNode(1)
        val b1 = TreeNode(2)
        root2.left = b1

        val expected = listOf<Int>(2,2).toIntArray()

        val solution = MergeTwoBinaryTrees.Solution()
        val actual = solution.merge(root1, root2)?.treeToList()?.toIntArray()
        assertArrayEquals(expected, actual)
    }

    @Test
    fun testSolution2() {
        val root1 = TreeNode(1)
        val a3 = TreeNode(3)
        val a5 = TreeNode(5)
        val a2 = TreeNode(2)
        root1.left = a3
        a3.left = a5
        root1.right = a2

        val root2 = TreeNode(2)
        val b1 = TreeNode(1)
        val b3 = TreeNode(3)
        val b4 = TreeNode(4)
        val b7 = TreeNode(7)
        root2.left = b1
        b1.right = b4
        root2.right = b3
        b3.right = b7

        val expected = intArrayOf(3,4,5,4,5,7)

        val solution = MergeTwoBinaryTrees.Solution()
        val actual = solution.merge(root1, root2)?.treeToList()?.toIntArray()
        assertArrayEquals(expected, actual)
    }
}