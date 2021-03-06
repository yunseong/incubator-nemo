/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.nemo.common.punctuation;

import java.io.Serializable;
import java.util.Objects;

/**
 * Watermark event.
 */
public final class Watermark implements Serializable, Comparable<Watermark> {

  private final long timestamp;
  public Watermark(final long timestamp) {
    this.timestamp = timestamp;
  }

  public long getTimestamp() {
    return timestamp;
  }

  @Override
  public boolean equals(final Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    final Watermark watermark = (Watermark) o;
    return timestamp == watermark.timestamp;
  }

  @Override
  public String toString() {
    return String.valueOf("Watermark(" + timestamp + ")");
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp);
  }

  @Override
  public int compareTo(final Watermark o) {
    return Long.compare(timestamp, o.getTimestamp());
  }
}
