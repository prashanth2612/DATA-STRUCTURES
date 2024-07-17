/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @param {number[]} to_delete
 * @return {TreeNode[]}
 */
var delNodes = function(root, to_delete) {
    const toDeleteSet = new Set(to_delete);
    const forest = [];

    const dfs = (node, isRoot) => {
        if (!node) {
            return null;
        }
        const nodeDeleted = toDeleteSet.has(node.val);
        if (isRoot && !nodeDeleted) {
            forest.push(node);
        }
        node.left = dfs(node.left, nodeDeleted);
        node.right = dfs(node.right, nodeDeleted);
        return nodeDeleted ? null : node;
    };

    dfs(root, true);
    return forest;
};
