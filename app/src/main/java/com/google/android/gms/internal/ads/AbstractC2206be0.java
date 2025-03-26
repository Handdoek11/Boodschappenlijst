package com.google.android.gms.internal.ads;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* renamed from: com.google.android.gms.internal.ads.be0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2206be0 implements SensorEventListener {
    protected AbstractC2206be0(String str, String str2) {
        C2097ae0.a();
        C2003Zd0.a();
    }

    public abstract void a(SensorEvent sensorEvent);

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i8) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        a(sensorEvent);
    }
}
