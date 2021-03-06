/*
 * Copyright 2012-2013 eBay Software Foundation and ios-driver committers
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package org.uiautomation.ios.wkrdp.command;

import org.json.JSONException;
import org.json.JSONObject;
import org.openqa.selenium.WebDriverException;

public class Network {

  // unsupported
  public static JSONObject canClearBrowserCache() {
    try {
      JSONObject cmd = new JSONObject();
      cmd.put("method", "Network.canClearBrowserCache");
      return cmd;
    } catch (JSONException e) {
      throw new WebDriverException(e);
    }
  }

  public static JSONObject enable() {
    try {
      JSONObject cmd = new JSONObject();
      cmd.put("method", "Network.enable");
      return cmd;
    } catch (JSONException e) {
      throw new WebDriverException(e);
    }
  }
}
