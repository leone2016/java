// Import visualization libraries
const { Tracer, Array1DTracer, GraphTracer, LogTracer, Layout, VerticalLayout } = require('algorithm-visualizer');
let root = null
class TreeNode {
    constructor(data) {

        this.data = data;
        this.left = null;
        this.right = null;


        logger.println(`${data} inserted as root of tree`);

    }
}

// Initialize tree structure and elements

const elements = [10, 20, 5, 3, 2, 17];

// Define tracer variables {
const graphTracer = new GraphTracer('BST - Elements marked red indicate the current status of tree');
const elemTracer = new Array1DTracer('Elements');
const logger = new LogTracer('Log');
Layout.setRoot(new VerticalLayout([graphTracer, elemTracer, logger]));
elemTracer.set(elements);
graphTracer.log(logger);
Tracer.delay();

//}

const insert = (value)=>{
    root = insertNode(root, value)

}

const insertNode=(node, value, lastNode = null)=>{
    if (node == null) {
        node = new TreeNode(value);
        graphTracer.addNode(value);
        if(lastNode!==null){
            graphTracer.addEdge(lastNode, value);
            Tracer.delay();
        }
        else{
            graphTracer.layoutTree(value, true);
            Tracer.delay();
        }
        Tracer.delay();
        return node;
    }


    if (value < node.data) {
        node.left = insertNode(node.left, value, node.data);

    } else {
        node.right = insertNode(node.right, value, node.data);

    }

    return node;
}


// Initialize
elements.forEach((x, i)=>{
    // visualize {
    elemTracer.select(i);
    Tracer.delay();
    // }
    insert(x)
    // visualize {
    elemTracer.deselect(i);
    Tracer.delay();
    // }

})
//https://algorithm-visualizer.org/greedy/stable-matching