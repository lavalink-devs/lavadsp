/*
 * Copyright 2018 natanbc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.natanbc.lavadsp;

/**
 * Contains information about the library version.
 */
@SuppressWarnings("WeakerAccess")
public final class DspInfo {
    /**
     * Library version.
     */
    public static final String VERSION;


    /**
     * Latest commit hash as of build time.
     */
    public static final String COMMIT_HASH;


    static {
        VERSION = "@VERSION@";
        COMMIT_HASH = "@COMMIT_HASH@";
    }

    private DspInfo() {}
}
