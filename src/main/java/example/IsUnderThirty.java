package example;

import org.neo4j.graphdb.Node;
import org.neo4j.procedure.Description;
import org.neo4j.procedure.Name;
import org.neo4j.procedure.UserFunction;

public class IsUnderThirty
{
    @UserFunction
    @Description("example.isUnderThirtyCustom(node) - returns true or false")
    public boolean isUnderThirtyCustom(
            @Name("node") Node node) {
        if (node == null) {
            return false;
        }
        return node.hasProperty("age") && ((Integer) node.getProperty("age")) < 30;
    }
}