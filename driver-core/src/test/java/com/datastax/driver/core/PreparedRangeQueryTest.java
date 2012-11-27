package com.datastax.driver.core;

import java.util.Arrays;
import java.util.Collection;

import com.datastax.driver.core.exceptions.NoHostAvailableException;

import org.junit.Test;

/**
 * @author John Sanda
 */
public class PreparedRangeQueryTest extends CCMBridge.PerClassSingleNodeCluster {

    @Override
    protected Collection<String> getTableDefinitions() {
        return Arrays.asList("CREATE TABLE prepared_range_test (x int, y int, z int, PRIMARY KEY (x, y))");
    }

    @Test
    public void prepareRangeQuery() throws NoHostAvailableException {
        session.prepare("SELECT x, y, z FROM prepared_range_test WHERE x = ? AND y > ? and y < ?");
    }
}
