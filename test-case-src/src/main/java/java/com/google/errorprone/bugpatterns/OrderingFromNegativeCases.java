/*
 * Copyright 2011 Google Inc. All Rights Reserved.
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

package java.com.google.errorprone.bugpatterns;

import java.util.Comparator;

import com.google.common.collect.Ordering;

/**
 * Negative test cases for theOrdering.from(new Comparator&lt;T&gt;() { ... }) check
 *
 * @author sjnickerson@google.com (Simon Nickerson)
 */
public class OrderingFromNegativeCases {

  public static void negativeCase1() {
    Comparator<String> comparator = new Comparator<String>() {
      @Override
      public int compare(String first, String second) {
        int compare = first.length() - second.length();
        return (compare != 0) ? compare : first.compareTo(second);
      }
    };
    Ordering<String> ord = Ordering.from(comparator);
  }

}
