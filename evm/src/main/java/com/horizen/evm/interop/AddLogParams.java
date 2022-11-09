package com.horizen.evm.interop;

import com.horizen.evm.utils.Address;
import com.horizen.evm.utils.Hash;

public class AddLogParams extends HandleParams {
    public Address address;
    public Hash[] topics;
    public byte[] data;

    public AddLogParams() {
    }

    public AddLogParams(int handle, EvmLog evmLog) {
        super(handle);
        this.address = evmLog.getAddress();
        this.topics = evmLog.getTopics();
        this.data = evmLog.getData();
    }
}
