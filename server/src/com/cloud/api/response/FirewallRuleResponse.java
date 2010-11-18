/**
 *  Copyright (C) 2010 Cloud.com, Inc.  All rights reserved.
 * 
 * This software is licensed under the GNU General Public License v3 or later.
 * 
 * It is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 */
package com.cloud.api.response;

import com.cloud.api.ApiConstants;
import com.cloud.serializer.Param;
import com.google.gson.annotations.SerializedName;

public class FirewallRuleResponse extends BaseResponse {
    @SerializedName(ApiConstants.ID) @Param(description="the ID of the port forwarding rule")
    private Long id;

    @SerializedName(ApiConstants.PRIVATE_PORT) @Param(description="the private port for the port forwarding rule")
    private String privatePort;

    @SerializedName(ApiConstants.PROTOCOL) @Param(description="the protocol of the port forwarding rule")
    private String protocol;

    @SerializedName(ApiConstants.PUBLIC_PORT) @Param(description="the public port for the port forwarding rule")
    private String publicPort;

    @SerializedName(ApiConstants.VIRTUAL_MACHINE_ID) @Param(description="the VM ID for the port forwarding rule")
    private Long virtualMachineId;

    @SerializedName("vmname") @Param(description="the VM name for the port forwarding rule")
    private String virtualMachineName;

    @SerializedName("vmdisplayname") @Param(description="the VM display name for the port forwarding rule")
    private String virtualMachineDisplayName;

    @SerializedName("publicipaddress") @Param(description="the public ip address for the port forwarding rule")
    private String publicIpAddress;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPrivatePort() {
        return privatePort;
    }

    public void setPrivatePort(String privatePort) {
        this.privatePort = privatePort;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getPublicPort() {
        return publicPort;
    }

    public void setPublicPort(String publicPort) {
        this.publicPort = publicPort;
    }

    public Long getVirtualMachineId() {
        return virtualMachineId;
    }

    public void setVirtualMachineId(Long virtualMachineId) {
        this.virtualMachineId = virtualMachineId;
    }

    public String getVirtualMachineName() {
        return virtualMachineName;
    }

    public void setVirtualMachineName(String virtualMachineName) {
        this.virtualMachineName = virtualMachineName;
    }

	public String getVirtualMachineDisplayName() {
		return virtualMachineDisplayName;
	}

	public void setVirtualMachineDisplayName(String virtualMachineDisplayName) {
		this.virtualMachineDisplayName = virtualMachineDisplayName;
	}

	public String getPublicIpAddress() {
		return publicIpAddress;
	}

	public void setPublicIpAddress(String publicIpAddress) {
		this.publicIpAddress = publicIpAddress;
	}
}
