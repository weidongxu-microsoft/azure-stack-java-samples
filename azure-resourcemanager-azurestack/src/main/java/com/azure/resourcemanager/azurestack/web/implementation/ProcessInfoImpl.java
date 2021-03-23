// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.web.implementation;

import com.azure.resourcemanager.azurestack.web.fluent.models.ProcessInfoInner;
import com.azure.resourcemanager.azurestack.web.fluent.models.ProcessModuleInfoInner;
import com.azure.resourcemanager.azurestack.web.fluent.models.ProcessThreadInfoInner;
import com.azure.resourcemanager.azurestack.web.models.ProcessInfo;
import com.azure.resourcemanager.azurestack.web.models.ProcessModuleInfo;
import com.azure.resourcemanager.azurestack.web.models.ProcessThreadInfo;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class ProcessInfoImpl implements ProcessInfo {
    private ProcessInfoInner innerObject;

    private final com.azure.resourcemanager.azurestack.web.AppServiceManager serviceManager;

    ProcessInfoImpl(
        ProcessInfoInner innerObject, com.azure.resourcemanager.azurestack.web.AppServiceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String kind() {
        return this.innerModel().kind();
    }

    public Integer identifier() {
        return this.innerModel().identifier();
    }

    public String deploymentName() {
        return this.innerModel().deploymentName();
    }

    public String href() {
        return this.innerModel().href();
    }

    public String minidump() {
        return this.innerModel().minidump();
    }

    public Boolean isProfileRunning() {
        return this.innerModel().isProfileRunning();
    }

    public Boolean isIisProfileRunning() {
        return this.innerModel().isIisProfileRunning();
    }

    public Double iisProfileTimeoutInSeconds() {
        return this.innerModel().iisProfileTimeoutInSeconds();
    }

    public String parent() {
        return this.innerModel().parent();
    }

    public List<String> children() {
        List<String> inner = this.innerModel().children();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<ProcessThreadInfo> threads() {
        List<ProcessThreadInfoInner> inner = this.innerModel().threads();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new ProcessThreadInfoImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public List<String> openFileHandles() {
        List<String> inner = this.innerModel().openFileHandles();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<ProcessModuleInfo> modules() {
        List<ProcessModuleInfoInner> inner = this.innerModel().modules();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new ProcessModuleInfoImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public String fileName() {
        return this.innerModel().fileName();
    }

    public String commandLine() {
        return this.innerModel().commandLine();
    }

    public String username() {
        return this.innerModel().username();
    }

    public Integer handleCount() {
        return this.innerModel().handleCount();
    }

    public Integer moduleCount() {
        return this.innerModel().moduleCount();
    }

    public Integer threadCount() {
        return this.innerModel().threadCount();
    }

    public OffsetDateTime startTime() {
        return this.innerModel().startTime();
    }

    public String totalCpuTime() {
        return this.innerModel().totalCpuTime();
    }

    public String userCpuTime() {
        return this.innerModel().userCpuTime();
    }

    public String privilegedCpuTime() {
        return this.innerModel().privilegedCpuTime();
    }

    public Long workingSet() {
        return this.innerModel().workingSet();
    }

    public Long peakWorkingSet() {
        return this.innerModel().peakWorkingSet();
    }

    public Long privateMemory() {
        return this.innerModel().privateMemory();
    }

    public Long virtualMemory() {
        return this.innerModel().virtualMemory();
    }

    public Long peakVirtualMemory() {
        return this.innerModel().peakVirtualMemory();
    }

    public Long pagedSystemMemory() {
        return this.innerModel().pagedSystemMemory();
    }

    public Long nonPagedSystemMemory() {
        return this.innerModel().nonPagedSystemMemory();
    }

    public Long pagedMemory() {
        return this.innerModel().pagedMemory();
    }

    public Long peakPagedMemory() {
        return this.innerModel().peakPagedMemory();
    }

    public OffsetDateTime timestamp() {
        return this.innerModel().timestamp();
    }

    public Map<String, String> environmentVariables() {
        Map<String, String> inner = this.innerModel().environmentVariables();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public Boolean isScmSite() {
        return this.innerModel().isScmSite();
    }

    public Boolean isWebjob() {
        return this.innerModel().isWebjob();
    }

    public String description() {
        return this.innerModel().description();
    }

    public ProcessInfoInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.azurestack.web.AppServiceManager manager() {
        return this.serviceManager;
    }
}
