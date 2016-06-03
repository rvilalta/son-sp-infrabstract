/**
 * @author Dario Valocchi (Ph.D.)
 * @mail d.valocchi@ucl.ac.uk
 * 
 *       Copyright 2016 [Dario Valocchi]
 * 
 *       Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 *       except in compliance with the License. You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *       Unless required by applicable law or agreed to in writing, software distributed under the
 *       License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *       either express or implied. See the License for the specific language governing permissions
 *       and limitations under the License.
 * 
 */

package sonata.kernel.adaptor.commons.vnfd;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VSwitchCapabilities {

  private String version;
  private String type;
  @JsonProperty("overlay_tunnel")
  private String overlayTunnel;

  public String getVersion() {
    return version;
  }

  public String getType() {
    return type;
  }

  public String getOverlayTunnel() {
    return overlayTunnel;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setOverlayTunnel(String overlayTunnel) {
    this.overlayTunnel = overlayTunnel;
  }
}
