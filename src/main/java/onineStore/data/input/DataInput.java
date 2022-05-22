package onineStore.data.input;

import onineStore.data.ReadableData;

public interface DataInput <T extends ReadableData> {

    T getData();
}
