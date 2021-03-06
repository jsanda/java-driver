/*
 *      Copyright (C) 2012 DataStax Inc.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package com.datastax.driver.core;

/**
 * A non-prepared CQL statement.
 * <p>
 * This class represents a query string along with query options. This class
 * can be extended but {@link SimpleStatement} is provided to build a {@code
 * Statement} directly from its query string.
 */
public abstract class Statement extends Query {

    /**
     * The query string for this statement.
     *
     * @return a valid CQL query string.
     */
    public abstract String getQueryString();

    @Override
    public String toString() {
        return getQueryString();
    }
}
