/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.azure.management.compute.models;

import java.net.URI;

/**
* Describes Boot Diagnostics.
*/
public class BootDiagnostics {
    private Boolean enabled;
    
    /**
    * Optional. Gets or sets whether VM Agent should be provisioned on the
    * Virtual Machine.
    * @return The Enabled value.
    */
    public Boolean isEnabled() {
        return this.enabled;
    }
    
    /**
    * Optional. Gets or sets whether VM Agent should be provisioned on the
    * Virtual Machine.
    * @param enabledValue The Enabled value.
    */
    public void setEnabled(final Boolean enabledValue) {
        this.enabled = enabledValue;
    }
    
    private URI storageUri;
    
    /**
    * Optional. Gets or sets the boot diagnostics storage Uri. It should be a
    * valid Uri
    * @return The StorageUri value.
    */
    public URI getStorageUri() {
        return this.storageUri;
    }
    
    /**
    * Optional. Gets or sets the boot diagnostics storage Uri. It should be a
    * valid Uri
    * @param storageUriValue The StorageUri value.
    */
    public void setStorageUri(final URI storageUriValue) {
        this.storageUri = storageUriValue;
    }
}
