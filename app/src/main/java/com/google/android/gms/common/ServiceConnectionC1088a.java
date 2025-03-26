package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.common.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class ServiceConnectionC1088a implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    boolean f13208a = false;

    /* renamed from: b, reason: collision with root package name */
    private final BlockingQueue f13209b = new LinkedBlockingQueue();

    public IBinder a(long j8, TimeUnit timeUnit) {
        Z2.r.k("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f13208a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f13208a = true;
        IBinder iBinder = (IBinder) this.f13209b.poll(j8, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f13209b.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
