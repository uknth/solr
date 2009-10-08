package org.apache.lucene.store.instantiated;

import java.io.Serializable;

/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * For non package access see {@link org.apache.lucene.index.IndexReader#getFieldNames(org.apache.lucene.index.IndexReader.FieldOption)} 
 */
class FieldSetting implements Serializable {
  String fieldName;

  boolean storeTermVector = false;
  boolean storeOffsetWithTermVector = false;
  boolean storePositionWithTermVector = false;
  boolean storePayloads = false;

  boolean stored = false;
  boolean indexed = false;
  boolean tokenized = false;

  FieldSetting() {
  }


  FieldSetting(String fieldName) {
    this.fieldName = fieldName;
  }

  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;

    final FieldSetting that = (FieldSetting) o;

    return fieldName.equals(that.fieldName);

  }

  public int hashCode() {
    return fieldName.hashCode();
  }


}
