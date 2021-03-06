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

/**
 * @author pepstein@google.com (Peter Epstein)
 */
@SuppressWarnings("unchecked")
public class FallthroughSuppressionNegativeCases extends FallthroughSuppressionToBeExtended {

  @SuppressWarnings("unchecked")
  public void suppressedMethod1a() {}

  @SuppressWarnings({"unchecked"})
  public void suppressedMethod1b() {}

  @SuppressWarnings({"varargs", "unchecked"})
  public void suppressedMethod2() {}

  @Override
  public void overriddenMethod() {}
}
