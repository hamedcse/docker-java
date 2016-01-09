package com.github.dockerjava.core.command;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.dockerjava.api.command.ConnectToNetworkCmd;
import com.github.dockerjava.api.command.DockerCmdSyncExec;

public class ConnectToNetworkCmdImpl extends AbstrDockerCmd<ConnectToNetworkCmd, Void> implements ConnectToNetworkCmd {

    @JsonIgnore
    private String networkId;

    @JsonProperty("Container")
    private String containerId;

    public ConnectToNetworkCmdImpl(DockerCmdSyncExec<ConnectToNetworkCmd, Void> execution) {
        super(execution);
    }

    @Override
    public String getNetworkId() {
        return networkId;
    }

    @Override
    public String getContainerId() {
        return containerId;
    }

    @Override public ConnectToNetworkCmd withNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }

    @Override public ConnectToNetworkCmd withContainerId(String containerId) {
        this.containerId = containerId;
        return this;
    }
}
