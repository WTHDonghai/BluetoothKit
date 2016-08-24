package com.inuker.bluetooth.library;

import java.util.UUID;

/**
 * Created by liwentian on 2016/8/23.
 */
public interface IBluetoothApi {

    void connect(String mac, BleResponse response);

    void disconnect(String mac);

    void read(String mac, UUID service, UUID character, BleResponse response);

    void write(String mac, UUID service, UUID character, byte[] value, BleResponse response);

    void notify(String mac, UUID service, UUID character, BleResponse response);

    void unnotify(String mac, UUID service, UUID character);

    void readRssi(String mac, BleResponse response);
}