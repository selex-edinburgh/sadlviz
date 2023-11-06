// Overrides check for valid roots
mxGraph.prototype.isValidRoot = function () {
    return false;
};

/***
 * Visit all elements (nodes and edges) in the JSON
 */
function transverseElkTree(elkGraph, mxgraphRoot, mxgraph) {
    // console.log(elkGraph.id);
    for (i in elkGraph.children) {
        let elkNode = elkGraph.children[i];
        transverseElkNodes(elkNode, mxgraphRoot, mxgraph);
    }
    for (i in elkGraph.edges) {
        let elkEdge = elkGraph.edges[i];
        let from = mxgraph.model.getCell(elkEdge.sources[0]);
        // console.log(from);
        // console.log(from.getGeometry());
        let to = mxgraph.model.getCell(elkEdge.targets[0]);
        // console.log(to);
        // console.log(to.getGeometry());
        var mxedge = mxgraph.insertEdge(mxgraphRoot, elkEdge.id, elkEdge.label, 
            from, to, "rounded=0;orthogonalLoop=1;jettySize=auto;html=1;");
        var points = [];
        for (j in elkEdge.sections) {
            let section = elkEdge.sections[j]; 
            
            // let startPoint = new mxPoint(section.startPoint.x, section.startPoint.y);
            // startPoint.as = "sourcePoint";
            // points.push(startPoint);
            // 
            // let endPoint = new mxPoint(section.endPoint.x, section.endPoint.y);
            // endPoint.as = "targetPoint";
            // points.push(endPoint);
            
            for (k in section.bendPoints) {
                let bendPoint = section.bendPoints[k];
                points.push(new mxPoint(bendPoint.x, bendPoint.y));
            }
        }
        // console.log(points);
        mxedge.getGeometry().points = points;
    }
}

function transverseElkNodes(elkElement, mxgraphElement, mxgraph) {
    //console.log("Node Id:" + elkElement.id);
    //console.log("Node Label:" + elkElement.labels[0].text);
    var mxElement = mxgraph.insertVertex(mxgraphElement, elkElement.id, elkElement.labels[0].text, elkElement.x, elkElement.y, elkElement.width, elkElement.height, style="verticalAlign=bottom;labelPosition=center;verticalLabelPosition=top;align=center;");

    for (i in elkElement.ports) {
        let port = elkElement.ports[i];
        //console.log("Port Id:" + port.id);
        //console.log("Port Label:" + port.labels[0].text);
        mxgraph.insertVertex(mxElement, port.id, port.labels[0].text, port.x, port.y, port.width, port.height, style="strokeColor=#000000;fillColor=#000000;verticalAlign=bottom;labelPosition=center;verticalLabelPosition=top;align=center;");
    }

    for (i in elkElement.children) {
        let subElkElement = elkElement.children[i];
        transverseElkNodes(subElkElement, mxElement, mxgraph);
    }
}


// Program starts here. Creates a sample graph in the
// DOM node with the specified ID. This function is invoked
// from the onLoad event handler of the document (see below).
function render(container, elkGraph) {
    // Checks if the browser is supported
    if (!mxClient.isBrowserSupported()) {
        // Displays an error message if the browser is not supported.
        mxUtils.error('Browser is not supported!', 200, false);
    }
    else {
        // Creates the graph inside the given container
        var mxgraph = new mxGraph(container);
        mxgraph.constrainChildren = false;
        mxgraph.extendParents = false;
        mxgraph.extendParentsOnAdd = true;
        mxgraph.setEnabled(false);
        // graph.panningHandler.ignoreCell = true;
        // graph.setPanning(true);
        mxgraph.foldingEnabled = false;
        mxgraph.recursiveResize = true;
        mxgraph.setConnectable(true);

        mxgraph.isPort = function (cell) {
            var geo = this.getCellGeometry(cell);
            return (geo != null) ? geo.relative : false;
        };

        // Enables rubberband selection
        new mxRubberband(mxgraph);

        // Gets the default parent for inserting new cells. This
        // is normally the first child of the root (ie. layer 0).
        var parent = mxgraph.getDefaultParent();

        // Adds cells to the model in a single step
        mxgraph.getModel().beginUpdate();
        try {
            // dummy(parent, mxgraph);
            transverseElkTree(elkGraph, parent, mxgraph);
            // var v1 = mxGgraph.insertVertex(parent, 'e1', 'A', 20, 20, 60, 120, "verticalLabelPosition=top;verticalAlign=bottom");
            // v1.setConnectable(false);
            // var v2 = graph.insertVertex(v1, 'e2', 'a', 1, 0.20, 20, 60, "fillColor=#d5e8d4;verticalLabelPosition=middle;verticalAlign=middle;labelPosition=left");
            // v2.geometry.offset = new mxPoint(-10, -10);
            // v2.geometry.relative = true;
            // var e1 = graph.insertEdge(parent, null, '', v3, v7, "movable=0;edgeStyle=orthogonalEdgeStyle");
            // var e2 = graph.insertEdge(parent, null, '', v5, v10, "movable=0;edgeStyle=orthogonalEdgeStyle");


        }
        finally {
            // Updates the display
            mxgraph.getModel().endUpdate();
        }
    }
};