/*
 * Copyright (c) 2015 SONATA-NFV, UCL, NOKIA, NCSR Demokritos ALL RIGHTS RESERVED.
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
 * 
 * Neither the name of the SONATA-NFV, UCL, NOKIA, NCSR Demokritos nor the names of its contributors
 * may be used to endorse or promote products derived from this software without specific prior
 * written permission.
 * 
 * This work has been performed in the framework of the SONATA project, funded by the European
 * Commission under Grant number 671517 through the Horizon 2020 and 5G-PPP programmes. The authors
 * would like to acknowledge the contributions of their colleagues of the SONATA partner consortium
 * (www.sonata-nfv.eu).
 *
 * @author Dario Valocchi (Ph.D.), UCL
 * 
 */

package sonata.kernel.vimadaptor.wrapper;

public class WrapperConfiguration {

  private String vimEndpoint;
  private VimVendor vimVendor;
  private WrapperType wrapperType;
  private String authUserName;
  private String authPass;
  private String authKey;
  private String uuid;
  private String city;
  private String country;
  private String configuration;


  public WrapperType getWrapperType() {
    return wrapperType;
  }

  public void setWrapperType(WrapperType wrapperType) {
    this.wrapperType = wrapperType;
  }

  public String getVimEndpoint() {
    return vimEndpoint;
  }

  public void setVimEndpoint(String vimEndpoint2) {
    this.vimEndpoint = vimEndpoint2;
  }

  public VimVendor getVimVendor() {
    return vimVendor;
  }

  public void setVimVendor(VimVendor vimVendor) {
    this.vimVendor = vimVendor;
  }

  public String getAuthUserName() {
    return authUserName;
  }

  public void setAuthUserName(String authUserName) {
    this.authUserName = authUserName;
  }

  public String getAuthPass() {
    return authPass;
  }

  public void setAuthPass(String authPass) {
    this.authPass = authPass;
  }

  public String getAuthKey() {
    return authKey;
  }

  public void setAuthKey(String authKey) {
    this.authKey = authKey;
  }

  public String getUuid() {
    return this.uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  @Override
  public String toString() {
    String out = "";
    out += "sid: " + uuid + "; ";
    out += "WrapperType: " + wrapperType.toString() + "\n";
    out += "VimVendor: " + vimVendor.toString() + "\n";
    out += "VimEndpount: " + vimEndpoint + "\n";
    out += "User: " + authUserName + "\n";
    out += "pass: " + authPass + "\n";
    out += "config:\n";
    out += configuration;
    return out;
  }



  public String getCity() {
    return city;
  }

  public String getCountry() {
    return country;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getConfiguration() {
    return configuration;
  }

  public void setConfiguration(String configuration) {
    this.configuration = configuration;
  }

}
