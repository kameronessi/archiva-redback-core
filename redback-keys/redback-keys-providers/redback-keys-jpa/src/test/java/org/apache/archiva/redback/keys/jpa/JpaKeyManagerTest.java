package org.apache.archiva.redback.keys.jpa;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import org.apache.archiva.redback.keys.KeyManager;
import org.apache.archiva.redback.keys.KeyManagerTestCase;
import org.junit.Before;
import org.junit.Test;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManagerFactory;

/**
 * JpaKeyManagerTest
 *
 * @author <a href="mailto:martin_s@apache.org">Martin Stockhammer</a>
 *
 */
@Transactional
public class JpaKeyManagerTest
    extends KeyManagerTestCase
{

    @Inject
    EntityManagerFactory entityManagerFactory;

    @Inject
    @Named(value = "keyManager#jpa")
    KeyManager keyManager;


    @Before
    public void setUp()
        throws Exception {

        super.setUp();
        super.setKeyManager(keyManager);

    }

    @Test
    public void initialize() {
        assertNotNull(keyManager);
    }
    
}
