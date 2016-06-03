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

package sonata.kernel.adaptor.commons.nsd;

public class MonitoringParameter {

  private String desc;
  private String metric;
  private String unit;

  public String getDesc() {
    return desc;
  }

  public String getMetric() {
    return metric;
  }

  public String getUnit() {
    return unit;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public void setMetric(String metric) {
    this.metric = metric;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }


}
