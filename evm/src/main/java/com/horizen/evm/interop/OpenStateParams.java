package com.horizen.evm.interop;

import com.horizen.evm.utils.Hash;

public class OpenStateParams extends DatabaseParams {
    public Hash root;

    public OpenStateParams() {
    }

    public OpenStateParams(int databaseHandle, byte[] root) {
        super(databaseHandle);
        this.root = Hash.FromBytes(root);
    }
}
