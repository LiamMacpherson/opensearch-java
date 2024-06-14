/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

package org.opensearch.client.opensearch.core;

import org.junit.Assert;
import org.junit.Test;

public class GetScriptRequestTest extends Assert {

    @Test
    public void toBuilder() {
        GetScriptRequest origin = new GetScriptRequest.Builder().id("id").build();
        GetScriptRequest copied = origin.toBuilder().build();

        assertEquals(copied.id(), origin.id());
    }
}
